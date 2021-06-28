package com.mercury.test.test;

import com.mercury.test.pages.HomePage;
import com.mercury.test.pages.LoginPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
    WebDriver driver;
    String PATH_DRIVER = "./src/main/resources/driver/chromedriver.exe";
    String TYPE_DRIVER = "webdriver.chrome.driver";
    String URL = "http://demo.guru99.com/test/newtours/index.php";
    LoginPage login;
    HomePage home;

    @Before
    public void setUp(){
        System.setProperty(TYPE_DRIVER,PATH_DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
        login = new LoginPage(driver);
    }



    @Test
    public void testLogin() throws InterruptedException {
        login.StartLogin("eduard@gmail.com","12345");
        home = new HomePage(driver);
        Assert.assertTrue(login.getMessageError().contains("Enter your userName and password correct"));
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
