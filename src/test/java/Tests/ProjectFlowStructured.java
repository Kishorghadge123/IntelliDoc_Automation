package Tests;

import Base.BasePage;
import Pages.DatasetPage;
import Pages.ProjectPage;
import Pages.TemplatePage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class ProjectFlowStructured extends BasePage {

    @Test
    public void ProjectFlow() throws InterruptedException, IOException {
        try {

            BasePage.LoginTest();
            Robot r = new Robot();
            Thread.sleep(8000);

            ProjectPage ProjectPageObj = new ProjectPage(driver);
            test.log(status.INFO, "TestInformation");
            test.log(status.PASS, "TestPassed");
            System.out.println("Successfully logged in");
            Thread.sleep(8000);

            //TC 5.1 Arrow Right and Left in Panel
            ProjectPageObj.ClickArrowRight();
            Thread.sleep(3000);
            ProjectPageObj.ClickArrowLeft();
            Thread.sleep(3000);


            //TC 5.2 Create new project with Blank information and also verify Create button
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(4000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,10000)", "");
            Thread.sleep(4000);
            ProjectPageObj.ClickonCreate();
            ProjectPageObj.VerifyAssertForError();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectTest//ProjectCreateBlank.jpg");
            Thread.sleep(4000);
            System.out.println("Please check form data and role(s) cannot be empty");


            //TC 5.3 Verify Next button with Blank information

            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickNextPage();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectTest//ProjectCreateBlankNext.jpg");
            Thread.sleep(4000);

            //Test 5.4 Verify Cancel button with Blank information
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickonCancelOnProject();
            Thread.sleep(4000);

            //Disable one Role for test in Project
            ProjectPageObj.ClickRoleManagementBtn();
            Thread.sleep(4000);
            ProjectPageObj.SearchCreatedRole(ReadProps.readAttr("RoleName"));
            Thread.sleep(4000);
            ProjectPageObj.ClickEditRole();
            Thread.sleep(4000);
            ProjectPageObj.ClickActiveRole();
            Thread.sleep(4000);
            ProjectPageObj.ClickUpdateBtn();
            Thread.sleep(4000);




            // 5 Create project with with invalid project name
           ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("ProjectInvalidName"));
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
            ProjectPageObj.ClickonCreate();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectTest//ProjectCreateInvalidName.jpg");
            ProjectPageObj.ClickOnRolesBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnAddRoleBtn();
            Thread.sleep(4000);
            ProjectPageObj.SearchRoleProject();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectTest//DisableRoleNotFound.jpg");

            //Enable the Role for script maintainance
            driver.navigate().refresh();
            Thread.sleep(4000);
            ProjectPageObj.ClickRoleManagementBtn();
            Thread.sleep(4000);
            ProjectPageObj.SearchCreatedRole(ReadProps.readAttr("RoleName"));
            Thread.sleep(4000);
            ProjectPageObj.ClickEditRole();
            Thread.sleep(4000);
            ProjectPageObj.ClickActiveRole();
            Thread.sleep(4000);
            ProjectPageObj.ClickUpdateBtn();
            Thread.sleep(4000);





            //Test 5.5  Create project with Project information without Template and Role
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("StructuredProjecteName"));
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
            ProjectPageObj.SelectOnDocumentStructureBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnProcessingEngineBtn();
            Thread.sleep(4000);
            ProjectPageObj.SelectOnProcessingEngineBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnStraightThroughProcessBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
            Thread.sleep(4000);
            ProjectPageObj.ClickOnStatusBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnDocumentAutoAssignBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickonCreate();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectTest//ProjectCreateTemplateRoleEmpty.jpg");
            ProjectPageObj.VerifyAsserForTemplate();
            Thread.sleep(4000);
            System.out.println("Please add the template before creating the project.");
            Thread.sleep(4000);


            //Test 5.6 Create project without Role
            ProjectPageObj.ClickOnAddTemplateBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnTemplateBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickonCreate();
            Thread.sleep(200);
            ProjectPageObj.VerifyAssertForRole();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectTest//CreateProjectRolesUserEmpty.jpg");
            Thread.sleep(4000);

            //Test 5.6 Create project without user
            ProjectPageObj.ClickOnRolesBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnAddRoleBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnSelectRoleBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickonCreate();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectTest//CreateProjectUserEmpty.jpg");
            ProjectPageObj.VerifyAssertForUser();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnAddUserBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnSelectUserBtn();
            Thread.sleep(4000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(4000);



            //ProjectPageObj.ClickonCreate();
            ProjectPageObj.ClickonCancelOnProject();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectTest//CreatedProject.jpg");
            // ProjectPageObj.VerifyAsertForUser();
            Thread.sleep(4000);




            //Create Project with disable status
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("ProjectDisabledName"));
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
            ProjectPageObj.SelectOnDocumentStructureBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnProcessingEngineBtn();
            Thread.sleep(4000);
            ProjectPageObj.SelectOnProcessingEngineBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnStraightThroughProcessBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
            Thread.sleep(4000);
            ProjectPageObj.ClickOnDocumentAutoAssignBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickonCreate();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectTest//ProjectCreateTemplateRoleEmpty.jpg");
            ProjectPageObj.VerifyAsserForTemplate();
            Thread.sleep(4000);
            System.out.println("Please add the template before creating the project.");
            Thread.sleep(4000);
            ProjectPageObj.ClickOnAddTemplateBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnTemplateBtn();
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
            ProjectPageObj.ClickonCreate();

            TakesScreen.takeSnapShot(driver, "test-output//ProjectTest//CreateProjectDisableStatus.jpg");
            // ProjectPageObj.VerifyAsertForUser();
            Thread.sleep(4000);
            System.out.println("Project Created");
            Thread.sleep(4000);





            //TC 5.7  Create project only with Role information
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnCreateProjectBtn();
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
            ProjectPageObj.ClickonCreate();
            //ProjectPageObj.VerifyAssertForData();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectTest//ProjectCreateOnlyRole.jpg");
            System.out.println("Please add the attributes before creating the project.");
            Thread.sleep(3000);
            ProjectPageObj.ClickLogout();
            Thread.sleep(2000);


            // Creation of Project By admin
            // Create Project
            ProjectPageObj.EnterUsername(ReadProps.readAttr("AdminUser"));
            Thread.sleep(2000);
            ProjectPageObj.EnterPassword(ReadProps.readAttr("AdminPwd"));
            Thread.sleep(2000);
            ProjectPageObj.ClickLoginButton();
            Thread.sleep(12000);



            //TC 5.8 Create new project with Blank information and also verify Create button
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(4000);
            js.executeScript("window.scrollBy(0,10000)", "");
            Thread.sleep(4000);
            ProjectPageObj.ClickonCreate();
            ProjectPageObj.VerifyAssertForError();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectTest//ProjectCreateBlank.jpg");
            Thread.sleep(4000);
            System.out.println("Please check form data and role(s) cannot be empty");


            //TC 5.9 Verify Next button with Blank information

            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickNextPage();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectTest//ProjectCreateBlankNext.jpg");
            Thread.sleep(4000);

            //Test 5.10 Verify Cancel button with Blank information
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickonCancelOnProject();
            Thread.sleep(4000);

            //Disable one Role for test in Project
            ProjectPageObj.ClickRoleManagementBtn();
            Thread.sleep(4000);
            ProjectPageObj.SearchCreatedRole(ReadProps.readAttr("RoleName"));
            Thread.sleep(4000);
            ProjectPageObj.ClickEditRole();
            Thread.sleep(4000);
            ProjectPageObj.ClickActiveRole();
            Thread.sleep(4000);
            ProjectPageObj.ClickUpdateBtn();
            Thread.sleep(4000);




            // 5.11 Create project with with invalid project name
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("ProjectInvalidName"));
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
            ProjectPageObj.ClickonCreate();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectTest-Admin//ProjectCreateInvalidName.jpg");
            ProjectPageObj.ClickOnRolesBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnAddRoleBtn();
            Thread.sleep(4000);
            ProjectPageObj.SearchRoleProject();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectTest-Admin//DisableRoleNotFound.jpg");

            //Enable the Role for script maintainance
            driver.navigate().refresh();
            Thread.sleep(4000);
            ProjectPageObj.ClickRoleManagementBtn();
            Thread.sleep(4000);
            ProjectPageObj.SearchCreatedRole(ReadProps.readAttr("RoleName"));
            Thread.sleep(4000);
            ProjectPageObj.ClickEditRole();
            Thread.sleep(4000);
            ProjectPageObj.ClickActiveRole();
            Thread.sleep(4000);
            ProjectPageObj.ClickUpdateBtn();
            Thread.sleep(4000);





            //Test 5.11  Create project with Project information without Template and Role
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("AdminProjectName"));
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
            ProjectPageObj.SelectOnDocumentStructureBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnProcessingEngineBtn();
            Thread.sleep(4000);
            ProjectPageObj.SelectOnProcessingEngineBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnStraightThroughProcessBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
            Thread.sleep(4000);
            ProjectPageObj.ClickOnStatusBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnDocumentAutoAssignBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickonCreate();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectTest-Admin//ProjectCreateTemplateRoleEmpty.jpg");
            ProjectPageObj.VerifyAsserForTemplate();
            Thread.sleep(4000);
            System.out.println("Please add the template before creating the project.");
            Thread.sleep(4000);


            //Test 5.12 Create project without Role
            ProjectPageObj.ClickOnAddTemplateBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnTemplateBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickonCreate();
            Thread.sleep(200);
            ProjectPageObj.VerifyAssertForRole();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectTest-Admin//CreateProjectRolesUserEmpty.jpg");
            Thread.sleep(4000);

            //Test 5.13 Create project without user
            ProjectPageObj.ClickOnRolesBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnAddRoleBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnSelectRoleBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickonCreate();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectTest-Admin//CreateProjectUserEmpty.jpg");
            ProjectPageObj.VerifyAssertForUser();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnAddUserBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnSelectUserBtn();
            Thread.sleep(4000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(4000);


            //ProjectPageObj.ClickonCreate();
            ProjectPageObj.ClickonCancelOnProject();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectTest-Admin//CreatedProject.jpg");
            // ProjectPageObj.VerifyAsertForUser();
            Thread.sleep(4000);
            System.out.println("Project Created  click on cancel");
            Thread.sleep(4000);

            //Time Scenario



            //Create Project with disable status
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("AdminProjectName"));
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
            ProjectPageObj.SelectOnDocumentStructureBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnProcessingEngineBtn();
            Thread.sleep(4000);
            ProjectPageObj.SelectOnProcessingEngineBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnStraightThroughProcessBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
            Thread.sleep(4000);
            ProjectPageObj.ClickOnDocumentAutoAssignBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickonCreate();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectTest-Admin//ProjectCreateTemplateRoleEmpty.jpg");
            ProjectPageObj.VerifyAsserForTemplate();
            Thread.sleep(4000);
            System.out.println("Please add the template before creating the project.");
            Thread.sleep(4000);
            ProjectPageObj.ClickOnAddTemplateBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnTemplateBtn();
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
          //  ProjectPageObj.ClickonCreate();

            TakesScreen.takeSnapShot(driver, "test-output//ProjectTest-Admin//CreateProjectDisableStatus.jpg");
            // ProjectPageObj.VerifyAsertForUser();
            Thread.sleep(4000);
            System.out.println("Project Created");
            Thread.sleep(4000);





            //TC 5.13  Create project only with Role information
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnCreateProjectBtn();
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
            ProjectPageObj.ClickonCreate();
            //ProjectPageObj.VerifyAssertForData();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectTest-Admin//ProjectCreateOnlyRole.jpg");
            System.out.println("Please add the attributes before creating the project.");
            Thread.sleep(3000);





            //Items Per Page
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.ClickOnTableStructure();
            Thread.sleep(6000);
            driver.navigate().refresh();
            Thread.sleep(6000);
            ProjectPageObj.ClickOnTableStructure();
            Thread.sleep(3000);

            //Tc Verify Footer Item per page,Next Page, Previous Page, Last Page, First Page
            ProjectPageObj.ClickItemsPerPage();
            Thread.sleep(3000);
            ProjectPageObj.SelectItemsPerPage();
            Thread.sleep(3000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(3000);


            //Table structure
            ProjectPageObj.ClickOnProjectBtn();
            Thread.sleep(4000);
            ProjectPageObj.TableStructure();
            Thread.sleep(4000);

            //Check created project
            ProjectPageObj.SearchProject();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectTest//UpdatedTime.jpg");
            Thread.sleep(4000);
            driver.close();


        } catch (Exception e) {
            test.log(status.FAIL, e);
        }

    }
}

