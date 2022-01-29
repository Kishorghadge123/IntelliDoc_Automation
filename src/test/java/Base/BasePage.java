package Base;
import Pages.LoginPage;
import Utilities.ReadProps;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    public static WebDriver driver;
    public static ExtentTest test;

    public static void LoginTest() throws Exception {
        LoginPage loginPageObjects = new LoginPage(driver);
        driver.get(ReadProps.readAttr("URL"));
        driver.manage().window().maximize();
        loginPageObjects.setUsername(ReadProps.readAttr("UserID"));
        loginPageObjects.setPassword(ReadProps.readAttr("Password"));
        loginPageObjects.clickLoginButton();
        Thread.sleep(8000);
    }
    public static void driverInit() throws Exception {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + ".\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }
}