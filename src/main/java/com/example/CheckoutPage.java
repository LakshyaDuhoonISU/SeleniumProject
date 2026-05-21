package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CheckoutPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Locators
    private By checkoutHeader = By.xpath("//*[@id=\"header_container\"]/div[2]/span"); // e.g. "Checkout: Your Information"

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Assert header after navigation
    public boolean isCheckoutPageDisplayed() {
        WebElement header = wait.until(ExpectedConditions.visibilityOfElementLocated(checkoutHeader));
        return header.getText().contains("Checkout");
    }
}
