package demo.mobilePages;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import static demo.Utils.ActionUtils.*;
import static demo.driver.AndroidDriverInstance.androidDriver;

public class loginPage {
    public void isOnPageLogin() {
        //return waitElement(assertProfilePage, 30).isDisplayed();
        waitABit(5000);
        waitElement(By.id("appCompatButtonLogin"),100).isDisplayed();
    }
    public void inputEmail(String email){
        AndroidElement inputEmail = androidDriver.findElement(By.id("textInputEditTextEmail"));
        inputEmail.sendKeys(email);
    }
    public void inputPassword(String password){
        AndroidElement inputPassword = androidDriver.findElement(By.id("textInputEditTextPassword"));
        inputPassword.sendKeys(password);
    }
    public void tapLoginButton(){
        AndroidElement tapLoginButton = androidDriver.findElement(By.id("appCompatButtonLogin"));
        tapLoginButton.click();
    }
    public void goToRegisterPage(){
        AndroidElement goToRegisterPage = androidDriver.findElement(By.id("textViewLinkRegister"));
        goToRegisterPage.click();
    }
}

//inputemail by id : textInputEditTextEmail
//inputpassword by id : textInputEditTextPassword
//loginbutton by id : appCompatButtonLogin
//createone by id : textViewLinkRegister
//failed login : snackbar_text