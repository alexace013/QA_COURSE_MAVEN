package pages;

import exception.ElementNoSuch;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import utils.ScreenShot;
import utils.WebElementsActions;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/**
 * This class works with the product page
 */
public class ProductPage {

    private static final Logger log = Logger.getLogger(ProductPage.class);

    private WebDriver driver;
    private WebElementsActions web;

    public ProductPage(WebDriver driver) {

        this.driver = driver;
        this.web = new WebElementsActions(driver);

    }

    /**
     * Switch to home page {@see http://www.ellos.se/}
     *
     * @throws ElementNoSuch {@link WebElementsActions#moveToElementAndClick(String, String)}
     * @throws IOException   {@link ScreenShot#screenShot(WebDriver, String, String, String)}
     */
    public void switchToHomePage() {

        try {

            web.moveToElementAndClick("logoCenterLink", "logoCenterLink");

            screenShot("switchToHomePage");

        } catch (IOException | ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    /**
     * Switch to home page {@see http://www.ellos.se/}
     * <p>
     * In this method used other locator {@see /main/resources/UAMapping.properties => locator = logoLeftLink}
     *
     * @throws ElementNoSuch {@link WebElementsActions#moveToElementAndClick(String, String)}
     * @throws IOException   {@link ScreenShot#screenShot(WebDriver, String, String, String)}
     */
    public void switchToHomeFinishedTest() {

        try {

            web.moveToElementAndClick("logoLeftLink", "logoLeftLink");

            screenShot("switchToHomeFinishedTest");

        } catch (IOException | ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    /**
     * Switch to product category page
     *
     * @throws ElementNoSuch {@link WebElementsActions#moveToElement(String)} and
     *                       {@link WebElementsActions#moveToElementAndClick(String, String)}
     * @throws IOException   {@link ScreenShot#screenShot(WebDriver, String, String, String)}
     */
    public void switchToProductCategory() {

        try {

            web.moveToElement("logoLeftLink");
            web.moveToElementAndClick("productCategoryFirstPosition", "productCategoryFirstPositionLink");

            screenShot("switchToProductCategory");

        } catch (IOException | ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }


    /**
     * Switch to first position product on the product category page
     *
     * @throws ElementNoSuch {@link WebElementsActions#moveToElement(String)} and
     *                       {@link WebElementsActions#moveToElementAndClick(String, String)}
     * @throws IOException   {@link ScreenShot#screenShot(WebDriver, String, String, String)}
     */
    public void switchToFirstPositionCategory() {

        try {

            web.moveToElement("logoLeftLink");
            web.moveToElementAndClick("productFirstPositionLink", "productFirstPositionLink");

            screenShot("switchToFirstPositionCategory");

        } catch (IOException | ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    /**
     * Check to see that we are on the correct page
     *
     * @throws exception.ElementNoSuch {@link WebElementsActions#isElementPresent(String)}
     * @throws IOException             {@link ScreenShot#screenShot(WebDriver, String, String, String)}
     */
    public boolean textPresent() {

        try {

            if (web.isElementPresent("theProductText")) {

                screenShot("textPresent");

                log.info(String.format("correct page"));
                return true;

            } else {

                log.info(String.format("incorrect page"));
                return false;

            }

        } catch (IOException | ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

        return false;

    }

    /**
     * Switch to second position product on the product category page
     *
     * @throws ElementNoSuch {@link WebElementsActions#moveToElement(String)} and
     *                       {@link WebElementsActions#moveToElementAndClick(String, String)}
     * @throws IOException   {@link ScreenShot#screenShot(WebDriver, String, String, String)}
     */
    public void switchToSecondPositionCategory() {

        try {

            web.moveToElement("logoLeftLink");
            web.moveToElementAndClick("productCategorySecondPositionLink", "productCategorySecondPositionLink");

            screenShot("switchToSecondPositionCategory");

        } catch (IOException e) {

            e.printStackTrace();
            log.error(String.format("Exeption < %s >", e.getStackTrace()));

        }

    }

    /**
     * This method wait for element present on page {wait timeout = @see {@link WebElementsActions#driverWait}}
     *
     * @return true if locator {@see productName} is present on page, otherwise false
     * @throws ElementNoSuch {@link WebElementsActions#waitForElementPresent(String)}
     */
    public boolean isTheProductPage() {

        try {

            if (web.waitForElementPresent("productName")) {

                log.info(String.format("switch to product page < %s > was correct", "productName"));
                return true;

            } else {

                log.info(String.format("switch to product page < %s > was failed", "productName"));
                return false;

            }

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

        return false;

    }

    /**
     * Verification that includes the desired page
     *
     * @return true if element {@see productName in UAMapping.properties} present on
     * page{@link WebElementsActions#isElementPresent(String)}, otherwise false
     * @throws ElementNoSuch {@link WebElementsActions#isElementPresent(String)}
     */
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

    /**
     * Add product to basket
     *
     * @throws exception.ElementNoSuch {@link WebElementsActions#clickElement(String)}
     * @throws IOException             {@link ScreenShot#screenShot(WebDriver, String, String, String)}
     */
    public void addProductToBasket() {

        try {

            web.windowScroll();
            web.clickElement("addProductToPage");

            screenShot("addProductToBasket");

        } catch (IOException | ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    /**
     * This method used only inspiration page {@see http://www.ellos.se/inspiration}
     *
     * @throws ElementNoSuch {@link WebElementsActions#waitForElementPresent(String)} and
     *                       {@link WebElementsActions#isElementPresent(String)}
     * @throws IOException   {@link ScreenShot#screenShot(WebDriver, String, String, String)}
     */
    public void forInspirationPage() {

        // this cycle down the page to the desired element
        for (int i = 0; i < 3; i++) {

            web.windowScroll();

        }

        try {

            web.clickLink("inspirationProductTwo");

            if (web.waitForElementPresent("isInspirationElementPresent")) {

                log.info(String.format("correct page"));

                /**
                 * It is used to confirm that exactly on the correct page.
                 * You should fall on the page {@see http://www.ellos.se/inspiration/svavande-gronska/1542}
                 * @param name this person's name, as referred on page
                 * */
                String name = "Alexandra Ogonowski";

                if (web.isElementPresent("isInspirationElementPresent")) {

                    log.info(String.format("you know who are %s.", name));

                    screenShot("InspirationPage");

                } else {

                    log.info(String.format("you didn't know who are %s.", name));

                }

            } else {

                log.info(String.format("incorrect page"));

            }


        } catch (IOException | ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    /**
     * This method used only for resor page {@see http://www.ellos.se/g/travel/travelStart?menuId=34}
     *
     * @throws ElementNoSuch {@link WebElementsActions#moveToElementAndClick(String, String)}
     * @throws IOException   {@link ScreenShot#screenShot(WebDriver, String, String, String)}
     */
    public void forResorPage() {

        try {

            web.moveToElementAndClick("resorMenuElementTwo", "resorMenuElementTwo");

            screenShot("forResorPage");
//        web.clickLink("linkNazar");
            isTravelPage();
            isNazarPagePresent();

        } catch (IOException | ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }


    }

    /**
     * This method ensures that we are on the travel page {@see http://www.ellos.se/g/travel/travelStart?menuId=34}
     * where locator travelLogo = Resor page
     *
     * @return true if element present on a page, otherwise false
     * @throws ElementNoSuch {@link WebElementsActions#isElementPresent(String)} and
     *                       {@link WebElementsActions#clickLink(String)}
     * @throws IOException   {@link ScreenShot#screenShot(WebDriver, String, String, String)}
     */
    private boolean isTravelPage() {

        try {

            if (web.isElementPresent("travelLogo")) {

                // click on an item on the page
                web.clickLink("linkNazar");

                screenShot("sTravelPage");

                log.info(String.format("resor page"));
                return true;

            } else {

                log.info(String.format("not resor page"));
                return false;

            }

        } catch (IOException | ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

        return false;

    }

    /**
     * Private method checked that we are on the correct
     * page {@see http://www.ellos.se/g/travel/nazar?menuId=74e60d34-b56c-4189-a818-ae4f3c0d5915}
     *
     * @return true is element nazarPage => some image present in page, otherwise false
     * @throws ElementNoSuch {@link WebElementsActions#isElementPresent(String)}
     * @throws IOException   {@link ScreenShot#screenShot(WebDriver, String, String, String)}
     */
    private boolean isNazarPagePresent() {

        try {

            if (web.isElementPresent("nazarPage")) {

                screenShot("isNazarPagePresent");

                return true;

            } else {

                return false;

            }

        } catch (IOException | ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

        return false;

    }

    /**
     * This method help with product where you must select model or color product
     *
     * @throws ElementNoSuch {@link WebElementsActions#moveToElementAndClick(String, String)}
     * @throws IOException   {@link ScreenShot#screenShot(WebDriver, String, String, String)}
     */
    public void selectColor() {

        try {

            web.windowScroll();

            web.moveToElementAndClick("colorMenuLink", "colorMenuLink");

            screenShot("selectColor_1_");

            web.moveToElementAndClick("selectColorLink", "selectColorLink");

            screenShot("selectColor_2_");

        } catch (IOException | ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    public void selectSize() {

        try {

            web.windowScroll();

            web.moveToElementAndClick("sizeMenuLink", "sizeMenuLink");

            screenShot("selectSize_1_");

            web.moveToElementAndClick("sizeMenu_M_Link", "sizeMenu_M_Link");

            screenShot("selectSize_2_");

        } catch (IOException | ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    /**
     * Private method for made screenshot page
     *
     * @param fileName input name screenshot file
     * @throws IOException {@link FileUtils#copyFile(File, OutputStream)}
     */
    private void screenShot(String fileName) throws IOException {

        ScreenShot.screenShot(driver,
                "/media/alexander/HDD/Workspace/Projects/QA/screens/productpage/",
                fileName, ".png");

    }

}
