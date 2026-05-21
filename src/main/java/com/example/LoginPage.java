// package com.example;

// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;

// public class LoginPage {
//     WebDriver driver;
//     By uname = By.id("user-name");
//     By pwd = By.id("password");
//     By loginBtn = By.id("login-button");

//     public LoginPage(WebDriver driver) {
//         this.driver = driver;
//     }

//     public void login(String user, String pass) {
//         driver.findElement(uname).sendKeys(user);
//         driver.findElement(pwd).sendKeys(pass);
//         driver.findElement(loginBtn).click();
//     }
// }
package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Log;

public class LoginPage {

    @FindBy(id = "user-name")
    WebElement usernameTextbox;

    @FindBy(id = "password")
    WebElement passwordTextbox;

    @FindBy(xpath = "//button[@type='submit']")

    // @FindBy(xpath = "//input[@value='LOG IN']")
    // @FindBy(xpath="//*[@id=\"main-content\"]/div/div/div/div[2]/div[1]/div/form/div[3]/button")
    WebElement loginButton;

    // private By usernameTextBox = By.id("Email");
    // private By passwordTextBox = By.id("Password");
    // private By loginButton =
    // By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div/form/div[3]/button");

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String username) {

        usernameTextbox.clear();
        usernameTextbox.sendKeys(username);
        // driver.findElement(usernameTextBox).clear();
        // driver.findElement(usernameTextBox).sendKeys(username);
    }

    public void enterPassword(String password) {

        passwordTextbox.clear();
        passwordTextbox.sendKeys(password);
        // driver.findElement(passwordTextBox).clear();
        // driver.findElement(passwordTextBox).sendKeys(password);
    }

    public void clickLogin() {

        Log.info("Clicking login button..");
        loginButton.click();
        // driver.findElement(loginButton).click();
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }
}