package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemo {
    public static void main(String[] args) throws InterruptedException {
        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();
        driver.get("https://trytestingthis.netlify.app/");

        // Login form demo
        driver.findElement(By.id("uname")).sendKeys("test");

        Thread.sleep(2000);
        driver.findElement(By.id("pwd")).sendKeys("test");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Login']")).click();

        driver.quit();
    }
}
