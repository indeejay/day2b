package com.ucsc.automation.basicautomation;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Driver;

public class EbaySearch {

WebDriver driver;

@BeforeMethod
public void beforemethod(){
    driver =new ChromeDriver();
    driver.manage().window().maximize();
}

    @Test
    public void basicSearch(){

        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//input[@id='gh-ac']")).click();
        driver.findElement(By.xpath("//input[@id='gh-ac']")).clear();
        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("mobile phones");
    }
@AfterMethod
    public void quitBrowser(){
        driver.quit();
}
}

