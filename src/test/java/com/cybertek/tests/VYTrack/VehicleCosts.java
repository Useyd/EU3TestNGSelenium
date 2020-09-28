package com.cybertek.tests.VYTrack;


import com.cybertek.tests.day8_types_of_elements_2.SelectDropdownTest;
import com.cybertek.utilities.ConfReadVyTrack;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class VehicleCosts {

    WebDriver driver;

    @BeforeMethod
    public void before(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void after() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }

    @Test
    public void test1() throws InterruptedException {

        driver.get(ConfReadVyTrack.get("url"));
        WebDriverWait wait = new WebDriverWait(driver,30);

        WebElement username = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        WebElement submit = driver.findElement(By.xpath("//button[@id='_submit']"));

        username.sendKeys(ConfReadVyTrack.get("storemanager_username"));
        password.sendKeys(ConfReadVyTrack.get("storemanager_password"));
        submit.click();

        //Thread.sleep(10000);



        WebElement fleetmodule = driver.findElement(By.xpath("//span[@class='title title-level-1'][contains(text(),'Fleet')]"));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='title title-level-1'][contains(text(),'Fleet')]"))).click();



        List<WebElement> fleetoptions = driver.findElements(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li"));

        for (WebElement fleetoption : fleetoptions) {

            System.out.println("fleetoption.getText() = " + fleetoption.getText());

        }

        String expected = "Vehicle Costs";
        String actual = fleetoptions.get(4).getText();

        Assert.assertEquals(actual, expected);

        fleetoptions.get(4).click();

        //navigate next page
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h1[@class='oro-subtitle']")));

        WebElement allcosts = driver.findElement(By.xpath("//h1[@class='oro-subtitle']"));

        Assert.assertTrue(allcosts.isDisplayed());
        System.out.println("allcosts.getText() = " + allcosts.getText());

        //find the create vehicle cost and click it then find cancel button too
        //WebElement create = driver.findElement(By.xpath("//a[contains(@class,'btn main-group btn-primary pull-right')]"));

        //WebElement delete1 = driver.findElement(By.xpath("//div[2]/div[2]/div[2]/div/table/thead[1]/tr/th[5]/div/button"));
        //WebElement delete = driver.findElement(By.xpath("//div[2]/div[2]/div[2]/div/table/thead[1]/tr/th[5]/div/ul/a/i"));
        //delete1.click();
        //Thread.sleep(2000);



       //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/div[2]/div[2]/div/table/thead[1]/tr/th[5]/div/ul/a/i"))).click();


        //delete.click();
        // Thread.sleep(2000);

        //Assert.assertTrue(delete.isDisplayed());

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(""))).click();

        //create.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"custom_entity_type-uid-5f6cb98d7c19a\"]/div[1]/div/div/div[2]/div[1]/div[1]/a"))).isDisplayed();

        WebElement cancelbutton = driver.findElement(By.xpath("//*[@id=\"custom_entity_type-uid-5f6cb98d7c19a\"]/div[1]/div/div/div[2]/div[1]/div[1]/a"));


        //Assert.assertTrue(cancelbutton.isDisplayed());
















    }

    @Test
    public void test2() throws InterruptedException {

        driver.get(ConfReadVyTrack.get("url"));

        WebElement username = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        WebElement submit = driver.findElement(By.xpath("//button[@id='_submit']"));

        username.sendKeys(ConfReadVyTrack.get("storemanager_username2"));
        password.sendKeys(ConfReadVyTrack.get("storemanager_password2"));
        submit.click();

        Thread.sleep(20000);

        WebElement fleetmodule = driver.findElement(By.xpath("//span[@class='title title-level-1'][contains(text(),'Fleet')]"));


        fleetmodule.click();


        List<WebElement> fleetoptions = driver.findElements(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li"));

        for (WebElement fleetoption : fleetoptions) {

            System.out.println("fleetoption.getText() = " + fleetoption.getText());

        }

        String expected = "Vehicle Costs";
        String actual = fleetoptions.get(4).getText();

        Assert.assertEquals(actual, expected);

        fleetoptions.get(4).click();

        //navigate next page
        Thread.sleep(5000);
        WebElement allcosts = driver.findElement(By.xpath("//h1[@class='oro-subtitle']"));

        Assert.assertTrue(allcosts.isDisplayed());
        System.out.println("allcosts.getText() = " + allcosts.getText());


    }

    @Test
    public void test3() throws InterruptedException {

        driver.get(ConfReadVyTrack.get("url"));

        WebElement username = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        WebElement submit = driver.findElement(By.xpath("//button[@id='_submit']"));

        username.sendKeys(ConfReadVyTrack.get("salesmanager_username"));
        password.sendKeys(ConfReadVyTrack.get("salesmanager_password"));
        submit.click();

        Thread.sleep(20000);

        WebElement fleetmodule = driver.findElement(By.xpath("//span[@class='title title-level-1'][contains(text(),'Fleet')]"));


        fleetmodule.click();


        List<WebElement> fleetoptions = driver.findElements(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li"));

        for (WebElement fleetoption : fleetoptions) {

            System.out.println("fleetoption.getText() = " + fleetoption.getText());

        }

        String expected = "Vehicle Costs";
        String actual = fleetoptions.get(4).getText();

        Assert.assertEquals(actual, expected);

        fleetoptions.get(4).click();

        //navigate next page
        Thread.sleep(5000);
        WebElement allcosts = driver.findElement(By.xpath("//h1[@class='oro-subtitle']"));

        Assert.assertTrue(allcosts.isDisplayed());
        System.out.println("allcosts.getText() = " + allcosts.getText());


    }

    @Test
    public void test4() throws InterruptedException {

        driver.get(ConfReadVyTrack.get("url"));

        WebElement username = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        WebElement submit = driver.findElement(By.xpath("//button[@id='_submit']"));

        username.sendKeys(ConfReadVyTrack.get("salesmanager_username2"));
        password.sendKeys(ConfReadVyTrack.get("salesmanager_password2"));
        submit.click();

        Thread.sleep(20000);

        WebElement fleetmodule = driver.findElement(By.xpath("//span[@class='title title-level-1'][contains(text(),'Fleet')]"));


        fleetmodule.click();


        List<WebElement> fleetoptions = driver.findElements(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li"));

        for (WebElement fleetoption : fleetoptions) {

            System.out.println("fleetoption.getText() = " + fleetoption.getText());

        }

        String expected = "Vehicle Costs";
        String actual = fleetoptions.get(4).getText();

        Assert.assertEquals(actual, expected);

        fleetoptions.get(4).click();

        //navigate next page
        Thread.sleep(5000);
        WebElement allcosts = driver.findElement(By.xpath("//h1[@class='oro-subtitle']"));

        Assert.assertTrue(allcosts.isDisplayed());
        System.out.println("allcosts.getText() = " + allcosts.getText());


    }

    @Test
    public void test5() throws InterruptedException {

        driver.get(ConfReadVyTrack.get("url"));

        WebElement username = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        WebElement submit = driver.findElement(By.xpath("//button[@id='_submit']"));

        username.sendKeys(ConfReadVyTrack.get("salesmanager_username3"));
        password.sendKeys(ConfReadVyTrack.get("salesmanager_password3"));
        submit.click();

        Thread.sleep(20000);

        WebElement fleetmodule = driver.findElement(By.xpath("//span[@class='title title-level-1'][contains(text(),'Fleet')]"));


        fleetmodule.click();


        List<WebElement> fleetoptions = driver.findElements(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li"));

        for (WebElement fleetoption : fleetoptions) {

            System.out.println("fleetoption.getText() = " + fleetoption.getText());

        }

        String expected = "Vehicle Costs";
        String actual = fleetoptions.get(4).getText();

        Assert.assertEquals(actual, expected);

        fleetoptions.get(4).click();

        //navigate next page
        Thread.sleep(5000);
        WebElement allcosts = driver.findElement(By.xpath("//h1[@class='oro-subtitle']"));

        Assert.assertTrue(allcosts.isDisplayed());
        System.out.println("allcosts.getText() = " + allcosts.getText());


    }


}

