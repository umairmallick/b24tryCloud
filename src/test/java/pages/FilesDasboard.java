package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import utilities.BrowserUtils;
import utilities.Driver;

import java.util.List;

public class FilesDasboard extends BasePage{
   public WebElement selectedFile;

@FindBy(xpath = "//span[@class='innernametext']")
   private List<WebElement> listOfFile;

@FindBy(xpath = "//span[.='Add to favorites']")
private WebElement addToFavorite;

@FindBy(xpath = "//tr[@data-favorite='true']")
public WebElement favoriteLogo;

@FindBy(css = "a[class='nav-icon-favorites svg']")
public WebElement favoriteFolder;



public void selectFile(String fileName){
    BrowserUtils.waitForClickablility(Driver.getDriver().findElement(By.xpath("//span[@class='name']")),10 );
   // BrowserUtils.waitFor(5);
    Actions actions = new Actions(Driver.getDriver());
    for (WebElement each : listOfFile) {
        if(each.getText().equals(fileName)){
            selectedFile=each;
            actions.contextClick(each).perform();
            BrowserUtils.waitFor(2);
            BrowserUtils.clickWithJS(addToFavorite);
        }

        break;
    }
}

}
