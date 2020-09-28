package com.cybertek.tests.HOMEWORKS;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork2 {

    WebDriver driver;

    @BeforeMethod
    public void driverSetup(){

        driver = WebDriverFactory.getDriver("chrome");

    }
    @AfterMethod
    public void quit() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {


        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        WebElement checkBox = driver.findElement(By.xpath("//*[@id='isAgeSelected']"));


        Assert.assertFalse(checkBox.isSelected(),"'Success - Check box is checked' message is NOT displayed");
        System.out.println("checkBox = " + checkBox);

        if(checkBox.isSelected()==false){

            System.out.println("'Success - Check box is checked' message is NOT displayed");

        }

        else{

            System.out.println("'Success - Check box is checked' message is displayed");

        }

        WebElement checkMessage = driver.findElement(By.xpath("//*[@id='txtAge']"));

        checkBox.click();

        Thread.sleep(3000);

        if(checkMessage.isDisplayed()==false){

            System.out.println("'Success - Check box is checked' message is NOT displayed");

        }else{

            System.out.println("'Success - Check box is checked' message is displayed");

        }


    }

    @Test
    public void test2() throws InterruptedException {

       driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");

       WebElement checkAll = driver.findElement(By.xpath("//*[@id='check1']"));

       String expected = "Check All";
       String actual = checkAll.getAttribute("value");

       System.out.println("expected = " + expected);
       System.out.println("actual = " + actual);

       Assert.assertEquals(actual, expected, "verify first selection");

       checkAll.click();

       Thread.sleep(3000);

       List<WebElement> checkBox = driver.findElements(By.xpath("//input[@class='cb1-element']"));

       for (WebElement box : checkBox) {
           
           Assert.assertTrue(box.isSelected(), "verify check box is selected");

       }

       String expectedAfter = "Uncheck All";
       String actualAfter = checkAll.getAttribute("value");

       System.out.println("expectedAfter = " + expectedAfter);
       System.out.println("actualAfter = " + actualAfter);

       Assert.assertEquals(actualAfter, expectedAfter, "verify if actual end expected are equal");





    }


}
