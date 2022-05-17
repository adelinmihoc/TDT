package org.example.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;

import java.util.stream.Collectors;

import static org.codehaus.groovy.runtime.DefaultGroovyMethods.findAll;
import static org.codehaus.groovy.runtime.DefaultGroovyMethods.last;

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

    public void clickPaginationUntilDisabled() throws InterruptedException {
        WebElementFacade rightArrow = find(By.cssSelector("div.MuiTablePagination-actions")).then(By.xpath("//button[@aria-label='Next page']"));
        while (!rightArrow.isDisabled()) {
            rightArrow.click();
            Thread.sleep(500);
        }
    }

    public void checkLastEntry(String expectedName, String expectedDistance) {
        WebElementFacade lastEntry = findAll("tr.MuiTableRow-root").stream()
                .reduce((first, second) -> second)
                .orElse(null);
        if (lastEntry != null) {
            String name = lastEntry.thenFindAll(By.cssSelector("td.MuiTableCell-root")).get(1).getText();
            String distance = lastEntry.thenFindAll(By.cssSelector("td.MuiTableCell-root")).get(2).getText();
            Assert.assertEquals("Expected correct last name added",expectedName, name);
            Assert.assertEquals("Expected correct last distance added",expectedDistance, distance);
        }
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
