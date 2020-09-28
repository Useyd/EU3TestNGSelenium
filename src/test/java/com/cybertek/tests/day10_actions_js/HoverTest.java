package com.cybertek.tests.day10_actions_js;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HoverTest {

   /*
   hover over each image in the website
   verify each name: user text is displayed
    */


    WebDriver driver;

    @BeforeMethod
    public void setUp(){

         driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void quit() throws InterruptedException {

        Thread.sleep(3000);
        driver.quit();

    }

    @Test
    public void oneImage() throws InterruptedException{

        driver.get("http://practice.cybertekschool.com/hovers");

        for(int i=1; i<=3; i++){

            String xpathImg = "(//img)["+i+"]";
            WebElement img = driver.findElement(By.xpath(xpathImg));
            System.out.println(xpathImg);

            Actions actions = new Actions(driver);
            Thread.sleep(3000);
            actions.moveToElement(img).perform();

            String textXpath = "//h5[.='name: user" + i + "']";
            WebElement text1 = driver.findElement(By.xpath(textXpath));
            System.out.println(textXpath);
            Thread.sleep(3000);
            Assert.assertTrue(text1.isDisplayed(),"verify user " + i + " is displayed");
        }

        /*WebElement img1 = driver.findElement(By.tagName("img"));

        Actions actions = new Actions(driver);

        Thread.sleep(3000);
        actions.moveToElement(img1).perform();

        WebElement text1 = driver.findElement(By.xpath("//h5[.='name: user1']"));

        Assert.assertTrue(text1.isDisplayed(),"verify text 1 is displayed");
    */
    }




}
