package StepDefinitions;

import PageObjects.HomePage;
import PageObjects.MenuListPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;

public class Steps {

    public HomePage homePage;
    public MenuListPage menuListPage;
    private AndroidDriver<MobileElement> driver;

    public Steps() {
        this.driver = Hooks.getDriver();
    }

    @Given("^I have launched the Calendar App$")
    public void i_have_launched_the_Calendar_App() throws Exception {
        System.out.println("Testing");

        homePage = new HomePage(driver);
        menuListPage = new MenuListPage(driver);

        if (homePage.checkMenuButtonIsDisplayed()) {
            homePage.clickBurgerMenuButton();
//            menuListPage.click3Days();
        } else {
            Assert.fail("Home Page was not displayed");
        }
    }

    @When("^It is not a non working day$")
    public void it_is_not_a_non_working_day() throws Exception {
        System.out.println("Testing");
    }

    @When("^Meeting is not repeated on successive days$")
    public void meeting_is_not_repeated_on_successive_days() throws Exception {
        System.out.println("Testing");
    }

    @Then("^I want to book a meeting with the title “Recurring-Team Catch Up”$")
    public void i_want_to_book_a_meeting_with_the_title_Recurring_Team_Catch_Up() throws Exception {
        System.out.println("Testing");
    }

    @Then("^Set Meeting duration as \"([^\"]*)\" in the evening$")
    public void set_Meeting_duration_as_in_the_evening(String duration_of_meeting) throws Exception {
        System.out.println("Testing");
    }

    @Then("^I invite \"([^\"]*)\" of people$")
    public void i_invite_of_people(String number_of_people) throws Exception {
        System.out.println("Testing");
    }

    @Then("^I save the meeting$")
    public void i_save_the_meeting() throws Exception {
        System.out.println("Testing");
    }

    @Then("^I Check if the meeting is created as expected$")
    public void i_Check_if_the_meeting_is_created_as_expected() throws Exception {
        System.out.println("Testing");
    }
}
