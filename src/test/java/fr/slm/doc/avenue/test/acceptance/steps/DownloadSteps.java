package fr.slm.doc.avenue.test.acceptance.steps;

import cucumber.api.DataTable;
import cucumber.api.java8.En;
import fr.slm.doc.avenue.test.adapters.http.clients.LocalPostService;
import fr.slm.doc.avenue.test.domain.exceptions.LoadingPostsException;
import fr.slm.doc.avenue.test.domain.exceptions.PostNotFoundException;
import fr.slm.doc.avenue.test.domain.http.clients.PostService;
import fr.slm.doc.avenue.test.domain.usecases.PostLoader;
import fr.slm.doc.avenue.test.domain.values.Post;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

@SuppressWarnings("CodeBlock2Expr")
public class DownloadSteps implements En {

    private final GivenParams givenParams;
    private final AttemptLoadPosts attemptLoadPosts;

    public DownloadSteps(PostService postsService) {
        givenParams = new GivenParams();
        attemptLoadPosts = new AttemptLoadPosts();
        PostLoader postsLoader = new PostLoader(postsService);

        Given("^following posts when downloading succeeded$", (DataTable givenPosts) -> {
            List<Post> posts = new ArrayList<>();
            List<Map<String, String>> mappedPosts = givenPosts.asMaps(String.class, String.class);
            mappedPosts.forEach( entry -> addPost(posts, entry));
            ((LocalPostService) postsService).addPosts(posts);
        });

        Given("^wanted (\\d+) first posts$", (Integer limit) -> givenParams.limit = limit);

        When("^trying to download all posts from jsonplaceholder and return limited elements$", () -> {
            attemptLoadPosts.toTry =  () ->
                    attemptLoadPosts.foundPosts = postsLoader.load(givenParams.limit);
        });

        When("^the downloading \"([^\"]*)\"$", (String operationResult) -> {
            boolean success = "success".equals(operationResult);
            ((LocalPostService) postsService).shouldSuccess(success);
            attemptLoadPosts.error = tryer(attemptLoadPosts.toTry);
            if(!success){
                assertThat(attemptLoadPosts.error, is(instanceOf(LoadingPostsException.class)));
            } else {
                assertThat(attemptLoadPosts.error, is(nullValue()));
            }
        });

        When("^the downloading has empty result$", () -> {
            ((LocalPostService) postsService).clearPosts();
            attemptLoadPosts.error = tryer(() -> attemptLoadPosts.foundPosts = postsLoader.load(givenParams.limit));
        });

        Then("^return error : not found$", () -> {
            assertThat(attemptLoadPosts.foundPosts, is(nullValue()));
            assertThat(attemptLoadPosts.error, is(instanceOf(PostNotFoundException.class)));
        });

        Then("^return following elements$", (DataTable expectedElements) -> {
            List<Map<String, String>> mappedExpectedposts = expectedElements.asMaps(String.class, String.class);
            assertThat(mappedExpectedposts.size(), is(equalTo(attemptLoadPosts.foundPosts.size())));
            List<Post> expectedPosts = new ArrayList<>();
            mappedExpectedposts.forEach(posts -> addPost(expectedPosts, posts));
            assertThat(attemptLoadPosts.foundPosts, is(equalTo(expectedPosts)));
        });

        Then("^return error : loading failure$", () -> {
            assertThat(attemptLoadPosts.error, is(instanceOf(LoadingPostsException.class)));
        });

    }

    private void addPost(Collection<Post> expectedPosts, Map<String, String> posts) {
        expectedPosts.add(new Post(Integer.parseInt(posts.get("id")),
                Integer.parseInt(posts.get("userId")),
                posts.get("title"),
                posts.get("body")));
    }

    private Throwable tryer(loadFunc toTry) {
        try {
            toTry.load();
        } catch (LoadingPostsException | PostNotFoundException e) {
            return e;
        }
        return null;
    }

    private class GivenParams {
        Integer limit;
    }

    private interface loadFunc {
        void load() throws PostNotFoundException, LoadingPostsException;
    }

    private class AttemptLoadPosts {
        loadFunc toTry;
        List<Post> foundPosts;
        Throwable error;
    }
}
