package test.pages;

import org.bdd.tools.frameworkConfig.TestContext;
import org.bdd.tools.helper.WebHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends WebHelper {
    public HomePage(TestContext context) {
        super(context);
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "header.MuiPaper-root > div.MuiToolbar-root > div.MuiTypography-root")
    public WebElement appNameHeader;

    public void isAppHeaderNameDisplayed(){
        Assert.assertTrue(appNameHeader.isDisplayed());
    }
}
