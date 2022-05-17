package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.AddBuildingPage;

public class AddBuildingSteps {

    AddBuildingPage addBuildingPage;

    @Step
    public void enterBuildingName(String buildingName) {
        addBuildingPage.enterBuildingName(buildingName);
    }

    @Step
    public void enterSafeDistance(String safeDistance) {
        addBuildingPage.enterSafeDistance(safeDistance);
    }

    @Step
    public void clickAddBuilding() {
        addBuildingPage.clickAddBuilding();
    }

    @Step
    public void submit() {
        addBuildingPage.submit();
    }

    @Step
    public void isTheAddBuildingPage() {
        addBuildingPage.open();
    }

    public void addBuilding(String buildingName, String safeDistance) {
        clickAddBuilding();
        enterBuildingName(buildingName);
        enterSafeDistance(safeDistance);
        submit();
    }

}
