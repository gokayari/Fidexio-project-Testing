package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

    public LogoutPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//ul[@class='dropdown-menu'])[2]/li[1]/a")
    public WebElement menuOption1;

    @FindBy(xpath = "(//ul[@class='dropdown-menu'])[2]/li[2]/a")
    public WebElement menuOption2;

    //there is not (//ul[@class='dropdown-menu'])[2]/li[3]/a

    @FindBy(xpath = "(//ul[@class='dropdown-menu'])[2]/li[4]/a")
    public WebElement menuOption3;

    @FindBy(xpath = "(//ul[@class='dropdown-menu'])[2]/li[5]/a")
    public WebElement menuOption4;

    @FindBy(xpath = "(//ul[@class='dropdown-menu'])[2]/li[6]/a")
    public WebElement menuOption5;

    @FindBy(xpath = "//div[@class='o_dialog_warning modal-body']")
    public WebElement stepBackWarning;
}
