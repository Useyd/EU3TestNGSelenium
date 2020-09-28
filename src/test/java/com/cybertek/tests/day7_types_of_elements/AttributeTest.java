package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AttributeTest {

    @Test
    public void test1(){

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blueRadioButton = driver.findElement(By.cssSelector("#blue"));

        blueRadioButton.getAttribute("value");

        //get the value of type attribute
        System.out.println("blueRadioButton.getAttribute(\"type\") = " + blueRadioButton.getAttribute("type"));

        //get the value of name attribute
        System.out.println("blueRadioButton.getAttribute(\"name\") = " + blueRadioButton.getAttribute("name"));

        //get the value of checked attribute
        //since checked attribute doesn't keep any value, it'll return true or false based on the condition
        System.out.println("blueRadioButton.getAttribute(\"checked\") = " + blueRadioButton.getAttribute("checked"));

        //trying to get attribute that doesn't exist
        //when we use non exist attribute, it will return null
        System.out.println("blueRadioButton.getAttribute(\"href\") = " + blueRadioButton.getAttribute("href"));


        System.out.println("blueRadioButton.getAttribute(\"outerHTML\") = " + blueRadioButton.getAttribute("outerHTML"));

        //going to multiple_buttons page
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement button2 = driver.findElement(By.name("button2"));

        //we can get the element with:
        //first getting all attributes together and assign them to a String
        //then using the assertTrue and inside it we can search for Button 2 with using contains method
        System.out.println("button2.getAttribute(\"outerHTML\") = " + button2.getAttribute("outerHTML"));
        String outerHTML = button2.getAttribute("outerHTML");
        Assert.assertTrue(outerHTML.contains("Button 2"));

        System.out.println("button2.getAttribute(\"innerHTML\") = " + button2.getAttribute("innerHTML"));


        driver.quit();
    }



}
