package pages;

import exception.ElementNoSuch;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import utils.WebElementsActions;

public class HomePage {

    private static final Logger log = Logger.getLogger(HomePage.class);

    private WebDriver driver;
    private WebElementsActions web;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        web = new WebElementsActions(driver);
    }

    public void clickLogo() {

        try {

            web.clickLink("logoCenterLink");

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    public void switchToRegistrationPage() {

        try {

            web.clickLink("loginLink");

            if (web.isElementPresent("loginFieldInput")) {

                log.info("Switch to LOGIN_PAGE successful.");

            } else {

                log.info("Switch to LOGIN_PAGE failed.");

            }

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    public void switchToWomanPage() {

        try {

            web.moveToElementAndClick("womanMenu", "womanMenuLink");

            if (web.waitForElementPresent("inThePage")) {

                log.info(String.format("switch to woman page was correct"));

            } else {

                log.info(String.format("switch to woman page was incorrect"));

            }

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    public void switchToManPage() {

        try {

            web.moveToElementAndClick("manMenu", "manMenuLink");

            if (web.waitForElementPresent("manNavigationLink")) {

                log.info(String.format("switch to man page was correct"));

            } else {

                log.info(String.format("switch to man page was incorrect"));

            }


        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    // switch to barn page
    public void switchToChildPage() {

        try {

            web.moveToElementAndClick("barnMenu", "barnMenuLink");

            if (web.waitForElementPresent("barnNavigationLink")) {

                web.windowScroll();
                log.info(String.format("switch to barn page was correct"));

            } else {

                log.info(String.format("switch to barn page was incorrect"));

            }

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }


    }

    // switch to sport page
    public void switchToSportPage() {

        try {

            web.moveToElementAndClick("sportMenu", "sportMenuLink");

            if (web.waitForElementPresent("sportNavigationLink")) {

                web.windowScroll();
                log.info(String.format("switch to sport page was correct"));

            } else {

                log.info(String.format("switch to sport page was incorrect"));

            }

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }


    }

    // switch to underkläder & bad page
    public void switchToLinenAndBathPage() {

        try {

            web.moveToElementAndClick("linen&bathMenu", "linen&bathMenuLink");

            if (web.waitForElementPresent("linen&bathNavigationLink")) {

                web.windowScroll();
                log.info(String.format("switch to linen and bath page was correct"));

            } else {

                log.info(String.format("switch to linen and bath page page was incorrect"));

            }

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }


    }

    // switch to skor page
    public void switchToFootwearPage() {

        try {

            web.moveToElementAndClick("footwearMenu", "footwearMenuLink");

            if (web.waitForElementPresent("footwearNavigationLink")) {

                log.info(String.format("switch to footwear page was correct"));

            } else {

                log.info(String.format("switch to footwear page was incorrect"));
            }

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }



    }

    public void switchToHemPage() {

        try {

            web.moveToElementAndClick("hemMenu", "hemMenuLink");

            if (web.waitForElementPresent("hemNavigationLink")) {

                log.info(String.format("switch to hem page was correct"));

            } else {

                log.info(String.format("switch to hem page was incorrect"));

            }

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }



    }

    public void switchToElectronicPage() {

        try {

            web.moveToElementAndClick("electronicMenu", "electronicMenuLink");

            if (web.waitForElementPresent("electronicNavigationLink")) {

                log.info(String.format("switch to electronic page was correct"));

            } else {

                log.info(String.format("switch to electronic page was incorrect"));

            }

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }



    }

    public void switchToSkonhetPage() {

        try {

            web.moveToElementAndClick("skonhetMenu", "skonhetMenuLink");

            if (web.waitForElementPresent("skonhetNavigationLink")) {

                log.info(String.format("switch to skonhet page was correct"));

            } else {

                log.info(String.format("switch to skonhet page was incorrect"));

            }

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }



    }

    public void switchToPlusPage() {

        try {

            web.moveToElementAndClick("plusMenu", "plusMenuLink");

            if (web.waitForElementPresent("plusNavigationLink")) {

                log.info(String.format("switch to plus page was correct"));

            } else {

                log.info(String.format("switch to plus page was incorrect"));

            }

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }



    }

    public void switchToREAPage() {

        try {

            web.moveToElementAndClick("reaMenu", "reaMenuLink");

            if (web.waitForElementPresent("reaNavigationLink")) {

                log.info(String.format("switch to rea page was correct"));

            } else {

                log.info(String.format("switch to rea page was incorrect"));
            }

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }



    }

    public void switchToInspirationPage() {

        try {

            web.moveToElementAndClick("inspirationMenu", "inspirationMenuLink");

            if (web.waitForElementPresent("inspirationNavigationLink")) {

                log.info(String.format("switch to inspiration page was correct"));

            } else {

                log.info(String.format("switch to inspiration page was incorrect"));

            }

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }



    }

    public void switchToResorPage() {

        try {

            web.moveToElementAndClick("resorMenu", "resorMenuLink");

            if (web.waitForElementPresent("resorNavigationLink")) {

                log.info(String.format("switch to resor page was correct"));

            } else {

                log.info(String.format("switch to resor page was incorrect"));

            }

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));
        }



    }

    public void closeBlurb() {

        try {

            web.clickButton("buttonBlurb");

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));
        }

    }

    public void clickLogoutLink() {

        try {

            web.clickLink("logoutLink");

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    public void clickLoginLink() {

        try {

            web.clickLink("loginLink");

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

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

    public void refreshHomePage() {
        web.refreshPage();
    }

}
