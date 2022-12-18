package com.saucedemo.pages;

import com.saucedemo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public abstract class Basepage {
    public Basepage(){
        PageFactory.initElements(Driver.get(),this);
    }

    //span[.='Checkout: Complete!']
    public String getTitle(String title){

        return Driver.get().findElement(By.xpath(" //span[.='"+title+"']")).getText();
    }

}
