package fr.slm.doc.avenue.test.domain.http.clients;

import fr.slm.doc.avenue.test.domain.exceptions.LoadingPostsException;
import fr.slm.doc.avenue.test.domain.values.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {
    Optional<List<Post>> loadPosts() throws LoadingPostsException;
}
