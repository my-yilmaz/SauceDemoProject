package pages.android;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductPage {
    public ProductPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
    }

    @AndroidFindBy(xpath = "//(android.widget.ImageView)[2]")
    public AndroidElement productLogo;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='PRODUCTS']")
    public AndroidElement productTitle;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Toggle']")
    public AndroidElement listingButton;

    @AndroidFindBy(accessibility = "test-LOGIN")
    public AndroidElement loginButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='standard_user']")
    public AndroidElement standardUser;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='secret_sauce']")
    public AndroidElement password;

}
