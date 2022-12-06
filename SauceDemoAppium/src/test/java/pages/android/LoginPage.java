package pages.android;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
    }

    @AndroidFindBy(xpath = "//android.widget.ImageView[1]")
    public AndroidElement logo;

    @AndroidFindBy(accessibility = "test-Username")
    public AndroidElement usernameBox;

    @AndroidFindBy(accessibility = "test-Password")
    public AndroidElement passwordBox;

    @AndroidFindBy(accessibility = "test-LOGIN")
    public AndroidElement loginButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='standard_user']")
    public AndroidElement standardUser;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='secret_sauce']")
    public AndroidElement password;

}
