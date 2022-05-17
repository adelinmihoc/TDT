package org.example.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://lighthouse-demo.evozon.com/contact-us")
public class ContactUsPage extends PageObject {

    @FindBy(name="subject")
    private WebElementFacade subjectInput;

    @FindBy(name="description")
    private WebElementFacade descriptionInput;

    public void enterSubject(String subject){
        subjectInput.type(subject);
    }

    public void enterDescription(String description){
        subjectInput.type(description);
    }

    public void submit() {
        WebElementFacade contactUsButton = find(By.xpath("('//button[@type=\"submit\"]')"));
        contactUsButton.waitUntilEnabled().click();
    }

    public void clickContactUs(){
        WebElementFacade contactUsButton = find(By.xpath("('//button[@type=\"submit\"]')"));
        contactUsButton.click();
    }

}
