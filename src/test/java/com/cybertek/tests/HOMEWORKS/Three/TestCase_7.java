package com.cybertek.tests.HOMEWORKS.Three;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase_7 {

    @Test
    public void test7() {


        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://practice-cybertekschool.herokuapp.com");

        WebElement uploadLink = driver.findElement(By.xpath("//a[contains(text(),'File Upload')]"));

        uploadLink.click();

        String projectPath = System.getProperty("user.dir");
        String filePath = "C:\\Users\\nb\\Desktop\\file.txt";

        WebElement chooseFile = driver.findElement(By.id("file-upload"));
        WebElement uploadButton = driver.findElement(By.id("file-submit"));

        chooseFile.sendKeys(filePath);

        uploadButton.click();

        WebElement uploadedMsg= driver.findElement(By.xpath("//h3[contains(text(),'File Uploaded!')]"));

        Assert.assertTrue(uploadedMsg.isDisplayed());

        WebElement uploadedFile = driver.findElement(By.xpath("//div[@id='uploaded-files']"));
        String fileName = uploadedFile.getText();

        Assert.assertTrue(uploadedFile.isDisplayed());
        Assert.assertEquals(fileName,"file.txt");

        driver.quit();

    }

}
