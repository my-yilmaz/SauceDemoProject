package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Screens;
import utilities.Driver;
import utilities.Log;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.*;

public class US001_ProductPageStepDefs {
    Screens screens = new Screens();

    @Given("Install the application")
    public void install_the_application() {
        Driver.getAppiumDriver();
        ReusableMethods.wait(15);
        Log.info("Installed the application");
    }

    @Then("Verify the Logo on the login page")
    public void verify_the_logo_on_the_login_page() {
        Log.startTestCase("US001 TC01 Product Page Test");
        waitToBeVisible(screens.loginPage().logo, 15);
        assertTrue(screens.loginPage().logo.isDisplayed());
        Log.info("Verified the Logo on the login page");
    }

    @Then("Verify the username and password box are enabled")
    public void verify_the_username_and_password_box_are_enabled() {
        assertTrue(screens.loginPage().usernameBox.isEnabled());
        assertTrue(screens.loginPage().passwordBox.isEnabled());
        Log.info("Verified the username and password box are enabled");
    }

    @Then("Verify the login button on the login page")
    public void verify_the_login_button_on_the_login_page() {
        assertTrue(screens.loginPage().loginButton.isDisplayed());
        Log.info("Verified the login button on the login page");
    }

    @Then("Verify the login and password credentials on the login page")
    public void verify_the_login_and_password_credentials_on_the_login_page() {
        scrollWithUiScrollable("secret_sauce");
        assertTrue(screens.loginPage().standardUser.isDisplayed());
        assertTrue(screens.loginPage().password.isDisplayed());
        Log.info("Verified the login and password credentials on the login page");
        Log.endTestCase("US001 TC01 Product Page Test");
    }

    @And("User is Login as a standard user")
    public void userIsLoginAsAStandardUser() {
        Log.startTestCase("US001 TC02 Items on the products page Test");
        tapOnElementWithText("standard_user");
        tapOn(screens.loginPage().loginButton);
        Log.info("logged in as standart_user");
    }

    @Then("User validations the Landing page logo")
    public void userValidationsTheLandingPageLogo() {
        waitToBeVisible(screens.productPage().productLogo, 10);
        assertTrue(screens.productPage().productLogo.isDisplayed());
        Log.info("Verified the Landing page logo");
    }

    @Then("User validations the PRODUCTS title")
    public void userValidationsThePRODUCTSTitle() {
        assertTrue(screens.productPage().productTitle.isDisplayed());
        Log.info("Verified the PRODUCTS title");
    }

    @Then("User verify the the Product listing button is enabled")
    public void userVerifyTheTheProductListingButtonIsEnabled() {
        assertTrue(screens.productPage().listingButton.isEnabled());
        Log.info("Verified the the Product listing button is enabled");
        Log.endTestCase("US001 TC02 Items on the products page Test");
    }
}

