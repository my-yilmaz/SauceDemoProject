import LoginPage from "../pages/LoginPage";
import ProductsPage from "../pages/ProductsPage";
const { Given, When, Then,} = require("@badeball/cypress-cucumber-preprocessor");
const loginPage = new LoginPage();
const productsPage = new ProductsPage();


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

When("User is Login as a standard user", () => {
    loginPage.getUserNameBox().type("standard_user");
    loginPage.getPasswordBox().type("secret_sauce");
    loginPage.getLoginButton().click();
  });

  Then("User validations the Landing page logo and URL", () => {
    productsPage.getProductsLogo().should("be.visible");
    cy.url().should("include", "inventory");
  });

  Then("User validations the PRODUCTS title", () => {
    productsPage.getProductsTitle().should("have.text","Products");
  });

  Then("User validations the peek image visible", () => {
    productsPage.getPeek().should("be.visible");
  });

  Then("User clicks Burger menu", () => {
   productsPage.getBurgerMenu().click()
  });

  Then("User verify that all items in Burger menu are visible", () => {
   productsPage.getAbout().should("be.visible")
   productsPage.getLogout().should("be.visible")
   productsPage.getResetApp().should("be.visible")
  });

  Then("Confirms user goes to saucelabs page when clicking About", () => {
    productsPage.getAbout().click()
    cy.url().should('include','saucelabs.com')
  });

  Then("User comes back to SauceDemo page and verify of page", () => {
    cy.go("back");
    productsPage.getProductsLogo().should("be.visible");
  });
  Then("User verify the shopping cart icon are visible", () => {
    productsPage.getShoppinCartIcon().should('be.visible')
  });
  Then("User verify the the product sort container is visible", () => {
    productsPage.getProductSortContainer().should('be.visible')
  });
  Then("User verify the items in product sort bar are visible", () => {
    productsPage.getProductSortContainer().select('Name (A to Z)')
    productsPage.getProductSortContainer().should('have.value','az')
    productsPage.getProductSortContainer().select('Name (Z to A)')
    productsPage.getProductSortContainer().should('have.value','za')
    productsPage.getProductSortContainer().select('Price (low to high)')
    productsPage.getProductSortContainer().should('have.value','lohi')
    productsPage.getProductSortContainer().select('Price (high to low)')
    productsPage.getProductSortContainer().should('have.value','hilo')
  });

  Then("User selects the Product sort container as Price low to high", () => {
    productsPage.getProductSortContainer().select('Price (low to high)')
  });

  Then("User verify that the price of products is from low to high", () => {
  const price= []
  cy.document().then((doc) => {
    const itemsCount = doc.querySelectorAll('*[class="inventory_item_price"]').length
    for(var i=0; i<itemsCount; i++) {
      price.push(doc.querySelectorAll('*[class="inventory_item_price"]')[i].innerText);
    };
  });
  const newPrices=[]

  cy.document().then(()=>{
    for (let i = 0; i < array.length; i++) {
      const element = price[i]
      newPrices.push(element)
  }
})
  
  console.log(price);
  console.log(newPrices)
});
  // Then("", () => {});