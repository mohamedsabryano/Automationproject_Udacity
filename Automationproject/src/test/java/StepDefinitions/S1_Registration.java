package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import pages.p1_registrationpage;
import static StepDefinitions.s0_Hooks.driver;

public class S1_Registration {

p1_registrationpage reg = new p1_registrationpage();

    @And("user navigate to home page")
    public void navigate_home()
    {
        driver.navigate().to("https://demo.nopcommerce.com/");
    }


    @And("user click on register link")
    public void register_click()
    {
        reg.registerlink().click();
    }



    @When("user fills your personal details with valid data")
    public void personal_details()
    {
        reg.fristname().sendKeys("mohamed");
        reg.lastname().sendKeys("Sabry");
        reg.email().sendKeys("sabryano@1234.com");
        reg.company().sendKeys("Uadicty");
        reg.Day().click();
        reg.Month().click();
        reg.Year().click();
    }

    @And("user fills your password with valid data")
    public void password(){
        reg.password().sendKeys("12345mosabry");
        reg.ConfirmPassword().sendKeys("12345mosabry");
    }
    @And("user click on register button")
    public void register_button(){
        reg.registerButton().click();
    }

    @Then("success message is displayed")
    public void success_message(){
        //Assert.assertTrue(driver.findElement(By.partialLinkText("Your registration completed")).isDisplayed());
        SoftAssert soft =new SoftAssert();
        soft.assertTrue(driver.findElement(By.cssSelector("div[class=\"result\"]")).isDisplayed());

        String color =driver.findElement(By.cssSelector("div[class=\"result\"]")).getCssValue("color");
        System.out.println("color :"+color);

        soft.assertAll();
    }





}
