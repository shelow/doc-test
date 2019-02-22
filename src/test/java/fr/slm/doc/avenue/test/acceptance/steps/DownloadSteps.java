package fr.slm.doc.avenue.test.acceptance.steps;

import cucumber.api.DataTable;
import cucumber.api.java8.En;
import fr.slm.doc.avenue.test.adapters.http.clients.LocalPostService;
import fr.slm.doc.avenue.test.domain.exceptions.LoadingPostsException;
import fr.slm.doc.avenue.test.domain.http.clients.PostService;
import fr.slm.doc.avenue.test.domain.usecases.PostLoader;
import fr.slm.doc.avenue.test.domain.values.Post;

import java.util.LinkedHashSet;
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
            LinkedHashSet<Post> posts = new LinkedHashSet<>();
            List<Map<String, String>> mappedPosts = givenPosts.asMaps(String.class, String.class);
            mappedPosts.forEach( entry -> addPost(posts, entry));
            ((LocalPostService) postsService).addPosts(posts);
        });

        Given("^wanted (\\d+) first posts$", (Integer limit) -> givenParams.limit = limit);

        When("^trying to download all posts from jsonplaceholder and return limited elements$", () -> {
            attemptLoadPosts.toTry =  () ->
                    attemptLoadPosts.foundPosts = (LinkedHashSet<Post>) postsLoader.load(givenParams.limit);
        });

        When("^the downloading \"([^\"]*)\"$", (String operationResult) -> {
            boolean success = "success".equals(operationResult);
            ((LocalPostService) postsService).shouldSuccess(success);
            attemptLoadPosts.error = tryer(attemptLoadPosts.toTry);
            if(success){
                assertThat(attemptLoadPosts.error, is(instanceOf(LoadingPostsException.class)));
            } else {
                assertThat(attemptLoadPosts.error, is(nullValue()));
            }
        });

        Then("^return following elements$", (DataTable expectedElements) -> {
            List<Map<String, String>> mappedExpectedposts = expectedElements.asMaps(String.class, String.class);
            assertThat(mappedExpectedposts.size(), is(equalTo(attemptLoadPosts.foundPosts.size())));
            LinkedHashSet<Post> expectedPostsSets = new LinkedHashSet<>();
            mappedExpectedposts.forEach(posts -> addPost(expectedPostsSets, posts));
            assertThat(attemptLoadPosts.foundPosts, is(equalTo(expectedPostsSets)));
        });

        Then("^return error : loading failure$", () -> {
            assertThat(attemptLoadPosts.error, is(instanceOf(LoadingPostsException.class)));
        });

    }

    private void addPost(LinkedHashSet<Post> expectedPostsSets, Map<String, String> posts) {
        expectedPostsSets.add(new Post(Integer.parseInt(posts.get("id")),
                Integer.parseInt(posts.get("userId")),
                posts.get("title"),
                posts.get("body")));
    }

    private Exception tryer(TryerFunc toTry) {
        try {
            toTry.trying();
        } catch (Exception e) {
            return e;
        }
        return null;
    }

    private class GivenParams {
        Integer limit;
    }

    private interface TryerFunc {
        void trying() throws Exception;
    }

    private class AttemptLoadPosts {
        TryerFunc toTry;
        LinkedHashSet<Post> foundPosts;
        Exception error;
    }
}
