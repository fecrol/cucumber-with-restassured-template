package API.requests;

import io.restassured.response.Response;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.then;

public abstract class BaseMethods {

    /**
     * Returns the response object from a REST Assured request
     * @return
     */
    @Step
    public Response getResponse() {
        return then().extract().response();
    }

    /**
     * Returns the response body as a string from a REST Assured request
     * @return
     */
    @Step
    public String getResponseBodyAsString() {
        return then().extract().response().asString();
    }

    /**
     * Returns the response status code from a REST Assured request
     * @return
     */
    @Step
    public int getResponseStatusCode() {
        return then().extract().statusCode();
    }
}
