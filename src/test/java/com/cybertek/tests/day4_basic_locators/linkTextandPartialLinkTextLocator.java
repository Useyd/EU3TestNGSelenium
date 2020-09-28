package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class linkTextandPartialLinkTextLocator {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dynamic_loading");

        //LinkText Locator
        WebElement link1 = driver.findElement(By.linkText("Example 1: Element on page that is hidden and become visible after trigger"));
        link1.click();

        Thread.sleep(5000);

        driver.navigate().back();

        Thread.sleep(5000);

        //PartialLinkText Locator
        WebElement link2 = driver.findElement(By.partialLinkText("Example 2"));
        link2.click();

        Thread.sleep(5000);

        driver.close();

    }

}
