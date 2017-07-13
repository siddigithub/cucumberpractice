package step;

import Base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 * Created by usachary on 12/07/2017.
 */
public class Hook extends BaseUtil{

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public  void InitializeTest(){
        System.out.println("Opening the browser window!");
        //Assign some values in the base
        //System.setProperty("WebDriver.firefox.marionette", "//Users//usachary//Downloads//geckodriver");
        //base.StepInfo = "FirefoxDriver";
        System.setProperty("webdriver.gecko.driver", "//Users//usachary//Downloads//geckodriver");
        base.Driver = new FirefoxDriver();
        base.Driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        //base.Driver.navigate().to("http://www.executeautomation.com/demosite/Login.html");
    }

    @After
    public  void TearDownTest(Scenario scenario){

        System.out.println("Closing the browser window: Firefox");
        base.Driver.close();
        if(scenario.isFailed()){
            //Do when the scenario is failed.
            //Take the screenshot.
        }
    }
}
