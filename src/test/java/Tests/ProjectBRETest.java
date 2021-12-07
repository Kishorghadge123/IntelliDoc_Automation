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
            ProjectPage ProjectPageObj = new ProjectPage(driver);
            test.log(status.INFO, "TestInformation");
            test.log(status.PASS, "TestPassed");

            //Object creation
            ProjectBREPage ProjectBREPageObj = new ProjectBREPage(driver);
            //TC-1.1 BRE Applied to NAME RULE = Fail.
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(3000);
            //Navigate to Project Page.
            ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("BREProjectName"));
            Thread.sleep(2000);
            ProjectPageObj.ClickOnLeadBtn();
            Thread.sleep(2000);
            ProjectPageObj.SelectOnLeadBtn();
            Thread.sleep(2000);
            //Starting Date should be updated in Xpath to Current Date before executing the Script.
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
            Thread.sleep(3000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(2000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,-1000)", "");
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//ProjectDetails.jpg");
            Thread.sleep(3000);
            js.executeScript("window.scrollBy(0,1000)", "");
            //Navigate to Data Page.
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
            //Navigate to Rules Page.
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
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//RulePage.jpg");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnThreeDotsButton();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddRulesButton();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//AddRule.jpg");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnDeleteRulesButton();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//DeleteRule.jpg");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddRulesButton();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnExpandFirstRule();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//ExpandRule.jpg");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnContractRuleButton();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//ContractRule.jpg");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnVisibility();
            Thread.sleep(2000);
            ProjectBREPageObj.DoubleClickOnRule1();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnRule1();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnClearRule1();
            Thread.sleep(1000);
            ProjectBREPageObj.DoubleClickOnRule1Second();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnRule1();
            Thread.sleep(1000);
            ProjectBREPageObj.EnterRuleName("Sample Rule");
            Thread.sleep(1000);
            //Add Condition.
            ProjectBREPageObj.EnterAddNameOfCondition("Name");
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnAddCondition();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnAttributeValue();
            Thread.sleep(1000);
            ProjectBREPageObj.SelectNameAttribute();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnOperator();
            Thread.sleep(1000);
            ProjectBREPageObj.SelectOperatorValueEqualTo();
            Thread.sleep(1000);
            ProjectBREPageObj.EnterValue(ReadProps.readAttr("DefaultValue"));
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnSave();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//ConditionSavedSuccessfully.jpg");
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnFirstDecisionBox();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//FirstCondition.jpg");
            Thread.sleep(1000);
            //Add Action.
            ProjectBREPageObj.DoubleClickOnTrue();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnTrueBoxButton();
            Thread.sleep(1000);
            ProjectBREPageObj.EnterActionValue("Name Exists");
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnAddAction();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnVariableDropdown();
            Thread.sleep(1000);
            ProjectBREPageObj.SelectVariable();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnSaveAction();
            Thread.sleep(1000);
            ProjectBREPageObj.SelectTrueBox();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//TrueActionSavedSuccessfully.jpg");
            Thread.sleep(1000);
            ProjectBREPageObj.DoubleClickOnFalse();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnFalseBoxButton();
            Thread.sleep(1000);
            ProjectBREPageObj.EnterActionValue("Name Doesn't Exists");
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnAddAction();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnVariableDropdown();
            Thread.sleep(1000);
            ProjectBREPageObj.SelectVariable();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnSaveAction();
            Thread.sleep(1000);
            ProjectBREPageObj.SelectFalseBox();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//FalseActionSavedSuccessfully.jpg");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnCreateProjectButton();
            Thread.sleep(6000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//ProjectCreatedSuccessfully.jpg");
            Thread.sleep(3000);
            //Document should be uploaded from backend to check the output.

            //TC-1.2 BRE Applied to NAME RULE = Pass.
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(3000);
            //Navigate to Project Page.
            ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("BREProjectName"));
            Thread.sleep(2000);
            ProjectPageObj.ClickOnLeadBtn();
            Thread.sleep(2000);
            ProjectPageObj.SelectOnLeadBtn();
            Thread.sleep(2000);
            //Starting Date should be updated in Xpath to Current Date before executing the Script.
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
            Thread.sleep(3000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(2000);
            js.executeScript("window.scrollBy(0,-1000)", "");
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//ProjectDetails.jpg");
            Thread.sleep(3000);
            js.executeScript("window.scrollBy(0,1000)", "");
            //Navigate to Data Page.
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
            //Navigate to Rules Page.
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
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//RulePage.jpg");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnThreeDotsButton();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddRulesButton();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//AddRule.jpg");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnDeleteRulesButton();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//DeleteRule.jpg");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddRulesButton();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnExpandFirstRule();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//ExpandRule.jpg");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnContractRuleButton();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//ContractRule.jpg");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnVisibility();
            Thread.sleep(2000);
            ProjectBREPageObj.DoubleClickOnRule1();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnRule1();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnClearRule1();
            Thread.sleep(1000);
            ProjectBREPageObj.DoubleClickOnRule1Second();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnRule1();
            Thread.sleep(1000);
            ProjectBREPageObj.EnterRuleName("Sample Rule");
            Thread.sleep(1000);
            //Add Condition.
            ProjectBREPageObj.EnterAddNameOfCondition("Name");
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnAddCondition();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnAttributeValue();
            Thread.sleep(1000);
            ProjectBREPageObj.SelectNameAttribute();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnOperator();
            Thread.sleep(1000);
            ProjectBREPageObj.SelectOperatorValueEqualTo();
            Thread.sleep(1000);
            ProjectBREPageObj.EnterValue(ReadProps.readAttr("DefaultValue"));
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnSave();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//ConditionSavedSuccessfully.jpg");
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnFirstDecisionBox();
            Thread.sleep(1000);
            //Add Action.
            ProjectBREPageObj.DoubleClickOnTrue();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnTrueBoxButton();
            Thread.sleep(1000);
            ProjectBREPageObj.EnterActionValue("Name Exists");
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnAddAction();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnVariableDropdown();
            Thread.sleep(1000);
            ProjectBREPageObj.SelectVariable();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnSaveAction();
            Thread.sleep(1000);
            ProjectBREPageObj.SelectTrueBox();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//TrueActionSavedSuccessfully.jpg");
            Thread.sleep(1000);
            ProjectBREPageObj.DoubleClickOnFalse();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnFalseBoxButton();
            Thread.sleep(1000);
            ProjectBREPageObj.EnterActionValue("Name Doesn't Exists");
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnAddAction();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnVariableDropdown();
            Thread.sleep(1000);
            ProjectBREPageObj.SelectVariable();
            Thread.sleep(1000);
            ProjectBREPageObj.ClickOnSaveAction();
            Thread.sleep(1000);
            ProjectBREPageObj.SelectFalseBox();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//FalseActionSavedSuccessfully.jpg");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnCreateProjectButton();
            Thread.sleep(8000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//ProjectCreatedSuccessfully.jpg");
            Thread.sleep(2000);
            //Document should be uploaded from backend to check the output.

        }
        catch (Exception e) {
            test.log(status.FAIL, e);
        }
    }

}
