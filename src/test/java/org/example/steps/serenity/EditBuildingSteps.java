package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.BuildingsPage;

public class EditBuildingSteps {

    BuildingsPage page;

    @Step
    public void isTheBuildingPage(){
        page.open();
    }

    @Step
    public void selectOptions(){
        page.pushOptionsButton();
    }

    @Step
    public void selectEditOption(){
        page.selectEditOption();
    }

    @Step
    public void eneterNewBuildingName(String name){
        page.enterNewBuildingName(name);
    }

    @Step
    public void enterNewSafeDistance(String distance){

        page.enterNewSafeDistance(distance);
    }

    @Step
    public void pushSaveButton(){
        page.saveEditedInformation();
    }

    public void SaveNewBuildingInformation(String name,String dist){
        selectOptions();
        selectEditOption();
        eneterNewBuildingName(name);
        enterNewSafeDistance(dist);
        pushSaveButton();

    }

}
