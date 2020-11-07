package StepDefinitions;

import cucumber.api.java.it.Date;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.joda.time.LocalDate;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class TestNG {
    public static URL url;
    public static DesiredCapabilities capabilities;

    @Test
    public void setupAppium() throws MalformedURLException {

        final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
        url = new URL(URL_STRING);

        capabilities = new DesiredCapabilities();
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("platformVersion", "13.4");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("deviceName", "iPhone 11 Pro Max");
        capabilities.setCapability("udid", "90A630D4-AF7D-4197-8FEB-3ED7EFE0E75B");
        capabilities.setCapability("bundleId", "com.apple.mobilecal");

        IOSDriver<MobileElement> driver = new IOSDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // What's New in Calendar
        // System.out.println(driver.findElement(By.id("What’s New in Calendar")).getText());

        // Continue Button
//        if(driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Continue\"]\n")).isDisplayed()){
//            driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Continue\"]\n")).click();
//        }

        // Click Plus Button
        driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Add\"]\n")).click();

        // Write Title
        driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Calendar\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther\n")).sendKeys("Test Event");
        driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Calendar\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther\n")).click();

        // Write Location
        try {
            driver.findElement(By.id("Enter Location")).sendKeys("Sydney");
            driver.findElement(By.id("Enter Location")).sendKeys(Keys.ENTER);
            // xpath = //XCUIElementTypeSearchField[@name="Enter Location"]
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Meeting Starts
        driver.findElement(By.id("Starts")).click();

        // Today
        Integer today = Integer.parseInt(LocalDate.now().toString("d-MMMM-YYYY").split("-")[0]);

        List<MobileElement> mList = driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Calendar\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeButton\n"));

        for (int j = 0; j < 3; j++) {
            for (int i = today + j; i < mList.size(); i++) {

                if (i == mList.size()) {
                    break;
                }

//                // Skip Saturday
//                if (mList.get(i).getText().contains("Saturday")) {
//                    i = i + 2;
//                }
//                // Skip Sunday
//                if (mList.get(i).getText().contains("Sunday")) {
//                    i = i + 1;
//                }

                System.out.println("Element - " + mList.get(i).getText());

                if ((mList.get(i).getText().contains("Monday") || mList.get(i).getText().contains("Wednesday") || mList.get(i).getText().contains("Friday")) && (Integer.parseInt(mList.get(i).getText().split(" ")[2])) > (i)) {
                    System.out.println("Day - " + mList.get(i).getText());
                    mList.get(i).click();
                    break;
                }
            }
        }

//        for (int i = 0; i < mList.size(); i++) {
//
//            if (i == 30){
//                break;
//            }
//
//            // Skip Saturday
//            if (mList.get(i).getText().contains("Saturday")) {
//                i = i + 2;
//            }
//            // Skip Sunday
//            if (mList.get(i).getText().contains("Sunday")) {
//                i = i + 1;
//            }
//
//            System.out.println("Element - " + mList.get(i).getText());
//
//            if ((mList.get(i).getText().contains("Monday") || mList.get(i).getText().contains("Wednesday") || mList.get(i).getText().contains("Friday")) && (Integer.parseInt(mList.get(i).getText().split(" ")[2])) >= today ) {
//                System.out.println("Day - " + mList.get(i).getText());
//                mList.get(i).click();
//                break;
//            }
//        }

        // Enter Time
        driver.findElement(By.xpath("//XCUIElementTypeTextField[@name=\"Time\"]\n")).sendKeys("600");

        // Click PM
        driver.findElement(By.id("PM")).click();

        // Hide Starts Overlay
        driver.findElement(By.id("Starts")).click();

        // Meeting Ends - Click on Ends
         driver.findElement(By.id("Ends")).click();

        // Check End Time has correct time
        System.out.println("End Time Text - " + driver.findElement(By.xpath("//XCUIElementTypeTextField[@name=\"Time\"]\n")).getText());
        System.out.println("End Time PM/AM - " + driver.findElement(By.id("PM")).getText());

        // Click on Ends again
        driver.findElement(By.id("Ends")).click();

        // Click on Repeat
        driver.findElement(By.id("Repeat")).click();

        // Click Every Week
        driver.findElement(By.id("Every Week")).click();

        // Click Add Button
        driver.findElement(By.id("Add")).click();

        // Assert Plus Button is displayed
        System.out.println("Assert Plus Button is displayed");
//        Assert.assertEquals(driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Add\"]\n")).isDisplayed(), true);

        // Assert that meeting has been setup
        System.out.println("Assert that meeting has been setup");
//        Assert.assertEquals(driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Test Event, Sydney, from 6:00 PM to 7:00 PM\"]\n")).isDisplayed(), true);
    }

    @Test
    public void getDate() {
//        Integer today = Integer.parseInt(LocalDate.now().toString("d-MMMM-YYYY").split("-")[0]);
//         String today =  LocalDate.now().dayOfWeek().getAsText();
//        Date today = new Date();
//     System.out.println(String.format("Today - " + today, "d-MMMM-YYYY"));

        ArrayList myList = new ArrayList(10);
        myList.add("Shivesh");
        myList.add(10);
        System.out.println(myList.size());
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