package demo.mobilePages;

import demo.Utils.ActionUtils.*;
import demo.driver.WebDriverInstance;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static demo.Utils.ActionUtils.waitABit;
import static demo.Utils.ActionUtils.waitElement;
import static demo.driver.AndroidDriverInstance.androidDriver;

public class registerPage {
    public void isOnPageRegister() {
        //return waitElement(assertProfilePage, 30).isDisplayed();
        waitABit(5000);
        waitElement(By.id("appCompatButtonRegister"),100).isDisplayed();
    }
    public void inputName(String name){
        AndroidElement inputName = androidDriver.findElement(By.id("textInputEditTextName"));
        inputName.sendKeys(name);
    }
    public void inputEmail(String email){
        AndroidElement inputEmail = androidDriver.findElement(By.id("textInputEditTextEmail"));
        inputEmail.sendKeys(email);
    }
    public void inputPassword(String password){
        AndroidElement inputPassword = androidDriver.findElement(By.id("textInputEditTextPassword"));
        inputPassword.sendKeys(password);
    }
    public void inputConfirmPassword(String confirmPassword){
        AndroidElement inputConfirmPassword = androidDriver.findElement(By.id("textInputEditTextConfirmPassword"));
        inputConfirmPassword.sendKeys(confirmPassword);
    }
    public void tapRegisterButton(){
        AndroidElement tapRegisterButton = androidDriver.findElement(By.id("appCompatButtonRegister"));
        tapRegisterButton.click();
    }
    public void goToLoginPage(){
        AndroidElement goToRegisterPage = androidDriver.findElement(By.id("appCompatTextViewLoginLink"));
        goToRegisterPage.click();
    }
    public boolean notificationSuccess(){
        WebDriverWait wait = new WebDriverWait(WebDriverInstance.webdriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("snackbar_text"))).isDisplayed();
    }
    public boolean invalidEmail(){
        WebDriverWait wait = new WebDriverWait(WebDriverInstance.webdriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Enter Valid Email']"))).isDisplayed();
    }
    public boolean invalidConfirmPassword(){
        WebDriverWait wait = new WebDriverWait(WebDriverInstance.webdriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Password Does Not Matches']"))).isDisplayed();
    }

}

//name by id : textInputEditTextName
//email by id : textInputEditTextEmail
//password by id : textInputEditTextPassword
//confirmpassword by id : textInputEditTextConfirmPassword
//registerbutton by id : appCompatButtonRegister
//ke login page by id : appCompatTextViewLoginLink
//success register : snackbar_text
//invalid email : //android.widget.TextView[@text='Enter Valid Email']
//invalid confirmPassword : //android.widget.TextView[@text='Password Does Not Matches']
