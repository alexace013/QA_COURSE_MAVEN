package tests.registration;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import random.RandomUser;

public class RegistrationTests extends RegistrationFixture {

    private static final Logger log = Logger.getLogger(RegistrationTests.class);
    private static final String PASS = "qwerty12345";
    private static final String EMAIL = RandomUser.randomEmail();

    // all fields are filled in correctly
    @Test(priority = 1)
    public void test1_positiveRegistration() {

        log.info(String.format("\ntest1_positiveRegistration\n"));

        {

            getHomePage().closeBlurb();
            getHomePage().clickLoginLink();

        }

        {

            getRegistrationPage().clickAndInputEmailMain(EMAIL);
            log.info(String.format("click and input %s in email field", EMAIL));

            getRegistrationPage().clickAndInputEmailRepeatAndClickTAB(EMAIL);
            log.info(String.format("click and input %s in email field repeat and click TAB", EMAIL));

            getRegistrationPage().clickAndInputPassMainAndClickTAB(PASS);
            log.info(String.format("click and input %s in password field and click TAB", PASS));

            //getRegistrationPage().clickAndInputPassRepeat(PASS);
            getRegistrationPage().clickAndInputPassRepeatTest(PASS);
            log.info(String.format("click and input %s password field repeat", PASS));

            getRegistrationPage().clickButtonRegistration();
            log.info(String.format("click on registration button"));

        }

        Assert.assertTrue(getRegistrationPage().isRegistrationSuccessful(),
                "registration is successful");
//        getHomePage().clickLogoutLink();
//        log.info(String.format("click logout link"));
        // TODO Felaktig erbjudandekod what is this? (#offerCodeError)

    }

    // just first field is filled with an email
    @Test(priority = 2)
    public void test2_negativeOnlyFirstEmailField() {

        log.info(String.format("\ntest2_negativeOnlyFirstEmailField\n"));

        {

            getHomePage().clickLoginLink();
            log.info(String.format("click login link"));

        }

        {

            getRegistrationPage().clickAndInputEmailMain(EMAIL);
            log.info(String.format("click and input %s in email field", EMAIL));

            String emptyStr = "";

            getRegistrationPage().clickAndInputEmailRepeatAndClickTAB(emptyStr);
            log.info(String.format("click and input %s in email field repeat and click TAB", emptyStr));

            getRegistrationPage().clickAndInputPassMainAndClickTAB(emptyStr);
            log.info(String.format("click and input %s in password field and click TAB", emptyStr));

            getRegistrationPage().clickAndInputPassRepeat(emptyStr);
            log.info(String.format("click and input %s password field repeat", emptyStr));

            getRegistrationPage().windowScroll();
            log.info(String.format("window scroll"));

            getRegistrationPage().clickButtonRegistration();
            log.info(String.format("click on registration button"));

        }

        Assert.assertTrue(getRegistrationPage().isErrorJustOneField(), "registration is failed");

    }

    // just second field is filled with an email
    @Test(priority = 2)
    public void test3_negativeOnlySecondEmailField() {

        log.info(String.format("\ntest3_negativeOnlySecondEmailField\n"));

        {

            getHomePage().clickLoginLink();
            log.info(String.format("click login link"));

        }

        {
            String emptyStr = "";

            getRegistrationPage().clickAndInputEmailMain(emptyStr);
            log.info(String.format("click and input %s in email field", emptyStr));

            getRegistrationPage().clickAndInputEmailRepeatAndClickTAB(EMAIL);
            log.info(String.format("click and input %s in email field repeat and click TAB", EMAIL));

            getRegistrationPage().clickAndInputPassMainAndClickTAB(emptyStr);
            log.info(String.format("click and input %s in password field and click TAB", emptyStr));

            getRegistrationPage().clickAndInputPassRepeat(emptyStr);
            log.info(String.format("click and input %s password field repeat", emptyStr));

            getRegistrationPage().windowScroll();
            log.info(String.format("window scroll"));

            getRegistrationPage().clickButtonRegistration();
            log.info(String.format("click on registration button"));

        }

        Assert.assertTrue(getRegistrationPage().isErrorJustOneField(), "registration is failed");

    }

    // just first field is filled with an password
    @Test(priority = 2)
    public void test4_negativeOnlyFirstPassField() {

        log.info(String.format("\ntest4_negativeOnlyFirstPassField\n"));

        {

            getHomePage().clickLoginLink();
            log.info(String.format("click login link"));

        }

        String emptyStr = "";

        {

            getRegistrationPage().clickAndInputEmailMain(emptyStr);
            log.info(String.format("click and input %s in email field", emptyStr));

            getRegistrationPage().clickAndInputEmailRepeatAndClickTAB(emptyStr);
            log.info(String.format("click and input %s in email field repeat and click TAB", emptyStr));

            getRegistrationPage().clickAndInputPassMainAndClickTAB(PASS);
            log.info(String.format("click and input %s in password field and click TAB", PASS));

            getRegistrationPage().clickAndInputPassRepeat(emptyStr);
            log.info(String.format("click and input %s password field repeat", emptyStr));

            getRegistrationPage().windowScroll();
            log.info(String.format("window scroll"));

            getRegistrationPage().clickButtonRegistration();
            log.info(String.format("click on registration button"));

        }

        Assert.assertTrue(getRegistrationPage().isErrorJustOneField(), "registration is failed");

    }

    // just second field is filled with an password
    @Test(priority = 2)
    public void test5_negativeOnlySecondPassField() {

        log.info(String.format("\ntest5_negativeOnlySecondPassField\n"));

        {

            getHomePage().clickLoginLink();
            log.info(String.format("click login link"));

        }

        {

            String emptyStr = "";

            getRegistrationPage().clickAndInputEmailMain(emptyStr);
            log.info(String.format("click and input %s in email field", emptyStr));

            getRegistrationPage().clickAndInputEmailRepeatAndClickTAB(emptyStr);
            log.info(String.format("click and input %s in email field repeat and click TAB", emptyStr));

            getRegistrationPage().clickAndInputPassMainAndClickTAB(emptyStr);
            log.info(String.format("click and input %s in password field and click TAB", emptyStr));

            getRegistrationPage().clickAndInputPassRepeat(PASS);
            log.info(String.format("click and input %s password field repeat", PASS));

            getRegistrationPage().windowScroll();
            log.info(String.format("window scroll"));

            getRegistrationPage().clickButtonRegistration();
            log.info(String.format("click on registration button"));

        }

        Assert.assertTrue(getRegistrationPage().isErrorJustOneField(), "registration is failed");

    }

    // only an email fields filled
    @Test(priority = 2)
    public void test6_negativeOnlyEmailFields() {

        log.info(String.format("\ntest6_negativeOnlyEmailFields\n"));

        {

            getHomePage().clickLoginLink();
            log.info(String.format("click login link"));

        }

        {

            getRegistrationPage().clickAndInputEmailMain(EMAIL);
            log.info(String.format("click and input %s in email field", EMAIL));

            getRegistrationPage().clickAndInputEmailRepeatAndClickTAB(EMAIL);
            log.info(String.format("click and input %s in email field repeat and click TAB", EMAIL));

            String emptyStr = "";

            getRegistrationPage().clickAndInputPassMainAndClickTAB(emptyStr);
            log.info(String.format("click and input %s in password field and click TAB", emptyStr));

            getRegistrationPage().clickAndInputPassRepeat(emptyStr);
            log.info(String.format("click and input %s password field repeat", emptyStr));

            getRegistrationPage().windowScroll();
            log.info(String.format("window scroll"));

            getRegistrationPage().clickButtonRegistration();
            log.info(String.format("click on registration button"));

        }

        Assert.assertTrue(getRegistrationPage().isErrorMessagePresent(), "registration is failed");

    }

    // only an password fields filled
    @Test(priority = 2)
    public void test7_negativeOnlyPassFields() {

        log.info(String.format("\ntest7_negativeOnlyPassFields\n"));

        {

            getHomePage().clickLoginLink();
            log.info(String.format("click login link"));

        }

        {

            String emptyStr = "";

            getRegistrationPage().clickAndInputEmailMain(emptyStr);
            log.info(String.format("click and input %s in email field", emptyStr));

            getRegistrationPage().clickAndInputEmailRepeatAndClickTAB(emptyStr);
            log.info(String.format("click and input %s in email field repeat and click TAB", emptyStr));

            getRegistrationPage().clickAndInputPassMainAndClickTAB(PASS);
            log.info(String.format("click and input %s in password field and click TAB", PASS));

            getRegistrationPage().clickAndInputPassRepeat(PASS);
            log.info(String.format("click and input %s password field repeat", PASS));

            getRegistrationPage().windowScroll();
            log.info(String.format("window scroll"));

            getRegistrationPage().clickButtonRegistration();
            log.info(String.format("click on registration button"));

        }

        Assert.assertTrue(getRegistrationPage().isErrorMessagePresent(), "registration is failed");

    }

    // first password field is empty
    @Test(priority = 2)
    public void test8_negativeFirstPassFieldEmpty() {

        log.info(String.format("\ntest8_negativeFirstPassFieldEmpty\n"));

        {

            getHomePage().clickLoginLink();
            log.info(String.format("click login link"));

        }

        {

            getRegistrationPage().clickAndInputEmailMain(EMAIL);
            log.info(String.format("click and input %s in email field", EMAIL));

            getRegistrationPage().clickAndInputEmailRepeatAndClickTAB(EMAIL);
            log.info(String.format("click and input %s in email field repeat and click TAB", EMAIL));

            String emptyStr = "";

            getRegistrationPage().clickAndInputPassMainAndClickTAB(emptyStr);
            log.info(String.format("click and input %s in password field and click TAB", emptyStr));

            getRegistrationPage().clickAndInputPassRepeat(PASS);
            log.info(String.format("click and input %s password field repeat", PASS));

            getRegistrationPage().windowScroll();
            log.info(String.format("window scroll"));

            getRegistrationPage().clickButtonRegistration();
            log.info(String.format("click on registration button"));

        }

        Assert.assertTrue(getRegistrationPage().isErrorMessagePresent(), "registration is failed");

    }

    // second password field is empty
    @Test(priority = 2)
    public void test9_negativeSecondPassFieldEmpty() {

        log.info(String.format("\ntest9_negativeSecondPassFieldEmpty\n"));

        {

            getHomePage().clickLoginLink();
            log.info(String.format("click login link"));

        }

        {

            getRegistrationPage().clickAndInputEmailMain(EMAIL);
            log.info(String.format("click and input %s in email field", EMAIL));

            getRegistrationPage().clickAndInputEmailRepeatAndClickTAB(EMAIL);
            log.info(String.format("click and input %s in email field repeat and click TAB", EMAIL));

            getRegistrationPage().clickAndInputPassMainAndClickTAB(PASS);
            log.info(String.format("click and input %s in password field and click TAB", PASS));

            String emptyStr = "";

            getRegistrationPage().clickAndInputPassRepeat(emptyStr);
            log.info(String.format("click and input %s password field repeat", emptyStr));

            getRegistrationPage().windowScroll();
            log.info(String.format("window scroll"));

            getRegistrationPage().clickButtonRegistration();
            log.info(String.format("click on registration button"));

        }

        Assert.assertTrue(getRegistrationPage().isErrorMessagePresent(), "registration is failed");

    }

    // first email field empty
    @Test(priority = 3)
    public void test10_negativeFirstEmailFieldEmpty() {

        log.info(String.format("\ntest10_negativeFirstEmailFieldEmpty\n"));

        {

            getHomePage().clickLoginLink();
            log.info(String.format("click login link"));

        }

        {

            String emptyStr = "";

            getRegistrationPage().clickAndInputEmailMain(emptyStr);
            log.info(String.format("click and input %s in email field", emptyStr));

            getRegistrationPage().clickAndInputEmailRepeatAndClickTAB(EMAIL);
            log.info(String.format("click and input %s in email field repeat and click TAB", EMAIL));

            getRegistrationPage().clickAndInputPassMainAndClickTAB(PASS);
            log.info(String.format("click and input %s in password field and click TAB", PASS));

            getRegistrationPage().clickAndInputPassRepeat(PASS);
            log.info(String.format("click and input %s password field repeat", PASS));

            getRegistrationPage().windowScroll();
            log.info(String.format("window scroll"));

            getRegistrationPage().clickButtonRegistration();
            log.info(String.format("click on registration button"));

        }

        Assert.assertTrue(getRegistrationPage().isErrorMessagePresent(), "registration is failed");

    }

    // second email field empty
    @Test(priority = 3)
    public void test11_negativeSecondEmailFieldEmpty() {

        log.info(String.format("\ntest11_negativeSecondEmailFieldEmpty\n"));

        {

            getHomePage().clickLoginLink();
            log.info(String.format("click login link"));

        }

        {

            getRegistrationPage().clickAndInputEmailMain(EMAIL);
            log.info(String.format("click and input %s in email field", EMAIL));

            String emptyStr = "";

            getRegistrationPage().clickAndInputEmailRepeatAndClickTAB(emptyStr);
            log.info(String.format("click and input %s in email field repeat and click TAB", emptyStr));

            getRegistrationPage().clickAndInputPassMainAndClickTAB(PASS);
            log.info(String.format("click and input %s in password field and click TAB", PASS));

            getRegistrationPage().clickAndInputPassRepeat(PASS);
            log.info(String.format("click and input %s password field repeat", PASS));

            getRegistrationPage().windowScroll();
            log.info(String.format("window scroll"));

            getRegistrationPage().clickButtonRegistration();
            log.info(String.format("click on registration button"));

        }

        Assert.assertTrue(getRegistrationPage().isErrorMessagePresent(), "registration is failed");

    }

    // introduced various email address
    @Test(priority = 3)
    public void test12_negativeVariousEmailAddress() {

        log.info(String.format("\ntest12_negativeVariousEmailAddress\n"));

        {

            getHomePage().clickLoginLink();
            log.info(String.format("click login link"));

        }

        {

            getRegistrationPage().clickAndInputEmailMain(EMAIL);
            log.info(String.format("click and input %s in email field", EMAIL));

            getRegistrationPage().clickAndInputEmailRepeatAndClickTAB(1 + EMAIL);
            log.info(String.format("click and input %s in email field repeat and click TAB", 1 + EMAIL));

            getRegistrationPage().clickAndInputPassMainAndClickTAB(PASS);
            log.info(String.format("click and input %s in password field and click TAB", PASS));

            getRegistrationPage().clickAndInputPassRepeat(PASS);
            log.info(String.format("click and input %s password field repeat", PASS));

            getRegistrationPage().windowScroll();
            log.info(String.format("window scroll"));

            getRegistrationPage().clickButtonRegistration();
            log.info(String.format("click on registration button"));

        }

        Assert.assertTrue(getRegistrationPage().isErrorMessagePresent(), "registration is failed");

    }

    // introduced various password
    @Test(priority = 3)
    public void test13_negativeVariousPassFields() {

        log.info(String.format("\ntest13_negativeVariousPassFields\n"));

        {

            getHomePage().clickLoginLink();
            log.info(String.format("click login link"));

        }

        {

            getRegistrationPage().clickAndInputEmailMain(EMAIL);
            log.info(String.format("click and input %s in email field", EMAIL));

            getRegistrationPage().clickAndInputEmailRepeatAndClickTAB(EMAIL);
            log.info(String.format("click and input %s in email field repeat and click TAB", EMAIL));

            getRegistrationPage().clickAndInputPassMainAndClickTAB(PASS);
            log.info(String.format("click and input %s in password field and click TAB", PASS));

            getRegistrationPage().clickAndInputPassRepeat(PASS + 1);
            log.info(String.format("click and input %s password field repeat", PASS + 1));

            getRegistrationPage().windowScroll();
            log.info(String.format("window scroll"));

            getRegistrationPage().clickButtonRegistration();
            log.info(String.format("click on registration button"));

        }

        Assert.assertTrue(getRegistrationPage().isErrorMessagePresent(), "registration is failed");

    }

}
