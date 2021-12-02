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
    By ExpandFirstRule = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/mat-icon[1]");
    By AddNameOfCondition = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/div[4]/div[1]/project-rule-section[1]/mat-drawer-container[1]/mat-drawer[2]/div[1]/rule-edit-sidebar[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]");
    By DefaultRuleName = By.xpath("//span[contains(text(),'Rule-1')]");
    By AddCondition = By.xpath("//span[contains(text(),'Add Condition')]");
    By AttributeValue = By.xpath("//span[contains(text(),'Attribute / Variable')]");
    By NameAttribute = By.xpath("//span[contains(text(),'NAME')]");
    By Operator = By.xpath("//span[contains(text(),'Operator')]");
    By OperatorValueEqualTo = By.xpath("//span[contains(text(),'==')]");
    By AttributeEqualToValue= By.xpath("//input[@id='mat-input-10']");


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

    public void ClickOnExpandFirstRule(){driver.findElement(ExpandFirstRule).click();}

    public void ClickOnAddNameOfCondition(String text){ driver.findElement(AddNameOfCondition).sendKeys(text);}

    public void ClearDefaultRuleName(){driver.findElement(DefaultRuleName).clear();}

    public  void ClickOnAddCondition(){driver.findElement(AddCondition).click();}

    public  void ClickOnAttributeValue(){driver.findElement(AttributeValue).click();}

    public void SelectNameAttribute(){driver.findElement(NameAttribute).click();}

    public  void ClickOnOperator(){driver.findElement(Operator).click();}

    public  void SelectOperatorValueEqualTo(){driver.findElement(OperatorValueEqualTo).click();}

    public void ClickOnAttributeEqualToValue(String text){ driver.findElement(AttributeEqualToValue).sendKeys(text);}

}