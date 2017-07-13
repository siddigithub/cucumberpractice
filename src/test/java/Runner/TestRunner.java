package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by usachary on 13/07/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/feature"}, format = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
        glue = "step")
//public class TestRunner extends AbstractTestNGCucumberTests {
//
//}
public class TestRunner {

}
