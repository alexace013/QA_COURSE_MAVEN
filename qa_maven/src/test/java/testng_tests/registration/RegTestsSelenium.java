package testng_tests.registration;

import org.testng.Assert;
import org.testng.annotations.Test;
import random.RandomUser;

public class RegTestsSelenium extends RegFixture {

    @Test(priority = 1)
    public void test0_positive() {

        log.info(String.format("\ntest0_positive\n"));
        homePage.closeBlurb();
        homePage.clickLogIn();
        registrationPage.clickAndInputEmailMain(EMAIL);
        registrationPage.clickAndInputEmailRepeat(EMAIL);
        registrationPage.clickAndInputPassMain(PASS);
        registrationPage.clickAndInputPassRepeat(PASS);
        registrationPage.clickButtonRegistration();

        Assert.assertTrue(registrationPage.isRegSuccessful());

    }

    @Test(priority = 2)
    public void test1_negative() {

        log.info(String.format("\ntest1_negative\n"));
        String email = RandomUser.randomEmail();
        registrationPage.clickAndInputEmailMain(email);
        registrationPage.clickAndInputEmailRepeat(email);
        registrationPage.clickAndInputPassMain(PASS);

        Assert.assertTrue(registrationPage.isErrorPassPresent());

    }

}
