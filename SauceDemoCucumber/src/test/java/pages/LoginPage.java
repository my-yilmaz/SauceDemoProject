package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "login_logo")
    public WebElement logo;
    @FindBy(id = "user-name")
    public WebElement usernameBox;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;
    @FindBy(id = "login-button")
    public WebElement loginButton;
    @FindBy(xpath = "//div[text()='standard_user']")
    public WebElement standart_user;
    @FindBy(xpath = "//div[text()='secret_sauce']")
    public WebElement secret_sauce;
}
