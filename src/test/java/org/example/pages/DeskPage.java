package org.example.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@DefaultUrl("https://lighthouse-demo.evozon.com/desks-management")
public class DeskPage extends PageObject {

    @FindBy(name = "filter")
    private WebElementFacade equipmentInput;

    @FindBy(name = "label")
    private WebElementFacade editEquipmentInput;

    public void clickManageEquipment() throws InterruptedException {

        WebElementFacade element = find(By.xpath("//button[@type='button'][@class='MuiButtonBase-root MuiButton-root MuiButton-contained jss1353 MuiButton-containedPrimary MuiButton-fullWidth']"));

        element.click();

    }

    public void createEquipment() {
        WebElementFacade element = find(By.xpath("//button[@type='button'][@class='MuiButtonBase-root MuiButton-root MuiButton-text jss935']"));

        element.click();
    }
    public void editEquipment() {
        WebElementFacade element = find(By.xpath("//button[@type='button'][@class='MuiButtonBase-root MuiButton-root MuiButton-text jss1422']"));

        element.click();
    }
    public void saveEquipmentChange() {
        WebElementFacade element = find(By.xpath("//button[@type='button'][@class='MuiButtonBase-root MuiButton-root MuiButton-text jss1423']"));

        element.click();
    }

    public void enterNewEquipmentName(String equipmentName) {
        editEquipmentInput.type(equipmentName);
    }

    public void enterNewFilter(String equipmentName) {
        equipmentInput.type(equipmentName);
    }


}
