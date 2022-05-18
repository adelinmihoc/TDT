package org.example.features.Doris;

import net.thucydides.core.annotations.Steps;
import org.example.features.BaseStory;
import org.example.steps.serenity.ContactUsSteps;
import org.junit.Test;

public class ContactUsStory extends BaseStory {

    @Steps
    private ContactUsSteps contactUsSteps;

    @Test
    public void contactUsTest() throws InterruptedException {
        loginSteps.isTheLoginPage();
        loginSteps.login("adelinmihoc@gmail.com", "X9zfxhZeU6Py9WD");
        Thread.sleep(2000);
        contactUsSteps.isTheContactUsPage();
        Thread.sleep(2000);
        contactUsSteps.contactUs("hhhhh", "asdasssssssssssssss");
//        contactUsSteps.enterSubject("Reporting bugs");
//        contactUsSteps.enterDescription("Found a bug here! Error when clicking on submit");
//        Thread.sleep(2000);
//        contactUsSteps.submit();
    }

}
