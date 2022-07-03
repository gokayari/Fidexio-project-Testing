package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "a.navbar-brand")
    public WebElement loginText;

    @FindBy(name = "login")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginButton;

    @FindBy(xpath ="//span[@class='oe_topbar_name']")
    public WebElement userProfileName;

    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement errorMessage;

    @FindBy(css = "#login")
    public WebElement errorMessageOnlyPassword;

    @FindBy(css = "#password")
    public WebElement errorMessageOnlyUsername;

    @FindBy(xpath ="//a[.='Reset Password']")
    public WebElement resetPasswordButton;

    @FindBy(css ="label.control-label")
    public  WebElement yourEmailText;


}
