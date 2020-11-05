package PageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MenuListPage extends BasePage {

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").resourceId(\"com.google.android.calendar:id/label\").index(0)")
    public MobileElement threeDays;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"3 days\")")
    public MobileElement theeDays;

    public MenuListPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    public void click3Days() {
        theeDays.click();
    }
}
