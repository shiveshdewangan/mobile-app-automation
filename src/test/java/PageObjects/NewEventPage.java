package PageObjects;

import Utility.HelperMethods;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSFindBy;

import java.util.List;

public class NewEventPage extends BasePage {

    @iOSFindBy(id = "Title")
    public IOSElement titleField;

    @iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Calendar\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther\n")
    public IOSElement locationField;

    @iOSFindBy(id = "Starts")
    public IOSElement startsTab;

    @iOSFindBy(xpath = "//XCUIElementTypeTextField[@name=\"Time\"]\n")
    public IOSElement timeField;

    @iOSFindBy(id = "PM")
    public IOSElement startTimePmField;

    @iOSFindBy(id = "Ends")
    public IOSElement endsTab;

    @iOSFindBy(xpath = "//XCUIElementTypeTextField[@name=\"Time\"]\n")
    public IOSElement endTime;

    @iOSFindBy(id = "PM")
    public IOSElement endTimePmField;

    @iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Calendar\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeButton\n")
    public List<IOSElement> calDateList;

    @iOSFindBy(id = "Repeat")
    public IOSElement repeatLink;

    @iOSFindBy(id="Weekly")
    public IOSElement selectWeekly;

    @iOSFindBy(id = "Add")
    public IOSElement addBtn;

    public NewEventPage(IOSDriver<MobileElement> driver) {
        super(driver);
    }

    public boolean checkTitleExists() {
        return titleField.isDisplayed();
    }

    public void enterTitle(String title) {
        titleField.sendKeys(title);
    }

    public void clickLocationField() {
        locationField.click();
    }

    public void clickStartsTab() {
        startsTab.click();
    }

    public void enterTime(String start_time) {
        timeField.sendKeys(start_time);
    }

    public void selectPM() {
        startTimePmField.click();
    }

    public void clickEndsTab() {
        endsTab.click();
    }

    public String getEndTime() {
        return endTime.getText();
    }

    public void selectWeekdayForMeeting(String index) {
        Integer idx = Integer.parseInt(index);

        HelperMethods helperMethods = new HelperMethods();
        Integer today = helperMethods.getToday();

        for (int i = (today + idx); i < calDateList.size(); i++) {

            if (i == calDateList.size()) {
                break;
            }

            boolean isMonday = calDateList.get(i).getText().contains("Monday");
            boolean isWednesday = calDateList.get(i).getText().contains("Wednesday");
            boolean isFriday = calDateList.get(i).getText().contains("Friday");
            boolean isCalDateAfterToday = (Integer.parseInt(calDateList.get(i).getText().split(" ")[2])) > (i);

            if ((isMonday || isWednesday || isFriday) && isCalDateAfterToday) {
                calDateList.get(i).click();
                break;
            }
        }
    }

    public void clickRepeatLink() {
        repeatLink.click();
    }

    public String getSelectedWeeklyText() {
        return selectWeekly.getText();
    }

    public void clickAddButton() {
        addBtn.click();
    }
}

