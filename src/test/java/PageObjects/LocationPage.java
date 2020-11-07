package PageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.*;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.Keys;

public class LocationPage extends BasePage {

    @iOSFindBy(id = "Enter Location")
    public IOSElement locationTextField;

    public LocationPage(IOSDriver<MobileElement> driver) {
        super(driver);
    }

    public void enterLocation(String location) {
        locationTextField.sendKeys(location);
        locationTextField.sendKeys(Keys.ENTER);
    }
}
