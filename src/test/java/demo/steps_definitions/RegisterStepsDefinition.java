package demo.steps_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepsDefinition {
    demo.pages.homePage homePage = new demo.pages.homePage();
    demo.pages.registerPage registerPage = new demo.pages.registerPage();

    @Given("User is on homepage")
    public void userIsOnHomepage() {
        homePage.openHomePage();
        homePage.isOnPage();
    }

    @When("User tap Daftar on header on homepage")
    public void userTapDaftarOnHeaderOnHomepage() {
        homePage.clickDaftarButtonOnHeader();
    }

    @When("User is on register page")
    public void userIsOnRegisterPage() {
        registerPage.isOnPage();
    }

    @When("User input {string} on name input text field")
    public void userInputOnNameInputTextField(String name) {
        registerPage.inputName(name);
    }

    @When("User input {string} on email or phone input text field")
    public void userInputOnEmailOrPhoneInputTextField(String emailOrPhone) {
        registerPage.inputEmailOrPhone(emailOrPhone);
    }

    @When("User tap jenis kelamin male")
    public void userTapJenisKelaminMale() {
        registerPage.maleSex();
    }

    @When("User input {string} on username input text field")
    public void userInputOnUsernameInputTextField(String userName) {
        registerPage.inputUserName(userName);
    }

    @When("User input {string} on password input text field")
    public void userInputOnPasswordInputTextField(String password) {
        registerPage.inputPassword(password);
    }

    @When("User input {string} on confirm password input text field")
    public void userInputOnConfirmPasswordInputTextField(String confirmPassword) {
        registerPage.inputConfirmPassword(confirmPassword);
    }
    @When("User tap checkbox confirmation")
    public void userTapCheckboxConfirmation() {
        registerPage.checkBox();
    }

    @When("User tap Daftar button")
    public void userTapDaftarButton() {
        registerPage.clickDaftarButton();
    }

    @Then("User is on homepage after register")
    public void userIsOnHomepageAfterRegister() {
        homePage.isOnPage();
    }
}
