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


