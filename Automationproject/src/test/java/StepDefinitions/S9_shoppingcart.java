package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.lv.Tad;
import org.openqa.selenium.By;

import static StepDefinitions.s0_Hooks.driver;

public class S9_shoppingcart {
    @Given("user click on shopping cart for a specific product")
    public void shopping_cart() throws InterruptedException {
        driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[2]")).click();
        driver.navigate().to("https://demo.nopcommerce.com/apple-macbook-pro-13-inch");
        driver.findElement(By.id("add-to-cart-button-4")).click();
        Thread.sleep(4000);

    }
    @When("user go to shopping cart")
    public void go_to_shopping() throws InterruptedException {
        driver.findElement(By.cssSelector("button[class=\"button-1 add-to-cart-button\"]")).click();
        Thread.sleep(2000);

    }
    @Tad("user go to shopping cart page")
    public void shopping_page() throws InterruptedException {
        driver.navigate().to("https://demo.nopcommerce.com/cart");
        Thread.sleep(2000);
    }
}
