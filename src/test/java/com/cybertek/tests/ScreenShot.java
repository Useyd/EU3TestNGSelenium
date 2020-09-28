package com.cybertek.tests;

import com.cybertek.utilities.WebDriverFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenShot {

    @Test
    public void ScreenShot() throws IOException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.google.com");

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        // Now you can do whatever you need to do with it, for example copy somewhere
        FileUtils.copyFile(scrFile, new File("C:\\Users\\nb\\Desktop\\screenshot.png"));

        driver.quit();

    }

}
