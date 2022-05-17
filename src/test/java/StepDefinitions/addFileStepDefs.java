package StepDefinitions;

import  io.cucumber.java.en.*;
import org.junit.Assert;
import pages.FilesDasboard;
import pages.HomePage;
import pages.LoginPage;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.Environment;

public class addFileStepDefs {
LoginPage loginPage = new LoginPage();
HomePage homePage = new HomePage();
FilesDasboard filesDasboard = new FilesDasboard();

    @Given("User logs in to tryCloud app")
    public void user_logs_in_to_tryCloud_app() {
        Driver.getDriver().get(Environment.URL);
        loginPage.logIn(Environment.USERNAME,Environment.PASSWORD);

    }

    @When("User hovers to app menu and click on {string}")
    public void user_hovers_to_app_menu_and_click_on(String appMenu) {

        homePage.clickOnAppMenu(appMenu);


    }

    @Then("User should be landed to files dashboard")
    public void user_should_be_landed_to_files_dashboard() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Files"));

    }

    @Then("User right clicks {string}")
    public void user_right_clicks(String firstFile) {
        filesDasboard.selectFile(firstFile);

    }



    @Then("{string} should have a star sign on top of the icon")
    public void should_have_a_star_sign_on_top_of_the_icon(String string) {
        BrowserUtils.waitFor(1);
        Assert.assertTrue(filesDasboard.favoriteLogo.isDisplayed());
        BrowserUtils.waitFor(1);

    }


    @Then("{string} should be moved to {string} folder")
    public void should_be_moved_to_folder(String string, String string2) {
        BrowserUtils.clickWithJS(filesDasboard.favoriteFolder);
        BrowserUtils.waitForPageToLoad(10);
        System.out.println(filesDasboard.selectedFile.isDisplayed());
        Assert.assertTrue(filesDasboard.selectedFile.isDisplayed());

    }

}
