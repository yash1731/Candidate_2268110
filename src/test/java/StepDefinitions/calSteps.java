package StepDefinitions;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import tests.BaseClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class calSteps extends BaseClass1 {


    @Given("click on digit7 number")
    public void click_on_digit7_number() throws MalformedURLException {
        setup();
        System.out.println("test starting...");
       driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

       driver.findElement(By.id("com.tct.calculator:id/digit_7")).click();
    }
    @When("click on add button")
    public void click_on_add_button() {
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.findElement(By.id("com.tct.calculator:id/op_add")).click();
    }

    @Given("click on digit8 number")
    public void click_on_digit8_number() {

        driver.findElement(By.id("com.tct.calculator:id/digit_8")).click();
    }

    @Then("verify result")
    public void verify_result() throws InterruptedException {

        driver.findElement(By.id("com.tct.calculator:id/eq")).click();
        Thread.sleep(3000);


        String result = driver.findElement(By.id("com.tct.calculator:id/formula")).getText();
        if (result.equals("15"))
        {
            System.out.println("test passed");
        }
        else
        {
            System.out.println("test failed");
        }
    }
}
