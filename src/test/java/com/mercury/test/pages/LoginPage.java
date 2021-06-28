package com.mercury.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static java.lang.Thread.sleep;

import static java.lang.Thread.sleep;

public class LoginPage {
    private By User = By.name("userName");
    private By Password = By.name("password");
    private By SubmitButton = By.name("submit");
    private By ErrorMessage = By.xpath("//span");
    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void StartLogin (String user, String password) throws InterruptedException {
        driver.findElement(User).sendKeys(user);
        sleep(2000);
        driver.findElement(Password).sendKeys(password);
        sleep(2000);
        driver.findElement(SubmitButton).click();
        sleep(5000);

    }

    public String getMessageError(){
        return driver.findElement(ErrorMessage).getText();
    }
}
