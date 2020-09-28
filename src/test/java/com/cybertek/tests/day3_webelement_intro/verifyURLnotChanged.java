package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class verifyURLnotChanged {
/*
    Verify URL not changed
    open chrome browser
    go to http://practice.cybertekschool.com/forgot_password Links to an external site.
    click on Retrieve password
    verify that url did not change
*/

    public static void main(String[] args) {

        //open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        String expectedURL = driver.getCurrentUrl(); //saved the url here.

        //click on Retrieve Password
        driver.findElement(By.id("form_submit")).click(); //inspect the source code on the Retrieve Password button
                                                          //and find it's id

        String actualURL = driver.getCurrentUrl(); //actual URL is this

        //Similarly we can create a new WebElement like below:
        //WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"))
        //retrievePasswordButton.click();

        //WebElement is a interface that represents the elements on a webpage
        //findElement is a method that we use to find element on a webpage

        //Verify that the url did not change
        if(expectedURL.equals(actualURL)){

            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }

        //close your browser
        driver.quit();

    }

}
