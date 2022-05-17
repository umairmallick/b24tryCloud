package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public class LoginPage extends BasePage {

    @FindBy(id = "user")
    private WebElement userNameBox;

    @FindBy(id = "password")
    private WebElement passWordBox;

    @FindBy(id = "submit-form")
    private WebElement logInBtn;

    public void logIn(String userName, String password){
        userNameBox.sendKeys(userName);
        passWordBox.sendKeys(password);
        logInBtn.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.elementToBeClickable(Driver.getDriver().findElement(By.xpath("//button[@class='user-status-menu-item__toggle user-status-menu-item__toggle--inline']"))));
    }


}
