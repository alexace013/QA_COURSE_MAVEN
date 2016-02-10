package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import utils.WebElementsActions;

public class BasketPage {

    private static final Logger log = Logger.getLogger(BasketPage.class);

    private WebDriver driver;
    private WebElementsActions web;

    public BasketPage(WebDriver driver) {

        this.driver = driver;
        web = new WebElementsActions(driver);

    }

    public void addProductToBasket() {

        web.windowScroll();

        web.clickElement("addProductToPage");

    }

    public void switchToMobile() {

        web.moveToElementAndClick("mobile", "mobile");

    }

    public void windowScroll() {

        web.windowScroll();

    }

    public boolean textPresent() {

        if (web.isElementPresent("textIphone")) {

            log.info(String.format("correct page"));
            return true;

        } else {

            log.info(String.format("incorrect page"));
            return false;

        }

    }
}
