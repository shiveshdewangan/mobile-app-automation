package StepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Hooks {

    public static URL url;
    public static DesiredCapabilities capabilities;
    public static AndroidDriver<MobileElement> driver;

    public static AndroidDriver<MobileElement> getDriver() {
        return driver;
    }

    @Before
    public void setup() throws MalformedURLException {
        final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
        url = new URL(URL_STRING);

        capabilities = new DesiredCapabilities();
        capabilities.setCapability("device", "Android");
        capabilities.setCapability("deviceName", "Android");
        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("appPackage", "com.google.android.calendar");
        capabilities.setCapability("appPackage", "com.google.android.calendar");
        capabilities.setCapability("appActivity", "com.android.calendar.AllInOneActivity");

        driver = new AndroidDriver<MobileElement>(url, capabilities);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.resetApp();
    }

    @After
    public void cleanup() {
    }

    @BeforeMethod
    public void waitForEachMethodToFinish() throws InterruptedException {
        Thread.sleep(2000);
    }
}
