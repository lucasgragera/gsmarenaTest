package com.solvd.gsmarenatest;

import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {
    @FindBy(xpath = "//*[@class= 'head-icon icon-login']")
    private ExtendedWebElement loginMenu;

    @FindBy(xpath = "//*[@id= 'email']")
    private ExtendedWebElement emailInput;

    @FindBy(xpath = "//*[@id= 'upass']")
    private ExtendedWebElement passInput;

    @FindBy(xpath = "//*[@id='nick-submit']")
    private ExtendedWebElement loginButton;

    @FindBy(xpath = "//*[text() ='Login failed.']")
    private ExtendedWebElement errorMessage;

    public ExtendedWebElement getErrorMessage() {
        return errorMessage;
    }

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public ExtendedWebElement getLoginMenu() {
        return loginMenu;
    }

    public ExtendedWebElement getEmailInput() {
        return emailInput;
    }

    public ExtendedWebElement getPassInput() {
        return passInput;
    }

    public ExtendedWebElement getLoginButton() {
        return loginButton;
    }
    public void clickLoginButton(){
        loginButton.click();
    }
    public void typeEmail(String email){
        emailInput.type(email);
    }
    public void typePassword(String password){
        passInput.type(password);
    }

    public void open(){
        openURL(Configuration.getRequired("home_url"));
    }
    public boolean isErrorMessagePresent(){
        return errorMessage.isElementPresent();
    }
}