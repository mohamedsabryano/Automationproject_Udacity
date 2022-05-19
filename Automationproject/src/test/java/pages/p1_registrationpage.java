package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinitions.s0_Hooks.driver;

public class p1_registrationpage {

    public WebElement registerlink(){
        return  driver.findElement(By.className("ico-register"));
    }

    public WebElement fristname(){
        return  driver.findElement(By.cssSelector("input[id^=\"FirstName\"]"));
    }
    public WebElement lastname(){
        return  driver.findElement(By.cssSelector("input[id^=\"LastName\"]"));
    }
    public WebElement email(){
        return  driver.findElement(By.name("Email"));
    }
    public WebElement company(){
        return  driver.findElement(By.name("Company"));
    }
    public WebElement Day(){
        return  driver.findElement(By.cssSelector("option[value=\"21\"]"));
    }
    public WebElement Month(){
        return  driver.findElement(By.xpath("(//option[@value=\"3\"])[2]"));
    }
    public WebElement Year(){
        return  driver.findElement(By.cssSelector("option[value=\"1999\"]"));
    }
    public WebElement password(){
        return  driver.findElement(By.id("Password"));
    }
    public WebElement ConfirmPassword(){
        return  driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement registerButton(){
        return  driver.findElement(By.id("register-button"));
    }

}
