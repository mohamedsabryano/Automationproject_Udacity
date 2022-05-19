package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static StepDefinitions.s0_Hooks.driver;

public class S7_followus {


        @When("Click on facebook and twitter and youtube and rss icon")
        public void clickFacebook() throws InterruptedException {
            driver.findElement(By.linkText("Facebook")).click();
            Thread.sleep(3000);
            driver.navigate().to("https://demo.nopcommerce.com/");
           driver.findElement(By.linkText("Twitter")).click();
           Thread.sleep(3000);
            driver.navigate().to("https://demo.nopcommerce.com/");
            driver.findElement(By.linkText("YouTube")).click();
            Thread.sleep(3000);
            driver.navigate().to("https://demo.nopcommerce.com/");
            driver.findElement(By.linkText("RSS")).click();
            Thread.sleep(3000);

    }



    @Then("Facebook and twitter and youtube and rss pages open")
    public void tabs(){
            SoftAssert soft =new SoftAssert();
 //soft.assertEquals(driver.findElement(By.linkText("Facebook")).getAttribute("href"),"http://www.facebook.com/nopCommerce");
 soft.assertEquals(driver.findElement(By.linkText("Twitter")).getAttribute("href"),"https://twitter.com/nopCommerce");
 soft.assertEquals(driver.findElement(By.linkText("YouTube")).getAttribute("href"),"http://www.youtube.com/user/nopCommerce");
 soft.assertEquals(driver.findElement(By.linkText("RSS")).getAttribute("href"),"/news/rss/1");
soft.assertAll();
    }

}
