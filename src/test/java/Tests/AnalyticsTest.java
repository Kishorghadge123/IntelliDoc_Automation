package Tests;

import Base.BasePage;
import Pages.AnalyticsPage;
import Utilities.TakesScreen;
import org.testng.annotations.Test;
import java.io.IOException;

public class AnalyticsTest extends BasePage {

    @Test
    public void AnalyticsFlow() throws InterruptedException, IOException {
        try {
            BasePage.LoginTest();
            Thread.sleep(8000);
            AnalyticsPage AnalyticsPageObj = new AnalyticsPage(driver);
            test.log(status.INFO, "TestInformation");
            test.log(status.PASS, "TestPassed");

            AnalyticsPageObj.ClickAnalyticsBtn();
            Thread.sleep(5000);
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//AnalyticsPage.jpg");
            //Organization Statistics
            AnalyticsPageObj.ClickOrganizationArrow();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//OrganizationStatistics.jpg");
            Thread.sleep(2000);
            AnalyticsPageObj.ClickOrganizationArrow();
            Thread.sleep(2000);
            AnalyticsPageObj.HoverTotalUser();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//HoverTotalUser.jpg");
            AnalyticsPageObj.HoverDocuments();
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//HoverDocuments.jpg");
            Thread.sleep(2000);
            AnalyticsPageObj.HoverProcessed();
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//HoverProcessed.jpg");
            Thread.sleep(2000);
            AnalyticsPageObj.HoverReadytoProcess();
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//HoverReadyToProcess.jpg");
            Thread.sleep(2000);
            AnalyticsPageObj.HoverRejected();
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//HoverRejected.jpg");
            Thread.sleep(2000);
            AnalyticsPageObj.HoverValidationTime();
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//HoverValidationTime.jpg");
            Thread.sleep(2000);
            AnalyticsPageObj.HoverStructuredBar();
            Thread.sleep(2000);
            AnalyticsPageObj.HoverSemiStructured();
            Thread.sleep(2000);
//            AnalyticsPageObj.HoverFreeForm();
//            Thread.sleep(2000);
//            AnalyticsPageObj.HoverMedicalChart();
//            Thread.sleep(2000);
//            TakesScreen.takeSnapShot(driver, "test-output//Analytics//HoverProgressBar.jpg");
            AnalyticsPageObj.ClickOrganizationArrow();
            Thread.sleep(2000);
            //Project Statistics
            AnalyticsPageObj.ClickProjectArrow();
            Thread.sleep(2000);
            AnalyticsPageObj.ClickSearchProject();
            Thread.sleep(2000);
            AnalyticsPageObj.ClickSelectProject();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//ProjectSelected.jpg");
            Thread.sleep(2000);
            AnalyticsPageObj.ClickSelectDropDown();
            Thread.sleep(2000);
            AnalyticsPageObj.ClickSelectOverall();
            Thread.sleep(2000);
            AnalyticsPageObj.ClickSelectDropDown();
            Thread.sleep(2000);
            AnalyticsPageObj.ClickSelectMonthly();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//MonthlyStatus.jpg");
            Thread.sleep(2000);
            AnalyticsPageObj.ClickSelectDropDown();
            Thread.sleep(2000);
            AnalyticsPageObj.ClickSelectWeekly();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//WeeklyStatus.jpg");
            Thread.sleep(2000);
            AnalyticsPageObj.ClickSelectDropDown();
            Thread.sleep(2000);
            AnalyticsPageObj.ClickSelectDaily();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Analytics//DailyStatus.jpg");
            Thread.sleep(2000);
            driver.close();

        } catch (Exception e) {
            test.log(status.FAIL, e);
        }
    }
}
