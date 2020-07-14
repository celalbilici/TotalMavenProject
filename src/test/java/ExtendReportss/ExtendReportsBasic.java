package ExtendReportss;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;

public class ExtendReportsBasic {
    private static WebDriver driver = null;

        public static void main(String[] args) throws Exception {
            // start reporters
            ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");

            // create ExtentReports and attach reporter(s)
            ExtentReports extent = new ExtentReports();
            extent.attachReporter(htmlReporter);

            // creates a toggle for the given test, adds all log events under it
            ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
            String projectPath =System.getProperty("user.dir");

            // log(Status, details)
            test.log(Status.INFO, "This step shows usage of log(status, details)");

            // info(details)
            test.info("This step shows usage of info(details)");

            test.log(Status.PASS, "pass");
// or:
            test.pass("pass");

            test.log(Status.FAIL, "fail");
// or:
            test.fail("fail");



            // calling flush writes everything to the log file
            extent.flush();
        }

}
