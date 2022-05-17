package org.example.features.Adelin;

import net.thucydides.core.annotations.Steps;
import org.example.features.BaseStory;
import org.example.steps.serenity.AddBuildingSteps;
import org.junit.Test;

public class AddBuildingStory extends BaseStory {

    @Steps
    private AddBuildingSteps addBuildingSteps;

    @Test
    public void addBuildingTest() throws InterruptedException {
        loginSteps.isTheLoginPage();
        loginSteps.login("adelinmihoc@gmail.com", "X9zfxhZeU6Py9WD");
        Thread.sleep(2000);
        addBuildingSteps.isTheAddBuildingPage();
        Thread.sleep(2000);
        addBuildingSteps.addBuilding("hihihi", "120");
    }
}
