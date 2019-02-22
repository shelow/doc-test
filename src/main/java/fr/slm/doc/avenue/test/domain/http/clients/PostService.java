package fr.slm.doc.avenue.test.domain.http.clients;

import fr.slm.doc.avenue.test.domain.values.Post;

import java.util.Optional;
import java.util.Set;

public interface PostService {
    Optional<Set<Post>> loadPosts();
}
