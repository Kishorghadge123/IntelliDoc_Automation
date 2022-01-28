package Tests;
import Base.BasePage;
import Pages.ProjectBREPage;
import Pages.ProjectPage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
@Listeners(Utilities.TestListeners.class)
public class ProjectBRETest extends BasePage {
    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
        BasePage.LoginTest();
    }
    @AfterClass
    public void cleanUp() throws Exception {
        driver.quit();
    }
    @Test
    public void ProjectBREFlow() throws InterruptedException, IOException {
        try {
            Robot r = new Robot();
            ProjectPage ProjectPageObj = new ProjectPage(driver);
            //Object Creation.
            ProjectBREPage ProjectBREPageObj = new ProjectBREPage(driver);
            ProjectPageObj.ClickOnCreateProjectBtn();
            Thread.sleep(5000);
            //Navigate to Project Page.
            ProjectPageObj.ClickOnProjectNameBtn(ReadProps.readAttr("BREProjectName"));//Change this before u Run.
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
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//ProjectDetails.jpg");
            Thread.sleep(2000);
            //Navigate to Data Page. Adding Variables for Name, Address, State.
            ProjectPageObj.ClickNextPage();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnExpandVariables();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddVariables();
            Thread.sleep(2000);
            ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName1"));
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnValidationType();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnName();
            Thread.sleep(2000);
            ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue1"));
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//Variable1AddedSuccessfully.jpg");
            Thread.sleep(2000);
            //Adding Second Variable for Name.
            ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName2"));
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnValidationType();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnName();
            Thread.sleep(2000);
            ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue"));
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//Variable2AddedSuccessfully.jpg");
            Thread.sleep(2000);
            //Adding Third Variable for Address.
            ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName3"));
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnValidationType();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddress();
            Thread.sleep(2000);
            ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue2"));
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//Variable3AddedSuccessfully.jpg");
            Thread.sleep(2000);
            //Adding Fourth Variable for Address.
            ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName4"));
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnValidationType();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddress();
            Thread.sleep(2000);
            ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue"));
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//Variable4AddedSuccessfully.jpg");
            Thread.sleep(2000);
            //Adding Fifth Variable for State.
            ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName5"));
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnValidationType();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnState();
            Thread.sleep(2000);
            ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue3"));
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//Variable5AddedSuccessfully.jpg");
            Thread.sleep(2000);
            //Adding Sixth Variable for State.
            ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName6"));
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnValidationType();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnState();
            Thread.sleep(2000);
            ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue"));
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//Variable6AddedSuccessfully.jpg");
            Thread.sleep(2000);
            //Adding Seventh Variable for City.
            ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName7"));
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnValidationType();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnCity();
            Thread.sleep(2000);
            ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue4"));
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//Variable7AddedSuccessfully.jpg");
            Thread.sleep(2000);
            //Adding Eight Variable for City.
            ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName8"));
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnValidationType();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnCity();
            Thread.sleep(2000);
            ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue"));
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//Variable8AddedSuccessfully.jpg");
            Thread.sleep(2000);
            //Adding Ninth Variable for ZIP.
            ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName9"));
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnValidationType();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnZIP();
            Thread.sleep(2000);
            ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue5"));
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//Variable9AddedSuccessfully.jpg");
            Thread.sleep(2000);
            //Adding Tenth Variable for ZIP.
            ProjectBREPageObj.EnterVariableName(ReadProps.readAttr("VariableName10"));
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnValidationType();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnZIP();
            Thread.sleep(2000);
            ProjectBREPageObj.EnterDefaultValue(ReadProps.readAttr("DefaultValue"));
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//Variable10AddedSuccessfully.jpg");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnCancelButton();
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
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//RulePage.jpg");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnThreeDotsButton();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddRulesButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//AddRule.jpg");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnDeleteRulesButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//DeleteRule.jpg");
            Thread.sleep(2000);
            //Adding First Rule for Name.
            //TC-1 BRE Applied to NAME-Pass.
            ProjectBREPageObj.ClickOnAddRulesButton();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnExpandFirstRule();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//ExpandRule1.jpg");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnContractRuleButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//ContractRule1.jpg");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnVisibility();
            Thread.sleep(2000);
            ProjectBREPageObj.DoubleClickOnRule1();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnRule();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnClearRule();
            Thread.sleep(2000);
            ProjectBREPageObj.DoubleClickOnRule1Second();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnRule();
            Thread.sleep(2000);
            ProjectBREPageObj.EnterRuleName("SampleRule1");
            Thread.sleep(2000);
            //Add Condition.
            ProjectBREPageObj.EnterAddNameOfCondition("Name");
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
            ProjectBREPageObj.EnterValue(ReadProps.readAttr("DefaultValue"));
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnSave();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//Condition1SavedSuccessfully.jpg");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnFirstDecisionBox();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//FirstCondition.jpg");
            Thread.sleep(2000);
            //Add Action.
            ProjectBREPageObj.DoubleClickOnTrue1();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnFirstTrueBoxButton();
            Thread.sleep(2000);
            ProjectBREPageObj.EnterActionValue("Name Exists");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddAction();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnVariableDropdown();
            Thread.sleep(2000);
            ProjectBREPageObj.SelectVariable1();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnSave();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnFirstTrueBoxButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//TrueAction1SavedSuccessfully.jpg");
            Thread.sleep(2000);
            //TC-2 BRE Applied to NAME-Fail.
            ProjectBREPageObj.DoubleClickOnFalse();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnFalseBoxButton1();
            Thread.sleep(2000);
            ProjectBREPageObj.EnterActionValue("Name Doesn't Exists");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddAction();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnVariableDropdown();
            Thread.sleep(2000);
            ProjectBREPageObj.SelectVariable2();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnSave();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnFalseBoxButton1();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//FalseAction1SavedSuccessfully.jpg");
            Thread.sleep(2000);
            //Adding Second Rule for Address.
            //TC-3 BRE Applied to Address = Pass.
            ProjectBREPageObj.ClickOnAddRulesButton();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnExpandSecondRule();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//ExpandRule2.jpg");
            Thread.sleep(2000);
            //Add Condition.
            ProjectBREPageObj.EnterAddNameOfCondition("Address");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddCondition();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAttributeValue();
            Thread.sleep(2000);
            ProjectBREPageObj.SelectAddressAttribute();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnOperator();
            Thread.sleep(2000);
            ProjectBREPageObj.SelectOperatorValueEqualTo();
            Thread.sleep(2000);
            ProjectBREPageObj.EnterValue(ReadProps.readAttr("DefaultValue"));
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnSave();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//Condition2SavedSuccessfully.jpg");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnFirstDecisionBox();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//SecondCondition.jpg");
            Thread.sleep(2000);
            //Add Action.
            ProjectBREPageObj.DoubleClickOnTrue2();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnSecondTrueBoxButton();
            Thread.sleep(2000);
            ProjectBREPageObj.EnterActionValue("Address Exists");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddAction();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnVariableDropdown();
            Thread.sleep(2000);
            ProjectBREPageObj.SelectVariable3();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnSave();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnSecondTrueBoxButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//TrueAction2SavedSuccessfully.jpg");
            Thread.sleep(2000);
            //TC-4 BRE Applied to Address-Fail.
            ProjectBREPageObj.DoubleClickOnFalse2();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnFalseBoxButton2();
            Thread.sleep(2000);
            ProjectBREPageObj.EnterActionValue("Address Doesn't Exists");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddAction();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnVariableDropdown();
            Thread.sleep(2000);
            ProjectBREPageObj.SelectVariable4();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnSave();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnFalseBoxButton2();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//FalseAction2SavedSuccessfully.jpg");
            Thread.sleep(2000);
            //Adding Third Rule for State.
            //TC-5 BRE Applied to State = Pass.
            ProjectBREPageObj.ClickOnAddRulesButton();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnExpandThirdRule();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//Expand3rdRule.jpg");
            Thread.sleep(2000);
            //Add Condition.
            ProjectBREPageObj.EnterAddNameOfCondition("State");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddCondition();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAttributeValue();
            Thread.sleep(2000);
            ProjectBREPageObj.SelectStateAttribute();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnOperator();
            Thread.sleep(2000);
            ProjectBREPageObj.SelectOperatorValueEqualTo();
            Thread.sleep(2000);
            ProjectBREPageObj.EnterValue(ReadProps.readAttr("DefaultValue"));
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnSave();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//Condition3SavedSuccessfully.jpg");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnFirstDecisionBox();
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//SecondCondition.jpg");
            Thread.sleep(2000);
            //Add Action.
            ProjectBREPageObj.DoubleClickOnTrue3();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnThirdTrueBoxButton();
            Thread.sleep(2000);
            ProjectBREPageObj.EnterActionValue("State Exists");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddAction();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnVariableDropdown();
            Thread.sleep(2000);
            ProjectBREPageObj.SelectVariable5();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnSave();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnThirdTrueBoxButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//TrueAction3SavedSuccessfully.jpg");
            Thread.sleep(2000);
            //TC-6 BRE Applied to State-Fail.
            ProjectBREPageObj.DoubleClickOnFalse3();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnFalseBoxButton3();
            Thread.sleep(2000);
            ProjectBREPageObj.EnterActionValue("State Doesn't Exists");
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnAddAction();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnVariableDropdown();
            Thread.sleep(2000);
            ProjectBREPageObj.SelectVariable6();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnSave();
            Thread.sleep(2000);
            ProjectBREPageObj.ClickOnFalseBoxButton3();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//FalseAction3SavedSuccessfully.jpg");
            Thread.sleep(2000);
            ProjectPageObj.ClickOnCreate();
            Thread.sleep(10000);
            TakesScreen.takeSnapShot(driver, "test-output//ProjectBRETest//BREProjectCreatedSuccessfully.jpg");
            Thread.sleep(3000);
            //Upload the Document in this Project for the Results.
        }
        catch (Exception e) {
            test.log(LogStatus.FAIL, e);
        }
    }

}
