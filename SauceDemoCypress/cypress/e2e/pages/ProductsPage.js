class ProductsPage{

    getProductsLogo(){
       return cy.get('.app_logo')
    }

    getProductsTitle(){
        return cy.get('.title')
    }

    getPeek(){
       return cy.get('.peek')
    }

    getBurgerMenu(){
        return cy.get('#react-burger-menu-btn')
    }


    getAbout(){
        return cy.get('#about_sidebar_link')
    }

    getLogout(){
        return cy.get('#logout_sidebar_link')
    }

    getResetApp(){
        return cy.get('#reset_sidebar_link')
    }

    getShoppinCartIcon(){
        return cy.get('.shopping_cart_link')
    }
    
    getProductSortContainer(){
        return cy.get('[data-test="product_sort_container"]')
    }

    getInventoryItemPrice(){
        return cy.get('.inventory_item_price')
    }
    
}
export default ProductsPage