package PageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.*;
import io.appium.java_client.ios.IOSElement;

public class RepeatPage extends BasePage {

    @iOSFindBy(id = "Every Week")
    public IOSElement everyWeekOption;

    public RepeatPage(IOSDriver<MobileElement> driver) {
        super(driver);
    }

    public void clickEveryWeekOption() {
        everyWeekOption.click();
    }

}
