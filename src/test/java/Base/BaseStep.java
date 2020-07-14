package Base;

import okhttp3.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.net.MalformedURLException;


public class BaseStep  {
    public WebDriver driver;
    public JavascriptExecutor jse = (JavascriptExecutor) driver;


    public void openBrowser(String browserName) throws MalformedURLException {

        String browser = System.getProperty("BROWSER");



        switch (browserName) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "ie":
                driver = new InternetExplorerDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
//            Current releases of Opera are built on top of the Chromium engine, and WebDriver is now supported via the closed-source Opera Chromium Driver,
//            which can be added to your PATH or as a system property.
            case "opera":
                driver = new OperaDriver();
                break;
            case "safari":
                driver = new SafariDriver();
//                Run the following command from the terminal for the first time and type your password at the prompt to authorise WebDriver
//                /usr/bin/safaridriver -p 1337</
                break;
        }
        System.out.println("Opening Browser=>" + browserName);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    public enum Pather {

        id,

        className,

        name,

        xPath,

        cssSelector,

        linkText
    }

    public enum TimeOut {

        LOW(5),

        MIDDLE(10),

        HIGH(15),

        CUSTOM_MAX(60);

        private final int value;

        public int getValue() {

            return value;

        }
        // enum constructor - cannot be public or protected

        private TimeOut(int value) {

            this.value = value;

        }
    }

    public void geturl(String name) throws Exception {
        driver.get(name);
    }

    public void waitElement(WebElement element, TimeOut timeOut)  {

        try {

            WebDriverWait wait = new WebDriverWait(driver, timeOut.value);

            wait.until(ExpectedConditions.invisibilityOf(element));

        } catch (Exception ex) {

        }

    }

    public void findElementClick(String path, Pather type) {

        try {

            WebDriverWait wait = new WebDriverWait(driver, TimeOut.MIDDLE.value);

            switch (type) {

                case className:

                   wait.until(ExpectedConditions.elementToBeClickable(By.id(path))).click();
                    break;

                case id:

                    wait.until(ExpectedConditions.elementToBeClickable(By.id(path))).click();

                    break;

                case name:

                    wait.until(ExpectedConditions.elementToBeClickable(By.name(path))).click();

                    break;

                case xPath:

                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(path))).click();

                    break;

                case cssSelector:

                    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(path))).click();

                    break;

                case linkText:

                    wait.until(ExpectedConditions.elementToBeClickable(By.linkText(path))).click();

                    break;

                default:

                    throw  new NotFoundException();

            }

        } catch (Exception ex) {
        }

    }

    public void findElementSendKeys(String path, Pather type, String text) {

        try {

            WebDriverWait wait = new WebDriverWait(driver, TimeOut.MIDDLE.value);

            switch (type) {

                case className:

                    wait.until(ExpectedConditions.elementToBeClickable(By.className(path))).sendKeys(text);

                    break;

                case id:

                    wait.until(ExpectedConditions.elementToBeClickable(By.id(path))).sendKeys(text);

                    break;

                case name:

                    wait.until(ExpectedConditions.elementToBeClickable(By.name(path))).sendKeys(text);

                    break;

                case xPath:

                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(path))).sendKeys(text);

                    break;

                case cssSelector:

                    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(path))).sendKeys(text);

                    break;

                case linkText:

                    wait.until(ExpectedConditions.elementToBeClickable(By.linkText(path))).sendKeys(text);

                    break;

                default:

                    new NotFoundException();

            }

        } catch (Exception ex) {

        }

    }

    public WebElement findElement(String path, Pather type, TimeOut timeOut) {


        try {

            WebDriverWait wait = new WebDriverWait(driver, timeOut.value);

            WebElement element = null;

            switch (type) {

                case className:

                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.className(path)));

                    break;

                case id:

                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(path)));

                    break;

                case name:

                    element = (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.name(path)));

                    break;

                case xPath:

                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));

                    break;

                case cssSelector:

                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(path)));

                    break;

                case linkText:

                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(path)));

                    break;

                default:

                    new NotFoundException();

            }

            return element;

        } catch (Exception ex) {
            return null;

        }

    }


    public void PageScrolldown() {

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("window.scrollBy(0,300)", "");
    }

    public void PageScrollup() {

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("window.scrollBy(0,-300)", "");

    }

    public void DriverQuit() {

        driver.quit();
    }
    public void findElementClear(String path, Pather type) {

        try {

            WebDriverWait wait = new WebDriverWait(driver, TimeOut.MIDDLE.value);

            switch (type) {

                case className:

                    wait.until(ExpectedConditions.elementToBeClickable(By.id(path))).clear();
                    break;

                case id:

                    wait.until(ExpectedConditions.elementToBeClickable(By.id(path))).clear();

                    break;

                case name:

                    wait.until(ExpectedConditions.elementToBeClickable(By.name(path))).clear();

                    break;

                case xPath:

                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(path))).clear();

                    break;

                case cssSelector:

                    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(path))).clear();

                    break;

                case linkText:

                    wait.until(ExpectedConditions.elementToBeClickable(By.linkText(path))).clear();

                    break;

                default:

                    throw  new NotFoundException();

            }

        } catch (Exception ex) {
        }

    }


    public void DriverClose() {
        driver.close();
    }


    public void RestAPI(String link, String method, String jsonBody, Integer reponseValue) throws Throwable {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        switch (method) {
            case "GET":
                Request request = new Request.Builder()
                        .url(link)
                        .method(method, null)
                        .addHeader("Content-Type", "application/json")
                        .build();
                Response response = client.newCall(request).execute();
                Integer responseCode = response.code();
                String bodyValue = response.body().string();
                Assert.assertEquals(responseCode, reponseValue);
                System.out.println(bodyValue);
                System.out.println(responseCode);
                break;
            case "POST":
                MediaType mediaType = MediaType.parse("application/json");
                RequestBody body = RequestBody.create(mediaType, jsonBody);
                Request requestPost = new Request.Builder()
                        .url(link)
                        .method(method, body)
                        .addHeader("Content-Type", "application/json")
                        .build();
                Response responsePost = client.newCall(requestPost).execute();
                String bodyValuePost = responsePost.body().string();
                Integer responseCodePost = responsePost.code();
                Assert.assertEquals(responseCodePost, reponseValue);
                System.out.println(bodyValuePost);
                System.out.println(responsePost);
                break;
            case "PUT":
                MediaType mediaTypePut = MediaType.parse("application/json");
                RequestBody bodyPut = RequestBody.create(mediaTypePut, jsonBody);
                Request requestPut = new Request.Builder()
                        .url(link)
                        .method(method, bodyPut)
                        .addHeader("Content-Type", "application/json")
                        .build();
                Response responsePut = client.newCall(requestPut).execute();
                String bodyValuePut = responsePut.body().string();
                Integer responseCodePut = responsePut.code();
                Assert.assertEquals(responseCodePut, reponseValue);
                System.out.println(bodyValuePut);
                System.out.println(responsePut);
                break;
        }
    }
}