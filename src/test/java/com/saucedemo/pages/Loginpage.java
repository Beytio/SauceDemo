package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends Basepage{

    @FindBy(id="user-name")
    public WebElement userName_loc;

    @FindBy(id="password")
    public WebElement password_loc;

    @FindBy(id="login-button")
    public WebElement loginButton_loc;

    public void loginMethod(String username, String password) {

        userName_loc.sendKeys(username);
        password_loc.sendKeys(password);
        loginButton_loc.click();

    }


}
