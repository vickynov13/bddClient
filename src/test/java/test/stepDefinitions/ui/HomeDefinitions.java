package test.stepDefinitions.ui;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.bdd.tools.frameworkConfig.TestContext;
import org.bdd.tools.stepDefs.KitDesktopSdf;
import test.pages.HomePage;

public class HomeDefinitions extends KitDesktopSdf {
    TestContext context;
    HomePage homePage;
    public HomeDefinitions(TestContext context) {
        super(context);
        this.context = context;
        homePage = new HomePage(context);
    }

    @Given("I open application")
    public void iOpenApplication(){
        System.out.println("Opening Application");
        driver.get(ymlConfig.getValue("applicationUrl"));
    }

    @Then("I verify App header is displayed")
    public void iVerifyAppHeaderIsDisplayed() {
        homePage.isAppHeaderNameDisplayed();
    }
}
