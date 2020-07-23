package demo.webPages;

import demo.driver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homePage {
    public void openHomePage(){
        WebDriverInstance.webdriver.get("https://www.bukalapak.com/");
    }
    public boolean isOnPage(){
        waitAbit(2000);
        WebDriverWait wait = new WebDriverWait(WebDriverInstance.webdriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@class='sigil-logo-icon']"))).isDisplayed();
    }
    public void clickDaftarButtonOnHeader(){
        waitAbit(2000);
        WebElement buttonDaftarOnHeader = WebDriverInstance.webdriver.findElement(By.xpath("//p[contains(text(),'Daftar')]"));
        buttonDaftarOnHeader.click();
    }

    public void waitAbit(int milis) {
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
