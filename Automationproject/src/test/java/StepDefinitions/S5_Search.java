package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P5_search;

import static StepDefinitions.s0_Hooks.driver;

public class S5_Search {
    P5_search sea = new P5_search();
    @Given("user write  item on search filed")
    public void  search_filed () {

        sea.search_filed().sendKeys("Apple MacBook Pro 13-inch");
    }

    @When("user click on search button")
    public void search_button() {
       sea.search_button().click();
    }

    @When("user can access the item page")
    public void access_the_item_page() {
        driver.navigate().to("https://demo.nopcommerce.com/apple-macbook-pro-13-inch");
    }
    @Given("user search by using suk")
    public void  search_by_using_suk () {

       sea.search_by_using_suk().sendKeys("HP_SPX_UB");
    }
    @Then("user can access the suk page")
    public void  suk_page() {
        driver.navigate().to("https://demo.nopcommerce.com/search?q=HP_SPX_UB");
    }
}
