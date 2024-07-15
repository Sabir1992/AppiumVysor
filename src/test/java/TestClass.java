import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class TestClass {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "SM A135F");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\pc\\IdeaProjects\\demopuiu\\AppiumVysor\\" +
                "Apk\\trendyol-7-24-2-803.apk");


        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new
                URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);

        MobileElement element1 = driver.findElementByXPath("//android.widget." +
                "ImageView[@resource-id=\"trendyol.com:id/buttonDismiss\"]");
        element1.click();

        //

        Thread.sleep(2000);
        MobileElement element2 = driver.findElementByXPath("//android.widget." +
                "ImageButton[@resource-id=\"trendyol.com:id/imageButtonClose\"]");
        element2.click();

        Thread.sleep(2000);

        MobileElement element3 = driver.findElementByXPath("//android.widget." +
                "TextView[@resource-id=\"trendyol.com:id/textViewAzerAddress\"]");
        element3.click();


        Thread.sleep(2000);
        MobileElement element4 = driver.findElementByXPath("//android.widget." +
                "ImageView[@resource-id=\"trendyol.com:id/imageViewTooltipClose\"]");
        element4.click();


        Thread.sleep(2000);
        MobileElement element5 = (MobileElement) driver.findElementByXPath("//android.widget." +
                "EditText[@content-desc=\"Ara\"]");
        element5.sendKeys("Kadın" + Keys.ENTER);



        Thread.sleep(2000);
        MobileElement element6 = (MobileElement) driver.findElementByXPath("//android.widget." +
                "ImageView[@content-desc=\"Ara\"]");
        element6.click();


        Thread.sleep(2000);
        MobileElement element7 = (MobileElement) driver.findElementByXPath("//android.widget." +
                "EditText[@content-desc=\"Ara\"]");
        element7.click();
        element7.sendKeys("Kadın" + Keys.ENTER);












    }
}
