package API.helpers;

import io.restassured.RestAssured;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.util.EnvironmentVariables;

/**
 * Abstract class with methods intended to be used in hooks
 */
public abstract class Hooks {

    private EnvironmentVariables environmentVariables;

    /**
     * Method to be run in a @Before hook tor un before each scenario
     */
    public void before() {
        this.setEndpoint();
    }

    /**
     * Sets the baseURI for sending requests with REST Assured
     */
    private void setEndpoint() {
        String propertyName = "baseEndpoint";
        RestAssured.baseURI = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(propertyName);
    }
}
