package com.mercury.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class HomePage {
    private By MessageSuccessfully = By.xpath("/h3");
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public String getMessageSuccessfully(){
        return driver.findElement(MessageSuccessfully).getText();
    }
}
