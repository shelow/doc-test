package fr.slm.doc.avenue.test.domain.usecases;

import fr.slm.doc.avenue.test.domain.exceptions.LoadingPostsException;
import fr.slm.doc.avenue.test.domain.exceptions.PostNotFoundException;
import fr.slm.doc.avenue.test.domain.http.clients.PostService;
import fr.slm.doc.avenue.test.domain.values.Post;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class PostLoader {
    private PostService postsService;

    public PostLoader(PostService postsService) {
        this.postsService = postsService;
    }

    public List<Post> load(Integer limit) throws PostNotFoundException, LoadingPostsException {
        Optional<List<Post>> postsFound = postsService.loadPosts();
        postsFound.orElseThrow(() -> new PostNotFoundException("Aucun post trouvé"));
        return postsFound.get()
                .stream()
                .sorted(comparing(Post::getTitle))
                .limit(limit)
                .collect(Collectors.toList());
    }
}
