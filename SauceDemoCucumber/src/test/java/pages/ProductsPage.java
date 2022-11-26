package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductsPage {
    public ProductsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "app_logo")
    public WebElement productsPageLogo;
    @FindBy(xpath = "//span[text()='Products']")
    public WebElement productsTitle;
    @FindBy(className = "peek")
    public WebElement peeekImage;


}
