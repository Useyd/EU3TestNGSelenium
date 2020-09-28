package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tagNameLocator {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //maximize the window first
        driver.manage().window().maximize();

        //open the link
        driver.get("http://practice.cybertekschool.com/sign_up");

        //when we can't use the id or name, we'll use tagName to locating the element
        //EX: <input type="text" bla bla bla.........
        //input is the tag here

        //sendkeys to fullname
        WebElement fullnameInput = driver.findElement(By.tagName("input"));
        fullnameInput.sendKeys("Mike Smith With TagName");

        //sendkeys to email
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("mike@smith.com");

        Thread.sleep(5000);

        //click sign up
        WebElement signUp = driver.findElement(By.tagName("button"));
        signUp.click();

        //close browser
        driver.quit();
    }

}
