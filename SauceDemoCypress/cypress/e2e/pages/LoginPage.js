class LoginPage{
    getLoginLogo(){
       return cy.get('.login_logo')
    }

    getUserNameBox(){
        return cy.get('[data-test="username"]');
    }

    getPasswordBox(){
        return cy.get('[data-test="password"]');
    }

    getLoginButton(){
        return cy.get('[data-test="login-button"]');
    }

    getLoginCredentials(){
        return cy.get('.login_credentials_wrap-inner');
    }
}
export default LoginPage