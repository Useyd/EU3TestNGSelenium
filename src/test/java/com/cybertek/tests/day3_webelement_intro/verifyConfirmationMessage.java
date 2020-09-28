package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyConfirmationMessage {
/*
    Verify confirmation message
    open chrome browser
    go to http://practice.cybertekschool.com/forgot_password Links to an external site.
    enter any email
    verify that email is displayed in the input box
    click on Retrieve password
    verify that confirmation message says ‘Your e-mail’s been sent!’
*/
    public static void main(String[] args) {

        //open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //enter any email
        WebElement emailinputBox = driver.findElement(By.name("email"));
        String expectedEmail = "mike@smith.com";
        System.out.println("expectedEmail = " + expectedEmail);

        emailinputBox.sendKeys(expectedEmail);

        //verify that email is displayed in the input box

        /*

        Somehow we should get text from web elements
        two main ways to get txt from web elements
        1-) getText() --> it will work %99 an it will return string
        2-) getAttribute("value") --> second way of getting text, especially from INPUT BOXES


         */

        String actualEmail = emailinputBox.getAttribute("value");
        System.out.println("actualEmail = " + actualEmail);

        if(actualEmail.equals(expectedEmail))
            System.out.println("PASS");
        else
            System.out.println("FAIL");

        //click on Retrieve password
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        //verify that confirmation message says ‘Your e-mail’s been sent!’
        WebElement actualConfirmationMessage = driver.findElement(By.name("confirmation_message"));

        String expectedMessage = "Your e-mail's been sent!";//--> expected message
        System.out.println("expectedMessage = " + expectedMessage);

        String actualMessage = actualConfirmationMessage.getText(); //--> actual message
        System.out.println("actualMessage = " + actualMessage);

        if(actualMessage.equals(actualMessage))
            System.out.println("PASS");
        else
            System.out.println("FAIL");

        //close the browser
        driver.quit();
    }

}
