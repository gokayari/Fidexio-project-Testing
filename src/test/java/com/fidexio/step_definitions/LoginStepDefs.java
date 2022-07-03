package com.fidexio.step_definitions;

import com.fidexio.pages.LoginPage;
import com.fidexio.utilities.BrowserUtils;
import com.fidexio.utilities.ConfigurationReader;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @When("User is on the login page")
    public void user_is_on_the_login_page() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
    }
    @Then("User should see text at the top of the page is {string}")
    public void user_should_see_text_at_the_top_of_the_page_is(String expectedText) {
        String actualText = loginPage.loginText.getText();
        System.out.println(actualText);

        Assert.assertEquals(expectedText, actualText);
    }


    @When("User enters POS Manager username {string}")
    public void user_enters_pos_manager_username(String string) {
        loginPage.username.sendKeys(string);
    }
    @When("User enters POS Manager password {string}")
    public void user_enters_pos_manager_password(String string) {
        loginPage.password.sendKeys(string);
    }

    @When("User enters Sales Manager username {string}")
    public void user_enters_sales_manager_username(String string) {
        loginPage.username.sendKeys(string);
    }
    @When("User enters Sales Manager password {string}")
    public void user_enters_sales_manager_password(String string) {
        loginPage.password.sendKeys(string);
    }

    @When("User clicks Login button")
    public void user_clicks_login_button() {
        BrowserUtils.sleep(1);
        loginPage.loginButton.click();
    }
    @Then("User should see the home page and username {string} on the top right")
    public void user_should_see_the_home_page_(String string) {
        /*
        String expectedInTitle = ConfigurationReader.getProperty("title");
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
        */
        String expectedUsername = string.substring(0, string.indexOf('@')).toLowerCase();
        String actualUsername = loginPage.userProfileName.getText().toLowerCase();
        System.out.println(actualUsername);
        Assert.assertEquals(expectedUsername,actualUsername);

    }


    @When("User enters invalid username {string}")
    public void user_enters_invalid_username(String string) {
        loginPage.username.sendKeys(string);
    }
    @When("User enters valid password {string}")
    public void user_enters_valid_password(String string) {
        loginPage.password.sendKeys(string);
    }

    @When("User enters valid username {string}")
    public void user_enters_valid_username(String string) {
        loginPage.username.sendKeys(string);
    }
    @When("User enters invalid password {string}")
    public void user_enters_invalid_password(String string) {
        loginPage.password.sendKeys(string);
    }
    @Then("User should see {string} on the page")
    public void user_should_see_on_the_page(String expectedMessage) {
        BrowserUtils.sleep(1);
        String actualMessage = loginPage.errorMessage.getText();
        System.out.println(actualMessage);

        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @When("User enters only username {string}")
    public void user_enters_only_username(String username) {
        loginPage.username.sendKeys(username);
    }

    @When("User enters only password {string}")
    public void user_enters_only_password(String password) {
        loginPage.password.sendKeys(password);
    }

    @Then("User should see message {string} on the password box")
    public void user_should_see_message_on_the_password_box(String expectedMessage) {
        String actualMessage = loginPage.errorMessageOnlyUsername.getAttribute("validationMessage");
        System.out.println("actualMessage = " + actualMessage);

        Assert.assertEquals(expectedMessage,actualMessage);
    }
    @Then("User should see message {string} on the username box")
    public void user_should_see_message_on_the_username_box(String expectedMessage) {
        String actualMessage = loginPage.errorMessageOnlyPassword.getAttribute("validationMessage");
        System.out.println("actualMessage = " + actualMessage);

        Assert.assertEquals(expectedMessage,actualMessage);
    }

    @When("User clicks Reset Password button")
    public void user_clicks_reset_password_button() {
        loginPage.resetPasswordButton.click();
    }
    @Then("User should see Reset Password page")
    public void user_should_see_reset_password_page() {
        String expectedText = "Your Email";
        String actualText = loginPage.yourEmailText.getText();

        Assert.assertEquals(expectedText, actualText);
    }

    @When("User enters a password {string} in the password box")
    public void user_enters_a_password_in_the_password_box(String password) {
        loginPage.password.sendKeys(password);
    }
    @Then("User should see password in bullet signs by default")
    public void user_should_see_password_in_bullet_signs_by_default() {
        String expectedType = "password";
        String actualType = loginPage.password.getAttribute("type");
        Assert.assertEquals(expectedType, actualType);
    }

    @When("User enters username {string}")
    public void user_enters_username(String string) {
        loginPage.username.sendKeys(string);
    }
    @When("User enters password {string}")
    public void user_enters_password(String string) {
        loginPage.password.sendKeys(string);
    }

    @When("User press the Enter key")
    public void user_press_the_enter_key() {
        loginPage.loginButton.sendKeys(Keys.ENTER);
    }

}
