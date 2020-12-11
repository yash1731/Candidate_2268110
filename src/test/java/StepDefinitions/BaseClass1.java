package StepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

public class BaseClass1 {

    public static AppiumDriver<MobileElement> driver;
   // public static AndroidDriver<MobileElement> driver;


    public void setup(){
        try {
            DesiredCapabilities des = new DesiredCapabilities();
            des.setCapability("platformName", "Android");
            //des.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            des.setCapability("platformVersion", "11.0");
            des.setCapability("deviceName", "Android Simulator");
            des.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 20);
            des.setCapability("automationName", "UiAutomator2");
            //des.setCapability("appPackage", "com.tct.calculator");
             des.setCapability("app", "C:/Users/Yash/Downloads/Handyman App Demo for Testing by Call4site com_v1.0_apkpure.com.apk");
            //des.setCapability("app", "C:/Users/Yash/Downloads/Twitter_v8.66.0-release.00_apkpure.com.apk");
            // des.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AppiumDriver<MobileElement>(url, des);
           // driver = new AndroidDriver<MobileElement>(url, des);



        }
        catch (Exception e) {
            System.out.println("cause is - " + e.getCause());
            System.out.println("message is -" + e.getMessage());
            e.printStackTrace();
        }


    }



}
