package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class browser {

  WebDriver driver = null;


    @Given("browser open")
    public void browser_open() {
        System.out.println("browser open ");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bbc.co.uk/news");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);

    }

    @When("enter text in search box")
    public void enter_text_in_search_box() {
        driver.findElement(By.xpath("//*[@id='orb-nav-links']/ul/li[4]/a")).click();
    }

    @Then("navigate to search result")
    public void navigate_to_search_result() {
        driver.findElement(By.xpath("//*[@id='orb-nav-links']/ul/li[2]/a")).click();
    }


}
