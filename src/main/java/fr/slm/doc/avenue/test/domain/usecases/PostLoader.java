package fr.slm.doc.avenue.test.domain.usecases;

import fr.slm.doc.avenue.test.domain.http.clients.PostService;
import fr.slm.doc.avenue.test.domain.values.Post;

import java.util.Set;
import java.util.stream.Collectors;

public class PostLoader {
    private PostService postsService;

    public PostLoader(PostService postsService) {
        this.postsService = postsService;
    }

    public Set<Post> load(Integer limit) {
        return postsService.loadPosts().get()
                .stream()
                .limit(limit)
                .collect(Collectors.toSet());
    }
}
