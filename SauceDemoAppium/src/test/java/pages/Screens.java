package pages;

import pages.android.LoginPage;

public class Screens {
    public Screens() {
    }

    private LoginPage loginPage;

    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }
}
