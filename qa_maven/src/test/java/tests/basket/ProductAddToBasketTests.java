package tests.basket;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class ProductAddToBasketTests extends BasketFixture {

    private static final Logger log = Logger.getLogger(ProductAddToBasketTests.class);


    @Test
    public void test1_addFirstProduct() {

        getHomePage().closeBlurb();
        getHomePage().switchToElectronicPage();
//        getBasketPage().switchToMobile();
        getProductPage().switchToSecondPositionCategory();
        getProductPage().switchToFirstPositionCategory();
        getProductPage().addProductToBasket();
        getProductPage().switchToHomePage();


//        Assert.assertTrue(getProductPage().textPresent(), "success page with iPhone 6 Plus 16GB Space Gray");


    }

    @Test
    public void test2_addSecondProduct() {

        getHomePage().switchToManPage();
        getProductPage().switchToProductCategory();
//        getProductPage().switchToFirstPositionCategory();
        getProductPage().switchToFirstPositionCategory();
        getProductPage().selectColor();
        getProductPage().selectSize();
        getProductPage().addProductToBasket();
        getProductPage().switchToHomePage();

    }

    @Test
    public void test3_addThirdProduct() {

        // TODO must be *XL size

    }

}
