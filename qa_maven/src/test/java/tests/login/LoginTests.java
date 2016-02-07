package tests.login;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends LoginFixture {

    private static final Logger log = Logger.getLogger(LoginTests.class);
    private final static String EMAIL = "alex_ace@ukr.net";
    private final static String PASS = "a1989";

    // all input correct
    @Test
    public void test1_positiveLogin() {

        log.info(String.format("test1_positiveLogin"));
        getHomePage().closeBlurb();
        log.info(String.format("close blurb"));
        getHomePage().switchToRegistrationPage();
        log.info(String.format("switch to registration page"));
        getLoginPage().clickAndInputLoginField(EMAIL);
        log.info(String.format("click and input %s in login filed", EMAIL));
        getLoginPage().clickAndInputPassFieldWithTwoLocators(PASS);
        log.info(String.format("click and input %s in password field", PASS));
        getLoginPage().clickLoginButton();
        log.info(String.format("click on login button"));
        getHomePage().clickLogoutLink();
        log.info(String.format("click on logout link"));

    }

    // input incorrect email and correct password
    @Test
    public void test2_incorrectLogin() {

        log.info(String.format("test2_incorrectLogin"));
        getHomePage().clickLoginLink();
        log.info(String.format("click login link"));
        String failedEMAIL = "qwerty" + EMAIL;
        getLoginPage().clickAndInputLoginFieldAndClickTAB(failedEMAIL);
        log.info(String.format("click and input %s in login field and click TAB", failedEMAIL));
        getLoginPage().clickAndInputPassFieldWithOneLocator(PASS);
        log.info(String.format("click and input %s in password filed", PASS));
        getLoginPage().clickLoginButton();
        log.info(String.format("click on login button"));
        Assert.assertTrue(getLoginPage().isErrorMessagePresentOnPage(),
                "error message is present on page");

    }

    // input correct email and incorrect password
    @Test
    public void test3_incorrectPassField() {

        log.info(String.format("test3_incorrectPassField"));
        getLoginPage().clickAndInputLoginFieldAndClickTAB(EMAIL);
        log.info(String.format("click and input %s in login field and click TAB",
                EMAIL));
        String failedPass = PASS.substring(0, 3);
        getLoginPage().clickAndInputPassFieldWithOneLocator(failedPass);
        log.info(String.format("click and input %s in password field", failedPass));
        getLoginPage().clickLoginButton();
        log.info(String.format("click on login button"));
        Assert.assertTrue(getLoginPage().isErrorMessagePresentOnPage(),
                "error message is present on page");

    }

    // input empty email and password
    @Test
    public void test4_emptyEmailAndPassFields() {

        log.info(String.format("test4_emptyEmailAndPassFields"));
        getLoginPage().clickAndInputLoginFieldAndClickTAB("");
        log.info(String.format("click and input empty in login field and click TAB"));
        getLoginPage().clickAndInputPassFieldWithOneLocator("");
        log.info(String.format("click and input empty in password field"));
        getLoginPage().clickLoginButton();
        log.info(String.format("click on login button"));
        Assert.assertTrue(getLoginPage().isErrorMessageFieldsEmpty(),
                "error message is present on page");

    }

    // input empty email and correct password
    @Test
    public void test5_emptyEmailField() {

        log.info(String.format("test5_emptyEmailField"));
        getLoginPage().clickAndInputLoginFieldAndClickTAB("");
        log.info(String.format("click and input empty in login field and click TAB"));
        getLoginPage().clickAndInputPassFieldWithOneLocator(PASS);
        log.info(String.format("click and input %s in password field", PASS));
        getLoginPage().clickLoginButton();
        log.info(String.format("click on login button"));
        Assert.assertTrue(getLoginPage().isErrorMessageOneFieldEmpty(),
                "error message is present on page");

    }

    // input correct email and empty password
    @Test
    public void test6_emptyPassField() {

        log.info(String.format("test6_emptyPassField"));
        getLoginPage().clickAndInputLoginFieldAndClickTAB(EMAIL);
        log.info(String.format("click and input %s in login field and click TAB", EMAIL));
        getLoginPage().clickAndInputPassFieldWithOneLocator("");
        log.info(String.format("click and input empty in password field and click TAB"));
        getLoginPage().clickLoginButton();
        log.info(String.format("click on login button"));
        Assert.assertTrue(getLoginPage().isErrorMessageOneFieldEmpty(),
                "error message is present on page");

    }

}
