package fr.slm.doc.avenue.test.adapters.http.clients;

import fr.slm.doc.avenue.test.domain.exceptions.LoadingPostsException;
import fr.slm.doc.avenue.test.domain.http.clients.PostService;
import fr.slm.doc.avenue.test.domain.values.Post;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LocalPostService implements PostService {

    private List<Post> posts= new ArrayList<>();
    private boolean willSuccess = true;

    public LocalPostService() {}

    public void addPosts(List<Post> posts) {
        this.posts.addAll(posts);
    }

    public void clearPosts() {
        this.posts.clear();
    }

    public void shouldSuccess(boolean willSuccess) {
        this.willSuccess = willSuccess;
    }

    public Optional<List<Post>> loadPosts() throws LoadingPostsException {
        if(!willSuccess)throw new LoadingPostsException();
        return posts.size() == 0 ? Optional.empty() : Optional.of(posts);
    }
}
