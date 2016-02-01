package testng_tests.login;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class NGTestsSelenium extends NGLoginFixture {

    // all input correct
    @Test
    public void test0() {

        log.info(String.format("\ntest0 (positive)\n"));
        homePage.closeBlurb();
        log.info("close blurb.");
//        homePage.clickLogo();
//        log.info("click logo.");
        homePage.switchToRegistrationPage();
        log.info("switch to registration page.");
        loginPage.clickAndInputLoginField(EMAIL);
        log.info("input " + EMAIL + " in login field.");
        loginPage.clickAndInputPassFieldAll(PASS);
        log.info("input " + PASS + " in password field.");
        loginPage.clickButtonLogIn();
        log.info("click login button.");
        homePage.clickLogOut();
        log.info("click log Out.");


    }

    // input incorrect email and correct password
    @Test
    public void test1() {

//        homePage.clickLogo();
        homePage.clickLogIn();
        log.info(String.format("\ntest1 (negative)\n"));
//        homePage.switchToRegistrationPage();
//        log.info("switch to registration page.");
        String failedEMAIL = EMAIL + ".";
        loginPage.clickAndInputLoginFieldAndClickTAB(failedEMAIL);
        log.info("input " + failedEMAIL + " in login field and click TAB.");
        loginPage.clickAndInputPassFieldOne(PASS);
        log.info("input " + PASS + " in password field.");
        loginPage.clickButtonLogIn();
        log.info("click login button");

        if (loginPage.isErrorMessageNotEmptyFields()) {
            log.info("not logged in.");
        } else {
            Assert.assertFalse(loginPage.isErrorMessageNotEmptyFields(), "ERROR is not present");
        }

    }

    // input correct email and incorrect password
    @Test
    public void test2() {

        if (loginPage.isHelpBoxPresent()) {
            loginPage.closeHelpBox();

            log.info(String.format("\ntest2 (negative)\n"));

            loginPage.clickAndInputLoginFieldAndClickTAB(EMAIL);
            log.info("input " + EMAIL + " in login field and click TAB.");
            String failedPASS = PASS.substring(0, 3);
            loginPage.clickAndInputPassFieldOne(failedPASS);
            log.info("input " + failedPASS + " in password field.");
            loginPage.clickButtonLogIn();

            if (loginPage.isErrorMessageNotEmptyFields()) {
                log.info("not logged in.");
            } else {
                Assert.assertFalse(loginPage.isErrorMessageNotEmptyFields(), "ERROR is not present");
            }

        } else {

            log.info(String.format("\ntest2 (negative)\n"));

            loginPage.clickAndInputLoginFieldAndClickTAB(EMAIL);
            log.info("input " + EMAIL + " in login field and click TAB.");
            String failedPASS = PASS.substring(0, 3);
            loginPage.clickAndInputPassFieldOne(failedPASS);
            log.info("input " + failedPASS + " in password field.");
            loginPage.clickButtonLogIn();

            if (loginPage.isErrorMessageNotEmptyFields()) {
                log.info("not logged in.");
            } else {
                Assert.assertFalse(loginPage.isErrorMessageNotEmptyFields(), "ERROR is not present");
            }
        }

    }

    // input empty email and password
    @Test
    public void test3() {

        if (loginPage.isHelpBoxPresent()) {
            loginPage.closeHelpBox();
        }

        log.info(String.format("\ntest3 (negative)\n"));

        loginPage.clickAndInputLoginFieldAndClickTAB("");
        log.info("input empty in login field and click TAB.");
        loginPage.clickAndInputPassFieldOne("");
        log.info("input empty in password field.");
        loginPage.clickButtonLogIn();

        if (loginPage.isErrorMessageEmptyFields()) {
            log.info("not logged in.");
        } else {
            Assert.assertFalse(loginPage.isErrorMessageNotEmptyFields(), "ERROR is not present");
        }

    }

    // input empty email and correct password
    @Test
    public void test4() {

        if (loginPage.isHelpBoxPresent()) {
            loginPage.closeHelpBox();
        }

        log.info(String.format("\ntest4 (negative)\n"));

        loginPage.clickAndInputLoginFieldAndClickTAB("");
        log.info("input empty in login field and click TAB.");
        loginPage.clickAndInputPassFieldOne(PASS);
        log.info("input " + PASS + " in password field.");

        if (loginPage.isErrorMessageOneFieldEmpty()) {
            log.info("not logged in.");
        } else {
            Assert.assertFalse(loginPage.isErrorMessageNotEmptyFields(), "ERROR is not present");
        }

    }

    // input correct email and empty password
    @Test
    public void test5() {

        if (loginPage.isHelpBoxPresent()) {
            loginPage.closeHelpBox();
        }

        log.info(String.format("\ntest5 (negative)\n"));

        loginPage.clickAndInputLoginFieldAndClickTAB(EMAIL);
        log.info("input " + EMAIL + " in login field.");
        loginPage.clickAndInputPassFieldOne("");
        log.info("input empty in password field.");

        if (loginPage.isErrorMessageOneFieldEmpty()) {
            log.info("not logged in.");
        } else {
            Assert.assertFalse(loginPage.isErrorMessageNotEmptyFields(), "ERROR is not present");
        }

    }

}
