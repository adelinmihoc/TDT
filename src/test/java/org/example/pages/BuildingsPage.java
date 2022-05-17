package org.example.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

@DefaultUrl("https://lighthouse-demo.evozon.com/buildings")
public class BuildingsPage extends PageObject {

    @FindBy(name = "label")
    private WebElementFacade editBuildingNameInput;

    @FindBy(name = "safeDistance")
    private WebElementFacade editDistanceInput;

    public void pushOptionsButton(){
        WebElementFacade optionsButton=find(By.cssSelector("td.MuiTableCell-alignRight")).then(By.cssSelector("button.MuiIconButton-root"));
        optionsButton.click();
    }

    public void selectEditOption(){
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException exception) {
            System.out.println("asd");
        }

    }

    public void enterNewBuildingName(String name){
        editBuildingNameInput.type(name);
    }

    public void enterNewSafeDistance(String dist){
        editDistanceInput.type(dist);
    }

    public void saveEditedInformation(){
        WebElementFacade saveEditedDataButton=find(By.cssSelector("div.MuiGrid-root")).then(By.cssSelector("button.MuiButton-contained"));
        saveEditedDataButton.click();
    }

}
