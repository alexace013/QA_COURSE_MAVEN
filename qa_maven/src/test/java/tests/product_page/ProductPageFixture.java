package tests.product_page;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;
import tests.browser.StartBrowserFixture;

public class ProductPageFixture extends StartBrowserFixture {

    private static final Logger log = Logger.getLogger(ProductPageFixture.class);
    private final static String URL = "http://www.ellos.se/";
    private HomePage homePage;
    private LoginPage loginPage;
    private ProductPage productPage;

    @BeforeClass
    public void setUp() {

        getDriver().get(URL);
        log.info(String.format("browser open page: %s", URL));
        homePage = new HomePage(getDriver());
        loginPage = new LoginPage(getDriver());
        productPage = new ProductPage(getDriver());
        log.info(String.format("start product page tests"));

    }

    @AfterClass
    public void tearDown() {
        log.info(String.format("end product page tests"));
    }

    public HomePage getHomePage() {
        return homePage;
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }

    public ProductPage getProductPage() {
        return productPage;
    }

}
