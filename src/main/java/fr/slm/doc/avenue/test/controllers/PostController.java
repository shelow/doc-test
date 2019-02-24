package fr.slm.doc.avenue.test.controllers;

import fr.slm.doc.avenue.test.adapters.exceptions.RestLoadingPostsException;
import fr.slm.doc.avenue.test.adapters.exceptions.RestPostNotFoundException;
import fr.slm.doc.avenue.test.domain.exceptions.LoadingPostsException;
import fr.slm.doc.avenue.test.domain.exceptions.PostNotFoundException;
import fr.slm.doc.avenue.test.domain.usecase.PostLoader;
import fr.slm.doc.avenue.test.domain.values.Post;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/api/posts/")
public class PostController {

    private final static Logger LOG = LoggerFactory.getLogger(PostController.class);

    @Autowired
    private PostLoader postLoader;

    @GetMapping
    @ResponseBody
    public List<Post> loadPosts(@RequestParam(defaultValue = "50") int limit) throws RestPostNotFoundException,
            RestLoadingPostsException {
        List<Post> result;
        try {
            LOG.info("START - loading of first " + limit + " sorted posts");
            result = postLoader.load(limit);
            LOG.info("END - loading of first " + limit + " sorted posts ("+result.size()+" posts founds )");
        } catch (PostNotFoundException e) {
            LOG.error("None posts found", e);
            throw new RestPostNotFoundException("None posts found", e);
        } catch (LoadingPostsException e) {
            LOG.error("Error on post downloading", e);
            throw new RestLoadingPostsException("Error on post downloading", e);
        }
        return result;
    }

}
