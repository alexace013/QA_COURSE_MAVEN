package tests.checkout;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import random.RandomUser;

public class CheckOutTests extends CheckOutFixture {

    private static final Logger log = Logger.getLogger(CheckOutTests.class);
    private static final String EMAIL = RandomUser.randomEmail();
    private static final String PASS = "qwerty123456";

    @Test(priority = 1)
    public void test1_addProductToBasket() {

        getHomePage().closeBlurb();
        getHomePage().switchToElectronicPage();
        getProductPage().switchToSecondPositionCategory();
        getProductPage().switchToFirstPositionCategory();
        getProductPage().addProductToBasket();
        getProductPage().switchToHomePage();

    }

    @Test(priority = 2)
    public void test2_switchToCheckOut() {

        getHomePage().switchToOrderDirect();
        getCheckOutPage().pressButtonCheckOut();
        getRegistrationPage().switchToRegisterCustomer();
        getCheckOutPage().inputEmail(EMAIL);
        getCheckOutPage().inputEmailRepeat(EMAIL);
        getCheckOutPage().inputPassword(PASS);
        getCheckOutPage().inputPasswordRepeat(PASS);
        getCheckOutPage().inputFirstName("Bob");
        getCheckOutPage().inputLastName("Wasofskiy");
        getCheckOutPage().input_CO_address("c/o address");
        getCheckOutPage().inputAddress("Great Britain");
        getCheckOutPage().inputZipCode("0771 - 33 33 10");
        getCheckOutPage().inputCity("London");

    }

}
