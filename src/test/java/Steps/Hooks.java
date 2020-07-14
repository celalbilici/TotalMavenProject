package Steps;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hooks {
    ExtentHtmlReporter htmlReporter=null;
    ExtentReports extent =null;
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
        String browser = System.getProperty("BROWSER");
        driver = new ChromeDriver();
    }

    @Test
    public void test1() throws Exception {
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
        driver.get("https://www.google.com");
        String sayfaIsmi=driver.getTitle();
        Assert.assertEquals(sayfaIsmi, "Google");
        test.log(Status.PASS, "pass oldu oleyyyyyy");
        test.pass("google a giris yapildi");
        test.log(Status.INFO, "This step shows usage of log(status, details)");
        test.info("This step shows usage of info(details)");
        test.info("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        test.addScreenCaptureFromPath("screenshot.png");
    }

    @AfterTest
    public void tearDown(){

// or:
       // test.pass("pass geçti pisti");

        //test.log(Status.FAIL, "fail oldu test");
// or:
        //test.fail("fail");
        extent.flush();
        driver.quit();
    }


}
