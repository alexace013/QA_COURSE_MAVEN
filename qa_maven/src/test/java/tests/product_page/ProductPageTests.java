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

        getHomePage().switchToManPage();
        getProductPage().switchToProductCategory();
        getProductPage().switchToFirstProductPage();
        getProductPage().inTheProductPage();

        Assert.assertTrue(getProductPage().checkCorrectSwitchToProductPage(), "correct switch to product page");

        getProductPage().switchToHomePage();

    }

    @Test(priority = 3)
    public void test3_barnProductPage() {

        getHomePage().switchToChildPage();
        getProductPage().switchToProductCategory();
        getProductPage().switchToFirstProductPage();
        getProductPage().inTheProductPage();

        Assert.assertTrue(getProductPage().checkCorrectSwitchToProductPage(), "correct switch to product page");

        getProductPage().switchToHomePage();

    }

    @Test(priority = 4)
    public void test4_sportProductPage() {

        getHomePage().switchToSportPage();
        getProductPage().switchToProductCategory();
        getProductPage().switchToFirstProductPage();
        getProductPage().inTheProductPage();

        Assert.assertTrue(getProductPage().checkCorrectSwitchToProductPage(), "correct switch to product page");

        getProductPage().switchToHomePage();

    }

    @Test(priority = 5)
    public void test5_linenAndBathPage() {

        getHomePage().switchToLinenAndBathPage();
        getProductPage().switchToProductCategory();
        getProductPage().switchToFirstProductPage();
        getProductPage().inTheProductPage();

        Assert.assertTrue(getProductPage().checkCorrectSwitchToProductPage(), "correct switch to product page");

        getProductPage().switchToHomePage();

    }

    @Test(priority = 6)
    public void test6_footwearPage() {

        getHomePage().switchToFootwearPage();
        getProductPage().switchToProductCategory();
        getProductPage().switchToFirstProductPage();
        getProductPage().inTheProductPage();

        Assert.assertTrue(getProductPage().checkCorrectSwitchToProductPage(), "correct switch to product page");

        getProductPage().switchToHomePage();

    }

    @Test(priority = 7)
    public void test7_hemPage() {

        getHomePage().switchToHemPage();
        getProductPage().switchToProductCategory();
        getProductPage().switchToFirstProductPage();
        getProductPage().inTheProductPage();

        Assert.assertTrue(getProductPage().checkCorrectSwitchToProductPage(), "correct switch to product page");

        getProductPage().switchToHomePage();

    }

    @Test(priority = 8)
    public void test8_electronicPage() {

        getHomePage().switchToElectronicPage();
        getProductPage().switchToProductCategory();
        getProductPage().switchToFirstProductPage();
        getProductPage().inTheProductPage();

        Assert.assertTrue(getProductPage().checkCorrectSwitchToProductPage(), "correct switch to product page");

        getProductPage().switchToHomePage();

    }

    @Test(priority = 9)
    public void test9_beautyAndHealthPage() {

        getHomePage().switchToBeautyAndHealthPage();
        getProductPage().switchToProductCategory();
        getProductPage().switchToFirstProductPage();
        getProductPage().inTheProductPage();

        Assert.assertTrue(getProductPage().checkCorrectSwitchToProductPage(), "correct switch to product page");

        getProductPage().switchToHomePage();

    }

    @Test(priority = 10)
    public void test10_plusPage() {

        getHomePage().switchToPlusPage();
        getProductPage().switchToProductCategory();
        getProductPage().switchToFirstProductPage();
        getProductPage().inTheProductPage();

        Assert.assertTrue(getProductPage().checkCorrectSwitchToProductPage(), "correct switch to product page");

        getProductPage().switchToHomePage();

    }

    @Test(priority = 11)
    public void test11_reaPage() {

        getHomePage().switchToREAPage();
        getProductPage().switchToProductCategory();
        getProductPage().switchToFirstProductPage();
        getProductPage().inTheProductPage();

        Assert.assertTrue(getProductPage().checkCorrectSwitchToProductPage(), "correct switch to product page");

        getProductPage().switchToHomePage();


    }

    @Test(priority = 12)
    public void test12_inspirationPage() {

        getHomePage().switchToInspirationPage();
        getProductPage().forInspirationPage();

//        Assert.assertTrue(getProductPage().checkCorrectSwitchToProductPage(), "correct switch to product page");

        getProductPage().switchToHomePage();

    }

    @Test(priority = 13)
    public void test13_resorPage() {

        getHomePage().switchToResorPage();
        getProductPage().forResorPage();

        getProductPage().switchToHomePageStart();

    }

}
