package org.example.features;

import net.thucydides.core.annotations.Steps;
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
        addBuildingSteps.clickAddBuilding();
        addBuildingSteps.enterBuildingName("hehehehe");
        addBuildingSteps.enterSafeDistance("150");
        Thread.sleep(2000);
        addBuildingSteps.submit();
        Thread.sleep(10000);
    }
}
