package fr.slm.doc.avenue.test.http.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.slm.doc.avenue.test.adapters.dtos.PostDto;
import fr.slm.doc.avenue.test.domain.exceptions.LoadingPostsException;
import fr.slm.doc.avenue.test.domain.http.services.PostService;
import fr.slm.doc.avenue.test.domain.values.Post;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.Optional.empty;
import static java.util.Optional.of;

@Service
public class JacksonPostService implements PostService {

    private final static Logger LOG = LoggerFactory.getLogger(PostService.class);

    @Value("${posts.service.url}")
    private String postsServiceUrl;

    @Override
    public Optional<List<Post>> loadPosts() throws LoadingPostsException {
        ObjectMapper mapper = new ObjectMapper();
        try {
            LOG.info("START - download and read values");
            Post[] result = mapper.readValue(new URL(postsServiceUrl), PostDto[].class);
            if(isEmptyResult(result))return empty();
            if(LOG.isDebugEnabled()) LOG.debug("Found Results "+result);
            LOG.info("END - download and read values");
            return of(Arrays.asList(result));
        } catch (IOException e) {
            throw new LoadingPostsException("Erreur lors du téléchargement des posts", e);
        }
    }

    private boolean isEmptyResult(Post[] foundPosts) {
        return foundPosts == null || foundPosts.length == 0;
    }
}
