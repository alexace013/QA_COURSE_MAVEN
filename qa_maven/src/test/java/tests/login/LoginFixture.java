package tests.login;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import pages.LoginPage;
import tests.browser.BrowserFixture;

public class LoginFixture extends BrowserFixture {

    private static final Logger log = Logger.getLogger(LoginFixture.class);
    private final static String URL = "http://www.ellos.se/";
    private HomePage homePage;
    private LoginPage loginPage;

    @BeforeClass
    public void setUp() {

        getDriver().get(URL);
        log.info(String.format("browser open page: %s", URL));
        homePage = new HomePage(getDriver());
        loginPage = new LoginPage(getDriver());
        log.info(String.format("start login tests"));

    }

    @AfterClass
    public void tearDown() {
        log.info(String.format("end login tests"));
    }

    public HomePage getHomePage() {
        return homePage;
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }

}
