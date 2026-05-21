package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.support.ui.Select;

public class ProductPage {
    WebDriver driver;


    // Locators
    private By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");
    private By cartIcon = By.className("shopping_cart_link");


    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }



    public void addToCart() {
        driver.findElement(addToCartButton).click();
    }

    public void goToCart() {
        driver.findElement(cartIcon).click();
    }

    // Validation
    public boolean isProductAdded() {
        // After adding, button changes to "Remove"
        return driver.findElement(By.id("remove-sauce-labs-backpack")).isDisplayed();
    }
}