package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.DeskPage;

public class ManageEquipmentSteps {

    DeskPage deskPage;

    @Step
    public void clickManage() throws InterruptedException {
        deskPage.clickManageEquipment();
    }
    @Step
    public void enterFilterEquipment(String equipmentName) {
        deskPage.enterNewFilter(equipmentName);
    }
    @Step
    public void enterNewEquipmentName(String equipmentName) {
        deskPage.enterNewEquipmentName(equipmentName);
    }
    @Step
    public void editEquipment() {
        deskPage.editEquipment();
    }
    @Step
    public void addEquipment() throws InterruptedException {
        deskPage.createEquipment();
    }
    @Step
    public void saveEquipment() {
        deskPage.saveEquipmentChange();
    }
    @Step
    public void isTheManageEquipmentPage() {
        deskPage.open();
    }

    public void manageEquipment(String equipmentName) throws InterruptedException {
        clickManage();

        enterFilterEquipment(equipmentName);

        addEquipment();

    }
    public void editEquipmentName(String newEquipmentName) throws InterruptedException {
        clickManage();

        editEquipment();

        enterNewEquipmentName(newEquipmentName);

        saveEquipment();
    }
}
