package ExtendReportss;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExtendReportsWithTestNg {
    ExtentHtmlReporter htmlReporter;
    ExtentReports extent;
    WebDriver driver;


    @BeforeSuite
    public void setUp() {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
         extent= new ExtentReports();
        extent.attachReporter(htmlReporter);
    }

    @BeforeTest
    public void setUpTest(){
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",projectPath+"/driver");
        driver = new ChromeDriver();
    }

    @Test
    public void test1() throws Exception {
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
        driver.get("https://www.google.com");
        test.pass("google a giris yapildi");
        test.log(Status.INFO, "This step shows usage of log(status, details)");
        test.info("This step shows usage of info(details)");
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        test.addScreenCaptureFromPath("screenshot.png");
    }

    @AfterTest
    public void tearDown(){
        extent.flush();
        driver.quit();
    }


}
