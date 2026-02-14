package test.runners;

import io.cucumber.testng.CucumberOptions;
import org.bdd.tools.runners.KitRunner;

@CucumberOptions(features = {"src/test/resources/"},
        glue = {"test.stepDefinitions"},
        plugin = {
                "pretty","html:target/cucumber-html-reports/cucumber.html",
                "json:target/cucumber-html-reports/Main.json",
                "rerun:target/cucumber-html-reports/rerun.txt"},
        monochrome = true
)
public class TestRunner extends KitRunner {
}
