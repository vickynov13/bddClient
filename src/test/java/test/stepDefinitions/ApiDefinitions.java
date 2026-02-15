package test.stepDefinitions;

import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.bdd.tools.util.RestApiUtil;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class ApiDefinitions {
    private final RestApiUtil restApiUtil = new RestApiUtil();
    @Given("I check health")
    public void iCHeckHealth() {
        System.out.println("test Working");
        RequestSpecification spec = restApiUtil.geRequestSpecBasic("https://vedha.ddns.net:5000/");
        Response resp = given(spec)
                .relaxedHTTPSValidation()
                .get()
                .then()
                .extract().response();
        Assert.assertEquals(resp.statusCode(),200);
    }
}
