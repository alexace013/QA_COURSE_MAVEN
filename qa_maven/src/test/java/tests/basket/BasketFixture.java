package tests.basket;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.BasketPage;
import pages.HomePage;
import pages.ProductPage;
import tests.browser.BrowserFixture;

public class BasketFixture extends BrowserFixture {

    private static final Logger log = Logger.getLogger(BasketFixture.class);
    private final static String URL = "http://www.ellos.se/";
    private HomePage homePage;
    private ProductPage productPage;
    private BasketPage basketPage;

    @BeforeClass
    public void setUp() {

        getDriver().get(URL);
        log.info(String.format("browser open: < %s >", URL));
        homePage = new HomePage(getDriver());
        productPage = new ProductPage(getDriver());
        basketPage = new BasketPage(getDriver());
        log.info(String.format("start login tests"));

    }

    @AfterClass
    public void tearDown() {

        log.info(String.format("end login tests"));

    }

    public HomePage getHomePage() {

        return homePage;

    }

    public ProductPage getProductPage() {

        return productPage;

    }

    public BasketPage getBasketPage() {

        return basketPage;

    }

}
