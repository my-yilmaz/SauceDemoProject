class ProductsPage{

    getProductsLogo(){
       return cy.get('.app_logo');
    }

    getProductsTitle(){
        return cy.get('.title');
    }

    getPeek(){
       return cy.get('.peek');
    }
    
}
export default ProductsPage