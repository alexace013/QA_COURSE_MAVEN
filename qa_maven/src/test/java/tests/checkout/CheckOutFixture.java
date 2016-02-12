package tests.checkout;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.CheckOutPage;
import pages.HomePage;
import pages.ProductPage;
import tests.browser.BrowserFixture;

public class CheckOutFixture extends BrowserFixture {

    private static final Logger log = Logger.getLogger(CheckOutFixture.class);
    private final static String URL = "http://www.ellos.se/";
    private HomePage homePage;
    private CheckOutPage checkOutPage;
    private ProductPage productPage;

    @BeforeClass
    public void setUp() {

        getDriver().get(URL);
        log.info(String.format("browser open page: < %s >", URL));
        homePage = new HomePage(getDriver());
        checkOutPage = new CheckOutPage(getDriver());
        log.info(String.format("start login tests"));

    }

    @AfterClass
    public void tearDown() {
        log.info(String.format("end checkout tests"));
    }

    public HomePage getHomePage() {

        return homePage;

    }

    public CheckOutPage getCheckOutPage() {

        return checkOutPage;

    }

    public ProductPage getProductPage() {

        return productPage;

    }

}
