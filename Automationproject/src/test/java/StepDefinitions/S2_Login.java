package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.p2_login;
import static StepDefinitions.s0_Hooks.driver;




public class S2_Login {

p2_login log =new p2_login();

    @And("user click on Login link")
    public void Login_click() {
        log.loginBtn().click();
    }

    @When("user enter valid email")
    public void valid_email() {

        log.Email().sendKeys("sabryano@1234.com");
    }

    @When("user enter valid password")
    public void valid_password() {

        log.Password().sendKeys("12345mosabry");
    }

    @And("user click on Login button")
    public void Login_button() {
        log.Login_button().click();
    }

    @Then("My account is displayed")
    public void account_message() throws InterruptedException {


        Thread.sleep(3000);
        //soft.assertTrue(driver.findElement(By.cssSelector("a[href=\"/customer/info\"]")).isDisplayed());
Assert.assertFalse(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/login?returnUrl=%2F"));
     // soft.assertAll();
    }
}