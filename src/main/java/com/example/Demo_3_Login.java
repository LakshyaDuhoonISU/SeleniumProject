package com.example;

// import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
// import org.testng.annotations.Test;

import java.time.Duration;

public class Demo_3_Login {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://trytestingthis.netlify.app/");
        // Login form demo
        driver.findElement(By.id("uname")).sendKeys("test");
        driver.findElement(By.id("pwd")).sendKeys("test");
        driver.findElement(By.xpath("//input[@value='Login']")).click();

        Thread.sleep(2000);
        String heading = driver.findElement(By.tagName("h2")).getText();
        System.out.println("Heading: " + heading);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement msg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h2")));
        System.out.println("Login message: " + msg.getText());

        driver.navigate().back();

        Select dropdown = new Select(driver.findElement(By.id("option")));
        dropdown.selectByVisibleText("Option 2");

        // Checkbox demo
        driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();

        // Radio button demo
        driver.findElement(By.xpath("//input[@type='radio'][@value='male']")).click();

        /*
         * // Scroll demo
         * JavascriptExecutor js = (JavascriptExecutor) driver;
         * WebElement sidemenu = driver.findElement(By.cssSelector(".side .ex1"));
         * js.executeScript("arguments[0].scrollIntoView(true);", sidemenu);
         * 
         * 
         * 
         * // Alert demo
         * driver.findElement(By.xpath("//button[text()='Submit']")).click();
         * Alert alert = driver.switchTo().alert();
         * System.out.println(alert.getText());
         * alert.accept();
         */

        // CSS selector for button with classes btn and btn-success
        WebElement button = driver.findElement(By.cssSelector("button.btn.btn-success"));
        button.click();

        WebElement uploadElement = driver.findElement(By.id("myfile"));
        uploadElement.sendKeys(
                "/Users/lakshyaduhoon/Documents/software testing/seleniumdemo/src/main/java/com/example/FirstDemo.java");

        // Verify the path was set
        String uploadedFilePath = uploadElement.getAttribute("value");
        System.out.println("File path set in input: " + uploadedFilePath);

        // driver.findElement(By.id("myfile")).sendKeys("/Users/muskaangulrajani/Desktop/oracle_toc.pdf");

        Thread.sleep(1000);

        driver.quit();
    }
}
