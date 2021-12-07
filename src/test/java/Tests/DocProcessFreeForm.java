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

public class DocProcessFreeForm extends BasePage {


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
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//DocumentTab.jpg");
                Thread.sleep(3000);

                //Search Project
                DocPageObj.ClickDropDownBtn();
                Thread.sleep(4000);
                DocPageObj.ClickSearchProject(ReadProps.readAttr("FreeFormProjectName"));
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//ProjectListDropDown.jpg");
                Thread.sleep(3000);
                DocPageObj.ClickSelectFreeFormProject();
                Thread.sleep(3000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//ProjectSelected.jpg");
                Thread.sleep(3000);
                DocPageObj.ClickStatusFilter();
                Thread.sleep(3000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//StatusFilter.jpg");
                DocPageObj.ClickCheckProcessed();
                Thread.sleep(3000);
                r.keyPress(KeyEvent.VK_ESCAPE);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//StatusFilter.jpg");
                Thread.sleep(5000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//Statuses.jpg");

                //SearchBox Document
                DocPageObj.ClickSearchBox("AN - OOLU2604599080.pdf");
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//DocumentSearched.jpg");
                Thread.sleep(3000);
                DocPageObj.ClickSearchDocument();
                Thread.sleep(4000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//OpenDocument.jpg");

                //Update document and cancel it
                DocPageObj.ClickViewDocIcon();
                Thread.sleep(25000);
                DocPageObj.ClickDocumentBtn();
                Thread.sleep(3000);

                //Document refresh
                DocPageObj.ClickRefreshDocument();
                Thread.sleep(3000);

                //Hide UnHide Analytics
                DocPageObj.ClickHideAnalytics();
                Thread.sleep(4000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//HideAnalytics.jpg");
                Thread.sleep(4000);
                DocPageObj.ClickUnhideAnalytics();
                Thread.sleep(4000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//UnhideAnalytics.jpg");

                // TC - Documents - filter
                DocPageObj.ClickFilterDoc();
                Thread.sleep(3000);
                DocPageObj.ClickSearchFilterDoc("AN");
                Thread.sleep(3000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//FilterDocSearch.jpg");
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
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//DocumentSort.jpg");
                Thread.sleep(4000);
                DocPageObj.ClickAssigneeSort();
                Thread.sleep(3000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//AssigneeSort.jpg");
                Thread.sleep(4000);
                DocPageObj.ClickStatusSort();
                Thread.sleep(3000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//StatusSort.jpg");
                Thread.sleep(4000);
                DocPageObj.ClickTypeSort();
                Thread.sleep(3000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//TypeSort.jpg");
                Thread.sleep(4000);
                DocPageObj.ClickScoreSort();
                Thread.sleep(3000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//ScoreSort.jpg");
                Thread.sleep(4000);
                DocPageObj.ClickSizeSort();
                Thread.sleep(3000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//SizeSort.jpg");
                Thread.sleep(4000);
                DocPageObj.ClickUpdateSort();
                Thread.sleep(3000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//UpdateSort.jpg");
                Thread.sleep(4000);
                DocPageObj.ClickReceivedSort();
                Thread.sleep(4000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//ReceivedSort.jpg");
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollBy(0,10000)", "");
                Thread.sleep(3000);

                //Items Per Page
                DocPageObj.ClickItemsPerPage();
                Thread.sleep(3000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//ItemsPerPage.jpg");
                DocPageObj.SelectItemsPerPage();
                Thread.sleep(3000);


                //Next, Last, Previous and First Page

                DocPageObj.ClickNextPage();
                Thread.sleep(3000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//NextItemPerPage.jpg");
                Thread.sleep(4000);
                DocPageObj.ClickPreviousPage();
                Thread.sleep(3000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//PreviousItemPerPage.jpg");
                Thread.sleep(4000);
                DocPageObj.ClickLastPage();
                Thread.sleep(3000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//LastItemPerPage.jpg");
                Thread.sleep(4000);
                DocPageObj.ClickFirstPage();
                Thread.sleep(3000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//FirstItemPerPage.jpg");
                Thread.sleep(4000);

                // Anticlockwise , clockwise , Next Page , Previous Page
                DocPageObj.ClickSearchBox("3.tif");
                Thread.sleep(2000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//DocumentMorePage.jpg");
                Thread.sleep(3000);
                DocPageObj.ClickSearchDocument();
                Thread.sleep(4000);
                DocPageObj.ClickViewDocIcon();
                Thread.sleep(60000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//OpenDocument.jpg");
                DocPageObj.ClickAntiWiseIcon();
                Thread.sleep(3000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//AntiClockWiseIcon.jpg");

                //Clockwise
                DocPageObj.ClickClockWiseIcon();
                Thread.sleep(3000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//ClockWiseIcon.jpg");

                //Zoom In
                DocPageObj.ClickZoomIn();
                Thread.sleep(3000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//ZoomIn.jpg");

                //ZoomOut
                DocPageObj.ClickZoomOut();
                Thread.sleep(4000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//ZoomOut.jpg");

                //Navigate Right
                DocPageObj.ClickNvgtRt();
                Thread.sleep(3000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//NextPage.jpg");

                //Navigate Back
                DocPageObj.ClickNvgtLft();
                Thread.sleep(5000);
                TakesScreen.takeSnapShot(driver, "test-output//FreeFormDocument//PreviousPage.jpg");
                driver.close();

            } catch (Exception e) {
                test.log(status.FAIL, e);
            }
        }
    }







