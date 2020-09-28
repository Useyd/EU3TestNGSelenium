package com.cybertek.tests.HOMEWORKS.Three;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase_6 {

    @Test
    public void test6() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.tempmailaddress.com/");

        WebElement email = driver.findElement(By.xpath("//span[@id='email']"));

        String emailText = email.getText();

        driver.get("https://practice-cybertekschool.herokuapp.com");

        WebElement signUpList = driver.findElement(By.xpath("//a[contains(text(),'Sign Up For Mailing List')]"));

        signUpList.click();

        Thread.sleep(2000);

        WebElement firstName = driver.findElement(By.xpath("//input[@name='full_name']"));
        WebElement emailInput = driver.findElement(By.xpath("//input[@name='email']"));

        firstName.sendKeys("Useyd");
        emailInput.sendKeys(emailText);

        WebElement signUp = driver.findElement(By.xpath("//button[@name='wooden_spoon']"));

        signUp.click();

        WebElement signUpMsg = driver.findElement(By.xpath("//h3[@name='signup_message']"));

        Assert.assertTrue(signUpMsg.isDisplayed());

        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();

        Thread.sleep(5000);

        WebElement emailFrom = driver.findElement(By.xpath("//td[contains(text(),'do-not-reply@practice.cybertekschool.com')]"));

        Assert.assertTrue(emailFrom.isDisplayed());

        emailFrom.click();

        WebElement emailSender = driver.findElement(By.xpath("//span[@id='odesilatel']"));

        Assert.assertEquals(emailSender.getText(), "do-not-reply@practice.cybertekschool.com");

        WebElement thxmessage = driver.findElement(By.xpath("//span[@id='predmet']"));

        Assert.assertEquals(thxmessage.getText(),"Thanks for subscribing to practice.cybertekschool.com!");

        driver.quit();


    }
}
