package StepDefinitions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestNG {
    public static URL url;
    public static DesiredCapabilities capabilities;
    public static AndroidDriver<MobileElement> driver;
    public static AppiumDriverLocalService service = null;

    @BeforeSuite
    public void setupAppium() throws MalformedURLException {

        service = AppiumDriverLocalService.buildDefaultService();
        final String URL_STRING = "http://127.0.0.0:4723/wd/hub";
        url = new URL(URL_STRING);

        // capabilities = new DesiredCapabilities();
        // capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        // capabilities.setCapability(MobileCapabilityType.APP, "https://github.com/afollestad/material-dialogs/raw/master/sample/sample.apk");
        // capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        // capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        // driver = new AndroidDriver<MobileElement>(url, capabilities);

        capabilities = new DesiredCapabilities();
        capabilities.setCapability("device", "Android");
        capabilities.setCapability("deviceName", "Android");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "com.google.android.calendar");
        capabilities.setCapability("appActivity", "com.android.calendar.LaunchActivity");
//        capabilities.setCapability("app", "app-leap-internal-release.apk");

        // service.start();
        // driver = new AndroidDriver<MobileElement>(service, capabilities);
        // driver = new IOSDriver<MobileElement>(url, capabilities);
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.resetApp();
    }

    //5
    @AfterSuite
    public void uninstallApp() throws InterruptedException {
//        driver.removeApp("com.example.android.contactmanager");
    }

    //6
    @Test(enabled = true)
    public void myFirstTest() throws InterruptedException {
//        driver.resetApp();
    }
}