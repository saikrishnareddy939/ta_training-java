package com.epam.training.saikrishna_reddy.optional_task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Pastebin {
    WebDriver driver;
    @BeforeClass
    public void webDriverSetUp(){
        driver = new EdgeDriver();
        driver.get("https://pastebin.com/");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void closeWebDriver(){
        driver.close();
        driver.quit();
    }

    @Test
    public void pastebinTest(){
        BasePage basePage = new BasePage(driver);
        basePage.createPaste("Hello from WebDriver", "helloweb");

    }
}