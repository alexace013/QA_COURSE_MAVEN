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
 * This class works with home page {@see http://www.ellos.se/}
 */
public class HomePage {

    private static final Logger log = Logger.getLogger(HomePage.class);

    private WebDriver driver;
    private WebElementsActions web;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        web = new WebElementsActions(driver);
    }

    /**
     * Click logo link
     *
     * @throws ElementNoSuch {@link WebElementsActions#clickLink(String)}
     */
    public void clickLogo() {

        try {

            web.clickLink("logoCenterLink");

            screenShot("clicklogo");


        } catch (IOException e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    /**
     * Switch to registration page {@see https://www.ellos.se/LoginAndRegistration/Login?returnUrl=%2finspiration}
     *
     * @throws ElementNoSuch {@link WebElementsActions#clickLink(String)} and
     *                       {@link WebElementsActions#isElementPresent(String)}
     * @throws IOException   {@link FileUtils#copyFile(File, OutputStream)}
     */
    public void switchToRegistrationPage() {

        try {

            web.clickLink("loginLink");

            if (web.isElementPresent("loginFieldInput")) {

                log.info("Switch to LOGIN_PAGE successful.");

                screenShot("switchToRegPage");

            } else {

                log.info("Switch to LOGIN_PAGE failed.");

            }

        } catch (IOException | ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    /**
     * Switch to order direct page {@see http://www.ellos.se/Checkout/Basket.aspx}
     *
     * @throws ElementNoSuch {@link WebElementsActions#clickLink(String)} and
     *                       {@link WebElementsActions#isElementPresent(String)}
     * @throws IOException   {@link FileUtils#copyFile(File, OutputStream)}
     */
    public void switchToOrderDirect() {

        try {

            web.clickLink("orderDirectLink");

            if (web.isElementPresent("isOrderDirectPage")) {

                log.info(String.format("switch to order direct page successful"));

                screenShot("switchToOrderDirect");

            } else {

                log.info(String.format("switch to order page failed"));

            }

        } catch (IOException | ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    /**
     * Switch to woman page {@see http://www.ellos.se/dam}
     *
     * @throws ElementNoSuch {@link WebElementsActions#moveToElementAndClick(String, String)} and
     *                       {@link WebElementsActions#waitForElementPresent(String)}
     * @throws IOException   {@link FileUtils#copyFile(File, OutputStream)}
     */
    public void switchToWomanPage() {

        try {

            web.moveToElementAndClick("womanMenu", "womanMenuLink");

            if (web.waitForElementPresent("inThePage")) {

                log.info(String.format("switch to woman page was correct"));

                screenShot("switchToWoman");


            } else {

                log.info(String.format("switch to woman page was incorrect"));

            }

        } catch (IOException | ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    /**
     * Switch to man page {@see http://www.ellos.se/herr}
     *
     * @throws ElementNoSuch {@link WebElementsActions#moveToElementAndClick(String, String)} and
     *                       {@link WebElementsActions#waitForElementPresent(String)}
     * @throws IOException   {@link FileUtils#copyFile(File, OutputStream)}
     */
    public void switchToManPage() {

        try {

            web.moveToElementAndClick("manMenu", "manMenuLink");

            if (web.waitForElementPresent("manNavigationLink")) {

                log.info(String.format("switch to man page was correct"));

                screenShot("switchToMan");

            } else {

                log.info(String.format("switch to man page was incorrect"));

            }


        } catch (IOException | ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    /**
     * Switch to barn page {@see http://www.ellos.se/barn}
     *
     * @throws ElementNoSuch {@link WebElementsActions#moveToElementAndClick(String, String)} and
     *                       {@link WebElementsActions#waitForElementPresent(String)}
     * @throws IOException   {@link FileUtils#copyFile(File, OutputStream)}
     */
    public void switchToChildPage() {

        try {

            web.moveToElementAndClick("barnMenu", "barnMenuLink");

            if (web.waitForElementPresent("barnNavigationLink")) {

                // this method is used because it is not visible element on next page
                web.windowScroll();

                log.info(String.format("switch to barn page was correct"));

                screenShot("switchToChild");

            } else {

                log.info(String.format("switch to barn page was incorrect"));

            }

        } catch (IOException | ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }


    }

    /**
     * Switch to sport page {@see http://www.ellos.se/sport}
     *
     * @throws ElementNoSuch {@link WebElementsActions#moveToElementAndClick(String, String)} and
     *                       {@link WebElementsActions#waitForElementPresent(String)}
     * @throws IOException   {@link FileUtils#copyFile(File, OutputStream)}
     */
    public void switchToSportPage() {

        try {

            web.moveToElementAndClick("sportMenu", "sportMenuLink");

            if (web.waitForElementPresent("sportNavigationLink")) {

                // this method is used because it is not visible element on next page
                web.windowScroll();

                log.info(String.format("switch to sport page was correct"));

                screenShot("switchToSportPage");

            } else {

                log.info(String.format("switch to sport page was incorrect"));

            }

        } catch (IOException | ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }


    }

    /**
     * Switch to underkläder & bad page {@see http://www.ellos.se/underklader-bad}
     *
     * @throws ElementNoSuch {@link WebElementsActions#moveToElementAndClick(String, String)} and
     *                       {@link WebElementsActions#waitForElementPresent(String)}
     * @throws IOException   {@link FileUtils#copyFile(File, OutputStream)}
     */
    public void switchToLinenAndBathPage() {

        try {

            web.moveToElementAndClick("linen&bathMenu", "linen&bathMenuLink");

            if (web.waitForElementPresent("linen&bathNavigationLink")) {

                // this method is used because it is not visible element on next page
                web.windowScroll();

                log.info(String.format("switch to linen and bath page was correct"));

                screenShot("switchToLinenAndBathPage");

            } else {

                log.info(String.format("switch to linen and bath page page was incorrect"));

            }

        } catch (IOException | ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }


    }

    /**
     * Switch to skor page {@see http://www.ellos.se/skor}
     *
     * @throws ElementNoSuch {@link WebElementsActions#moveToElementAndClick(String, String)} and
     *                       {@link WebElementsActions#waitForElementPresent(String)}
     * @throws IOException   {@link FileUtils#copyFile(File, OutputStream)}
     */
    public void switchToFootwearPage() {

        try {

            web.moveToElementAndClick("footwearMenu", "footwearMenuLink");

            if (web.waitForElementPresent("footwearNavigationLink")) {

                log.info(String.format("switch to footwear page was correct"));

                screenShot("switchToFootwearPage");

            } else {

                log.info(String.format("switch to footwear page was incorrect"));
            }

        } catch (IOException | ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }


    }

    /**
     * Switch to hem page {@see http://www.ellos.se/hem}
     *
     * @throws ElementNoSuch {@link WebElementsActions#moveToElementAndClick(String, String)} and
     *                       {@link WebElementsActions#waitForElementPresent(String)}
     * @throws IOException   {@link FileUtils#copyFile(File, OutputStream)}
     */
    public void switchToHemPage() {

        try {

            web.moveToElementAndClick("hemMenu", "hemMenuLink");

            if (web.waitForElementPresent("hemNavigationLink")) {

                log.info(String.format("switch to hem page was correct"));

                screenShot("switchToHemPage");

            } else {

                log.info(String.format("switch to hem page was incorrect"));

            }

        } catch (IOException | ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    /**
     * Switch to electronic page {@see http://www.ellos.se/elektronik}
     *
     * @throws ElementNoSuch {@link WebElementsActions#moveToElementAndClick(String, String)} and
     *                       {@link WebElementsActions#waitForElementPresent(String)}
     * @throws IOException   {@link FileUtils#copyFile(File, OutputStream)}
     */
    public void switchToElectronicPage() {

        try {

            web.moveToElementAndClick("electronicMenu", "electronicMenuLink");

            if (web.waitForElementPresent("electronicNavigationLink")) {

                log.info(String.format("switch to electronic page was correct"));

                screenShot("switchToElectronicPage");

            } else {

                log.info(String.format("switch to electronic page was incorrect"));

            }

        } catch (IOException | ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }


    }

    /**
     * Switch to shonhet page {@see http://www.ellos.se/skonhet-halsa}
     *
     * @throws ElementNoSuch {@link WebElementsActions#moveToElementAndClick(String, String)} and
     *                       {@link WebElementsActions#waitForElementPresent(String)}
     * @throws IOException   {@link FileUtils#copyFile(File, OutputStream)}
     */
    public void switchToBeautyAndHealthPage() {

        try {

            web.moveToElementAndClick("beautyAndHealthMenu", "beautyAndHealthMenuLink");

            if (web.waitForElementPresent("beautyAndHealthNavigationLink")) {

                log.info(String.format("switch to beauty and health page was correct"));

                screenShot("switchToBeautyAndHealthPage");

            } else {

                log.info(String.format("switch to beauty and health page was incorrect"));

            }

        } catch (IOException | ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }


    }

    /**
     * Switch to plus page {@see http://www.ellos.se/plus/?N=1z141kn}
     *
     * @throws ElementNoSuch {@link WebElementsActions#moveToElementAndClick(String, String)} and
     *                       {@link WebElementsActions#waitForElementPresent(String)}
     * @throws IOException   {@link FileUtils#copyFile(File, OutputStream)}
     */
    public void switchToPlusPage() {

        try {

            web.moveToElementAndClick("plusMenu", "plusMenuLink");

            if (web.waitForElementPresent("plusNavigationLink")) {

                log.info(String.format("switch to plus page was correct"));

                screenShot("switchToPlusPage");

            } else {

                log.info(String.format("switch to plus page was incorrect"));

            }

        } catch (IOException | ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    /**
     * Switch to REA page {@see http://www.ellos.se/rea}
     *
     * @throws ElementNoSuch {@link WebElementsActions#moveToElementAndClick(String, String)} and
     *                       {@link WebElementsActions#waitForElementPresent(String)}
     * @throws IOException   {@link FileUtils#copyFile(File, OutputStream)}
     */
    public void switchToREAPage() {

        try {

            web.moveToElementAndClick("reaMenu", "reaMenuLink");

            if (web.waitForElementPresent("reaNavigationLink")) {

                log.info(String.format("switch to rea page was correct"));

                screenShot("switchToREAPage");

            } else {

                log.info(String.format("switch to rea page was incorrect"));
            }

        } catch (IOException | ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    /**
     * Switch to inspiration page {@see http://www.ellos.se/inspiration}
     *
     * @throws ElementNoSuch {@link WebElementsActions#moveToElementAndClick(String, String)} and
     *                       {@link WebElementsActions#waitForElementPresent(String)}
     * @throws IOException   {@link FileUtils#copyFile(File, OutputStream)}
     */
    public void switchToInspirationPage() {

        try {

            web.moveToElementAndClick("inspirationMenu", "inspirationMenuLink");

            if (web.waitForElementPresent("inspirationNavigationLink")) {

                log.info(String.format("switch to inspiration page was correct"));

                screenShot("switchToInspirationPage");

            } else {

                log.info(String.format("switch to inspiration page was incorrect"));

            }

        } catch (IOException | ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }


    }

    /**
     * Switch to resor page {@see http://www.ellos.se/g/travel/travelStart?menuId=34}
     *
     * @throws ElementNoSuch {@link WebElementsActions#moveToElementAndClick(String, String)} and
     *                       {@link WebElementsActions#waitForElementPresent(String)}
     * @throws IOException   {@link FileUtils#copyFile(File, OutputStream)}
     */
    public void switchToResorPage() {

        try {

            web.moveToElementAndClick("resorMenu", "resorMenuLink");

            if (web.waitForElementPresent("resorNavigationLink")) {

                log.info(String.format("switch to resor page was correct"));

                screenShot("switchToResorPage");

            } else {

                log.info(String.format("switch to resor page was incorrect"));

            }

        } catch (IOException | ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));
        }


    }

    /**
     * Close the blurb in the page
     *
     * @throws ElementNoSuch {@link WebElementsActions#clickButton(String)}
     */
    public void closeBlurb() {

        if (web.isElementPresent("buttonBlurb")) {

            try {

                web.clickButton("buttonBlurb");

            } catch (ElementNoSuch e) {

                e.printStackTrace();
                log.error(String.format("Exception < %s >", e.getStackTrace()));
            }

        }

    }

    /**
     * Click on logout link
     *
     * @throws ElementNoSuch {@link WebElementsActions#clickLink(String)}
     * @throws IOException   {@link FileUtils#copyFile(File, OutputStream)}
     */
    public void clickLogoutLink() {

        try {

            web.clickLink("logoutLink");

            screenShot("clickLogoutLink");

        } catch (IOException | ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    /**
     * Click on login link
     *
     * @throws ElementNoSuch {@link WebElementsActions#clickLink(String)}
     * @throws IOException   {@link FileUtils#copyFile(File, OutputStream)}
     */
    public void clickLoginLink() {

        try {

            web.clickLink("loginLink");

            screenShot("clickLoginLink");

        } catch (IOException | ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    /**
     * Method verifies a successful user login
     *
     * @throws ElementNoSuch {@link WebElementsActions#isElementPresent(String)}
     */
    public boolean isUserLogIn() {

        try {

            if (web.isElementPresent("logoutLink")) {

                log.info(String.format("login was correct"));
                return true;

            } else {

                log.info(String.format("login was failed"));
                return false;

            }

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

        return false;

    }

    /**
     * Method verifies a successful user logout
     *
     * @throws ElementNoSuch {@link WebElementsActions#isElementPresent(String)}
     */
    public boolean isUserLogOut() {

        try {

            if (web.isElementPresent("loginLink")) {

                log.info(String.format("logout was correct"));
                return true;

            } else {

                log.info(String.format("logout was faliled"));
                return false;

            }

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

        return false;

    }

    /**
     * Refresh the home page
     */
    public void refreshHomePage() {
        web.refreshPage();
    }

    /**
     * Private method for made screenshot page
     *
     * @param fileName input name screenshot file
     * @throws IOException {@link FileUtils#copyFile(File, OutputStream)}
     */
    private void screenShot(String fileName) throws IOException {

        ScreenShot.screenShot(driver,
                "/media/alexander/HDD/Workspace/Projects/QA/screens/homepage/",
                fileName, ".png");

    }

}
