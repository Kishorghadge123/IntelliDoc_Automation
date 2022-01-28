package Tests;

import Base.BasePage;
import Pages.ForgetPwdPage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.io.IOException;

public class ForgetPwdTest extends BasePage {

    @Test(priority = 1)
    public void click_on_cancel_button_on_forgot_password() throws InterruptedException, IOException {
        try {
            String projectPath = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", projectPath + ".\\Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            ForgetPwdPage FwdPwdObj = new ForgetPwdPage(driver);
            driver.get(ReadProps.readAttr("URL"));
            driver.manage().window().maximize();
            Thread.sleep(2000);
            //12.1 Click on Cancel button on Forgot Password Screen.
            FwdPwdObj.ClickForgetPwdBtn();
            TakesScreen.takeSnapShot(driver, "test-output//ForgotPassword//ForgetPwdScreen.jpg");
            Thread.sleep(2000);
            FwdPwdObj.ClickCancelBtn();
            TakesScreen.takeSnapShot(driver, "test-output//ForgotPassword//CancelLoginScreen.jpg");
            Thread.sleep(2000);
            test.log(LogStatus.INFO, "click on cancel button on forgot password");
            test.log(LogStatus.PASS, "TestPassed");
            //TC 12.2 First Login is not Done By the User.
            FwdPwdObj.ClickForgetPwdBtn();
            Thread.sleep(2000);
            FwdPwdObj.ClickEmailBtn(ReadProps.readAttr("UserEmail"));
            FwdPwdObj.ClickSubmitBtn();
            Thread.sleep(950);
            TakesScreen.takeSnapShot(driver, "test-output//ForgotPassword//FirstLoginNotDone.jpg");
            Thread.sleep(2000);
            test.log(LogStatus.INFO, "First login is not done by the user");
            test.log(LogStatus.PASS, "TestPassed");
            //TC 12.3 Invalid EmailID.
            FwdPwdObj.ClickForgetPwdBtn();
            Thread.sleep(2000);
            FwdPwdObj.ClickEmailBtn(ReadProps.readAttr("Invalid1"));
            TakesScreen.takeSnapShot(driver, "test-output//ForgotPassword//InvalidEmailID.jpg");
            FwdPwdObj.VerifyAssertEmailID();
            FwdPwdObj.ClickCancelBtn();
            Thread.sleep(2000);
            test.log(LogStatus.INFO, "invalid email id");
            test.log(LogStatus.PASS, "TestPassed");
            //12.4 User Does not Exist.
            FwdPwdObj.ClickForgetPwdBtn();
            Thread.sleep(2000);
            FwdPwdObj.ClickEmailBtn(ReadProps.readAttr("Invalid2"));
            Thread.sleep(3000);
            FwdPwdObj.ClickSubmitBtn();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//ForgotPassword//UserDoesn'tExist.jpg");
            FwdPwdObj.ClickCancelBtn();
            Thread.sleep(2000);
            test.log(LogStatus.INFO, "user doesn't exists");
            test.log(LogStatus.PASS, "TestPassed");
            //TC 12.5 Disable user.
            FwdPwdObj.ClickForgetPwdBtn();
            Thread.sleep(2000);
            FwdPwdObj.ClickEmailBtn(ReadProps.readAttr("DisabledUser"));
            Thread.sleep(1000);
            FwdPwdObj.ClickSubmitBtn();
            TakesScreen.takeSnapShot(driver, "test-output//ForgotPassword//DisableUser.jpg");
            Thread.sleep(2000);
            FwdPwdObj.ClickCancelBtn();
            Thread.sleep(4000);
            test.log(LogStatus.INFO, "Disable User");
            test.log(LogStatus.PASS, "TestPassed");
            driver.close();
        } catch (Exception e) {
            test.log(LogStatus.FAIL, e);
        }}}