package testng_tests.registration;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import random.RandomUser;

import java.util.concurrent.TimeUnit;

public class RegBrowserFixture {

    protected final static Logger log = Logger.getLogger(RegBrowserFixture.class);
    protected final static String URL = "http://www.ellos.se/";
    protected final static String PASS = "12345";
    protected final static String EMAIL = RandomUser.randomEmail();
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
