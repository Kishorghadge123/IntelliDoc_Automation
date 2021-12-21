package Tests;

import Base.BasePage;
import Pages.LoginPage;
import Pages.ProjectPage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class ProjectFlowMedicalChart extends BasePage {

    @Test
    public void ProjectFlow() throws InterruptedException, IOException {
        try {

            BasePage.LoginTest();
            Robot r = new Robot();
            ProjectPage ProjectPageObj = new ProjectPage(driver);
            test.log(status.INFO, "TestInformation");
            test.log(status.PASS, "TestPassed");

            //TC Platform Admin.
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(6000);
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("MedicalChartProjectName"));//change this name in Obj file.
            Thread.sleep(2000);
            ProjectPageObj.ClickOnLeadBtn();
            Thread.sleep(2000);
            ProjectPageObj.SelectOnLeadBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnStartDateBtn();
            Thread.sleep(2000);
            ProjectPageObj.SelectStartDateBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnEndDate();
            Thread.sleep(2000);
            ProjectPageObj.SelectEndDate();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnDocumentStructureBtn();
            Thread.sleep(2000);
            ProjectPageObj.SelectDocumentStructureMedicalBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnStatusBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnDocumentAutoAssignBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnAddEntity();
            Thread.sleep(2000);
            ProjectPageObj.SelectPatientGraphics();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnAddEntity();
            Thread.sleep(2000);
            ProjectPageObj.SelectChronicConditions();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnRolesBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnAddRoleBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnSelectRoleBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnAddUserBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnSelectUserBtn();
            Thread.sleep(1000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(2000);
            ProjectPageObj.ClickNextPage();
            Thread.sleep(4000);









            driver.close();
        } catch (Exception e) {
            test.log(status.FAIL, e);
        }

    }
}

