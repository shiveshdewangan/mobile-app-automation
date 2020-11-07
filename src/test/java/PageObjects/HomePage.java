package PageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.*;
import io.appium.java_client.ios.IOSElement;

public class HomePage extends BasePage {

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Add\"]\n")
    public IOSElement plusBtn;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Recurring-Team Catch Up, Sydney, from 6:00 PM to 7:00 PM\"]\n")
    public IOSElement meetingDetails;

    public HomePage(IOSDriver<MobileElement> driver) {
        super(driver);
    }

    public boolean isPlusButtonDisplayed(){
        return plusBtn.isDisplayed();
    }

    public void clickPlusButton() {
        plusBtn.click();
    }

    public boolean validateMeeting() {
        return meetingDetails.isDisplayed();
    }
}
