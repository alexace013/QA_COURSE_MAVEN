package tests.checkout;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class CheckOutTests extends CheckOutFixture {

    private static final Logger log = Logger.getLogger(CheckOutTests.class);

    @Test
    public void test1_addProductToBasket() {

        getHomePage().closeBlurb();
        getHomePage().switchToElectronicPage();
        getProductPage().switchToSecondPositionCategory();
        getProductPage().switchToFirstPositionCategory();
        getProductPage().addProductToBasket();
        getProductPage().switchToHomePage();

    }

    @Test
    public void test2_() {

        getHomePage().switchToOrderDirect();

    }

}
