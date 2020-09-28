package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndUrl {

    public static void main(String[] args) {

        //Task: Open chrome and navigate to: http://practice.cybertekschool.com

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com");

        //getting title with selenium and print it
        String title = driver.getTitle();//Shortcut for creating variable=> Alt+Enter+Enter
                                         //it was driver.getTitle(); before
        //soutv+Enter creates the syntax below
        //So we can automatically create the syntax for print the variable name and value
        System.out.println("title = " + title);

        //to get the url
        driver.getCurrentUrl();

        //with the Alt+Enter+Enter shortcut creating variable
        String currentUrl = driver.getCurrentUrl();
        
        //with soutv+Enter print the variable name and value
        System.out.println("currentUrl = " + currentUrl);
        
        //We can get the source code of the page too
        driver.getPageSource();

        String pageSource = driver.getPageSource();

        System.out.println("pageSource = " + pageSource);


    }
}
