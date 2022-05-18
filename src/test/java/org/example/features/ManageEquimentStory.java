package org.example.features;

import net.thucydides.core.annotations.Steps;
import org.example.steps.serenity.ManageEquipmentSteps;
import org.junit.Test;

public class ManageEquimentStory extends BaseStory{

    @Steps
    private ManageEquipmentSteps manageEquipmentSteps;

    @Test
    public void manageEquipment() throws InterruptedException {
        loginSteps.isTheLoginPage();
        loginSteps.login("mihaimehi@gmail.com", "Samsungs10!");
        Thread.sleep(2000);
        manageEquipmentSteps.isTheManageEquipmentPage();
        Thread.sleep(2000);
        manageEquipmentSteps.manageEquipment("seleniumTest");
    }

    @Test
    public void editEquipment() throws InterruptedException {
        loginSteps.isTheLoginPage();
        loginSteps.login("mihaimehi@gmail.com", "Samsungs10!");
        Thread.sleep(2000);
        manageEquipmentSteps.isTheManageEquipmentPage();
        Thread.sleep(2000);
        manageEquipmentSteps.editEquipmentName("1 Monitor");
    }
}
