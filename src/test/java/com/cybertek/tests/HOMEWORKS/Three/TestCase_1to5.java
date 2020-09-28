package com.cybertek.tests.HOMEWORKS.Three;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase_1to5 {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){

        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void quit(){

        driver.quit();

    }

    @Test
    public void test1(){

        driver.get("https://practice-cybertekschool.herokuapp.com");

        WebElement register = driver.findElement(By.xpath("//a[contains(text(),'Registration Form')]"));
        register.click();

        WebElement date = driver.findElement(By.name("birthday"));

        date.sendKeys("wrong_dob");

        WebElement warning = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[8]/div/small[2]"));

        Assert.assertTrue(warning.isDisplayed());

    }

    @Test
    public void test2(){

        driver.get("https://practice-cybertekschool.herokuapp.com");

        WebElement register = driver.findElement(By.xpath("//a[contains(text(),'Registration Form')]"));

        register.click();

        WebElement cplus = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[11]/div/div[1]/label"));
        WebElement Java = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[11]/div/div[2]/label"));
        WebElement JavaS = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[11]/div/div[3]/label"));

        Assert.assertTrue(cplus.isDisplayed());
        Assert.assertTrue(Java.isDisplayed());
        Assert.assertTrue(JavaS.isDisplayed());

        Assert.assertEquals(cplus.getText(), "C++");
        Assert.assertEquals(Java.getText(), "Java");
        Assert.assertEquals(JavaS.getText(), "JavaScript");

    }

    @Test
    public void test3(){

        driver.get("https://practice-cybertekschool.herokuapp.com");

        WebElement register = driver.findElement(By.xpath("//a[contains(text(),'Registration Form')]"));
        register.click();

        WebElement firstname = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[1]/div/input"));
        WebElement message = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[1]/div/small[2]"));

        firstname.sendKeys("a");

        Assert.assertTrue(message.isDisplayed());

    }

    @Test
    public void test4(){

        driver.get("https://practice-cybertekschool.herokuapp.com");

        WebElement register = driver.findElement(By.xpath("//a[contains(text(),'Registration Form')]"));
        register.click();

        WebElement lastname = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[2]/div/input"));
        WebElement message = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[2]/div/small[2]"));

        lastname.sendKeys("a");

        Assert.assertTrue(message.isDisplayed());

    }

    @Test
    public void test5() throws InterruptedException {

        driver.get("https://practice-cybertekschool.herokuapp.com");



        WebElement register = driver.findElement(By.xpath("//a[contains(text(),'Registration Form')]"));

        register.click();

        WebElement firstname = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[1]/div/input"));
        WebElement lastname = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[2]/div/input"));
        WebElement username = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[3]/div/input"));
        WebElement email = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[4]/div/input"));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[5]/div/input"));
        WebElement phone = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[6]/div/input"));
        WebElement genderM = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[7]/div/div[1]/label/input"));
        WebElement birth = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[8]/div/input"));
        WebElement department = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[9]/div/select"));
        WebElement jobTitle = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[10]/div/select"));
        WebElement cplus = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[11]/div/div[1]/label"));
        WebElement Java = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[11]/div/div[2]/label"));
        WebElement JavaS = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[11]/div/div[3]/label"));
        WebElement signUp = driver.findElement(By.xpath("//*[@id=\"wooden_spoon\"]"));


        Select stateDropdown = new Select(department);
        Select stateDropdown2 = new Select(jobTitle);

        firstname.sendKeys("useyd");
        lastname.sendKeys("citlak");
        username.sendKeys("cilgincocuk");
        email.sendKeys("cilgincocuk@cilgin.com");
        password.sendKeys("123456789");
        phone.sendKeys("571-000-0000");
        genderM.click();
        birth.sendKeys("07/23/1990");
        stateDropdown.selectByVisibleText("Department of Engineering");
        stateDropdown2.selectByVisibleText("QA");
        Java.click();
        JavaS.click();
        cplus.click();

        Thread.sleep(3000);

        signUp.click();

        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }

        WebElement message = driver.findElement(By.xpath("//p[contains(text(),\"You've successfully completed registration!\")]"));

        Assert.assertTrue(message.isDisplayed());

    }




}
