package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.ContactUsPage;
import org.junit.Assert;

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

    @Step
    public void checkMessage() {
        String message = contactUsPage.displayMessage();
        Assert.assertNotEquals("The message should be one of success","Cannot send your request!",message);
    }

    public void contactUs(String subject, String description) throws InterruptedException {
        enterSubject(subject);
        enterDescription(description);
        submit();
        Thread.sleep(1000);
        checkMessage();
    }


}
