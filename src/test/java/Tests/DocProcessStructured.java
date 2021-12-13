package Tests;

import Base.BasePage;
import Pages.DocumentPage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class DocProcessStructured extends BasePage {

        @Test
        public void DocumentFlow() throws InterruptedException, IOException {
            try {
                BasePage.LoginTest();
                Thread.sleep(8000);
                Robot r = new Robot();
                DocumentPage DocPageObj = new DocumentPage(driver);
                test.log(status.INFO, "TestInformation");
                test.log(status.PASS, "TestPassed");

                DocPageObj.ClickDocumentBtn();
                Thread.sleep(5000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//DocumentTab.jpg");
                Thread.sleep(3000);

                //Search Project
                DocPageObj.ClickDropDownBtn();
                Thread.sleep(2000);
                DocPageObj.ClickSearchProject(ReadProps.readAttr("StructuredProjectName"));
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//ProjectListDropDown.jpg");
                Thread.sleep(2000);
                DocPageObj.ClickSelectStructuredProject();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//ProjectSelected.jpg");
                Thread.sleep(2000);
                DocPageObj.ClickStatusFilter();
                Thread.sleep(2000);
                DocPageObj.ClickCheckProcessed();
                Thread.sleep(2000);
                System.out.println("Status filter updated");
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//StatusFilter.jpg");
                Thread.sleep(1000);
                r.keyPress(KeyEvent.VK_ESCAPE);
                Thread.sleep(1000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//Statuses.jpg");

                //SearchBox Document
                DocPageObj.ClickSearchBox("BRE US Citizen.jpg");
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//DocumentSearched.jpg");
                Thread.sleep(2000);
                DocPageObj.ClickSearchDocument();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//OpenDocument.jpg");

                //Update document and cancel it
                DocPageObj.ClickViewDocIcon();
                Thread.sleep(8000);
                DocPageObj.ClickExpansionPanel();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//PanelExpanded.jpg");
                Thread.sleep(2000);
                DocPageObj.ClickCancelDoc2();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//CancelUpdate.jpg");
                Thread.sleep(2000);
                DocPageObj.ClickClearSearch();
                Thread.sleep(2000);

                //Document refresh
                DocPageObj.ClickRefreshDocument();
                Thread.sleep(5000);

                //Hide UnHide Analytics
                DocPageObj.ClickHideAnalytics();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//HideAnalytics.jpg");
                Thread.sleep(2000);
                DocPageObj.ClickUnhideAnalytics();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//UnhideAnalytics.jpg");

                // TC - Documents - filter
                DocPageObj.ClickFilterDoc();
                Thread.sleep(2000);
                DocPageObj.ClickSearchFilterDoc("BRE");
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//FilterDocSearch.jpg");
                Thread.sleep(2000);
                DocPageObj.ClickFilterSearchIcon();
                Thread.sleep(1000);
                r.keyPress(KeyEvent.VK_ESCAPE);
                Thread.sleep(1000);
                DocPageObj.ClickFilterDoc();
                Thread.sleep(2000);
                DocPageObj.ClickCancelFilterSearch();
                Thread.sleep(1000);
                r.keyPress(KeyEvent.VK_ESCAPE);
                Thread.sleep(1000);

                //sorting
                DocPageObj.ClickDocSort();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//DocumentSort.jpg");
                Thread.sleep(2000);
                DocPageObj.ClickAssigneeSort();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//AssigneeSort.jpg");
                Thread.sleep(2000);
                DocPageObj.ClickStatusSort();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//StatusSort.jpg");
                Thread.sleep(2000);
                DocPageObj.ClickTypeSort();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//TypeSort.jpg");
                Thread.sleep(2000);
                DocPageObj.ClickScoreSort();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//ScoreSort.jpg");
                Thread.sleep(2000);
                DocPageObj.ClickSizeSort();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//SizeSort.jpg");
                Thread.sleep(2000);
                DocPageObj.ClickUpdateSort();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//UpdateSort.jpg");
                Thread.sleep(2000);
                DocPageObj.ClickReceivedSort();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//ReceivedSort.jpg");
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollBy(0,10000)", "");
                Thread.sleep(3000);

                //Items Per Page
                DocPageObj.ClickItemsPerPage();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//ItemsPerPage.jpg");
                DocPageObj.SelectItemsPerPage();
                Thread.sleep(2000);

                //Next, Last, Previous and First Page
                DocPageObj.ClickNextPage();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//NextItemPerPage.jpg");
                Thread.sleep(2000);
                DocPageObj.ClickPreviousPage();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//PreviousItemPerPage.jpg");
                Thread.sleep(2000);
                DocPageObj.ClickLastPage();
                Thread.sleep(1000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//LastItemPerPage.jpg");
                Thread.sleep(1000);
                DocPageObj.ClickFirstPage();
                Thread.sleep(1000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//FirstItemPerPage.jpg");
                Thread.sleep(1000);

                // Anticlockwise , clockwise , Next Page , Previous Page
                DocPageObj.ClickSearchBox("form 1040.pdf");
                Thread.sleep(1000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//DocumentMorePage.jpg");
                Thread.sleep(1000);
                DocPageObj.ClickSearchDocument();
                Thread.sleep(1000);
                DocPageObj.ClickViewDocIcon();
                Thread.sleep(15000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//OpenDocument.jpg");
                DocPageObj.ClickAntiWiseIcon();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//AntiClockWiseIcon.jpg");

                //Clockwise
                DocPageObj.ClickClockWiseIcon();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//ClockWiseIcon.jpg");

                //Zoom In
                DocPageObj.ClickZoomIn();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//ZoomIn.jpg");

                //ZoomOut
                DocPageObj.ClickZoomOut();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//ZoomOut.jpg");

                //Navigate Right
                DocPageObj.ClickNvgtRt();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//NextPage.jpg");

                //Navigate Back
                DocPageObj.ClickNvgtLft();
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//PreviousPage.jpg");
                Thread.sleep(2000);
                driver.close();

            } catch (Exception e) {
                test.log(status.FAIL, e);
            }
        }
    }





