package pages;

import exception.ElementNoSuch;
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

    public void switchToHomePage() {

        try {

            web.moveToElementAndClick("logoCenterLink", "logoCenterLink");

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    public void switchToProductCategory() {

        try {

            web.moveToElement("logoLeftLink");
            web.moveToElementAndClick("productOuterwearLink", "productOuterwearText");

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    public void switchToProductOuterwear() {

        try {

            web.moveToElement("logoLeftLink");
            web.moveToElementAndClick("productOuterwearLink", "productOuterwearText");

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    public void switchToFirstProductPage() {

        try {

            web.moveToElementAndClick("productFirstPositionImage", "productFirstPositionLink");

            if (web.waitForElementPresent("productName")) {

                log.info(String.format("switch to woman product was correct"));

            } else {

                log.info(String.format("switch to woman product was failed"));

            }

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }


    }

    public boolean checkCorrectSwitchToProductPage() {

        try {

            if (web.isElementPresent("productName")) {

                log.info(String.format("switch to product page was correct"));
                return true;

            } else {

                log.info(String.format("switch to product page was failed"));
                return false;

            }

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

        return false;

    }

}
