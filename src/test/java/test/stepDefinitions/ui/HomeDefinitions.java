package test.stepDefinitions.ui;

import io.cucumber.java.en.Given;
import org.bdd.tools.frameworkConfig.Base;
import org.bdd.tools.frameworkConfig.TestContext;
import org.bdd.tools.stepDefs.KitDesktopSdf;
import org.openqa.selenium.support.PageFactory;

public class HomeDefinitions extends KitDesktopSdf {
    TestContext context;
    public HomeDefinitions(TestContext context) {
        super(context);
        this.context = context;
        PageFactory.initElements(driver, this);
    }

    @Given("I open application")
    public void iOpenApplication(){
        System.out.println("Opening Application");
        driver.get(ymlConfig.getValue("applicationUrl"));
    }
}
