package StepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Hooks {

    public static URL url;
    public static DesiredCapabilities capabilities;
    public static IOSDriver<MobileElement> driver;

    public static IOSDriver<MobileElement> getDriver() {
        return driver;
    }

    @Before
    public void setup() throws MalformedURLException {
        final String URL_STRING = "http://0.0.0.0:4723/wd/hub";
        url = new URL(URL_STRING);

        capabilities = new DesiredCapabilities();
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("platformVersion", "14.1");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("deviceName", "iPhone 12 Pro Max");
        capabilities.setCapability("udid", "90A630D4-AF7D-4197-8FEB-3ED7EFE0E75B");
        capabilities.setCapability("bundleId", "com.apple.mobilecal");

        driver = new IOSDriver<MobileElement>(url, capabilities);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @After
    public void cleanup() {
        driver.quit();
    }

    @BeforeMethod
    public void waitForEachMethodToFinish() throws InterruptedException {
        Thread.sleep(2000);
    }
}
