package stepDefinitions;

import io.appium.java_client.TouchAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Screens;
import utilities.Driver;

import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.scrollWithUiScrollable;
import static utilities.ReusableMethods.waitToBeVisible;

public class US001_ProductPageStepDefs {
    Screens screens = new Screens();

    @Given("Install the application")
    public void ınstallTheApplication() {
        Driver.getAppiumDriver();
    }

    @Then("Verify the Logo on the login page")
    public void verifyTheLogoOnTheLoginPage() {
        waitToBeVisible(screens.loginPage().logo, 15);
        assertTrue(screens.loginPage().logo.isDisplayed());
    }

    @Then("Verify the username and password box are enabled")
    public void verify_the_username_and_password_box_are_enabled() {
        assertTrue(screens.loginPage().usernameBox.isEnabled());
        assertTrue(screens.loginPage().passwordBox.isEnabled());
    }


    @Then("Verify the login button on the login page")
    public void verify_the_login_button_on_the_login_page() {
        assertTrue(screens.loginPage().loginButton.isDisplayed());
    }

    @Then("Verify the login and password credentials on the login page")
    public void verify_the_login_and_password_credentials_on_the_login_page() {
        scrollWithUiScrollable("secret_sauce");
        assertTrue(screens.loginPage().standardUser.isDisplayed());
        assertTrue(screens.loginPage().password.isDisplayed());
    }

}

