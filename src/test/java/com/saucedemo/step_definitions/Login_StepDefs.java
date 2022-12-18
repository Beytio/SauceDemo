package com.saucedemo.step_definitions;

import com.saucedemo.pages.Loginpage;
import com.saucedemo.pages.Productpage;
import com.saucedemo.utilities.ConfigurationReader;
import com.saucedemo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefs {
    Loginpage loginpage=new Loginpage();
    Productpage productpage=new Productpage();

    @Given("The user is on login page")
    public void the_user_is_on_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));

        }
    @When("The user enters {string} and {string} credentials")
    public void the_user_enters_and_credentials(String username, String password) {
        loginpage.loginMethod(username,password);

    }
    @Then("The user should be able login and see {string} page")
    public void the_user_should_be_able_login_and_see_page(String expectedHeader) {
        String actualHeader=productpage.productPageTitle_loc.getText();
        Assert.assertEquals("Verify that header is displayed",expectedHeader,actualHeader);


        }
}
