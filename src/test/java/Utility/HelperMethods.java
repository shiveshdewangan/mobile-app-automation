package Utility;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.joda.time.LocalDate;
import org.openqa.selenium.JavascriptExecutor;

import java.util.HashMap;
import java.util.List;

public class HelperMethods {

    public int getToday() {
        Integer today = Integer.parseInt(LocalDate.now().toString("d-MMMM-YYYY").split("-")[0]);
        return today;
    }

    public boolean isMonday(List<IOSElement> iList, Integer i) {
        return iList.get(i).getText().contains("Monday");
    }

    public boolean isWednesday(List<IOSElement> iList, Integer i) {
        return iList.get(i).getText().contains("Wednesday");
    }

    public boolean isFriday(List<IOSElement> iList, Integer i) {
        return iList.get(i).getText().contains("Friday");
    }

    public void swipeRight(IOSDriver<MobileElement> driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("direction", "right");
        scrollObject.put("duration", "5000");
        js.executeScript("mobile: scroll", scrollObject);
    }
}
