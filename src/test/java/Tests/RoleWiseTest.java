package Tests;
import Base.BasePage;
import Pages.RoleAccess;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.*;
import java.io.IOException;
@Listeners(Utilities.TestListeners.class)

public class RoleWiseTest extends BasePage {
    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
    }
    @AfterClass
    public void cleanUp() throws Exception {
        driver.quit();
    }
    @Test
    public void RoleWiseFlow() throws InterruptedException, IOException {
            RoleAccess roleAccessObj = new RoleAccess(driver);
            driver.get(ReadProps.readAttr("URL"));
            Thread.sleep(8000);
            driver.manage().window().maximize();
            Thread.sleep(2000);
            //TC 19.1 Admin Role Login with valid Username and Valid password
            roleAccessObj.setUsername(ReadProps.readAttr("AdminUser"));
            Thread.sleep(2000);
            roleAccessObj.setPassword(ReadProps.readAttr("AdminPwd"));
            Thread.sleep(2000);
            roleAccessObj.clickLoginButton();
            Thread.sleep(8000);

            //TC 19.2 Admin Role Access User tab.
            roleAccessObj.clickAdminUser();
            Thread.sleep(5000);

            //TC 19.3 Admin Role Access Role tab.
            roleAccessObj.clickAdminRole();
            Thread.sleep(5000);

            //TC 19.4 Admin Role Access Template tab.
            roleAccessObj.clickAdminTemplate();
            Thread.sleep(5000);

            //TC 19.5 Admin Role Access Project tab.
            roleAccessObj.clickAdminProject();
            Thread.sleep(5000);

            //TC 19.6 Admin Role Access Analytics tab.
            roleAccessObj.clickAdminAnalytic();
            Thread.sleep(5000);

            //TC 19.7 Admin Role Access Analytics tab.
            roleAccessObj.ClickLogout();
            Thread.sleep(4000);
            driver.navigate().refresh();
            Thread.sleep(3000);

            //TC 19.8 Supervisor ROle Valid User Valid PWD.
            roleAccessObj.setUsername(ReadProps.readAttr("SupervisorUser"));
            Thread.sleep(2000);
            roleAccessObj.setPassword(ReadProps.readAttr("SupervisorPwd"));
            Thread.sleep(2000);
            roleAccessObj.clickLoginButton();
            Thread.sleep(5000);
            Thread.sleep(2000);

            //TC 19.9 Supervisor ROle Access Template.
            roleAccessObj.clickSupervisorTemplate();
            Thread.sleep(7000);

            //TC 19.10 Supervisor ROle Access Document.
            roleAccessObj.clickSupervisorDocument();
            Thread.sleep(8000);

            //TC 19.11 Supervisor ROle Access Analytics
            roleAccessObj.ClickLogout();
            Thread.sleep(4000);
            driver.navigate().refresh();
            Thread.sleep(5000);

            //TC 19.12 Operator ROle Login with Valid ID and PWD.
            roleAccessObj.setUsername(ReadProps.readAttr("OperatorUser"));
            Thread.sleep(2000);
            roleAccessObj.setPassword(ReadProps.readAttr("OperatorPwd"));
            Thread.sleep(2000);
            roleAccessObj.clickLoginButton();
            Thread.sleep(4000);

            //TC 19.13 Operator Role Access Document.
            roleAccessObj.clickOperatorDocument();
            Thread.sleep(4000);
            //TC 19.14 Operator Role Access Analytics.
            roleAccessObj.ClickLogout();
            Thread.sleep(4000);
            Thread.sleep(4000);


        }

    }