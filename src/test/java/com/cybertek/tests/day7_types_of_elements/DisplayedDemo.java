package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayedDemo {

    @Test
    public void test1() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        WebElement usernameInput = driver.findElement(By.id("username"));


        System.out.println("Before the clicking");
        System.out.println("usernameInput.isDisplayed() = " + usernameInput.isDisplayed());

        //verify username input box isn't displayed on the screen
        //click start button
        //verify username displayed on the screen
        WebElement start = driver.findElement(By.cssSelector("#start>button"));
        start.click();


        Thread.sleep(7000);
        Assert.assertTrue(usernameInput.isDisplayed(),"verify username input box is displayed");

        System.out.println("After the clicking:");
        System.out.println("usernameInput.isDisplayed() = " + usernameInput.isDisplayed());

        driver.quit();

    }
}
