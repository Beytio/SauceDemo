package com.saucedemo.step_definitions;

import com.saucedemo.pages.Productpage;
import com.saucedemo.pages.YourChartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class Purchase_Stepdefs {
    Productpage productpage=new Productpage();

    @When("The user should be able to sort product {string}")
    public void the_user_should_be_able_to_sort_product(String sort) {
        Select select=new Select(productpage.sortSelect);
        select.selectByVisibleText(sort);

    }

    @And("The user selects the cheapest item {string}")
    public void theUserSelectsTheCheapestItem(String itemNumber) {
        productpage.addToChart(Integer.parseInt(itemNumber)-1).click();
    }


    @And("The user clicks the open the basket")
    public void theUserClicksTheOpenTheBasket() {
        productpage.openTheBasket.click();

    }
}
