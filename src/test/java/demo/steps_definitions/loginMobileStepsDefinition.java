package demo.steps_definitions;

import demo.mobilePages.homePage;
import demo.mobilePages.loginPage;
import demo.mobilePages.registerPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginMobileStepsDefinition {
    demo.mobilePages.homePage homePage = new homePage();
    demo.mobilePages.loginPage loginPage = new loginPage();
    demo.mobilePages.registerPage registerPage = new registerPage();

    @Given("User is on login page")
    public void userIsOnLoginPage() {
        loginPage.isOnPageLogin();
    }

    @When("User tap create one link text")
    public void userTapCreateOneLinkText() {
        loginPage.goToRegisterPage();
    }

    @When("User is on register page on mobile")
    public void userIsOnRegisterPageOnMobile() {
        registerPage.isOnPageRegister();
    }

    @When("User input {string} as name on name input text field on mobile")
    public void userInputAsNameOnNameInputTextFieldOnMobile(String name) {
        registerPage.inputName(name);
    }

    @When("User input {string} as email on email input text field on mobile")
    public void userInputAsEmailOnEmailInputTextFieldOnMobile(String email) {
        registerPage.inputEmail(email);
    }

    @When("User input {string} as password on password input text field on mobile")
    public void userInputAsPasswordOnPasswordInputTextFieldOnMobile(String password) {
        registerPage.inputPassword(password);
    }

    @When("User input {string} as confirm password on confirm password input text field on mobile")
    public void userInputAsConfirmPasswordOnConfirmPasswordInputTextFieldOnMobile(String confirmPassword) {
        registerPage.inputConfirmPassword(confirmPassword);
    }

    @When("User tap register button on mobile")
    public void userTapRegisterButtonOnMobile() {
        registerPage.tapRegisterButton();
    }

    @When("User tap login text link")
    public void userTapLoginTextLink() {
        registerPage.goToLoginPage();
    }

    @Then("User is on login page on mobile")
    public void userIsOnLoginPageOnMobile() {
        loginPage.isOnPageLogin();
    }

    @When("User input {string} on email input text field on mobile")
    public void userInputOnEmailInputTextFieldOnMobile(String email) {
        loginPage.inputEmail(email);
    }

    @When("User input {string} on password input text field on mobile")
    public void userInputOnPasswordInputTextFieldOnMobile(String password) {
        loginPage.inputPassword(password);
    }

    @When("User tap login button on mobile")
    public void userTapLoginButtonOnMobile() {
        loginPage.tapLoginButton();
    }

    @Then("User is on home page on mobile")
    public void userIsOnHomePageOnMobile() {
        homePage.isOnHomePage();
    }

    @When("User get notification success")
    public void userGetNotificationSuccess() {
        registerPage.notificationSuccess();
    }

    @When("User get notification invalid email")
    public void userGetNotificationInvalidEmail() {
        registerPage.invalidEmail();
    }

    @When("User get notification invalid confirm password")
    public void userGetNotificationInvalidConfirmPassword() {
        registerPage.invalidConfirmPassword();
    }
}
