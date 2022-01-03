package Tests;

import Base.BasePage;
import Pages.EditProfilePage;
import Pages.LoginPage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.io.IOException;

public class EditProfileTest extends BasePage {

    @Test
    public void EditProfileFlow() throws InterruptedException, IOException {
        try {

            String projectPath = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", projectPath + ".\\Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            EditProfilePage EditProfileObj = new EditProfilePage(driver);
            test.log(LogStatus.INFO, "TestInformation");
            test.log(LogStatus.PASS, "TestPassed");
            LoginPage loginPageObjects = new LoginPage(driver);
            driver.get(ReadProps.readAttr("URL"));
            driver.manage().window().maximize();
            Thread.sleep(1000);
            //TC 10.1 Visible Password On.
            loginPageObjects.setUsername(ReadProps.readAttr("UserID"));
            Thread.sleep(1000);
            loginPageObjects.setPassword(ReadProps.readAttr("Password"));
            Thread.sleep(1000);
            EditProfileObj.clickVisible();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//EditProfileTest//PasswordVisible.jpg");
            Thread.sleep(1000);

            //TC 10.2 Visible Password Off.
            EditProfileObj.clickVisible();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//EditProfileTest//PasswordInvisible.jpg");
            Thread.sleep(1000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(8000);

            //TC 10.3 Profile Icon
            EditProfileObj.ProfileButton();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//EditProfileTest//Profile.jpg");
            Thread.sleep(2000);

            //TC 10.4 Night Mode , Day Mode
            EditProfileObj.NightModeButton();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//EditProfileTest//NightMode.jpg");
            Thread.sleep(2000);
            EditProfileObj.DayModeButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//EditProfileTest//DayMode.jpg");

            //TC 10.5 Edit Profile.
            EditProfileObj.EditProfileButton();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//EditProfileTest//EditProfileWindow.jpg");
            Thread.sleep(2000);

            //TC 10.6 Edit Profile Cancel.
            EditProfileObj.CancelButton();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//EditProfileTest//Cancel.jpg");
            Thread.sleep(4000);
            driver.close();
        }
        catch (Exception e) {
            test.log(LogStatus.FAIL, e);
        }

    }
}