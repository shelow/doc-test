package fr.slm.doc.avenue.test.adapters.usecase;

import fr.slm.doc.avenue.test.domain.http.services.PostService;
import fr.slm.doc.avenue.test.domain.usecase.PostLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostLoaderBean extends PostLoader {
    @Autowired
    public PostLoaderBean(PostService postsService) {
        super(postsService);
    }
}
