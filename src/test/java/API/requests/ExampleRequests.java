package API.requests;

import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.given;

public class ExampleRequests extends BaseMethods {

    private final String contentType;

    public ExampleRequests() {
        this.contentType = "application/json";
    }

    /**
     * Sends a GET request to the specified endpoint to retrieve all values
     * @param endpoint
     */
    @Step
    public void get(String endpoint) {
        given()
                .contentType(this.contentType)
                .get("/" + endpoint);
    }

    /**
     * Sends a GET request to the specified endpoint to retrieve a single record by the specified id
     * @param endpoint
     * @param id
     */
    @Step
    public void get(String endpoint, String id) {
        given()
                .contentType(this.contentType)
                .get("/" + endpoint + "/" + id);
    }
}
