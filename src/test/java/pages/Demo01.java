package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import library.Utility;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Demo01 {

    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/select-menu");
        String title = driver.getTitle();
        System.out.println (title);
        String expected_title = "ToolsQA";
        Assert.assertEquals(expected_title, title);
       // Assert.assertTrue(title.contains("Tools"));

        Utility.captureScreenshot(driver, "first");

        System.out.println("Test Pass");

//        Alert alt = driver.switchTo().alert();
//        alt.accept();
//        alt.dismiss();
//        driver.switchTo().frame("w3e");
//        driver.switchTo().defaultContent();

        driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(5,TimeUnit.SECONDS);

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfAllElements());
        WebElement w01 =  driver.findElement(By.xpath("//*[@id='oldSelectMenu']"));
        Actions act = new Actions(driver);
        act.click().build().perform();
        act.moveToElement(w01).build().perform();


        Thread.sleep(3000);
        WebElement W1 =  driver.findElement(By.xpath("//*[@id='oldSelectMenu']"));
        Select s1 = new Select(W1);
        Utility.captureScreenshot(driver, "second");

        s1.selectByIndex(3);
        Thread.sleep(3000);
        driver.navigate().refresh();

        WebElement W2 =  driver.findElement(By.xpath("//*[@id='oldSelectMenu']"));
        Select s2 = new Select(W2);
        s2.selectByValue("4");

        WebElement ele =s2.getFirstSelectedOption();
        System.out.println(ele.getText());

//        List<WebElement> list = s2.getOptions();
//
//        int all = list.size();
//        System.out.println("all -> " + all);
//
//        Assert.assertEquals(all, 11);
//
//        for(WebElement ele1: list){
//          String total =  ele1.getText();
//            System.out.println("ALL -> " + total);
//        }







    }
}
