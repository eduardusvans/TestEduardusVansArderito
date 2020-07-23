package demo.webPages;

import demo.driver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class registerPage {
    public boolean isOnPage(){
        WebDriverWait wait = new WebDriverWait(WebDriverInstance.webdriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(@name,'commit')]"))).isDisplayed();
    }
    public void inputName(String keyword){
        waitAbit(2000);
        WebElement inputName = WebDriverInstance.webdriver.findElement(By.id("user_name"));
        inputName.sendKeys(keyword);
    }
    public void inputEmailOrPhone(String keyword){
        waitAbit(2000);
        WebElement inputEmailOrPhone = WebDriverInstance.webdriver.findElement(By.id("email_or_phone"));
        inputEmailOrPhone.sendKeys(keyword);
    }
    public void maleSex(){
        waitAbit(2000);
        WebElement chooseMale = WebDriverInstance.webdriver.findElement(By.xpath("//span[contains(text(),'Laki-laki')]"));
        chooseMale.click();
    }
    public void femaleSex(){
        waitAbit(2000);
        WebElement chooseFemale = WebDriverInstance.webdriver.findElement(By.xpath("//span[contains(text(),'Perempuan')]"));
        chooseFemale.click();
    }
    public void inputUserName(String keyword){
        waitAbit(2000);
        WebDriverInstance.webdriver.findElement(By.id("user_username")).clear();
        WebElement inputUserName = WebDriverInstance.webdriver.findElement(By.id("user_username"));
        inputUserName.sendKeys(keyword);
    }
    public void inputPassword(String keyword){
        waitAbit(2000);
        WebElement inputPassword = WebDriverInstance.webdriver.findElement(By.id("user_password"));
        inputPassword.sendKeys(keyword);
    }
    public void inputConfirmPassword(String keyword){
        waitAbit(2000);
        WebElement inputConfirmPassword = WebDriverInstance.webdriver.findElement(By.id("user_password_confirmation"));
        inputConfirmPassword.sendKeys(keyword);
    }
    public void checkBoxAkun(){
        waitAbit(2000);
        WebElement chooseCheckBox = WebDriverInstance.webdriver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[2]/div[1]/form[1]/div[7]/label[1]/span[1]"));
        chooseCheckBox.click();
    }
    public void checkBox(){
        waitAbit(2000);
        WebElement chooseCheckBox = WebDriverInstance.webdriver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[2]/div[1]/form[1]/div[8]/label[1]/span[1]"));
        chooseCheckBox.click();
    }
    public void clickDaftarButton(){
        waitAbit(2000);
        WebElement clickDaftarButton = WebDriverInstance.webdriver.findElement(By.xpath("//button[contains(@name,'commit')]"));
        clickDaftarButton.click();
    }
    public void waitAbit(int milis) {
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
