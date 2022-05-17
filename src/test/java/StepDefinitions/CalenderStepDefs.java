package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.CalendarPage;
import pages.DashboardPage;
import utilities.BrowserUtils;
import utilities.Driver;

import java.util.List;

public class CalenderStepDefs {

    DashboardPage dashboardPage = new DashboardPage();

    @When("the user click on calenderMenu")
    public void theUserClickOnCalenderMenu() {
        dashboardPage.calendarMenu.click();


        //selenium code
        System.out.println("the user clicked on to Calender");
    }


    @Then("the title should be {string}")
    public void theTitleShouldBe(String expectedTitle) {
        BrowserUtils.waitFor(4);
        String actualTitle= Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));

        System.out.println("Expected and Actual title are matching");
    }

    CalendarPage calendarPage = new CalendarPage();

    @When("the user click on to Hamburger menu")
    public void the_user_click_on_to_Hamburger_menu() {
        BrowserUtils.waitFor(3);
        calendarPage.hamburgerButton.click();
    }

    @Then("User should see & click following options")
    public void user_should_see_click_following_options(List<String> expected) {

            for (int i = 0; i < expected.size(); i++) {
                BrowserUtils.waitFor(3);
                WebElement eachElement=calendarPage.hamburgerOption.get(i);//website sa day
                eachElement.click();
                System.out.println("eachElement ="+eachElement.getText());//day
                System.out.println("expected.get(i) = " + expected.get(i));//day

                Assert.assertEquals(expected.get(i),eachElement.getText());
            }

//            Actions actions = new Actions(Driver.getDriver());
//            actions.moveToElement(eachElement).perform();
//            actions.click(eachElement).perform();


    }


}
