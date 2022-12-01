@US001
Feature: Login as a standard user to verify the products page and logout from the application

  @TC01
  Scenario: TC01 User validates data on login page
    Given User is on the Login Page
    Then Verify the Logo, title, url on the login page
    Then Verify the username and password box are enabled
    Then Verify the login button on the login page
    Then Verify the login and password credentials on the login page

  @TC02 @SauceDemo
  Scenario: TC02 User logs in and validates items on the products page
    And User is Login as a standard user
    Then User validations the Landing page logo and URL
    Then User validations the PRODUCTS title
    Then User validations the peek image visible

  @TC03 @SauceDemo
  Scenario: TC03 User validates items on the Burger menu
    Given User is Login as a standard user
    And User clicks Burger menu
    Then User verify that all items in Burger menu are visible
    Then Confirms user goes to saucelabs page when clicking About
    And User comes back to SauceDemo page
    And User exits Burger menu

  @TC04 @SauceDemo
  Scenario: TC04 User validates the shopping cart icon and product sort container
    Given User is Login as a standard user
    Then User verify the shopping cart icon are visible
    Then User verify the the product sort container is visible
    Then User verify the items in product sort bar are visible
    And User selects the Product sort container as Price low to high
    Then User verify that the price of products is from low to high

  @TC05 @SauceDemo
  Scenario: TC05 User validates the footer
    Given User is Login as a standard user
    Then User verify the footer text and swag bot footer is visible
    Then User verify the Twitter, Facebook, Linkedin logo visible
    Then Click on Twitter social link and verify user is navigated to Twitter page
    Then Click on Facebook social link and verify user is navigated to Facebook page
    Then Click on LinkedIn social link and verify user is navigated to LinkedIn page
    Then Logs out user from application and validates login page



