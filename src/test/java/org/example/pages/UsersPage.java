package org.example.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
@DefaultUrl("https://lighthouse-demo.evozon.com/users")
public class UsersPage extends PageObject {
    @FindBy(name = "setSearchKey")
    private WebElementFacade searchUserInput;

    public void lookUp(String userName){
        searchUserInput.type(userName);
    }






}
