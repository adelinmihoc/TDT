package org.example.features.Madalina;

import net.thucydides.core.annotations.Steps;
import org.example.features.BaseStory;
import org.example.steps.serenity.EditBuildingSteps;
import org.junit.Test;

public class EditBuildingsStory extends BaseStory {

    @Steps
    private EditBuildingSteps editBuildingSteps;

    @Test
    public void testEditBuilding()throws InterruptedException{
        loginSteps.isTheLoginPage();
        loginSteps.login("adelinmihoc@gmail.com", "X9zfxhZeU6Py9WD");
        Thread.sleep(2000);
        editBuildingSteps.isTheBuildingPage();
        Thread.sleep(2000);
        editBuildingSteps.SaveNewBuildingInformation("NameEditedBuilding","100000");
        System.out.println(editBuildingSteps.getNameOfEditedBuilding());
        assert(editBuildingSteps.getNameOfEditedBuilding().equals("NameEditedBuilding"));

    }
}
