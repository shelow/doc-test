package fr.slm.doc.avenue.test.acceptance.steps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java8.En;

public class DownloadSteps implements En {

    public DownloadSteps() {

        Given("^following posts when downloading succeeded$", (DataTable arg1) -> {
            // Write code here that turns the phrase above into concrete actions
            // For automatic transformation, change DataTable to one of
            // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
            // E,K,V must be a scalar (String, Integer, Date, enum etc)
            throw new PendingException();
        });

        Given("^wanted (\\d+) first posts$", (Integer arg1) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        When("^trying to download all posts from jsonplaceholder$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        When("^the downloading \"([^\"]*)\"$", (String arg1) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Then("^return following elements$", (DataTable arg1) -> {
            // Write code here that turns the phrase above into concrete actions
            // For automatic transformation, change DataTable to one of
            // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
            // E,K,V must be a scalar (String, Integer, Date, enum etc)
            throw new PendingException();
        });

        Then("^return error which telling the failure$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });


    }
}
