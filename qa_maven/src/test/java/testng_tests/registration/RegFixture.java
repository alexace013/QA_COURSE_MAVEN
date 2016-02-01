package testng_tests.registration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.RegistrationPage;


public class RegFixture extends RegBrowserFixture {

    protected static RegistrationPage registrationPage;
    protected static HomePage homePage;

    @BeforeMethod
    public void regOnPage() {

        driver.get(URL);
        log.info(String.format("\nstart test.\n"));

        homePage = new HomePage(driver);
        registrationPage = new RegistrationPage(driver);

    }

    @AfterMethod
    public void regOffPage() {
        registrationPage.clickLogOut();
        homePage.clickLogIn();
    }


}
