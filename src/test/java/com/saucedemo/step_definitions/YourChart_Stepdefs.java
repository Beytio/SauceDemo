package com.saucedemo.step_definitions;

import com.saucedemo.pages.CheckoutOverview;
import com.saucedemo.pages.CheckoutYourInformationPage;
import com.saucedemo.pages.YourChartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class YourChart_Stepdefs {

    YourChartPage yourChartPage=new YourChartPage();
    CheckoutYourInformationPage checkoutYourInformationPage=new CheckoutYourInformationPage();
    CheckoutOverview checkoutOverview=new CheckoutOverview();


    @When("The user checks out")
    public void the_user_checks_out() {
       yourChartPage.checkout.click();

        }



    @And("The user enters name {string}, lastname {string} and zipcode {string} and click")
    public void theUserEntersNameLastnameAndZipcodeAndClick(String name, String lastName, String zipCode) {
        checkoutYourInformationPage.entersCheckoutınfo(name,lastName,zipCode);
    }


    @And("The user clicks finish button")
    public void theUserClicksFinishButton() {
        checkoutOverview.finishButton.click();
    }

    @Then("The user verifys the header {string}")
    public void theUserVerifysTheHeader(String title) {
        Assert.assertEquals(title.toUpperCase(), checkoutOverview.getTitle(title));
        System.out.println("title = " + title);
        System.out.println("checkoutOverview.getTitle(title) = " + checkoutOverview.getTitle(title));


    }
}
