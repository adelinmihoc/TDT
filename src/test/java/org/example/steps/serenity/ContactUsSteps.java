package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.ContactUsPage;

public class ContactUsSteps {

    ContactUsPage contactUsPage;

    @Step
    public void enterSubject(String subject) {
        contactUsPage.enterSubject(subject);
    }

    @Step
    public void enterDescription(String description){
        contactUsPage.enterDescription(description);
    }

    @Step
    public void clickContactUs(){
        contactUsPage.clickContactUs();
    }

    @Step
    public void submit() {
        contactUsPage.submit();
    }

    @Step
    public void isTheContactUsPage(){
        contactUsPage.open();
    }

    public void contactUs(String subject, String description){
        enterSubject(subject);
        enterDescription(description);
        submit();
    }


}
