package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import utils.WebElementsActions;

public class ProductPage {

    private static final Logger log = Logger.getLogger(ProductPage.class);

    private WebDriver driver;
    private WebElementsActions web;

    public ProductPage(WebDriver driver) {

        this.driver = driver;
        this.web = new WebElementsActions(driver);

    }



}
