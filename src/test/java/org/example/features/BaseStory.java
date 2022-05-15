package org.example.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.example.steps.serenity.LoginSteps;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class BaseStory {

    @Managed(uniqueSession = true)
    protected WebDriver webDriver;

    @Steps
    protected LoginSteps loginSteps;

}
