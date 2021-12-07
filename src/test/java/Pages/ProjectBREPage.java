package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectBREPage {


    WebDriver driver = null;

    By NextPage = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[3]/div[1]/div[1]/button[4]/span[1]");
    By ThreeDots = By.xpath("//mat-icon[contains(text(),'menu')]");
    By ProjectData = By.xpath("//mat-panel-title[contains(text(),'Project DATA')]");
    By DataSets = By.xpath("//mat-panel-title[contains(text(),'Datasets')]");
    By Variables = By.xpath("//mat-panel-title[contains(text(),'Variables')]");
    By AddRules = By.xpath("//span[contains(text(),'Rules')]");
    By DeleteRules = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/mat-card[1]/div[1]/span[3]/mat-icon[1]");
    By ExpandFirstRule = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/mat-icon[1]");
    By ContractFirstRule = By.xpath("//mat-icon[contains(text(),'visibility_off')]");
    By AddNameOfCondition = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer[2]/div[1]/rule-edit-sidebar[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]");
    By DefaultRuleName = By.xpath("//span[contains(text(),'Rule-1')]");
    By AddCondition = By.xpath("//span[contains(text(),'Add Condition')]");
    By AttributeValue = By.xpath("//span[contains(text(),'Attribute / Variable')]");
    By NameAttribute = By.xpath("//span[contains(text(),'NAME')]");
    By Visibility = By.xpath("//mat-icon[contains(text(),'visibility')]");
    By Operator = By.xpath("//span[contains(text(),'Operator')]");
    By OperatorValueEqualTo = By.xpath("//span[contains(text(),'==')]");
    By AttributeEqualToValue= By.xpath("//input[@id='mat-input-10']");
    By ExpandVariables = By.xpath("//span[contains(text(),'Variables')]");
    By AddVariablesButton = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[3]/div[1]/project-data-section[1]/mat-accordion[1]/project-variables[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/button[1]/span[1]");
    By VariableName = By.xpath("//input[@id='variableName']");
    By ValidationType = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[3]/div[1]/project-data-section[1]/mat-accordion[1]/project-variables[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[1]/span[1]");
    By Name = By.xpath("//span[contains(text(),'Name')]");
    By DefaultValue = By.xpath("//input[@id='VariableValue']");
    By AddButton = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[3]/div[1]/project-data-section[1]/mat-accordion[1]/project-variables[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[2]/span[1]");
    By CancelButton = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[3]/div[1]/project-data-section[1]/mat-accordion[1]/project-variables[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]/span[1]");






    //Constructor
    public ProjectBREPage(WebDriver driver) {
        this.driver = driver;
    }

    public  void ClickOnNextPageButton(){driver.findElement(NextPage).click();}
    public  void ClickOnThreeDotsButton(){driver.findElement(ThreeDots).click();}
    public void ClickOnProjectData(){driver.findElement(ProjectData).click();}
    public void ClickOnDataSets(){driver.findElement(DataSets).click();}
    public void ClickOnVariables(){driver.findElement(Variables).click();}
    public void ClickOnAddRulesButton(){driver.findElement(AddRules).click();}
    public void ClickOnDeleteRulesButton(){driver.findElement(DeleteRules).click();}
    public void EnterRuleName(String text){ driver.findElement(DefaultRuleName).sendKeys(text);}
    public void ClickOnExpandFirstRule(){driver.findElement(ExpandFirstRule).click();}
    public void ClickOnAddNameOfCondition(String text){ driver.findElement(AddNameOfCondition).sendKeys(text);}
    public void ClearDefaultRuleName(){driver.findElement(DefaultRuleName).clear();}
    public  void ClickOnAddCondition(){driver.findElement(AddCondition).click();}
    public  void ClickOnAttributeValue(){driver.findElement(AttributeValue).click();}
    public void SelectNameAttribute(){driver.findElement(NameAttribute).click();}
    public  void ClickOnOperator(){driver.findElement(Operator).click();}
    public  void ClickOnVisibility(){driver.findElement(Visibility).click();}
    public  void SelectOperatorValueEqualTo(){driver.findElement(OperatorValueEqualTo).click();}
    public void ClickOnAttributeEqualToValue(String text){ driver.findElement(AttributeEqualToValue).sendKeys(text);}
    public  void ClickOnExpandVariables(){driver.findElement(ExpandVariables).click();}
    public  void ClickOnAddVariables(){driver.findElement(AddVariablesButton).click();}
    public void EnterVariableName(String text){ driver.findElement(VariableName).sendKeys(text);}
    public  void ClickOnValidationType(){driver.findElement(ValidationType).click();}
    public  void ClickOnName(){driver.findElement(Name).click();}
    public void EnterDefaultValue(String text){ driver.findElement(DefaultValue).sendKeys(text);}
    public  void ClickOnAddButton(){driver.findElement(AddButton).click();}
    public  void ClickOnCancelButton(){driver.findElement(CancelButton).click();}
    public  void ClickOnContractRuleButton(){driver.findElement(ContractFirstRule).click();}


}