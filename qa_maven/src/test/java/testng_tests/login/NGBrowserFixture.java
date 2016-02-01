package testng_tests.login;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Test
public class NGBrowserFixture {

    protected final static Logger log = Logger.getLogger(NGBrowserFixture.class);
    protected final static String URL = "http://www.ellos.se/";
    protected final static String EMAIL = "alex_ace@ukr.net";
    protected final static String PASS = "a1989";
    protected static WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        log.info(String.format("BROWSER: [\"%s\"] open successful.", driver.getClass().getSimpleName()));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }

    }

}
