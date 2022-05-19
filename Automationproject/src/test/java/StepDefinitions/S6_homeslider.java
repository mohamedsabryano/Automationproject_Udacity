package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import static StepDefinitions.s0_Hooks.driver;

public class S6_homeslider {
    @When("user clicks on first slider")
    public void slider() throws InterruptedException {

        driver.findElement(By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])[1]")).click();

    }
    @Then("relative product for frist slider is display")
    public void Fristslider(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphpne");
    }
    @When("user clicks on second slider")
    public void secondslider() throws InterruptedException {

        driver.findElement(By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])[2]")).click();

    }
    @Then("relative product for second slider is display")
    public void Secondslider(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/search?q=nokia");
    }
}
