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

    public void switchToHomePageStart() {

        web.moveToElementAndClick("logoLeftLink", "logoLeftLink");

    }

    public void switchToProductCategory() {

        try {

            web.moveToElement("logoLeftLink");
            web.moveToElementAndClick("productCategoryOuterwear", "productCategoryOuterwearLink");

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    public void switchToFirstProductPage() {

        try {

            web.moveToElement("logoLeftLink");
            web.moveToElementAndClick("productFirstPositionLink", "productFirstPositionLink");

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    public void inTheProductPage() {

        try {

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

    public void forInspirationPage() {

        for (int i = 0; i < 3; i++) {

            web.windowScroll();

        }

        web.clickLink("inspirationProductTwo");

        if (web.waitForElementPresent("isInspirationElementPresent")) {

            log.info(String.format("correct page"));

            String name = "Alexandra Ogonowski";

            if (web.isElementPresent("isInspirationElementPresent")) {

                log.info(String.format("you know who are %s.", name));

            } else {

                log.info(String.format("you didn't know who are %s.", name));

            }

        } else {

            log.info(String.format("incorrect page"));

        }


    }

    public void forResorPage() {

        web.moveToElementAndClick("resorMenuElementTwo", "resorMenuElementTwo");
//        web.clickLink("linkNazar");
        isTravelPage();
        isNazarPagePresent();

    }

    private boolean isTravelPage() {

        if (web.isElementPresent("travelLogo")) {

            web.clickLink("linkNazar");
            log.info(String.format("resor page"));
            return true;

        } else {

            log.info(String.format("not resor page"));
            return false;
        }

    }

    private boolean isNazarPagePresent() {

        if (web.isElementPresent("nazarPage")) {

            return true;

        } else {

            return false;

        }

    }

}
