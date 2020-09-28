package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class multipleWindows {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void SwitchWindowsTest(){

        driver.get("http://practice.cybertekschool.com/windows");

        //get title
        System.out.println("Title before new window: " + driver.getTitle());

        //click the Click Here
        driver.findElement(By.linkText("Click Here")).click();

        //get title again
        System.out.println("Title after new windows: " + driver.getTitle());

        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());

        String currentWindowHandle = driver.getWindowHandle();

        Set<String> windowHandles = driver.getWindowHandles();

        for (String handle : windowHandles) {

            if(!handle.equals(currentWindowHandle)){

                driver.switchTo().window(handle);
            }
        }

        System.out.println("Title after switch new window: " + driver.getTitle());

    }

    @Test
    public void MoreThan2Windows(){

        driver.get("http://practice.cybertekschool.com/windows");

        //get title
        System.out.println("Title before new window: " + driver.getTitle());

        //click the Click Here
        driver.findElement(By.linkText("Click Here")).click();

        System.out.println("Before Switch: " + driver.getTitle());

        Set<String> windowHandles = driver.getWindowHandles();

        //loop through each window
        for (String handle : windowHandles) {

            //one by one change it
            driver.switchTo().window(handle);

            //whenever your title equals to your window title, stop.
            if(driver.getTitle().equals("New Window")){

                //stop on that window with break
                break;
            }

        }

        System.out.println("After switch: " + driver.getTitle());


    }

}
