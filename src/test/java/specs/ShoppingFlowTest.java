package specs;

// import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.example.CartPage;
import com.example.CheckoutPage;
import com.example.LoginPage;
import com.example.ProductPage;

public class ShoppingFlowTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void shoppingFlow() {
        LoginPage login = new LoginPage(driver);
        login.login("standard_user","secret_sauce");

        ProductPage product = new ProductPage(driver);
        //product.selectProduct("Option 2");
        product.addToCart();
        product.goToCart();
        product.isProductAdded();


        CartPage cart = new CartPage(driver);
        cart.checkout();


        CheckoutPage check = new CheckoutPage(driver);

        Assert.assertTrue(check.isCheckoutPageDisplayed());

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
