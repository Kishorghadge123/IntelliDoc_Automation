package Tests;

import Base.BasePage;
import Pages.LoginPage;
import Pages.ProjectPage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class ProjectFlowStructuredTest extends BasePage {

    @Test
    public void ProjectFlow() throws InterruptedException, IOException {
        try {

            BasePage.LoginTest();
            Robot r = new Robot();
            ProjectPage ProjectPageObj = new ProjectPage(driver);
            test.log(LogStatus.INFO, "ProjectFlow");
            test.log(LogStatus.PASS, "TestPassed");

            //TC 14.1 Create new project with Blank information and also Verify 'Create' button for Platform Admin.
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(4000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,10000)", "");
            Thread.sleep(1000);
            ProjectPageObj.ClickOnCreate();
            ProjectPageObj.VerifyAssertForBlank();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowStructured//ProjectCreateBlank.jpg");
            System.out.println("Please add the attributes before creating the project.");
            Thread.sleep(2000);

            //TC 14.2 Verify Next button with Blank information for Platform Admin.
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(6000);
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(2000);
            js.executeScript("window.scrollBy(0,10000)", "");
            Thread.sleep(1000);
            ProjectPageObj.ClickNextPage();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowStructured//ProjectCreateBlankNext.jpg");
            Thread.sleep(2000);

            //TC 14.3 Verify Cancel button with Blank information for Platform Admin.
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(6000);
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(2000);
            js.executeScript("window.scrollBy(0,10000)", "");
            Thread.sleep(1000);
            ProjectPageObj.ClickOnCancelProject();
            Thread.sleep(5000);

            //TC 14.4 Create project with Invalid Project Name for Platform Admin.
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(6000);
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("ProjectInvalidName"));
            Thread.sleep(1000);
            ProjectPageObj.ClickOnLeadBtn();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowStructured//InvalidName.jpg");
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
            ProjectPageObj.SelectDocumentStructureBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnProcessingEngineBtn();
            Thread.sleep(2000);
            ProjectPageObj.SelectOnProcessingEngineBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnStraightThroughProcessBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
            Thread.sleep(2000);
            ProjectPageObj.ClickOnStatusBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnDocumentAutoAssignBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnAddTemplateBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnTemplateBtn();
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
            Thread.sleep(1000);
            ProjectPageObj.ClickOnCreate();
            ProjectPageObj.VerifyAssertForData();
            Thread.sleep(200);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowStructured//PleaseCheckFormData.jpg");
            Thread.sleep(2000);

            //TC 14.5  Create project with Project information without Template for Platform Admin.
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(6000);
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("StructuredProjectName1"));//Change this
            Thread.sleep(1000);
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
            ProjectPageObj.SelectDocumentStructureBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnProcessingEngineBtn();
            Thread.sleep(2000);
            ProjectPageObj.SelectOnProcessingEngineBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnStraightThroughProcessBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
            Thread.sleep(2000);
            ProjectPageObj.ClickOnStatusBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnDocumentAutoAssignBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnCreate();
            Thread.sleep(200);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowStructured//ProjectCreateWithoutTemplate.jpg");
            ProjectPageObj.VerifyAssertForNoTemplate();
            Thread.sleep(2000);

            //TC 14.6 Create project without Role for Platform Admin.
            ProjectPageObj.ClickOnAddTemplateBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnTemplateBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnCreate();
            ProjectPageObj.VerifyAssertForRole();
            Thread.sleep(200);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowStructured//CreateProjectWithoutRole.jpg");
            Thread.sleep(2000);

            //TC 14.7 Create Project without User for Platform Admin and TC 14.8 Create Project with Valid Data.
            ProjectPageObj.ClickOnRolesBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnAddRoleBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnSelectRoleBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnCreate();
            Thread.sleep(200);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowStructured//CreateProjectWithEmptyUsers.jpg");
            ProjectPageObj.VerifyAssertForUser();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnAddUserBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnSelectUserBtn();
            Thread.sleep(1000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(1000);
            ProjectPageObj.ClickOnCreate();
            Thread.sleep(8000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowStructured//ProjectCreatedSuccessfully.jpg");
            Thread.sleep(2000);

            //TC 14.9 Create Project with Disable Status Platform Admin.
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(6000);
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("ProjectDisabledNameFA"));//change this name in Obj file.
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
            ProjectPageObj.SelectDocumentStructureBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnProcessingEngineBtn();
            Thread.sleep(2000);
            ProjectPageObj.SelectOnProcessingEngineBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnStraightThroughProcessBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowStructured//StatusNotEnabled.jpg");
            ProjectPageObj.ClickOnDocumentAutoAssignBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnAddTemplateBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnTemplateBtn();
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
            Thread.sleep(1000);
            ProjectPageObj.ClickOnCreate();
            Thread.sleep(6000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowStructured//StatusNotEnabledProjectCreated.jpg");
            System.out.println("Project With Status Not Enabled Created Successfully");
            Thread.sleep(2000);

            //TC 14.10  Create Project only with Role information Platform Admin.
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(4000);
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
            Thread.sleep(1000);
            ProjectPageObj.ClickOnCreate();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowStructured//ProjectCreateOnlyRole.jpg");
            System.out.println("Please add the attributes before creating the project.");
            Thread.sleep(2000);
            ProjectPageObj.ClickLogout();
            System.out.println("Logout Success");
            Thread.sleep(5000);

            //TC 14.11 Create New Project with Blank information and also verify Create button for Admin.
            ProjectPageObj.EnterUsername(ReadProps.readAttr("AdminUser"));
            Thread.sleep(2000);
            ProjectPageObj.EnterPassword(ReadProps.readAttr("AdminPwd"));
            Thread.sleep(2000);
            ProjectPageObj.ClickLoginButton();
            Thread.sleep(6000);
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnCreate();
            ProjectPageObj.VerifyAssertForBlank();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowStructured//ProjectCreateBlankForAdmin.jpg");
            System.out.println("Please add the attributes before creating the project.");
            Thread.sleep(2000);

            //TC 14.12 Verify Next button with Blank information for Admin.
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(6000);
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickNextPage();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowStructured//ProjectCreateBlankNextAdmin.jpg");
            Thread.sleep(2000);

            //TC 14.13 Verify Cancel button with Blank Information for Admin.
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(6000);
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnCancelProject();
            System.out.println("Cancel Done for Admin");
            Thread.sleep(5000);

            //TC 14.14 Create Project with Invalid Project Name for Admin.
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(6000);
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("ProjectInvalidName"));
            Thread.sleep(1000);
            ProjectPageObj.ClickOnLeadBtn();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowStructured//InvalidNameAdmin.jpg");
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
            ProjectPageObj.SelectDocumentStructureBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnProcessingEngineBtn();
            Thread.sleep(2000);
            ProjectPageObj.SelectOnProcessingEngineBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnStraightThroughProcessBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
            Thread.sleep(2000);
            ProjectPageObj.ClickOnStatusBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnDocumentAutoAssignBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnAddTemplateBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnTemplateBtn();
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
            Thread.sleep(1000);
            ProjectPageObj.ClickOnCreate();
            ProjectPageObj.VerifyAssertForData();
            Thread.sleep(200);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowStructured//PleaseCheckFormDataAdmin.jpg");
            Thread.sleep(2000);

            //TC 14.15 Create project with Project information without Template for Admin.
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(6000);
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("StructuredProjectName"));
            Thread.sleep(1000);
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
            ProjectPageObj.SelectDocumentStructureBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnProcessingEngineBtn();
            Thread.sleep(2000);
            ProjectPageObj.SelectOnProcessingEngineBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnStraightThroughProcessBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
            Thread.sleep(2000);
            ProjectPageObj.ClickOnStatusBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnDocumentAutoAssignBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnCreate();
            Thread.sleep(200);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowStructured//ProjectCreateWithoutTemplateAdmin.jpg");
            ProjectPageObj.VerifyAssertForNoTemplate();
            Thread.sleep(2000);

            //TC 14.16 Create project without Role for Admin.
            ProjectPageObj.ClickOnAddTemplateBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnTemplateBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnCreate();
            ProjectPageObj.VerifyAssertForRole();
            Thread.sleep(200);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowStructured//CreateProjectWithoutRoleAdmin.jpg");
            Thread.sleep(2000);

            //TC 14.17 Create project without User for Admin.
            ProjectPageObj.ClickOnRolesBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnAddRoleBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnSelectRoleBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnCreate();
            Thread.sleep(200);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowStructured//CreateProjectWithEmptyUsersAdmin.jpg");
            ProjectPageObj.VerifyAssertForUser();
            Thread.sleep(2000);

            //TC 14.18 Create Project with Disable Status Admin.
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(6000);
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("ProjectDisabledNameA"));//change this name in Obj file.
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
            ProjectPageObj.SelectDocumentStructureBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnProcessingEngineBtn();
            Thread.sleep(2000);
            ProjectPageObj.SelectOnProcessingEngineBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnStraightThroughProcessBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowStructured//StatusNotEnabledAdmin.jpg");
            ProjectPageObj.ClickOnDocumentAutoAssignBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnAddTemplateBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnTemplateBtn();
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
            Thread.sleep(1000);
            ProjectPageObj.ClickOnCreate();
            Thread.sleep(6000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowStructured//StatusNotEnabledProjectCreatedAdmin.jpg");
            System.out.println("Project With Status Not Enabled Created Successfully Admin");
            Thread.sleep(2000);

            //TC 14.19  Create Project only with Role information for Admin.
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(5000);
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
            Thread.sleep(1000);
            ProjectPageObj.ClickOnCreate();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectFlowStructured//ProjectCreateOnlyRoleAdmin.jpg");
            System.out.println("Please add the attributes before creating the project.");
            Thread.sleep(2000);
            ProjectPageObj.ClickLogout();
            System.out.println("Logout Success for Admin");
            Thread.sleep(5000);

            //TC 14.20 Table Structure.
            LoginPage loginPageObjects = new LoginPage(driver);
            loginPageObjects.setUsername(ReadProps.readAttr("UserID"));
            Thread.sleep(1000);
            loginPageObjects.setPassword(ReadProps.readAttr("Password"));
            loginPageObjects.clickLoginButton();
            Thread.sleep(10000);
            ProjectPageObj.ClickOnTableStructure();
            Thread.sleep(6000);
            driver.navigate().refresh();
            Thread.sleep(6000);
            ProjectPageObj.ClickOnTableStructure();
            Thread.sleep(6000);

            //TC 14.21 Verify Items per Page.
            ProjectPageObj.ClickItemsPerPage();
            Thread.sleep(2000);
            ProjectPageObj.SelectItemsPerPage();
            Thread.sleep(1000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(3000);
            driver.close();
        } catch (Exception e) {
            test.log(LogStatus.FAIL, e);
        }
    }
}