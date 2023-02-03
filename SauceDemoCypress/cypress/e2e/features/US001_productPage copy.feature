Feature: Login as a standard user to verify the products page and logout from the application

Background: Login Page
Given User is on the Login Page
  
  @TC01
  Scenario: TC01 User validates data on login page
    Then Verify the Logo, title, url on the login page
    Then Verify the username and password box are enabled
    Then Verify the login button on the login page
    Then Verify the login and password credentials on the login page

  @TC02
  Scenario: TC02 User logs in and validates items on the products page
    And User is Login as a standard user
    Then User validations the Landing page logo and URL
    Then User validations the PRODUCTS title
    Then User validations the peek image visible

    @TC03
  Scenario: TC03 User validates items on the Burger menu
    Given User is Login as a standard user
    And User clicks Burger menu
    Then User verify that all items in Burger menu are visible
    Then Confirms user goes to saucelabs page when clicking About
    And  User comes back to SauceDemo page and verify of page
    
    @TC04
  Scenario: TC04 User validates the shopping cart icon and product sort container
    Given User is Login as a standard user
    Then User verify the shopping cart icon are visible
    Then User verify the the product sort container is visible
    Then User verify the items in product sort bar are visible
    And User selects the Product sort container as Price low to high
    Then User verify that the price of products is from low to high