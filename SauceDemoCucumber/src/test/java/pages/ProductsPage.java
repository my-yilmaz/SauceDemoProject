package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

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

    @FindBy(id = "react-burger-menu-btn")
    public WebElement burgerMenu;

    @FindBy(id = "inventory_sidebar_link")
    public WebElement allItemsLink;

    @FindBy(id = "about_sidebar_link")
    public WebElement aboutLink;

    @FindBy(id = "logout_sidebar_link")
    public WebElement logoutLink;

    @FindBy(id = "reset_sidebar_link")
    public WebElement resetAppState;

    @FindBy(id = "react-burger-cross-btn")
    public WebElement burgerMenuCrossButton;

    @FindBy(className = "shopping_cart_link")
    public WebElement shoppingIcon;

    @FindBy(className = "product_sort_container")
    public WebElement productSortContainer;

    @FindBy(xpath = "//option[text()='Name (A to Z)']")
    public WebElement nameAtoZ;

    @FindBy(xpath = "//option[text()='Name (Z to A)']")
    public WebElement nameZtoA;

    @FindBy(xpath = "//option[text()='Price (low to high)']")
    public WebElement priceLoHi;

    @FindBy(xpath = "//option[text()='Price (high to low)']")
    public WebElement priceHiLo;

    @FindBy(className = "product_sort_container")
    public WebElement select;

    @FindBy(className = "inventory_item_price")
    public List<WebElement> inventoryItemPrice;




}
