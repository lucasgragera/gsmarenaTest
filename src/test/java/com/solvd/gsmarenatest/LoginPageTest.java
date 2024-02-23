package com.solvd.gsmarenatest;

import com.zebrunner.carina.core.AbstractTest;
import com.zebrunner.carina.core.IAbstractTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static com.zebrunner.agent.core.webdriver.RemoteWebDriverFactory.getDriver;
import static org.testng.Assert.assertTrue;


public class LoginPageTest implements IAbstractTest {
    @Test
    public void verifyLoginTest(){
        LoginPage loginPage = new LoginPage(getDriver());

        loginPage.open();
        //loginPage.typeEmail("lucasgragera51@gmail.com");
        //loginPage.typePassword("jdsfhds");
        loginPage.setEmailInput("lucasgragera51@gmail.com");
        loginPage.setPassInput("hhfjdsj");
        loginPage.clickLoginButton();
        assertTrue(loginPage.isErrorMessagePresent(), "Error message isn't present");

    }
}
