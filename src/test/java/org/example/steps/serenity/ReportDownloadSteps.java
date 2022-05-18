package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.ReportDownloadPage;

public class ReportDownloadSteps
{
    ReportDownloadPage reportDownloadPage;
    @Step
    public void isTheReportDownloadPage()
    {
        reportDownloadPage.open();
    }

    @Step
    public void reportDownload()
    {
        reportDownloadPage.clickDownloadReport();
    }
}
