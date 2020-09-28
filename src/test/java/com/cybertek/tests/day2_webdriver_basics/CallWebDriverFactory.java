package com.cybertek.tests.day2_webdriver_basics;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import static com.cybertek.utilities.WebDriverFactory.getDriver;

public class CallWebDriverFactory {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        
        driver.get("https://www.google.com");
        
        String title = driver.getTitle();

        System.out.println("title = " + title);

        Thread.sleep(2000);
        driver.quit();

    }
}
