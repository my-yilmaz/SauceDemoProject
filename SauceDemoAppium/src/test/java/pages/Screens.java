package pages;

import pages.android.LoginPage;
import pages.android.ProductPage;

public class Screens {
    public Screens() {
    }

    private LoginPage loginPage;
    private ProductPage productPage;

    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }
    public ProductPage productPage() {
        if (productPage == null) {
            productPage = new ProductPage();
        }
        return productPage;
    }
}
