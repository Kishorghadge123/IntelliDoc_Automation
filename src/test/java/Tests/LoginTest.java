package Tests;
import Base.BasePage;
import Pages.LoginPage;
import Utilities.ReadProps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import static org.testng.Assert.assertEquals;
@Listeners(Utilities.TestListeners.class)
public class LoginTest extends BasePage {
        static LoginPage loginPageObjects;

        @BeforeClass
        public void login() throws Exception {
                BasePage.driverInit();
        }

        @AfterClass
        public void cleanUp() throws Exception {
                driver.quit();
        }

        @Test(priority = 1)
        public static void verification_of_title_logo_and_login_with_blank_details() throws Exception {
                //Object creation
                loginPageObjects = new LoginPage(driver);
                driver.get(ReadProps.readAttr("URL"));
                Thread.sleep(2000);
                String actualTitle = driver.getTitle();
                String expectedTitle = "IntelliDoc";
                assertEquals(expectedTitle, actualTitle);
                System.out.println("Title Match");
                driver.manage().window().maximize();
                // Identify Logo
                WebElement i = driver.findElement(By.xpath("//img[contains(@class,'img-fluid login-logo')]"));
                Boolean p = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);
                //Verify logo Matched or not.
                if (p) {
                        System.out.println("Logo Matched!");
                } else {
                        System.out.println("Logo Unmatched!");
                }
                Thread.sleep(2000);
                //TC 14.1 - Login with Blank Username and Blank Password for Platform Admin.
                loginPageObjects.clickLoginButton();
                loginPageObjects.VerifyAssertError();
                Thread.sleep(2000);
        }

        @Test(priority = 2)
        public static void login_with_invalid_username_and_blank_password() throws Exception {
                //TC 14.2 - Login with Invalid Username and Blank Password for Platform Admin.
                loginPageObjects.setUsername(ReadProps.readAttr("InvalidUsername"));
                Thread.sleep(2000);
                loginPageObjects.clickLoginButton();
                loginPageObjects.VerifyAssertError();
        }

        @Test(priority = 3)
        public static void login_with_blank_username_and_valid_password() throws Exception {
                //TC 14.3 - Login with Blank Username and Valid Password for Platform Admin.
                loginPageObjects.ClearUserID();
                Thread.sleep(2000);
                loginPageObjects.setPassword(ReadProps.readAttr("Password"));
                Thread.sleep(1000);
                loginPageObjects.clickLoginButton();
                Thread.sleep(3000);
        }

        @Test(priority = 4)
        public static void login_with_blank_username_and_invalid_password() throws Exception {
                //TC 14.4 - Login with Blank Username and Invalid Password for Platform Admin.
                loginPageObjects.ClearPWD();
                Thread.sleep(2000);
                loginPageObjects.setPassword(ReadProps.readAttr("InvalidPassword"));
                Thread.sleep(1000);
                loginPageObjects.clickLoginButton();
                Thread.sleep(2000);
        }

        @Test(priority = 5)
        public static void login_with_valid_username_and_blank_password() throws Exception {
                //TC 14.5 - Login with Valid Username and Blank Password for Platform Admin.
                loginPageObjects.ClearPWD();
                Thread.sleep(2000);
                loginPageObjects.setUsername(ReadProps.readAttr("UserID"));
                Thread.sleep(1000);
                loginPageObjects.clickLoginButton();
                Thread.sleep(2000);
                driver.navigate().refresh();
                Thread.sleep(3000);
        }

        @Test(priority = 6)
        public static void login_with_invalid_username_and_password() throws Exception {
                //TC 14.6 - Login with Invalid Username and Password for Platform Admin.
                loginPageObjects.setUsername(ReadProps.readAttr("InvalidUsername"));
                Thread.sleep(1000);
                loginPageObjects.setPassword(ReadProps.readAttr("InvalidPassword"));
                Thread.sleep(1000);
                loginPageObjects.clickLoginButton();
                Thread.sleep(2000);
        }

        @Test(priority = 7)
        public static void login_with_invalid_username_and_valid_password() throws Exception {
                //TC 14.7 - Login with Invalid Username and Valid Password for Platform Admin.
                driver.navigate().refresh();
                Thread.sleep(3000);
                loginPageObjects.setUsername(ReadProps.readAttr("InvalidUsername"));
                Thread.sleep(1000);
                loginPageObjects.setPassword(ReadProps.readAttr("Password"));
                Thread.sleep(1000);
                loginPageObjects.clickLoginButton();
                Thread.sleep(2000);
        }

        @Test(priority = 8)
        public static void login_with_valid_username_and_invalid_password() throws Exception {
                //TC 14.8 - Login with Valid Username and Invalid Password for Platform Admin.
                driver.navigate().refresh();
                Thread.sleep(3000);
                loginPageObjects.setUsername(ReadProps.readAttr("UserID"));
                Thread.sleep(1000);
                loginPageObjects.setPassword(ReadProps.readAttr("InvalidPassword"));
                Thread.sleep(1000);
                loginPageObjects.clickLoginButton();
                Thread.sleep(2000);
        }

        @Test(priority = 9)
        public static void login_with_valid_username_and_password() throws Exception {
                //TC 14.9 Login with Valid Username and Password for Platform Admin.
                driver.navigate().refresh();
                Thread.sleep(3000);
                loginPageObjects.setUsername(ReadProps.readAttr("UserID"));
                Thread.sleep(1000);
                loginPageObjects.setPassword(ReadProps.readAttr("Password"));
                Thread.sleep(1000);
                loginPageObjects.clickLoginButton();
                Thread.sleep(12000);
                loginPageObjects.VerifyHomePage();
        }

        @Test(priority = 10)
        public static void navigate_backward() throws Exception {
                //TC 14.10 - Navigate Backward for Platform Admin.
                driver.navigate().back();
                loginPageObjects.VerifyAssertBack();
                Thread.sleep(2000);
        }

        @Test(priority = 11)
        public static void logout_for_platform_admin() throws Exception {
                //TC 14.11 - Logout for Platform Admin.
                loginPageObjects.ClickLogoutBtn();
                Thread.sleep(5000);
        }

        @Test(priority = 12)
        public static void login_with_invalid_username_password() throws Exception {
                //TC 14.2 - Admin Login with Invalid Username and Password.
                loginPageObjects.setUsername(ReadProps.readAttr("AdminInvalidUser"));
                Thread.sleep(1000);
                loginPageObjects.setPassword(ReadProps.readAttr("AdminInvalidPwd"));
                Thread.sleep(1000);
                loginPageObjects.clickLoginButton();
                Thread.sleep(2000);
        }

        @Test(priority = 13)
        public static void login_with_invalid_username_and_valid_password_for_admin() throws Exception {
                //TC 14.13 - Admin Login with Invalid Username and Valid Password.
                driver.navigate().refresh();
                Thread.sleep(3000);
                loginPageObjects.setUsername(ReadProps.readAttr("AdminInvalidUser"));
                Thread.sleep(1000);
                loginPageObjects.setPassword(ReadProps.readAttr("AdminPwd"));
                Thread.sleep(1000);
                loginPageObjects.clickLoginButton();
                Thread.sleep(2000);
        }

        @Test(priority = 14)
        public static void login_with_valid_username_and_invalid_password_admin() throws Exception {
                //TC 14.14 - Admin Login with Valid Username and Invalid Password.
                driver.navigate().refresh();
                Thread.sleep(3000);
                loginPageObjects.setUsername(ReadProps.readAttr("AdminUser"));
                Thread.sleep(1000);
                loginPageObjects.setPassword(ReadProps.readAttr("AdminInvalidPwd"));
                Thread.sleep(1000);
                loginPageObjects.clickLoginButton();
                Thread.sleep(2000);
        }

        @Test(priority = 15)
        public static void login_with_valid_username_and_password_admin() throws Exception {
                //TC 14.15 Admin Role Login with Valid Username and Password.
                driver.navigate().refresh();
                Thread.sleep(3000);
                loginPageObjects.setUsername(ReadProps.readAttr("AdminUser"));
                Thread.sleep(1000);
                loginPageObjects.setPassword(ReadProps.readAttr("AdminPwd"));
                Thread.sleep(1000);
                loginPageObjects.clickLoginButton();
                Thread.sleep(10000);
                loginPageObjects.ClickLogoutBtn();
                Thread.sleep(4000);
        }

        @Test(priority =16)
        public static void login_with_invalid_username_and_password_supervisor() throws Exception {
                //TC 14.16 Supervisor Role Login with InValid Username and Password.
                driver.navigate().refresh();
                Thread.sleep(3000);
                loginPageObjects.setUsername(ReadProps.readAttr("SupervisorInvalidUser"));
                Thread.sleep(1000);
                loginPageObjects.setPassword(ReadProps.readAttr("SupervisorInvalidPwd"));
                Thread.sleep(1000);
                loginPageObjects.clickLoginButton();
                Thread.sleep(2000);
        }

        @Test(priority = 17)
        public static void login_with_invalid_username_and_valid_password_supervisor() throws Exception {
                //TC 14.17 - Supervisor Role  Login with Invalid Username and Valid Password.
                driver.navigate().refresh();
                Thread.sleep(3000);
                loginPageObjects.setUsername(ReadProps.readAttr("SupervisorInvalidUser"));
                Thread.sleep(1000);
                loginPageObjects.setPassword(ReadProps.readAttr("SupervisorPwd"));
                Thread.sleep(1000);
                loginPageObjects.clickLoginButton();
                Thread.sleep(2000);
        }
        @Test(priority = 18)
        public static void login_with_valid_username_and_invalid_password_supervisor() throws Exception {
        //TC 14.18 - Supervisor Role  Login with Valid Username and Invalid Password.
            driver.navigate().refresh();
            Thread.sleep(3000);
            loginPageObjects.setUsername(ReadProps.readAttr("SupervisorUser"));
            Thread.sleep(1000);
            loginPageObjects.setPassword(ReadProps.readAttr("SupervisorInvalidPwd"));
            Thread.sleep(1000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(2000);
}
        @Test(priority = 19)
        public static void login_with_valid_username_and_password_supervisor() throws Exception {
                //TC 14.19 Supervisor Role Valid Username and Password.
                driver.navigate().refresh();
                Thread.sleep(3000);
                loginPageObjects.setUsername(ReadProps.readAttr("SupervisorUser"));
                Thread.sleep(1000);
                loginPageObjects.setPassword(ReadProps.readAttr("SupervisorPwd"));
                Thread.sleep(1000);
                loginPageObjects.clickLoginButton();
                Thread.sleep(10000);
                loginPageObjects.ClickLogoutBtn();
                Thread.sleep(2000);
        }
        @Test(priority = 20)
        public static void login_with_invalid_username_and_password_for_operator() throws Exception {
                //TC 14.20 - Operator Role  Login with Invalid Username and Password.
                driver.navigate().refresh();
                Thread.sleep(3000);
                loginPageObjects.setUsername(ReadProps.readAttr("OperatorInvalidUser"));
                Thread.sleep(1000);
                loginPageObjects.setPassword(ReadProps.readAttr("OperatorInvalidPwd"));
                Thread.sleep(1000);
                loginPageObjects.clickLoginButton();
                Thread.sleep(2000);
        }
        @Test(priority = 21)
        public static void login_with_invalid_username_and_valid_password_for_operator() throws Exception {
                //TC 14.21 - Operator Role  Login with Invalid Username and Valid Password.
                driver.navigate().refresh();
                Thread.sleep(3000);
                loginPageObjects.setUsername(ReadProps.readAttr("OperatorInvalidUser"));
                Thread.sleep(1000);
                loginPageObjects.setPassword(ReadProps.readAttr("OperatorPwd"));
                Thread.sleep(1000);
                loginPageObjects.clickLoginButton();
                Thread.sleep(2000);
        }
        @Test(priority = 22)
        public static void login_with_valid_username_and_invalid_password_for_operator() throws Exception {
                //TC 14.22 - Operator ROle  Login with Valid Username and Invalid Password.
                driver.navigate().refresh();
                Thread.sleep(3000);
                loginPageObjects.setUsername(ReadProps.readAttr("OperatorUser"));
                Thread.sleep(1000);
                loginPageObjects.setPassword(ReadProps.readAttr("OperatorInvalidPwd"));
                Thread.sleep(1000);
                loginPageObjects.clickLoginButton();
                Thread.sleep(2000);
        }
        @Test(priority = 23)
        public static void login_with_valid_username_and_password_for_operator() throws Exception {
            //TC 14.23 Operator Role Login with Valid Username and Password.
            driver.navigate().refresh();
            Thread.sleep(3000);
            loginPageObjects.setUsername(ReadProps.readAttr("OperatorUser"));
            Thread.sleep(1000);
            loginPageObjects.setPassword(ReadProps.readAttr("OperatorPwd"));
            Thread.sleep(1000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(10000);
            loginPageObjects.ClickLogoutBtn();
            Thread.sleep(5000);
        }
    }
