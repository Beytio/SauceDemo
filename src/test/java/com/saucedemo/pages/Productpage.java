package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Productpage extends Basepage{

    @FindBy(xpath = "//*[text()='Products']")
    public WebElement productPageTitle_loc;

    @FindBy(xpath="//select[@class='product_sort_container']")
    public WebElement sortSelect;

    @FindBy (xpath = "//button[starts-with(@name,'add-to-cart')]")
    public List<WebElement> addToChartItems;

    @FindBy (xpath = "//a[@class='shopping_cart_link']")
    public WebElement openTheBasket;


    public WebElement addToChart(int a){
        return addToChartItems.get(a);
    }
}
