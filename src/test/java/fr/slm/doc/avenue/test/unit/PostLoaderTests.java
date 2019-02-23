package fr.slm.doc.avenue.test.unit;

import fr.slm.doc.avenue.test.adapters.http.clients.LocalPostService;
import fr.slm.doc.avenue.test.domain.exceptions.LoadingPostsException;
import fr.slm.doc.avenue.test.domain.exceptions.PostNotFoundException;
import fr.slm.doc.avenue.test.domain.http.clients.PostService;
import fr.slm.doc.avenue.test.domain.usecases.PostLoader;
import fr.slm.doc.avenue.test.domain.values.Post;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PostLoaderTests {

    private final Post post1 = new Post(1, 1, "mon titre 1", "mon contenu 1");
    private final Post post2 = new Post(2, 1, "mon titre 2", "mon contenu 2");
    private final List<Post> sortedPosts = Arrays.asList(post1, post2);
    private PostService postService ;
    private PostLoader loader;

    @Before
    public void init(){
        postService = new LocalPostService();
        loader = new PostLoader(postService);
    }

    @Test
    public void load_one_post() throws PostNotFoundException, LoadingPostsException {

        List<Post> posts = Collections.singletonList(post1);
        ((LocalPostService) postService).addPosts(posts);

        List<Post> res = loader.load(1);
        assertThat(res, is(contains(posts.get(0))));
    }

    @Test
    public void load_two_already_sorted_posts() throws PostNotFoundException, LoadingPostsException {
        ((LocalPostService) postService).addPosts(sortedPosts);

        List<Post> res = loader.load(2);
        assertThat(res, contains(post1, post2));
    }

    @Test
    public void load_two_not_sorted_posts() throws PostNotFoundException, LoadingPostsException {
        ((LocalPostService) postService).addPosts(Arrays.asList(post2, post1));

        List<Post> res = loader.load(2);
        assertThat(res, contains(post1, post2));
    }

    @Test(expected = PostNotFoundException.class)
    public void load_empty_posts() throws LoadingPostsException, PostNotFoundException {
        loader.load(1);
    }
}
