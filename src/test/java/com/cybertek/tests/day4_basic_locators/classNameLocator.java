package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class classNameLocator {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");

        //click home button
        WebElement homeLink = driver.findElement(By.className("nav-link"));
        homeLink.click();

        //close the browser
        driver.close();

        //another web site
        WebDriver driver2 = WebDriverFactory.getDriver("chrome");
        driver2.get("http://practice.cybertekschool.com/multiple_buttons");

        //print multiple buttons header
        WebElement header = driver2.findElement(By.className("h3"));

        String head = header.getText();       // --> get the text
        System.out.println("head = " + head); // --> print it

        driver2.close();



    }

}
