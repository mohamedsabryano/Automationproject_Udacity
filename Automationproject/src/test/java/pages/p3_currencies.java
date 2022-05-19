package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinitions.s0_Hooks.driver;

public class p3_currencies {
    public WebElement currencies(){
        return  driver.findElement(By.name("customerCurrency"));
    }
}
