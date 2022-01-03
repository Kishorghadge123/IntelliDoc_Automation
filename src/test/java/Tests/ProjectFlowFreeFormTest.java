package Tests;

import Base.BasePage;
import Pages.DocumentPage;
import Pages.ProjectPage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.event.KeyEvent;

public class ProjectFlowFreeFormTest extends BasePage {

    @Test
            public void FreeFormProjectFlow(){

    try {

        BasePage.LoginTest();
        Robot r = new Robot();
        ProjectPage ProjectPageObj = new ProjectPage(driver);
        DocumentPage DocPageObj = new DocumentPage(driver);
        test.log(LogStatus.INFO, "TestInformation");
        test.log(LogStatus.PASS, "TestPassed");
        //TC 16.1 Verify the working of Platform Admin for checking all the functionalities for Project Page.
        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(5000);
        ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("FreeFormProjectName"));
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
        ProjectPageObj.SelectOnFreeFormStructure();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnStraightThroughProcessBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
        Thread.sleep(2000);
        ProjectPageObj.ClickOnStatusBtn();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnDocumentAutoAssignBtn();
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
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(2000);

        //TC 16.2 Creating Project without adding the Attributes.
        ProjectPageObj.ClickOnCreate();
        TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowFree-Form//PleaseAddAttributes.jpg");
        Thread.sleep(2000);

        //TC 16.3 Create Project with Attributes.
        ProjectPageObj.ClickOnAttributes();
        Thread.sleep(2000);
        ProjectPageObj.ClickOnAddFieldBtn();
        Thread.sleep(2000);
        ProjectPageObj.SelectFieldValue();
        Thread.sleep(1000);
        TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowFree-Form//FieldValueSelected.jpg");
        Thread.sleep(4000);
        driver.close();
    }

    catch (Exception e) {
        test.log(LogStatus.FAIL, e);
    }}
}