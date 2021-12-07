package Tests;

import Base.BasePage;
import Pages.ProjectBREPage;
import Pages.ProjectPage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class ProjectBRETest extends BasePage {

    @Test
    public void AnalyticsFlow() throws InterruptedException, IOException {
        try {
            BasePage.LoginTest();
            Robot r = new Robot();
            Thread.sleep(6000);
            ProjectPage ProjectPageObj = new ProjectPage(driver);
            test.log(status.INFO, "TestInformation");
            test.log(status.PASS, "TestPassed");

            //Object creation
            ProjectBREPage ProjectBREPageObj = new ProjectBREPage(driver);
            //TC-1.1 BRE Applied to NAME.
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(3000);
            ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("BREProjectName"));
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
            ProjectPageObj.ClickOnStatusBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnDocumentAutoAssignBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnStraightThroughProcessBtn();
            Thread.sleep(2000);
            ProjectPageObj.ClickOnDocumentScoreBtn(ReadProps.readAttr("Score"));
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
            Thread.sleep(2000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(2000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,-1000)", "");
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//ProjectDetailsPage.jpg");
            Thread.sleep(3000);
            js.executeScript("window.scrollBy(0,1000)", "");
            ProjectPageObj.ClickNextPage();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnExpandVariables();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnAddVariables();
            Thread.sleep(1000);
            ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName1"));
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnValidationType();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnName();
            Thread.sleep(1000);
            ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue"));
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnAddButton();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnCancelButton();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//Variable.jpg");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnNextPageButton();
            Thread.sleep(3000);
            ProjectBREPageObj.ClickOnThreeDotsButton();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnProjectData();
            Thread.sleep(4000);
            ProjectBREPageObj.ClickOnProjectData();
            Thread.sleep(3000);
            ProjectBREPageObj.ClickOnDataSets();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnVariables();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnThreeDotsButton();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//DataPage1.jpg");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddRulesButton();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//AddRules.jpg");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnDeleteRulesButton();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//DeleteRules.jpg");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddRulesButton();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnExpandFirstRule();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//ExpandFirstRule.jpg");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnContractRuleButton();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//ContractFirstRule.jpg");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnVisibility();
            Thread.sleep(1000);
            //One Double Click, One Single click then clear default rule name and enter new rule name
            ProjectBREPageObj.ClearDefaultRuleName();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddNameOfCondition("Condition");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddCondition();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAttributeValue();
            Thread.sleep(2000);
            ProjectBREPageObj.SelectNameAttribute();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnOperator();
            Thread.sleep(2000);
            ProjectBREPageObj.SelectOperatorValueEqualTo();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAttributeEqualToValue("OperatorValue");
            Thread.sleep(2000);





        } catch (Exception e) {
            test.log(status.FAIL, e);
        }
    }

}
