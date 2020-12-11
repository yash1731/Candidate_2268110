package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class loginSteps extends BaseClass1 {

    @Given("handyman browser open")
    public void handyman_browser_open() {
       setup();
        System.out.println("test starting...");
    }

    @When("user enter {string} and {string}")
    public void user_enter_and(String username, String password) throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.id("com.call4site.handymanservices:id/email")).sendKeys(username);
        driver.findElement(By.id("com.call4site.handymanservices:id/password")).sendKeys(password);
    }

    @When("user click on signin button")
    public void user_click_on_signin_button() throws InterruptedException {
        Thread.sleep(5000);
       driver.findElement(By.id("com.call4site.handymanservices:id/email_sign_in_button")).click();
    }

    @Then("verify user should not able to login")
    public void verify_user_should_not_able_to_login() {

    }

}
