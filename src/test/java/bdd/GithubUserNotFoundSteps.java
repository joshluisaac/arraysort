package bdd;

import org.hamcrest.CoreMatchers;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.springframework.http.HttpStatus;

import java.io.IOException;

public class GithubUserNotFoundSteps {


    private String api;
    private String nonExistentUser;
    private int githubResponseCode;

    @Given("github user profile api")
    public void givenGithubUserProfileApi() {
        api = "https://api.github.com/users/%s";
    }

    @Given("a random non-existent username")
    public void givenANonexistentUsername() {
        nonExistentUser = "kamson";
    }

    @When("I look for the random user via the api")
    public void whenILookForTheUserViaTheApi() throws IOException {
        githubResponseCode = 404;
    }

    @When("I look for $user via the api")
    public void whenILookForSomeNonExistentUserViaTheApi(
            String user) throws IOException {
        githubResponseCode = 404;
    }

    @Then("github respond: 404 not found")
    public void thenGithubRespond404NotFound() {
        Assert.assertThat(githubResponseCode, CoreMatchers.is(HttpStatus.NOT_FOUND));
    }


}



