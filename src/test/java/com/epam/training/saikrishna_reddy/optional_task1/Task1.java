package com.epam.training.saikrishna_reddy.optional_task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task1 {
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        driver = new EdgeDriver();
        driver.get("https://pastebin.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void Test(){
        WebElement textArea = driver.findElement(By.id("postform-text"));
        textArea.click();
        textArea.sendKeys("Hello from WebDriver");

        WebElement selectDropDown = driver.findElement(By.xpath("//*[@id=\"w0\"]/div[5]/div[1]/div[4]/div/span/span[1]/span/span[2]"));
        selectDropDown.click();
        WebElement pasteExpiration = driver.findElement(By.xpath("//li[text()='10 Minutes']"));
        pasteExpiration.click();
        WebElement pasteTitle = driver.findElement(By.id("postform-name"));
        pasteTitle.sendKeys("helloweb");
        driver.findElement(By.xpath("//*[@id=\"w0\"]/div[5]/div[1]/div[10]/button")).click();

    }
}
