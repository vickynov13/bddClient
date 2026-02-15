package test.runners;

import io.cucumber.testng.CucumberOptions;
import org.bdd.tools.runners.KitRunner;

@CucumberOptions(
        tags = "@ui"
)
public class TestRunner extends KitRunner {
}
