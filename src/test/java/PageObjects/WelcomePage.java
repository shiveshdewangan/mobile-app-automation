package PageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.*;
import io.appium.java_client.ios.IOSElement;

public class WelcomePage extends BasePage {

    @iOSFindBy(id = "What’s New in Calendar")
    public IOSElement whatsNewInCalendarText;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Continue\"]\n")
    public IOSElement continueBtn;

    public WelcomePage(IOSDriver<MobileElement> driver) {
        super(driver);
    }

    public Boolean checkWhatsNewInCalendarTextExist(){
        return whatsNewInCalendarText.isDisplayed();
    }

    public void clickContinueButton(){
        continueBtn.click();
    }
}
