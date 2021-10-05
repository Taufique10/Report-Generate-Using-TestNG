package com.LoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LogTest {

        public static WebDriver driver;

        @BeforeClass
        public static void launch_chrome() {
            System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demo.opencart.com/index.php?route=account/login");
        }


        @Test
        public static void TC_01() {

            WebElement Email = driver.findElement(By.id("input-email"));
            Email.clear();
            Email.sendKeys("taufiquehasan513@gmail.com");

            WebElement Password = driver.findElement(By.id("input-password"));
            Password.clear();
            Password.sendKeys("123456");

            WebElement LoginBtn = driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input.btn.btn-primary"));
            LoginBtn.click();

            String Expected_Tittle = "My Account";
            String Actual_Tittle = driver.getTitle();

            if (Expected_Tittle.equals(Actual_Tittle)) {
                System.out.println("Test Case Passed");
            } else {
                System.out.println("Test Case Failed");
            }

            WebElement Logout = driver.findElement(By.linkText("Logout"));
            Logout.click();

            WebElement LoginPage = driver.findElement(By.linkText("Login"));
            LoginPage.click();

        }

        @Test
        public static void TC_02() {
            WebElement Email = driver.findElement(By.id("input-email"));
            Email.clear();
            Email.sendKeys("taufiquehasan@gmail.com");

            WebElement Password = driver.findElement(By.id("input-password"));
            Password.clear();
            Password.sendKeys("123456789");

            WebElement LoginBtn= driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input.btn.btn-primary"));
            LoginBtn.click();

            String Expected_Tittle = "Account Login";
            String Actual_Tittle = driver.getTitle();

            if (Expected_Tittle.equals(Actual_Tittle)) {
                System.out.println("Test Case Passed");
            } else {
                System.out.println("Test Case Failed");
            }

        }
        @Test
        public static void TC_03() {
            WebElement Email = driver.findElement(By.id("input-email"));
            Email.clear();
            Email.sendKeys("taufiquehasan513@gmail.com");

            WebElement Password = driver.findElement(By.id("input-password"));
            Password.clear();
            Password.sendKeys("123456789");

            WebElement LoginBtn= driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input.btn.btn-primary"));
            LoginBtn.click();

            String Expected_Tittle = "Account Login";
            String Actual_Tittle = driver.getTitle();

            if (Expected_Tittle.equals(Actual_Tittle)) {
                System.out.println("Test Case Passed");
            } else {
                System.out.println("Test Case Failed");
            }
        }
        @Test
        public static void TC_04() {
            WebElement Email = driver.findElement(By.id("input-email"));
            Email.clear();
            Email.sendKeys("taufiquehasan@gmail.com");

            WebElement Password = driver.findElement(By.id("input-password"));
            Password.clear();
            Password.sendKeys("123456");

            WebElement LoginBtn= driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input.btn.btn-primary"));
            LoginBtn.click();

            String Expected_Tittle = "Account Login";
            String Actual_Tittle = driver.getTitle();

            if (Expected_Tittle.equals(Actual_Tittle)) {
                System.out.println("Test Case Passed");
            } else {
                System.out.println("Test Case Failed");
            }

        }
        @AfterTest
        public static void close_Browser(){
            driver.close();
        }
    }
