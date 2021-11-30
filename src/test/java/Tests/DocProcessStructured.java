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
                Thread.sleep(15000);
                Robot r = new Robot();
                DocumentPage DocPageObj = new DocumentPage(driver);
                test.log(status.INFO, "TestInformation");
                test.log(status.PASS, "TestPassed");

                DocPageObj.ClickDocumentBtn();
                Thread.sleep(4000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//DocumentTab.jpg");
                Thread.sleep(3000);

                //Arrow Right and Left
                DocPageObj.ClickArrowRight();
                Thread.sleep(3000);
                DocPageObj.ClickArrowLeft();
                Thread.sleep(3000);


                //Search Project
                DocPageObj.ClickDropDownBtn();
                Thread.sleep(4000);
                DocPageObj.ClickSearchProject(ReadProps.readAttr("StructuredProjecteName"));
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//ProjectListDropDown.jpg");
                Thread.sleep(3000);
                DocPageObj.ClickSelectStructuredProject();
                Thread.sleep(3000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//ProjectSelected.jpg");
                Thread.sleep(3000);
                DocPageObj.ClickStatusFilter();
                Thread.sleep(3000);
                DocPageObj.ClickCheckProcessed();
                Thread.sleep(3000);
                System.out.println("Status filter updated");
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//StatusFilter.jpg");
                Thread.sleep(2000);
                r.keyPress(KeyEvent.VK_ESCAPE);
                Thread.sleep(3000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//Statuses.jpg");



                //Searchbox Document
                DocPageObj.ClickSearchBox("BRE US Citizen.jpg");
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//DocumentSearched.jpg");
                Thread.sleep(3000);
                DocPageObj.ClickSearchDocument();
                Thread.sleep(4000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//OpenDocument.jpg");

                //Update document and cancel it
                DocPageObj.ClickViewDocIcon();
                Thread.sleep(15000);
                DocPageObj.ClickExpansionPanel();
                Thread.sleep(4000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//PanelExpanded.jpg");
                Thread.sleep(3000);
                DocPageObj.ClickCancelDoc2();
                Thread.sleep(4000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//CancelUpdate.jpg");
                Thread.sleep(3000);
                // DocPageObj.ClickDiscardUpdate();
                //Thread.sleep(4000);
                DocPageObj.ClickClearSearch();
                Thread.sleep(4000);

                //Document refresh
                DocPageObj.ClickRefreshDocument();
                Thread.sleep(3000);

                //Hide Unhide Analytics
                DocPageObj.ClickHideAnalytics();
                Thread.sleep(4000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//HideAnalytics.jpg");
                Thread.sleep(4000);
                DocPageObj.ClickUnhideAnalytics();
                Thread.sleep(4000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//UnhideAnalytics.jpg");


                // TC - Documents - filter
                DocPageObj.ClickFilterDoc();
                Thread.sleep(3000);
                DocPageObj.ClickSearchFilterDoc("BRE");
                Thread.sleep(3000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//FilterDocSearch.jpg");
                Thread.sleep(4000);
                DocPageObj.ClickFilterSearchIcon();
                Thread.sleep(3000);
                r.keyPress(KeyEvent.VK_ESCAPE);
                Thread.sleep(3000);
                DocPageObj.ClickFilterDoc();
                Thread.sleep(4000);
                DocPageObj.ClickCancelFilterSearch();
                Thread.sleep(3000);
                r.keyPress(KeyEvent.VK_ESCAPE);
                Thread.sleep(3000);

                //sorting
                DocPageObj.ClickDocSort();
                Thread.sleep(3000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//DocumentSort.jpg");
                Thread.sleep(4000);
                DocPageObj.ClickAssigneeSort();
                Thread.sleep(3000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//AssigneeSort.jpg");
                Thread.sleep(4000);
                DocPageObj.ClickStatusSort();
                Thread.sleep(3000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//StatusSort.jpg");
                Thread.sleep(4000);
                DocPageObj.ClickTypeSort();
                Thread.sleep(3000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//TypeSort.jpg");
                Thread.sleep(4000);
                DocPageObj.ClickScoreSort();
                Thread.sleep(3000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//ScoreSort.jpg");
                Thread.sleep(4000);
                DocPageObj.ClickSizeSort();
                Thread.sleep(3000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//SizeSort.jpg");
                Thread.sleep(4000);
                DocPageObj.ClickUpdateSort();
                Thread.sleep(3000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//UpdateSort.jpg");
                Thread.sleep(4000);
                DocPageObj.ClickReceivedSort();
                Thread.sleep(4000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//ReceivedSort.jpg");
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollBy(0,10000)", "");
                Thread.sleep(3000);

                //Items Per Page
                DocPageObj.ClickItemsPerPage();
                Thread.sleep(3000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//ItemsPerPage.jpg");
                DocPageObj.SelectItemsPerPage();
                Thread.sleep(3000);


                //Next, Last, Previous and First Page

                DocPageObj.ClickNextPage();
                Thread.sleep(3000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//NextItemPerPage.jpg");
                Thread.sleep(4000);
                DocPageObj.ClickPreviousPage();
                Thread.sleep(3000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//PreviousItemPerPage.jpg");
                Thread.sleep(4000);
                DocPageObj.ClickLastPage();
                Thread.sleep(3000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//LastItemPerPage.jpg");
                Thread.sleep(4000);
                DocPageObj.ClickFirstPage();
                Thread.sleep(3000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//FirstItemPerPage.jpg");
                Thread.sleep(4000);


                // Anticlockwise , clockwise , Next Page , Previous Page
                DocPageObj.ClickSearchBox("form 1040.pdf");
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//DocumentMorePage.jpg");
                Thread.sleep(3000);
                DocPageObj.ClickSearchDocument();
                Thread.sleep(4000);
                DocPageObj.ClickViewDocIcon();
                Thread.sleep(60000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//OpenDocument.jpg");
                DocPageObj.ClickAntiWiseIcon();
                Thread.sleep(3000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//AntiClockWiseIcon.jpg");


                //Clockwise
                DocPageObj.ClickClockWiseIcon();
                Thread.sleep(3000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//ClockWiseIcon.jpg");


                //Zoom In
                DocPageObj.ClickZoomIn();
                Thread.sleep(3000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//ZoomIn.jpg");

                //ZoomOut
                DocPageObj.ClickZoomOut();
                Thread.sleep(4000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//ZoomOut.jpg");


                //Navigate Right
                DocPageObj.ClickNvgtRt();
                Thread.sleep(3000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//NextPage.jpg");

                //Navigate Back
                DocPageObj.ClickNvgtLft();
                Thread.sleep(5000);
                TakesScreen.takeSnapShot(driver, "test-output//StructuredDocument//PreviousPage.jpg");

                driver.close();

            } catch (Exception e) {
                test.log(status.FAIL, e);
            }
        }
    }





