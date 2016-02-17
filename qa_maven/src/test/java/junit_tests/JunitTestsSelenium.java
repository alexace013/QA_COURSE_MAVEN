//package junit_tests;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//public class JunitTestsSelenium extends JunitLoginFixture {
//
//    // all input correct
//    @Test
//    public void test0() {
//
//        log.info(String.format("\ntest0 (positive)\n"));
//        homePage.closeBlurb();
//        log.info("close blurb.");
////        homePage.clickLogo();
////        log.info("click logo.");
//        homePage.switchToRegistrationPage();
//        log.info("switch to registration page.");
//        loginPage.clickAndInputLoginField(EMAIL);
//        log.info("input " + EMAIL + " in login field.");
//        loginPage.clickAndInputPassFieldWithTwoLocators(PASS);
//        log.info("input " + PASS + " in password field.");
//        loginPage.clickLoginButton();
//        log.info("click login button.");
//        homePage.clickLogoutLink();
//        log.info("click log Out.");
//
//
//    }
//
//    // input incorrect email and correct password
//    @Test
//    public void test1() {
//
////        homePage.clickLogo();
//        homePage.clickLoginLink();
//        log.info(String.format("\ntest1 (negative)\n"));
////        homePage.switchToRegistrationPage();
////        log.info("switch to registration page.");
//        String failedEMAIL = EMAIL + ".";
//        loginPage.clickAndInputLoginFieldAndClickTAB(failedEMAIL);
//        log.info("input " + failedEMAIL + " in login field and click TAB.");
//        loginPage.clickAndInputPassFieldWithOneLocator(PASS);
//        log.info("input " + PASS + " in password field.");
//        loginPage.clickLoginButton();
//        log.info("click login button");
//
//        if (loginPage.isErrorMessagePresentOnPage()) {
//            log.info("not logged in.");
//        } else {
//            Assert.assertFalse("ERROR is not present", loginPage.isErrorMessagePresentOnPage());
//        }
//
//    }
//
//    // input correct email and incorrect password
//    @Test
//    public void test2() {
//
//        if (loginPage.isHelpBoxPresent()) {
//            loginPage.closeHelpBox();
//
//            log.info(String.format("\ntest2 (negative)\n"));
//
//            loginPage.clickAndInputLoginFieldAndClickTAB(EMAIL);
//            log.info("input " + EMAIL + " in login field and click TAB.");
//            String failedPASS = PASS.substring(0, 3);
//            loginPage.clickAndInputPassFieldWithOneLocator(failedPASS);
//            log.info("input " + failedPASS + " in password field.");
//            loginPage.clickLoginButton();
//
//            if (loginPage.isErrorMessagePresentOnPage()) {
//                log.info("not logged in.");
//            } else {
//                Assert.assertFalse("ERROR is not present", loginPage.isErrorMessagePresentOnPage());
//            }
//
//        } else {
//
//            log.info(String.format("\ntest2 (negative)\n"));
//
//            loginPage.clickAndInputLoginFieldAndClickTAB(EMAIL);
//            log.info("input " + EMAIL + " in login field and click TAB.");
//            String failedPASS = PASS.substring(0, 3);
//            loginPage.clickAndInputPassFieldWithOneLocator(failedPASS);
//            log.info("input " + failedPASS + " in password field.");
//            loginPage.clickLoginButton();
//
//            if (loginPage.isErrorMessagePresentOnPage()) {
//                log.info("not logged in.");
//            } else {
//                Assert.assertFalse("ERROR is not present", loginPage.isErrorMessagePresentOnPage());
//            }
//        }
//
//    }
//
//    // input empty email and password
//    @Test
//    public void test3() {
//
//        if (loginPage.isHelpBoxPresent()) {
//            loginPage.closeHelpBox();
//        }
//
//        log.info(String.format("\ntest3 (negative)\n"));
//
//        loginPage.clickAndInputLoginFieldAndClickTAB("");
//        log.info("input empty in login field and click TAB.");
//        loginPage.clickAndInputPassFieldWithOneLocator("");
//        log.info("input empty in password field.");
//        loginPage.clickLoginButton();
//
//        if (loginPage.isErrorMessageOneFieldEmpty()) {
//            log.info("not logged in.");
//        } else {
//            Assert.assertFalse("ERROR is not present", loginPage.isErrorMessageOneFieldEmpty());
//        }
//
//    }
//
//    // input empty email and correct password
//    @Test
//    public void test4() {
//
//        if (loginPage.isHelpBoxPresent()) {
//            loginPage.closeHelpBox();
//        }
//
//        log.info(String.format("\ntest4 (negative)\n"));
//
//        loginPage.clickAndInputLoginFieldAndClickTAB("");
//        log.info("input empty in login field and click TAB.");
//        loginPage.clickAndInputPassFieldWithOneLocator(PASS);
//        log.info("input " + PASS + " in password field.");
//
//        if (loginPage.isErrorMessageOneFieldEmpty()) {
//            log.info("not logged in.");
//        } else {
//            Assert.assertFalse("ERROR is not present", loginPage.isErrorMessageOneFieldEmpty());
//        }
//
//    }
//
//    // input correct email and empty password
//    @Test
//    public void test5() {
//
//        if (loginPage.isHelpBoxPresent()) {
//            loginPage.closeHelpBox();
//        }
//
//        log.info(String.format("\ntest5 (negative)\n"));
//
//        loginPage.clickAndInputLoginFieldAndClickTAB(EMAIL);
//        log.info("input " + EMAIL + " in login field.");
//        loginPage.clickAndInputPassFieldWithOneLocator("");
//        log.info("input empty in password field.");
//
//        if (loginPage.isErrorMessageOneFieldEmpty()) {
//            log.info("not logged in.");
//        } else {
//            Assert.assertFalse("ERROR is not present", loginPage.isErrorMessageOneFieldEmpty());
//        }
//
//    }
//
//}
