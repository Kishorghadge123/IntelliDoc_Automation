package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AnalyticsPage {

    WebDriver driver = null;

    By AnalyticsBtn = By.xpath("//i[@class='mat-tooltip-trigger fa fa-cubes m-0 side-icon ng-star-inserted']");
    By OrganizationDownArrow =By.xpath("//span[@class='mat-expansion-indicator ng-tns-c157-6 ng-trigger ng-trigger-indicatorRotate ng-star-inserted']");
    By TotalUser = By.xpath("//div[contains(text(),' Users ')]");
    By Document = By.xpath("//*[@class='mat-expansion-panel analytics ng-tns-c156-5 mat-expanded mat-expansion-panel-spacing']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]");
    By Processed = By.xpath("//*[@class='mat-expansion-panel analytics ng-tns-c156-5 mat-expanded mat-expansion-panel-spacing']/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]");
    By ReadyToProcess = By.xpath("//*[@class='mat-expansion-panel analytics ng-tns-c156-5 mat-expanded mat-expansion-panel-spacing']/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]");
    By Rejected = By.xpath("//*[@class='mat-expansion-panel analytics ng-tns-c156-5 mat-expanded mat-expansion-panel-spacing']/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]");
    By ValidationTime = By.xpath("//*[@class='mat-expansion-panel analytics ng-tns-c156-5 mat-expanded mat-expansion-panel-spacing']/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]");
    By SProcessedBar = By.xpath("//div[@class='row ng-star-inserted']/div[1]/div[1]/div[2]/div[1]");
    By SReadyBar = By.xpath("//div[@class='row ng-star-inserted']/div[1]/div[1]/div[2]/div[2]");
    By SRejectedBar = By.xpath("//div[@class='row ng-star-inserted']/div[1]/div[1]/div[2]/div[3]");
    By SSProcessedBar = By.xpath("//div[@class='row ng-star-inserted']/div[2]/div[1]/div[2]/div[1]");
    By SSReadyBar = By.xpath("//div[@class='row ng-star-inserted']/div[2]/div[1]/div[2]/div[2]");
    By SSRejectedBar = By.xpath("//div[@class='row ng-star-inserted']/div[2]/div[1]/div[2]/div[3]");
    By FFProcessedBar = By.xpath("//div[@class='row ng-star-inserted']/div[3]/div[1]/div[2]/div[1]");
    By FFReadyBar = By.xpath("//div[@class='row ng-star-inserted']/div[3]/div[1]/div[2]/div[2]");
    By FFRejectedBar = By.xpath("//div[@class='row ng-star-inserted']/div[3]/div[1]/div[2]/div[3]");
    By MCProcessedBar = By.xpath("//div[@class='row ng-star-inserted']/div[4]/div[1]/div[2]/div[1]");
    By MCReadyBar = By.xpath("//div[@class='row ng-star-inserted']/div[4]/div[1]/div[2]/div[2]");
    By MCRejectedBar = By.xpath("//div[@class='row ng-star-inserted']/div[4]/div[1]/div[2]/div[3]");
    By ProjectDownArrow=By.xpath("//button[@class='mat-focus-indicator mat-menu-trigger white_bg mat-button mat-button-base mat-primary ng-star-inserted']");
    By SearchProject=By.xpath("//input[@placeholder='Search']");
    By SelectProject=By.xpath("//span[contains(text(),'Abcd new')]");
    By SelectDropDown= By.xpath("//body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-analytics[1]/div[2]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]");
    By SelectMonthly = By.xpath("//span[contains(text(),'Monthly')]");
    By SelectWeekly = By.xpath("//span[contains(text(),'Weekly')]");
    By SelectDaily = By.xpath("//span[contains(text(),'Daily')]");
    By SelectOverall = By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/mat-option[4]/span[1]");
    By TotalDocument = By.xpath("//div[@class='white_bg rounded_5px box_shadow px-2 py-2 h-100 d-flex-center flex-column']");
    By Received = By.xpath("//div[@class='mat-sort-header-content ng-tns-c166-14']");
    By LastPage = By.xpath("//button[@class='mat-focus-indicator mat-tooltip-trigger mat-paginator-navigation-last mat-icon-button mat-button-base ng-star-inserted']");
    By FirstPage = By.xpath("//button[@class='mat-focus-indicator mat-tooltip-trigger mat-paginator-navigation-first mat-icon-button mat-button-base ng-star-inserted']");
    By PreviousPage = By.xpath("//button[@class='mat-focus-indicator mat-tooltip-trigger mat-paginator-navigation-previous mat-icon-button mat-button-base']");
    By NextPage = By.xpath("//button[@class='mat-focus-indicator mat-tooltip-trigger mat-paginator-navigation-next mat-icon-button mat-button-base']");
    By Document_Manual = By.xpath("//div[@class='mat-sort-header-content ng-tns-c166-14']");
    By Received_Manual = By.xpath("//div[@class='mat-sort-header-content ng-tns-c166-15']");
    By ProjectStatisticArrow = By.xpath("//span[@class='mat-expansion-indicator ng-tns-c157-8 ng-trigger ng-trigger-indicatorRotate ng-star-inserted']");


    public AnalyticsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickAnalyticsBtn() {
        driver.findElement(AnalyticsBtn).click();
    }
    //Organization Statistics
   public  void ClickOrganizationArrow(){
        driver.findElement(OrganizationDownArrow).click();
    }

    public  void HoverTotalUser(){
        Actions action = new Actions(driver);
        WebElement element= driver.findElement(TotalUser);
        action.moveToElement(element).build().perform();
        System.out.println("Mouse hover");
    }

    public void HoverDocuments()
    {
        Actions action = new Actions(driver);
        WebElement element= driver.findElement(Document);
        action.moveToElement(element).build().perform();
        System.out.println("Mouse hover");
    }

public void HoverProcessed()
{
    Actions action = new Actions(driver);
    WebElement element= driver.findElement(Processed);
    action.moveToElement(element).build().perform();

}

public void HoverReadytoProcess()
{
    Actions action = new Actions(driver);
    WebElement element= driver.findElement(ReadyToProcess);
    action.moveToElement(element).build().perform();
}

public void HoverRejected()
{
    Actions action = new Actions(driver);
    WebElement element= driver.findElement(Rejected);
    action.moveToElement(element).build().perform();
}

public void HoverValidationTime()
{
    Actions action = new Actions(driver);
    WebElement element= driver.findElement(ValidationTime);
    action.moveToElement(element).build().perform();
}

    public void HoverStructuredBar()
    {
        Actions action = new Actions(driver);
        WebElement element1= driver.findElement(SProcessedBar);
        action.moveToElement(element1).build().perform();

        WebElement element2= driver.findElement(SReadyBar);
        action.moveToElement(element2).build().perform();

        WebElement element3= driver.findElement(SRejectedBar);
        action.moveToElement(element3).build().perform();
    }

    public void HoverSemiStructured()
    {
        Actions action = new Actions(driver);
        WebElement element1= driver.findElement(SSProcessedBar);
        action.moveToElement(element1).build().perform();

        WebElement element2= driver.findElement(SSReadyBar);
        action.moveToElement(element2).build().perform();

        WebElement element3= driver.findElement(SSRejectedBar);
        action.moveToElement(element3).build().perform();
    }

    public void HoverFreeForm()
    {
        Actions action = new Actions(driver);
        WebElement element1= driver.findElement(FFProcessedBar);
        action.moveToElement(element1).build().perform();

        WebElement element2= driver.findElement(FFReadyBar);
        action.moveToElement(element2).build().perform();

        WebElement element3= driver.findElement(FFRejectedBar);
        action.moveToElement(element3).build().perform();
    }

    public void HoverMedicalChart()
    {
        Actions action = new Actions(driver);
        WebElement element1= driver.findElement(MCProcessedBar);
        action.moveToElement(element1).build().perform();

        WebElement element2= driver.findElement(MCReadyBar);
        action.moveToElement(element2).build().perform();

        WebElement element3= driver.findElement(MCRejectedBar);
        action.moveToElement(element3).build().perform();
    }


    //Project Statistics
    public  void ClickProjectArrow(){
        driver.findElement(ProjectDownArrow).click();
    }
    public void ClickSearchProject(){driver.findElement(SearchProject).click();}
    public void ClickSelectProject(){driver.findElement(SelectProject).click();}
    public void ClickSelectDropDown(){driver.findElement(SelectDropDown).click();}
    public void ClickSelectMonthly(){driver.findElement(SelectMonthly).click();}
    public void ClickSelectWeekly(){driver.findElement(SelectWeekly).click();}
    public void ClickSelectDaily(){driver.findElement(SelectDaily).click();}
    public void ClickSelectOverall(){driver.findElement(SelectOverall).click();}
    public  void HoverTotalDocument(){driver.findElement(TotalDocument).click();}
    public void ClickDocument(){driver.findElement(Document).click();}
    public void ClickReceived(){driver.findElement(Received).click();}
    public void ClickLastPage(){driver.findElement(LastPage).click();}
    public void ClickFirstPage(){driver.findElement(FirstPage).click();}
    public void ClickPreviousPage(){driver.findElement(PreviousPage).click();}
    public  void ClickNextPage(){driver.findElement(NextPage).click();}
    public void ClickDocumentManual(){driver.findElement(Document_Manual).click();}
    public  void ClickReceivedManual(){driver.findElement(Received_Manual).click();}
    public  void ClickProjectStatisticArrow(){driver.findElement(ProjectStatisticArrow).click();}

}