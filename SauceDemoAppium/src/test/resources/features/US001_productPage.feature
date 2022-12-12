@US001
Feature: Login as a standard user to verify the products page and logout from the application

  Background:
    Given Install the application

  @TC01
  Scenario: TC01 User validates data on login page
    Then Verify the Logo on the login page
    Then Verify the username and password box are enabled
    Then Verify the login button on the login page
    Then Verify the login and password credentials on the login page

  @TC02
  Scenario: TC02 User logs in and validates items on the products page
    And User is Login as a standard user
    Then User validations the Landing page logo
    Then User validations the PRODUCTS title
    Then User verify the the Product listing button is enabled







