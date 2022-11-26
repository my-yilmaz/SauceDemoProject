package pages;

public class AllPages {
    public AllPages() {
    }

    private LoginPage loginPage;
    private ProductsPage productsPage;

    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public ProductsPage productsPage() {
        if (productsPage == null) {
            productsPage = new ProductsPage();
        }
        return productsPage;
    }
}
