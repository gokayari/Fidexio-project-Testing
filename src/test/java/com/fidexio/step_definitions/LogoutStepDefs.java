package com.fidexio.step_definitions;

import com.fidexio.pages.LoginPage;
import com.fidexio.pages.LogoutPage;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogoutStepDefs {

    LoginPage loginPage = new LoginPage();
    LogoutPage logoutPage = new LogoutPage();

    @When("User clicks on the username on the top right")
    public void user_clicks_on_the_username_on_the_top_right() {
        loginPage.userProfileName.click();
    }
    @Then("User should see the drop-down menu correctly in order: {string}, {string}, {string}, {string}, {string}")
    public void user_should_see_the_drop_down_menu_correctly_in_order(String string1, String string2, String string3, String string4, String string5) {
        Assert.assertEquals(string1, logoutPage.menuOption1.getText());
        Assert.assertEquals(string2, logoutPage.menuOption2.getText());
        Assert.assertEquals(string3, logoutPage.menuOption3.getText());
        Assert.assertEquals(string4, logoutPage.menuOption4.getText());
        Assert.assertEquals(string5, logoutPage.menuOption5.getText());
    }

    @When("User clicks Log out button")
    public void user_clicks_log_out_button() {
        logoutPage.menuOption5.click();
    }

    @When("User clicks the step back button")
    public void user_clicks_the_step_back_button() {
        Driver.getDriver().navigate().back();
    }
    @Then("User should see error message {string}")
    public void user_should_see_error_message(String errorMessage) {
        Assert.assertEquals(errorMessage, logoutPage.stepBackWarning.getText());
        //System.out.println("logoutPage.stepBackWarning.getText() = " + logoutPage.stepBackWarning.getText());
    }


}
