package org.example.features.Sergiu;

import net.thucydides.core.annotations.Steps;
import org.example.features.BaseStory;
import org.example.steps.serenity.ReportDownloadSteps;
import org.junit.Test;

public class ReportDownloadStory extends BaseStory
{
    @Steps
    private ReportDownloadSteps reportDownloadSteps;

    @Test
    public void reportDownloadTest() throws InterruptedException
    {
        loginSteps.isTheLoginPage();
        loginSteps.login("adelinmihoc@gmail.com", "X9zfxhZeU6Py9WD");
        Thread.sleep(2000);
        reportDownloadSteps.isTheReportDownloadPage();
        Thread.sleep(2000);
        reportDownloadSteps.reportDownload();
    }
}
