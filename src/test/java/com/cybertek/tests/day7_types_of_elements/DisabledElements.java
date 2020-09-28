package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class DisabledElements {

    @Test
    public void test1() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement greenRadioButton = driver.findElement(By.cssSelector("#green"));

        //green radio button disabled or enabled
        System.out.println("greenRadioButton.isEnabled() = " + greenRadioButton.isEnabled());

        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void test2() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebElement inputBox = driver.findElement(By.cssSelector("#input-example>input"));

        //When we try to interact with disable elements, 2 things can happen:
        //1. No action will be happen and code will not fail, no complain
        //2. No action will be happen but we can get ElementNotInteractableException: element is not interactable

        inputBox.sendKeys("boqumu ye");

        Thread.sleep(3000);

        //so going to click enable button
        //but it won't do the action. Since inputBox is not working it stops


        driver.quit();


    }

    @Test
    public void test3() throws InterruptedException {

        //So creating an after test
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        //so going to click enable button
        WebElement enableButton  = driver.findElement(By.cssSelector("#input-example>button"));

        enableButton.click();

        Thread.sleep(5000);

        WebElement inputBox = driver.findElement(By.cssSelector("#input-example>input"));

        //When we try to interact with disable elements, 2 things can happen:
        //1. No action will be happen and code will not fail, no complain
        //2. No action will be happen but we can get ElementNotInteractableException: element is not interactable

        inputBox.sendKeys("boqumu ye");

        Thread.sleep(3000);

        driver.quit();


    }

}
