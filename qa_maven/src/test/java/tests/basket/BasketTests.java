package tests.basket;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasketTests extends BasketFixture {

    private static final Logger log = Logger.getLogger(BasketTests.class);


    @Test
    public void test1_addProduct() {

        getHomePage().closeBlurb();
        getHomePage().switchToElectronicPage();
        getBasketPage().switchToMobile();
        getProductPage().switchToFirstProductPage();
        getBasketPage().addProductToBasket();

        Assert.assertTrue(getBasketPage().textPresent(), "success page with iPhone 6 Plus 16GB Space Gray");


    }

}
