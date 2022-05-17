package org.example.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://lighthouse-demo.evozon.com/buildings")
public class BuildingsPage extends PageObject {

   // @FindBy(className = "MuiButtonBase-root MuiIconButton-root jss316")
    //private WebElementFacade optionsButton ;


    @FindBy(className = "MuiButtonBase-root MuiListItem-root MuiMenuItem-root MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button")
    private WebElementFacade editButton;

    @FindBy(id = "MuiInputBase-root MuiOutlinedInput-root MuiInputBase-fullWidth MuiInputBase-formControl.label")
    private WebElementFacade editBuildingNameInput;

    @FindBy(id = "MuiInputBase-root MuiOutlinedInput-root MuiInputBase-fullWidth MuiInputBase-formControl.safeDistance")
    private WebElementFacade editDistanceInput;

    @FindBy(className = "MuiButtonBase-root MuiButton-root MuiButton-contained jss341 MuiButton-containedPrimary")
    private WebElementFacade saveEditedDataButton;

    public void pushOptionsButton(){
        WebElementFacade optionsButton=find(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root jss235']"));
        optionsButton.click();
    }

    public void selectEditOption(){
        editButton.click();
    }

    public void enterNewBuildingName(String name){
        editBuildingNameInput.type(name);
    }

    public void enterNewSafeDistance(String dist){
        editDistanceInput.type(dist);
    }

    public void saveEditedInformation(){
        saveEditedDataButton.click();
    }

}
