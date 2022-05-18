package org.example.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://lighthouse-demo.evozon.com/desk-report")
public class ReportDownloadPage extends PageObject
{
    public void clickDownloadReport() {
        WebElementFacade downloadReport = find(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary']"));
        downloadReport.click();
    }
}
