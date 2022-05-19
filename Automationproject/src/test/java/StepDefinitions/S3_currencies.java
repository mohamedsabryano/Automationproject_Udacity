package StepDefinitions;

import io.cucumber.java.en.And;
import pages.p3_currencies;

public class S3_currencies {
    p3_currencies cur =new p3_currencies();
    @And("user select between cuurencies")
    public void currencies(){
        cur.currencies().click();
    }
}
