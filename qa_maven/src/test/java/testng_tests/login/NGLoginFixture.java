package testng_tests.login;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

@Test
public class NGLoginFixture extends NGBrowserFixture {

    protected static HomePage homePage;
    protected static LoginPage loginPage;

    @BeforeClass
    public void login() {

        driver.get(URL);
        log.info(String.format("\nstart test.\n"));

        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);

    }

    @AfterClass
    public void logout() {
        log.info(String.format("end test."));
    }

}
