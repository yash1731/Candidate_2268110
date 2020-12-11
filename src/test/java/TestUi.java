


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class
TestUi {



    public static void main(String[] args) throws Exception {



        DesiredCapabilities cap = new DesiredCapabilities();
//        cap.setCapability("platformName", "Android");
//        cap.setCapability("platformVersion", "11.0");
//       cap.setCapability("deviceName", "Android Simulator");
//        cap.setCapability("automationName", "UiAutomator2");

        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Simulator");
        cap.setCapability(MobileCapabilityType.APP,"C:/Users/Yash/Downloads/Handyman App Demo for Testing by Call4site com_v1.0_apkpure.com.apk");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, cap);

        System.out.println("Application starting ...");
        // apk pure
        // desiredCapabilities.setCapability("app", "C:/Users/Yash/Downloads/APKPure_v3.17.14_apkpure.com.apk");

        //handy man
       // desiredCapabilities.setCapability("app","C:/Users/Yash/Downloads/Handyman App Demo for Testing by Call4site com_v1.0_apkpure.com.apk");

        // calculator
       // desiredCapabilities.setCapability("app", "C:/Users/Yash/Downloads/com.tct.calculator.apk");

        // demo debug appium
       // desiredCapabilities.setCapability("app", "C:/Users/Yash/Downloads/ApiDemos-debug.apk");

        // twitter
       // desiredCapabilities.setCapability("app", "C:/Users/Yash/Downloads/Twitter_7.34.0_apk-dl.com.apk");

        // klm
       // cap.setCapability("app", "C:/Users/Yash/Downloads/com.afklm.mobile.android.gomobile.klm_11.5.0-36635_4arch_3dpi_14lang_40a7507ef303b8571a3e05e983e0e6eb_apkmirror.com.apkm");


//
//        MobileElement element = (MobileElement) driver.findElement(By.id("com.tct.calculator:id/digit_7"));
//        element.click();


       // driver.findElement(By.id("com.tct.calculator:id/digit_7")).click();
       // driver.wait(5000);
//
//        MobileElement element1 = (MobileElement) driver.findElement(By.id("com.tct.calculator:id/op_add"));
//        element1.click();
       // driver.findElement(By.id("com.tct.calculator:id/op_add")).click();

//
//        MobileElement element2 = (MobileElement) driver.findElement(By.id("com.tct.calculator:id/digit_8"));
//        element2.click();

//       driver.findElement(By.id("com.tct.calculator:id/digit_8")).click();
//        driver.wait(5000);

//        MobileElement element3 = (MobileElement) driver.findElement(By.id("com.tct.calculator:id/eq"));
//        element3.click();

       // driver.findElement(By.id("com.tct.calculator:id/eq")).click();



    }
}
