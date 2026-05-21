package com.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args) throws InterruptedException {
        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        Thread.sleep(2000);
        driver.findElement(By.id("APjFqb")).sendKeys("selenium");

        Thread.sleep(2000);
        driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);

        Thread.sleep(20000);
        driver.quit();
    }
}
