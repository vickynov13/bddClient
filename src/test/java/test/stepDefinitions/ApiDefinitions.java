package test.stepDefinitions;

import io.cucumber.java.en.Given;

public class ApiDefinitions {
    @Given("I check health")
    public void iCHeckHealth() {
        System.out.println("test Working");
    }
}
