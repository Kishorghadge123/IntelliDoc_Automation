package Tests;
import Base.BasePage;
import Pages.ForgetPwdPage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.*;
import java.io.IOException;
@Listeners(Utilities.TestListeners.class)

public class ForgetPwdTest extends BasePage {
    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
    }
    @AfterClass
    public void cleanUp() throws Exception {
        driver.quit();
    }
    @Test(priority = 1)
    public void click_on_cancel_button_on_forgot_password() throws Exception {
            driver.get(ReadProps.readAttr("URL"));
            driver.manage().window().maximize();
            Thread.sleep(8000);
            ForgetPwdPage FwdPwdObj = new ForgetPwdPage(driver);
            //12.1 Click on Cancel button on Forgot Password Screen.
            FwdPwdObj.ClickForgetPwdBtn();
            TakesScreen.takeSnapShot(driver, "test-output//ForgotPassword//ForgetPwdScreen.jpg");
            Thread.sleep(2000);
            FwdPwdObj.ClickCancelBtn();
            TakesScreen.takeSnapShot(driver, "test-output//ForgotPassword//CancelLoginScreen.jpg");
            Thread.sleep(2000);
            //TC 12.2 First Login is not Done By the User.
            FwdPwdObj.ClickForgetPwdBtn();
            Thread.sleep(2000);
            FwdPwdObj.ClickEmailBtn(ReadProps.readAttr("UserEmail"));
            FwdPwdObj.ClickSubmitBtn();
            Thread.sleep(950);
            TakesScreen.takeSnapShot(driver, "test-output//ForgotPassword//FirstLoginNotDone.jpg");
            Thread.sleep(2000);
            //TC 12.3 Invalid EmailID.
            FwdPwdObj.ClickForgetPwdBtn();
            Thread.sleep(2000);
            FwdPwdObj.ClickEmailBtn(ReadProps.readAttr("Invalid1"));
            TakesScreen.takeSnapShot(driver, "test-output//ForgotPassword//InvalidEmailID.jpg");
            FwdPwdObj.VerifyAssertEmailID();
            FwdPwdObj.ClickCancelBtn();
            Thread.sleep(2000);
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

        }}