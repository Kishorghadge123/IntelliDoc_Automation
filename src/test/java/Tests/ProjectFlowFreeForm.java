package Tests;

import Base.BasePage;
import Pages.DocumentPage;
import Pages.ProjectPage;
import Utilities.ReadProps;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class ProjectFlowFreeForm extends BasePage {

    @Test
            public void FreeFormProjectFlow(){

    try {

        BasePage.LoginTest();
        Robot r = new Robot();
        Thread.sleep(8000);

        ProjectPage ProjectPageObj = new ProjectPage(driver);
        DocumentPage DocPageObj = new DocumentPage(driver);

        test.log(status.INFO, "TestInformation");
        test.log(status.PASS, "TestPassed");
        System.out.println("Successfully logged in");
        Thread.sleep(8000);

        ProjectPageObj.ClickOnCreateProjectBtn();
        Thread.sleep(4000);
        ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("FreeFormProjectName"));
        Thread.sleep(6000);
        ProjectPageObj.ClickOnLeadBtn();
        Thread.sleep(4000);
        ProjectPageObj.SelectOnLeadBtn();
        Thread.sleep(4000);
        ProjectPageObj.ClickOnStartDateBtn();
        Thread.sleep(4000);
        ProjectPageObj.SelectOnStartDateBtn();
        Thread.sleep(4000);
        ProjectPageObj.ClickOnEndDate();
        Thread.sleep(4000);
        ProjectPageObj.SelectEndDate();
        Thread.sleep(4000);
        ProjectPageObj.ClickOnDocumentStructureBtn();
        Thread.sleep(4000);
        ProjectPageObj.SelectOnFreeFormStructure();
        Thread.sleep(4000);
        ProjectPageObj.ClickOnStraightThroughProcessBtn();
        Thread.sleep(4000);
        ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
        Thread.sleep(4000);
        Thread.sleep(4000);
        ProjectPageObj.ClickOnStatusBtn();
        Thread.sleep(4000);
        ProjectPageObj.ClickOnDocumentAutoAssignBtn();
        Thread.sleep(4000);
        ProjectPageObj.ClickOnAddFieldsbtn();
        Thread.sleep(4000);
        ProjectPageObj.SelectFieldValue();
        Thread.sleep(4000);
        ProjectPageObj.ClickOnRolesBtn();
        Thread.sleep(4000);
        ProjectPageObj.ClickOnAddRoleBtn();
        Thread.sleep(4000);
        ProjectPageObj.ClickOnSelectRoleBtn();
        Thread.sleep(4000);
        ProjectPageObj.ClickOnAddUserBtn();
        Thread.sleep(4000);
        ProjectPageObj.ClickOnSelectUserBtn();
        Thread.sleep(4000);
        r.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(4000);
       // ProjectPageObj.ClickonCreate();
        Thread.sleep(4000);


        driver.close();




    }

    catch (Exception e) {
        test.log(status.FAIL, e);
    }}
}