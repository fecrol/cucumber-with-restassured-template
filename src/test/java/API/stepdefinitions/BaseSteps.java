package API.stepdefinitions;

import API.helpers.Hooks;
import io.cucumber.java.Before;

public class BaseSteps extends Hooks {

    @Before
    public void setUp() {
        before();
    }
}
