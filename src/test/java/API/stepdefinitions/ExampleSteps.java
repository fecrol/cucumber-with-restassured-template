package API.stepdefinitions;

import API.requests.ExampleRequests;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class ExampleSteps {

    @Steps
    private ExampleRequests exampleRequests;

    @Given("I send a GET request")
    public void i_send_a_get_request() {
        String endpoint = "jobs";
        exampleRequests.get(endpoint);
    }
    @Then("I should get a status code of {int} back")
    public void i_should_get_a_status_code_of_back(Integer statusCode) {
        int responseStatusCode = exampleRequests.getResponseStatusCode();
        assertThat("Invalid status code. Expected " + statusCode + " but received " + responseStatusCode + ".", responseStatusCode == statusCode);
    }
    @And("I should see the response body")
    public void i_should_see_the_response_body() {
        String responseBody = exampleRequests.getResponseBodyAsString();
        assertThat("No response body", responseBody, containsString("title"));
    }
}
