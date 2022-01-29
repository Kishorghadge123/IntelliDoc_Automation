package Tests;
import Base.BasePage;
import Pages.EditProfilePage;
import Pages.LoginPage;
import Utilities.ReadProps;
import org.testng.annotations.*;
@Listeners(Utilities.TestListeners.class)
public class EditProfileTest extends BasePage {
    static LoginPage loginPageObjects;
    static EditProfilePage EditProfileObj;
    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
    }
    @AfterClass
    public void cleanUp() throws Exception {
        driver.quit();
    }
    @Test(priority = 1)
    public void visible_password_on() throws Exception {
            driver.get(ReadProps.readAttr("URL"));
            driver.manage().window().maximize();
            Thread.sleep(8000);
           EditProfileObj = new EditProfilePage(driver);
            loginPageObjects = new LoginPage(driver);
            //TC 11.1 Visible Password On.
            loginPageObjects.setUsername(ReadProps.readAttr("UserID"));
            Thread.sleep(1000);
            loginPageObjects.setPassword(ReadProps.readAttr("Password"));
            Thread.sleep(1000);
            EditProfileObj.clickVisible();
            Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void visible_password_off() throws Exception {
        //TC 11.2 Visible Password Off.
        EditProfileObj.clickVisible();
        Thread.sleep(2000);
        loginPageObjects.clickLoginButton();
        Thread.sleep(10000);
    }
    @Test(priority = 3)
    public void profile_icon() throws Exception {
        //TC 11.3 Profile Icon
        EditProfileObj.ProfileButton();
        Thread.sleep(2000);
    }
        @Test(priority = 4)
        public void night_mode_day_mode() throws Exception {
            //TC 11.4 Night Mode , Day Mode
            EditProfileObj.NightModeButton();
            Thread.sleep(2000);
            EditProfileObj.DayModeButton();
            Thread.sleep(2000);
        }
        @Test(priority = 5)
            public void edit_profile() throws Exception {
        //TC 11.5 Edit Profile.
        EditProfileObj.EditProfileButton();
        Thread.sleep(3000);
    }
    @Test(priority = 6)
    public void edit_profile_cancel() throws Exception {
            //TC 11.6 Edit Profile Cancel.
            EditProfileObj.CancelButton();
            Thread.sleep(2000);
        }
    }