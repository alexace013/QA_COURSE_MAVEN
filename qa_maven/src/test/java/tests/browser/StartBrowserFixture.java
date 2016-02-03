package tests.browser;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class StartBrowserFixture {

    private static final Logger log = Logger.getLogger(StartBrowserFixture.class);
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeSuite
    public void startBrowser() {

        driver = new FirefoxDriver();
        log.info(String.format("browser %s open successful",
                driver.getClass().getSimpleName().substring(0, 7)));
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
