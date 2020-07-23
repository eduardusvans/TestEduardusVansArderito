package demo.hooks;

import demo.driver.AndroidDriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class AndroidDriverHooks {
    @Before(value = "@Android")
    public void initializeWebdriver() {
        AndroidDriverInstance.initialize();
    }

    @After(value = "@Android")
    public void quitAndroidDriver(){
        AndroidDriverInstance.quit();
    }
}
