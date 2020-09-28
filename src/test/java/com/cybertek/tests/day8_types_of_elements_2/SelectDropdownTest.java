package com.cybertek.tests.day8_types_of_elements_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDropdownTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/dropdown");

        //locate your dropdown just like any other web element with unique locator
        WebElement dropdownElement = driver.findElement(By.id("state"));

        //create select object by passing that element as a constructor
        Select stateDropdown = new Select(dropdownElement);

        //getOptions --> returns all the available options from the dropdown
        List<WebElement> options = stateDropdown.getOptions();

        //printing the size of the options
        System.out.println("options.size() = " + options.size());

        //printing each options in one time
        for (WebElement option : options) {

            System.out.println(option.getText());
        }

    }

    @Test
    public void test2() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/dropdown");

        //locate your dropdown just like any other web element with unique locator
        WebElement dropdownElement = driver.findElement(By.id("state"));

        //create select object by passing that element as a constructor
        Select stateDropdown = new Select(dropdownElement);

        //verify that first selection is Select a State
        String expectedOption = "Select a State";
        String actualOption = stateDropdown.getFirstSelectedOption().getText();

        System.out.println("expectedOption = " + expectedOption);
        System.out.println("actualOption = " + actualOption);

        Assert.assertEquals(actualOption,expectedOption, "verify first selection");

        //HOW TO SELECT OPTIONS FROM DROP BOARD?
        //1.SELECT USING VISIBLE TEXT

        Thread.sleep(3000);
        stateDropdown.selectByVisibleText("Virginia");

        expectedOption = "Virginia";
        actualOption = stateDropdown.getFirstSelectedOption().getText();

        System.out.println("expectedOption = " + expectedOption);
        System.out.println("actualOption = " + actualOption);

        Assert.assertEquals(actualOption, expectedOption, "verify first selection");

        //2.SELECT WITH INDEX
        Thread.sleep(3000);
        stateDropdown.selectByIndex(51);

        expectedOption = "Wyoming";
        actualOption = stateDropdown.getFirstSelectedOption().getText();

        System.out.println("expectedOption = " + expectedOption);
        System.out.println("actualOption = " + actualOption);

        Assert.assertEquals(actualOption, expectedOption, "verify first selection");

        //3.SELECT WITH VALUE
        Thread.sleep(3000);
        stateDropdown.selectByValue("TX");

        expectedOption = "Texas";
        actualOption = stateDropdown.getFirstSelectedOption().getText();

        System.out.println("expectedOption = " + expectedOption);
        System.out.println("actualOption = " + actualOption);

        Assert.assertEquals(actualOption, expectedOption, "verify first selection");


    }

}