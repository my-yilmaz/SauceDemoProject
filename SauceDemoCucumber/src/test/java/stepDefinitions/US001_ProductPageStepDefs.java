package stepDefinitions;

import io.cucumber.java.en.*;
import pages.AllPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.Log;

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
}