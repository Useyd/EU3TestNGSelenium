package com.cybertek.tests.HOMEWORKS.Three;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase_8 {

    @Test
    public void test8() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice-cybertekschool.herokuapp.com");

        WebElement AutoComp = driver.findElement(By.xpath("//a[contains(text(),'Autocomplete')]"));

        AutoComp.click();

        WebElement input = driver.findElement(By.id("myCountry"));

        input.sendKeys("Uni");

        Thread.sleep(2000);

        WebElement USA = driver.findElement(By.xpath("//div[contains(text(),'ted States of America')]"));

        USA.click();

        WebElement submit = driver.findElement(By.cssSelector("form>input"));

        submit.click();

        Thread.sleep(2000);
        WebElement message = driver.findElement(By.id("result"));

        String Message = message.getText();

        Assert.assertTrue(message.isDisplayed());
        Assert.assertEquals(Message, "You selected: United States of America");


    }
}
