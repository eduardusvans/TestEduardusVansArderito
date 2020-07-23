package demo.hooks;

import demo.driver.WebDriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class WebDriverHooks {
    @Before(value = "@Web")
    public void initializeWebdriver() {
        WebDriverInstance.initialize();
    }
    @After(value = "@Web")
    public void quitWebdriver(){
        WebDriverInstance.quit();
    }
}
