package tests.browser;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utils.PropertyLoader;

import java.util.concurrent.TimeUnit;

public class BrowserFixture {

    private static final Logger log = Logger.getLogger(BrowserFixture.class);
    /* Browsers constants */
    private static final String CHROME = "chrome";
    private static final String FIREFOX = "firefox";
    private static final String INTERNET_EXPLORER = "ie";
    private static final String PHANTOMJS = "phantomjs";
    /**/
    private static final String BROWSER_NAME = PropertyLoader.loadProperty("browser.name");
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeSuite
    public void startBrowser() {

        if (BROWSER_NAME.equals(FIREFOX)) {

            driver = new FirefoxDriver();

        } else if (BROWSER_NAME.equals(CHROME)) {

            driver = new ChromeDriver();

        } else if (BROWSER_NAME.equals(PHANTOMJS)) {

            driver = new PhantomJSDriver();

        } else {

            Assert.fail(String.format("invalid driver name"));

        }

        log.info(String.format("browser %s open successful",
                driver.getClass().getSimpleName()));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterSuite
    public void quitBrowser() {

        if (driver != null) {
            driver.quit();
            log.info(String.format("browser close successful"));
        }

        log.info(String.format("tests suite execution completed"));

    }

}
