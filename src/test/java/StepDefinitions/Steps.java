package StepDefinitions;

import PageObjects.*;
import Utility.HelperMethods;
import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.testng.Assert;

public class Steps {

    public HomePage homePage;
    public WelcomePage welcomePage;
    public NewEventPage newEventPage;
    public LocationPage locationPage;
    public RepeatPage repeatPage;

    public HelperMethods helperMethods = new HelperMethods();

    private IOSDriver<MobileElement> driver;

    public Steps() {
        this.driver = Hooks.getDriver();
    }

    @Given("^I have launched the Calendar App$")
    public void i_have_launched_the_Calendar_App() {
        welcomePage = new WelcomePage(driver);

        try {
            if (welcomePage.checkWhatsNewInCalendarTextExist()) {
                welcomePage.clickContinueButton();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^I click on the Plus Button$")
    public void i_click_on_the_plus_button() throws Throwable {
        homePage = new HomePage(driver);

        boolean homePageValidation = homePage.isPlusButtonDisplayed();

        if (homePageValidation) {
            Assert.assertEquals(homePageValidation, true);
            homePage.clickPlusButton();
        } else {
            Assert.fail("Home Page did not appear on time");
        }
    }

    @Then("^I enter the title as \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_the_title_as_something(String title, String sequence) throws Throwable {
        newEventPage = new NewEventPage(driver);

        boolean newEventsPageValidation = newEventPage.checkTitleExists();

        if (newEventsPageValidation) {
            Assert.assertEquals(newEventsPageValidation, true);
            newEventPage.enterTitle(title + " " + sequence);
        } else {
            Assert.fail("New Events Page did not appear on time");
        }
    }

    @And("^I enter the location as \"([^\"]*)\"$")
    public void i_enter_the_location_as_something(String location) throws Throwable {
        newEventPage.clickLocationField();
        locationPage = new LocationPage(driver);
        locationPage.enterLocation(location);
    }

    @Then("^I set the Start Time as \"([^\"]*)\"$")
    public void i_set_the_start_time_as_something(String start_time) throws Throwable {
        newEventPage.clickStartsTab();
        newEventPage.enterTime(start_time);
        newEventPage.selectPM();
    }

    @Then("^I select a week day for the meeting as per \"([^\"]*)\"$")
    public void i_select_a_week_day_for_the_meeting_as_per_something(String iteration) {
        newEventPage.selectWeekdayForMeeting(iteration);
        newEventPage.clickStartsTab();
    }

    @And("^I check the \"([^\"]*)\" of the meeting$")
    public void i_check_the_something_of_the_meeting(String end_time) throws Throwable {
        newEventPage.clickEndsTab();
        String endTime = newEventPage.getEndTime();
        Assert.assertEquals(endTime, "0" + end_time + ":00");
    }

    @Then("^I set weekly \"([^\"]*)\" of the meeting$")
    public void i_set_weekly_something_of_the_meeting(String frequency) throws Throwable {
        newEventPage.clickRepeatLink();
        repeatPage = new RepeatPage(driver);

        if (frequency.equalsIgnoreCase("Weekly")) {
            repeatPage.clickEveryWeekOption();
        }

        Assert.assertEquals(newEventPage.getSelectedWeeklyText(), frequency);
    }

    @Then("^I save the meeting$")
    public void i_save_the_meeting() {
        newEventPage.clickAddButton();
    }

    @Then("^I check if the meeting is created as expected$")
    public void i_check_if_the_meeting_is_created_as_expected() throws Throwable {

        boolean isVisible = false;

        while (!isVisible) {
            helperMethods.swipeRight(driver);
            isVisible = homePage.validateMeeting();
        }

        try {
            boolean isMeetingScheduled = homePage.validateMeeting();
            Assert.assertEquals(isMeetingScheduled, true);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
