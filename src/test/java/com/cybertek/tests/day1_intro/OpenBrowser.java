package com.cybertek.tests.day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenBrowser {

    public static void main(String[] args) {
        //we have to enter this line every time we want to open chrome
        //hey webdrivermanager! Can you make chrome ready for me for automation
        WebDriverManager.chromedriver().setup();

        //creating driver object from ChromeDriver.
        //this driver object represents our chrome browser
        WebDriver driver = new ChromeDriver();

        //get method will navigate the chrome browser to the link
        driver.get("https://cybertekschool.com");

        WebDriverManager.iedriver().setup();

        WebDriver driver2 = new InternetExplorerDriver();
        driver2.get("https://google.com");
    }
}
