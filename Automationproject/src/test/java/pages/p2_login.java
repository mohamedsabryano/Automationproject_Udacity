package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinitions.s0_Hooks.driver;

public class p2_login {


    public WebElement loginBtn(){
        WebElement loginBtn =driver.findElement(By.className("ico-login"));
        return loginBtn;
    }
    public WebElement Email(){
        WebElement Email=driver.findElement(By.id("Email"));
        return Email;
    }
    public WebElement Password(){
        WebElement Password =driver.findElement(By.id("Password"));
        return Password;
    }
    public WebElement Login_button() {
       WebElement login_Button = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
    return login_Button;
    }




}
