package com.cybertek.tests.HOMEWORKS.Three;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.DataProviderHolder;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase_9to12 {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){

        driver= WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void quit(){

        driver.quit();

    }

    @Test
    public void test9(){

        driver.get("https://practice-cybertekschool.herokuapp.com/");

    }






}
