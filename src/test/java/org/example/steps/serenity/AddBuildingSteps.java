package org.example.steps.serenity;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.example.pages.AddBuildingPage;

import java.util.stream.Collectors;

import static org.codehaus.groovy.runtime.DefaultGroovyMethods.findAll;

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

    @Step
    public void clickPaginationUntilDisable() throws InterruptedException {
        addBuildingPage.clickPaginationUntilDisabled();
    }

    @Step
    public void checkAddBuilding(String name, String distance) {
        addBuildingPage.checkLastEntry(name, distance);
    }

    public void addBuilding(String buildingName, String safeDistance) throws InterruptedException {
        clickAddBuilding();
        enterBuildingName(buildingName);
        enterSafeDistance(safeDistance);
        submit();
        clickPaginationUntilDisable();
        checkAddBuilding(buildingName, safeDistance);
    }

}
