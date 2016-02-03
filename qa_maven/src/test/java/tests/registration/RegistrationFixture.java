package tests.registration;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import pages.RegistrationPage;
import tests.browser.StartBrowserFixture;

public class RegistrationFixture extends StartBrowserFixture {

    private static final Logger log = Logger.getLogger(RegistrationFixture.class);
    private final static String URL = "http://www.ellos.se/";
    private HomePage homePage;
    private RegistrationPage registrationPage;

    @BeforeClass
    public void setUp() {

        getDriver().get(URL);
        log.info(String.format("browser open page: %s", URL));
        homePage = new HomePage(getDriver());
        registrationPage = new RegistrationPage(getDriver());
        log.info(String.format("start registration tests"));

    }

    @AfterClass
    public void tearDown() {
        log.info(String.format("end registration tests"));
    }

    public HomePage getHomePage() {
        return homePage;
    }

    public RegistrationPage getRegistrationPage() {
        return registrationPage;
    }

}
