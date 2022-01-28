package Tests;
import Base.BasePage;
import Pages.EditProfilePage;
import Pages.LoginPage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.*;

import java.io.IOException;
@Listeners(Utilities.TestListeners.class)
public class EditProfileTest extends BasePage {
    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
    }
    @AfterClass
    public void cleanUp() throws Exception {
        driver.quit();
    }
    @Test
    public void EditProfileFlow() throws InterruptedException, IOException {
        try {
            driver.get(ReadProps.readAttr("URL"));
            driver.manage().window().maximize();
            Thread.sleep(8000);
            EditProfilePage EditProfileObj = new EditProfilePage(driver);
            LoginPage loginPageObjects = new LoginPage(driver);
            //TC 11.1 Visible Password On.
            loginPageObjects.setUsername(ReadProps.readAttr("UserID"));
            Thread.sleep(1000);
            loginPageObjects.setPassword(ReadProps.readAttr("Password"));
            Thread.sleep(1000);
            EditProfileObj.clickVisible();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//EditProfileTest//PasswordVisible.jpg");
            Thread.sleep(1000);

            //TC 11.2 Visible Password Off.
            EditProfileObj.clickVisible();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//EditProfileTest//PasswordInvisible.jpg");
            Thread.sleep(1000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(10000);

            //TC 11.3 Profile Icon
            EditProfileObj.ProfileButton();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//EditProfileTest//Profile.jpg");
            Thread.sleep(2000);

            //TC 11.4 Night Mode , Day Mode
            EditProfileObj.NightModeButton();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//EditProfileTest//NightMode.jpg");
            Thread.sleep(2000);
            EditProfileObj.DayModeButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//EditProfileTest//DayMode.jpg");

            //TC 11.5 Edit Profile.
            EditProfileObj.EditProfileButton();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//EditProfileTest//EditProfileWindow.jpg");
            Thread.sleep(2000);

            //TC 11.6 Edit Profile Cancel.
            EditProfileObj.CancelButton();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//EditProfileTest//Cancel.jpg");
            Thread.sleep(2000);
        }
        catch (Exception e) {
            test.log(LogStatus.FAIL, e);
        }

    }
}