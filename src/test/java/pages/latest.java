package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

public class latest {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        FirefoxDriver driver = new FirefoxDriver();


        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
        String url = driver.getCurrentUrl();
        System.out.println(url);
    }
}
