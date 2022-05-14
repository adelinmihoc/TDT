package org.example.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;
import net.serenitybdd.core.pages.WebElementFacade;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://lighthouse-demo.evozon.com/login")
public class LoginPage extends PageObject {

    @FindBy(name = "username")
    private WebElementFacade usernameInput;

    @FindBy(name = "password")
    private WebElementFacade passwordInput;

    public void enterUsername(String username) {
        usernameInput.type(username);
    }

    public void enterPassword(String password) {
        passwordInput.type(password);
    }

    public void submit() {
        passwordInput.sendKeys(Keys.ENTER);
    }
}
