package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLchanged {
/*
    Verify URL changed
    open chrome browser
    go to http://practice.cybertekschool.com/forgot_password Links to an external site.
    enter any email
    click on Retrieve password
    verify that url changed to http://practice.cybertekschool.com/email_sent
*/
    public static void main(String[] args) {

        //open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //go to the http://practice.cybertekschool.com/forgot_password
        driver.navigate().to("http://practice.cybertekschool.com/forgot_password");

        String expectedURL = driver.getCurrentUrl();

        //enter any e mail
        WebElement emailInputBox = driver.findElement(By.name("email"));//if there is no id on the html code
                                                                        //then search for the name of the element...


        emailInputBox.sendKeys("mike@smith.com"); //sendKeys() will send the keyboard action to the element


        //click on Retrieve password
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        String actualURL = driver.getCurrentUrl();

        //verify that url changed to http://practice.cybertekschool.com/email_sent
        if(expectedURL.equals(actualURL))
            System.out.println("FAIL");
        else
            System.out.println("PASS");

        //close the browser
        driver.quit();





    }

}
