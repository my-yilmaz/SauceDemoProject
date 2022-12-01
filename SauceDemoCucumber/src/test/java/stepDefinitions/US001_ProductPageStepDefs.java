package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import pages.AllPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.Log;
import utilities.ReusableMethods;

import java.util.*;

import static org.junit.Assert.*;

public class US001_ProductPageStepDefs {
    AllPages allPages = new AllPages();

    @Given("User is on the Login Page")
    public void userIsOnTheLoginPage() {
        Log.startTestCase("US001 Product Page Test");
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
        Log.info("SauceDemo homepage");
    }

    @Then("Verify the Logo, title, url on the login page")
    public void verifyTheLogoTitleUrlOnTheLoginPage() {
        assertTrue(Driver.getDriver().getCurrentUrl().contains("saucedemo"));
        assertTrue(allPages.loginPage().logo.isDisplayed());
        assertEquals("Swag Labs", Driver.getDriver().getTitle());
        Log.info("Verified the Logo, title, url on the login page");
    }

    @Then("Verify the username and password box are enabled")
    public void verifyTheUsernameAndPasswordBoxAreEnabled() {
        assertTrue(allPages.loginPage().usernameBox.isDisplayed());
        assertTrue(allPages.loginPage().passwordBox.isDisplayed());
        Log.info("Verified the username and password box are enabled");
    }

    @Then("Verify the login button on the login page")
    public void verifyTheLoginButtonOnTheLoginPage() {
        assertTrue(allPages.loginPage().loginButton.isDisplayed());
        Log.info("Verified the login button on the login page");
    }

    @Then("Verify the login and password credentials on the login page")
    public void verifyTheLoginAndPasswordCredentialsOnTheLoginPage() {
        assertTrue(allPages.loginPage().standart_user.isDisplayed());
        assertTrue(allPages.loginPage().secret_sauce.isDisplayed());
        Log.info("Verified the standard login and password credentials on the login page");
    }

    @And("User is Login as a standard user")
    public void userIsLoginAsAStandardUser() {
        allPages.loginPage().usernameBox.sendKeys(ConfigReader.getProperty("standard_user"));
        allPages.loginPage().passwordBox.sendKeys(ConfigReader.getProperty("password"));
        allPages.loginPage().loginButton.submit();
        Log.info("The page has been successfully logged in");
    }

    @Then("User validations the Landing page logo and URL")
    public void userValidationsTheLandingPageLogoAndURL() {
        assertTrue(Driver.getDriver().getCurrentUrl().contains("inventory"));
        assertTrue(allPages.productsPage().productsPageLogo.isDisplayed());
        Log.info("Verified the Landing page logo and URL");

    }

    @Then("User validations the PRODUCTS title")
    public void userValidationsThePRODUCTSTitle() {
        assertEquals("PRODUCTS", allPages.productsPage().productsTitle.getText());
        Log.info("Verified the PRODUCTS title");
    }

    @Then("User validations the peek image visible")
    public void userValidationsThePeekImageVisible() {
        assertTrue(allPages.productsPage().peeekImage.isDisplayed());
        Log.info("Verified the peek image visible");
    }

    @And("User clicks Burger menu")
    public void userClicksBurgerMenu() {
        allPages.productsPage().burgerMenu.click();
        Log.info("User clicked Burger menu");
    }

    @Then("User verify that all items in Burger menu are visible")
    public void userVerifyThatAllItemsInBurgerMenuAreVisible() {
        ReusableMethods.waitFor(2);
        assertTrue(allPages.productsPage().allItemsLink.isDisplayed());
        assertTrue(allPages.productsPage().aboutLink.isDisplayed());
        assertTrue(allPages.productsPage().logoutLink.isDisplayed());
        assertTrue(allPages.productsPage().resetAppState.isDisplayed());
        Log.info("Verified that all items in Burger menu are visible");
    }

    @Then("Confirms user goes to saucelabs page when clicking About")
    public void confirmsUserGoesToSaucelabsPageWhenClickingAbout() {
        allPages.productsPage().aboutLink.click();
        assertEquals("https://saucelabs.com/", Driver.getDriver().getCurrentUrl());
        Log.info("Confirmed the saucelabs page is go when clicking of the about");
    }

    @And("User comes back to SauceDemo page")
    public void userComesBackToSauceDemoPage() {
        Driver.getDriver().navigate().back();
    }

    @And("User exits Burger menu")
    public void userExitsBurgerMenu() {
        allPages.productsPage().burgerMenuCrossButton.click();
        Log.info("User closed Burger menu");
    }

    @Then("User verify the shopping cart icon are visible")
    public void userVerifyTheShoppingCartIconAreVisible() {
        assertTrue(allPages.productsPage().shoppingIcon.isDisplayed());
        Log.info("Verified the shopping cart icon are visible");
    }

    @Then("User verify the the product sort container is visible")
    public void userVerifyTheTheProductSortContainerIsVisible() {
        assertTrue(allPages.productsPage().productSortContainer.isDisplayed());
        Log.info("Verified the the product sort container is visible");
    }

    @Then("User verify the items in product sort bar are visible")
    public void userVerifyTheItemsInProductSortBarAreVisible() {
        allPages.productsPage().productSortContainer.click();
        assertTrue(allPages.productsPage().nameAtoZ.isDisplayed());
        assertTrue(allPages.productsPage().nameZtoA.isDisplayed());
        assertTrue(allPages.productsPage().priceLoHi.isDisplayed());
        assertTrue(allPages.productsPage().priceHiLo.isDisplayed());
        Log.info("Verified the items in product sort bar are visible");
    }

    List<String> priceHiLo;
    @And("User selects the Product sort container as Price low to high")
    public void userSelectsTheProductSortContainerAsPriceLowToHigh() {
        allPages.productsPage().productSortContainer.click();
        allPages.productsPage().priceHiLo.click();
        List<WebElement> pricesHiLo = allPages.productsPage().inventoryItemPrice;
        priceHiLo = new ArrayList<>();
        for (WebElement each : pricesHiLo) {
            priceHiLo.add(each.getText().substring(1));
        }
        Collections.reverse(priceHiLo);
        allPages.productsPage().productSortContainer.click();
        allPages.productsPage().priceLoHi.click();
        Log.info("User selected the Product sort container as Price low to high");
    }

    @Then("User verify that the price of products is from low to high")
    public void userVerifyThatThePriceOfProductsIsFromLowToHigh() {
        List<WebElement> allPrice = allPages.productsPage().inventoryItemPrice;
        List<String> pricesLoHi = new ArrayList<>();
        for (WebElement each : allPrice) {
            pricesLoHi.add(each.getText().substring(1));
        }
        assertEquals(priceHiLo, pricesLoHi);
        Log.info("Verified that the price of products is from low to high");
    }

    @Then("User verify the footer text and swag bot footer is visible")
    public void userVerifyTheFooterTextAndSwagBotFooterIsVisible() {
    }

    @Then("User verify the Twitter, Facebook, Linkedin logo visible")
    public void userVerifyTheTwitterFacebookLinkedinLogoVisible() {
    }

    @Then("Click on Twitter social link and verify user is navigated to Twitter page")
    public void clickOnTwitterSocialLinkAndVerifyUserIsNavigatedToTwitterPage() {
    }

    @Then("Click on Facebook social link and verify user is navigated to Facebook page")
    public void clickOnFacebookSocialLinkAndVerifyUserIsNavigatedToFacebookPage() {
    }

    @Then("Click on LinkedIn social link and verify user is navigated to LinkedIn page")
    public void clickOnLinkedInSocialLinkAndVerifyUserIsNavigatedToLinkedInPage() {
    }

    @Then("Logs out user from application and validates login page")
    public void logsOutUserFromApplicationAndValidatesLoginPage() {
    }
}
