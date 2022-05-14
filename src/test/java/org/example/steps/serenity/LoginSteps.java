package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.LoginPage;

public class LoginSteps {

    LoginPage landingPage;

    @Step
    public void entersUsername(String username) {
        landingPage.enterUsername(username);
    }

    @Step
    public void entersPassword(String password) {
        landingPage.enterPassword(password);
    }

    @Step
    public void submitLogin() {
        landingPage.submit();
    }

    @Step
    public void isTheLoginPage() {
        landingPage.open();
    }

    public void login(String username, String password) {
        entersUsername(username);
        entersPassword(password);
        submitLogin();
    }
}
