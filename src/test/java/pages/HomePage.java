package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public class HomePage extends BasePage {

    @FindBy(linkText = "Files")
    private WebElement fileBox;

    @FindBy(css = "image[preserveAspectRatio='xMinYMin meet']")
    public WebElement appMenu;

    public void clickOnAppMenu(String string){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(appMenu).perform();

        fileBox.click();
    }

}
