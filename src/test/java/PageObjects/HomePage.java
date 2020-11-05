package PageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends BasePage {

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageButton\").content-desc(\"Show Calendar List and Settings drawer\").index(0)")
    public MobileElement menuBtn;

    public HomePage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    public Boolean checkMenuButtonIsDisplayed() {
        return menuBtn.isDisplayed();
    }

    public void clickBurgerMenuButton() {
        menuBtn.click();
    }
}
