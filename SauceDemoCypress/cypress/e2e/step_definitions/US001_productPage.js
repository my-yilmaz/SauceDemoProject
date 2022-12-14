import LoginPage from "../pages/LoginPage";
import ProductsPage from "../pages/ProductsPage";
const { Given, When, Then } = require("@badeball/cypress-cucumber-preprocessor");
const loginPage = new LoginPage();


/*** ---- login page step definitions  ---- ***/
Given("User is on the Login Page", () => {
    cy.visit("https://www.saucedemo.com/");
  });
  
  When("Verify the Logo, title, url on the login page", () => {
    cy.url().should('include','saucedemo');
    cy.title().should('contains','Swag Labs');
    loginPage.getLoginLogo().should("be.visible");
  });
  
  When("Verify the username and password box are enabled", () => {
    loginPage.getUserNameBox().should('be.enabled');
    loginPage.getPasswordBox().should('be.enabled');
  });
  
  Then("Verify the login button on the login page", () => {
    loginPage.getLoginButton().should('be.enabled');
  });
  
  Then ("Verify the login and password credentials on the login page", () => {
     loginPage.getLoginCredentials().should('include.text','standard_user');
     loginPage.getLoginCredentials().should('include.text','secret_sauce');
  });
