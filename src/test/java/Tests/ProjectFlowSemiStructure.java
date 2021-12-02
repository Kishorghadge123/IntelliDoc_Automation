package Tests;

import Base.BasePage;
import Pages.DocumentPage;
import Pages.ProjectPage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class ProjectFlowSemiStructure extends BasePage{
    @Test
    public void ProjectFlowSemiStructure() throws InterruptedException, IOException {
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



            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("SemiStructuredProject"));
            Thread.sleep(6000);
            ProjectPageObj.ClickOnLeadBtn();
            Thread.sleep(4000);
            ProjectPageObj.SelectOnLeadBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnStartDateBtn();
            Thread.sleep(4000);
            ProjectPageObj.SelectStartDateBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnEndDate();
            Thread.sleep(4000);
            ProjectPageObj.SelectEndDate();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnDocumentStructureBtn();
            Thread.sleep(4000);
            ProjectPageObj.SelectOnSemiStructure();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnStraightThroughProcessBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
            Thread.sleep(4000);
            ProjectPageObj.ClickOnStatusBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnDocumentAutoAssignBtn();
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
            Thread.sleep(2000);
           TakesScreen.takeSnapShot(driver, "test-output//ProjectTestSemiStructured//CreateProject.jpg");
            Thread.sleep(4000);
            System.out.println("Project Created");
        }
        catch (Exception e) {
                test.log(status.FAIL, e);
            }
        }
    }