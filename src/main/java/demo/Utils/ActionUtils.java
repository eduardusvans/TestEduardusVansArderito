package demo.Utils;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static demo.driver.AndroidDriverInstance.androidDriver;

public class ActionUtils {
    public static WebElement waitElement(By targetElement, int timeOutInSeconds) {
        WebDriverWait wait = new WebDriverWait(androidDriver, timeOutInSeconds);
        return wait.until(ExpectedConditions.presenceOfElementLocated(targetElement));
    }

    public static AndroidElement getElement(By targetElement){
        return androidDriver.findElement(targetElement);
    }

    public static void tapElement(By targetElement) {
        AndroidElement element = androidDriver.findElement(targetElement);
        element.click();
    }


    public static void inputElement(By targetElement, String input) {
        // Null changer
        input = nullChanger(input);

        AndroidElement element = androidDriver.findElement(targetElement);
        element.sendKeys(input);
    }

    public static String nullChanger(String input) {
        if (input == null) {
            return "";
        } else {
            return input;
        }
    }

    public static void waitABit(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
