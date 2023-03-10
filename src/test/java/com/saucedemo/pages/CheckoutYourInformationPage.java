package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutYourInformationPage extends Basepage{
    @FindBy (id="first-name")
    public WebElement firstnameInput;

    @FindBy (id="last-name")
    public WebElement lastnameInput;

    @FindBy (id="postal-code")
    public WebElement postalcode;

    @FindBy (id = "continue")
    public WebElement checkOut;

    public void entersCheckout─▒nfo(String name, String lastname, String zipcode){
    firstnameInput.sendKeys(name);
    lastnameInput.sendKeys(lastname);
    postalcode.sendKeys(zipcode);
    checkOut.click();

    }

}
