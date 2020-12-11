package tests;
import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;


public class test01 extends BaseClass {

    @Test
    public void testOne() throws InterruptedException {
        System.out.println("Application starting ...");
        driver.findElement(By.id("com.tct.calculator:id/digit_7")).click();
        driver.findElement(By.id("com.tct.calculator:id/op_add")).click();
        driver.findElement(By.id("com.tct.calculator:id/digit_8")).click();
        driver.findElement(By.id("com.tct.calculator:id/eq")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("com.tct.calculator:id/del2")).click();
    }

    @Test
    public void testTwo() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Application starting ...");
        driver.findElement(By.id("com.tct.calculator:id/digit_7")).click();
        driver.findElement(By.id("com.tct.calculator:id/op_mul")).click();
        driver.findElement(By.id("com.tct.calculator:id/digit_8")).click();
        driver.findElement(By.id("com.tct.calculator:id/eq")).click();

        Thread.sleep(3000);

        String result = driver.findElement(By.id("com.tct.calculator:id/formula")).getText();
        if (result.equals("56"))
        {
            System.out.println("test passed");
        } else
            {
            System.out.println("test failed");
        }

    }


    @AfterSuite
    public void teardown(){
       // driver.close();
        // driver.quit();
   }
}
