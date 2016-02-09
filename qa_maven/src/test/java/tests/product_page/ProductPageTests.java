package tests.product_page;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductPageTests extends ProductPageFixture {

    private static final Logger log = Logger.getLogger(ProductPageTests.class);

    @Test(priority = 1)
    public void test1_womanProductPage() {

        getHomePage().closeBlurb();
        getHomePage().switchToWomanPage();
        getProductPage().switchToProductCategory();
        getProductPage().switchToFirstProductPage();
        getProductPage().inTheProductPage();

        Assert.assertTrue(getProductPage().checkCorrectSwitchToProductPage(), "correct switch to product page");

        getProductPage().switchToHomePage();

    }

    @Test(priority = 2)
    public void test2_manProductPage() {

//        getHomePage().closeBlurb();
        getHomePage().switchToManPage();
        getProductPage().switchToProductCategory();
        getProductPage().switchToFirstProductPage();
        getProductPage().inTheProductPage();

        Assert.assertTrue(getProductPage().checkCorrectSwitchToProductPage(), "correct switch to product page");

        getProductPage().switchToHomePage();

    }

}
