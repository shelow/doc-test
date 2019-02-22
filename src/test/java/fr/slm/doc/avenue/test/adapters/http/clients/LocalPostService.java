package fr.slm.doc.avenue.test.adapters.http.clients;

import fr.slm.doc.avenue.test.domain.exceptions.LoadingPostsException;
import fr.slm.doc.avenue.test.domain.http.clients.PostService;
import fr.slm.doc.avenue.test.domain.values.Post;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class LocalPostService implements PostService {

    private Set<Post> posts= new LinkedHashSet<>();
    private boolean willSuccess;

    public LocalPostService() {}

    public void addPosts(LinkedHashSet<Post> posts) {
        this.posts.addAll(posts);
    }

    public void shouldSuccess(boolean willSuccess) {
        this.willSuccess = willSuccess;
    }

    public Optional<Set<Post>> loadPosts() {
        if(!willSuccess)throw new LoadingPostsException();
        return Optional.of(posts);
    }
}
