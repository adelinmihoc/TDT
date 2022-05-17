package org.example.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://lighthouse-demo.evozon.com/buildings")
public class AddBuildingPage extends PageObject {

    @FindBy(name = "label")
    private WebElementFacade buildingNameInput;

    @FindBy(name = "safeDistance")
    private WebElementFacade safeDistanceInput;

    public void enterBuildingName(String buildingName) {
        buildingNameInput.type(buildingName);
    }

    public void enterSafeDistance(String safeDistance) {
        safeDistanceInput.type(safeDistance);
    }

    public void submit() {
        WebElementFacade button = find(By.cssSelector("button.MuiButton-contained"));
        System.out.println(button.toString());
        button.click();
//        addBuilding.click();
}

    public void clickAddBuilding() {
        WebElementFacade addBuilding = find(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-fullWidth']"));
        addBuilding.click();
    }
}
