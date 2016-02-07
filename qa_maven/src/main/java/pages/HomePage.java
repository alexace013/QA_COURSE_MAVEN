package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import utils.WebElementsActions;

import java.io.IOException;

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

        } catch (IOException e) {

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

        } catch (IOException e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    public void switchToWomanPage() {

        try {

            web.moveToElementAndClick("womanMenu", "womanMenuLink");

        } catch (IOException e) {

            e.printStackTrace();

        }

        if (web.waitForElementPresent("productOuterwearLink")) {

            log.info(String.format("switch to woman page was correct"));

        } else {

            log.error(String.format("switch to woman page was incorrect"));

        }

    }

    public void switchToManPage() {

        try {

            web.moveToElementAndClick("manMenu", "manMenuLink");

        } catch (IOException e) {

            e.printStackTrace();

        }

        if (web.waitForElementPresent("manNavigationLink")) {

            log.info(String.format("switch to man page was correct"));

        } else {

            log.error(String.format("switch to man page was incorrect"));

        }

    }

    public void switchToBarnPage() {

        try {

            web.moveToElementAndClick("barnMenu", "barnMenuLink");

        } catch (IOException e) {

            e.printStackTrace();

        }

        if (web.waitForElementPresent("barnNavigationLink")) {

            log.info(String.format("switch to barn page was correct"));

        } else {

            log.error(String.format("switch to barn page was incorrect"));

        }

    }

    public void switchToSportPage() {

        try {

            web.moveToElementAndClick("sportMenu", "sportMenuLink");

        } catch (IOException e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

        if (web.waitForElementPresent("sportNavigationLink")) {

            log.info(String.format("switch to sport page was correct"));

        } else {

            log.error(String.format("switch to sport page was incorrect"));

        }

    }

    public void switchToUnderkladerAndBadPage() {

        try {

            web.moveToElementAndClick("underklader-badMenu", "underklader-badMenuLink");

        } catch (IOException e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

        if (web.waitForElementPresent("underkladerAndBadNavigationLink")) {

            log.info(String.format("switch to underklader and badpage was correct"));

        } else {

            log.error(String.format("switch to underklader and badpage page was incorrect"));

        }

    }

    public void switchToSkorPage() {

        try {

            web.moveToElementAndClick("skorMenu", "skorMenuLink");

        } catch (IOException e) {

            e.printStackTrace();

        }

        if (web.waitForElementPresent("skorNavigationLink")) {

            log.info(String.format("switch to skor page was correct"));

        } else {

            log.error(String.format("switch to skor page was incorrect"));
        }

    }

    public void switchToHemPage() {

        try {

            web.moveToElementAndClick("hemMenu", "hemMenuLink");

        } catch (IOException e) {

            e.printStackTrace();

        }

        if (web.waitForElementPresent("hemNavigationLink")) {

            log.info(String.format("switch to hem page was correct"));

        } else {

            log.error(String.format("switch to hem page was incorrect"));

        }

    }

    public void switchToElectronicPage() {

        try {

            web.moveToElementAndClick("electronicMenu", "electronicMenuLink");

        } catch (IOException e) {

            e.printStackTrace();

        }

        if (web.waitForElementPresent("electronicNavigationLink")) {

            log.info(String.format("switch to electronic page was correct"));

        } else {

            log.error(String.format("switch to electronic page was incorrect"));

        }

    }

    public void switchToSkonhetPage() {

        try {

            web.moveToElementAndClick("skonhetMenu", "skonhetMenuLink");

        } catch (IOException e) {

            e.printStackTrace();

        }

        if (web.waitForElementPresent("skonhetNavigationLink")) {

            log.info(String.format("switch to skonhet page was correct"));

        } else {

            log.error(String.format("switch to skonhet page was incorrect"));

        }

    }

    public void switchToPlusPage() {

        try {

            web.moveToElementAndClick("plusMenu", "plusMenuLink");

        } catch (IOException e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

        if (web.waitForElementPresent("plusNavigationLink")) {

            log.info(String.format("switch to plus page was correct"));

        } else {

            log.error(String.format("switch to plus page was incorrect"));

        }

    }

    public void switchToREAPage() {

        try {

            web.moveToElementAndClick("reaMenu", "reaMenuLink");

        } catch (IOException e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

        if (web.waitForElementPresent("reaNavigationLink")) {

            log.info(String.format("switch to rea page was correct"));

        } else {

            log.error(String.format("switch to rea page was incorrect"));
        }

    }

    public void switchToInspirationPage() {

        try {

            web.moveToElementAndClick("inspirationMenu", "inspirationMenuLink");

        } catch (IOException e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

        if (web.waitForElementPresent("inspirationNavigationLink")) {

            log.info(String.format("switch to inspiration page was correct"));

        } else {

            log.error(String.format("switch to inspiration page was incorrect"));

        }

    }

    public void switchToResorPage() {

        try {

            web.moveToElementAndClick("resorMenu", "resorMenuLink");

        } catch (IOException e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));
        }

        if (web.waitForElementPresent("resorNavigationLink")) {

            log.info(String.format("switch to resor page was correct"));

        } else {

            log.error(String.format("switch to resor page was incorrect"));

        }

    }

    public void closeBlurb() {

        try {

            web.clickButton("buttonBlurb");

        } catch (IOException e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));
        }

    }

    public void clickLogoutLink() {

        try {

            web.clickLink("logoutLink");

        } catch (IOException e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    public void clickLoginLink() {

        try {

            web.clickLink("loginLink");

        } catch (IOException e) {

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

                log.error(String.format("login was failed"));
                return false;

            }

        } catch (IOException e) {

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

                log.error(String.format("logout was faliled"));
                return false;

            }

        } catch (IOException e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

        return false;

    }

    public void refreshHomePage() {
        web.refreshPage();
    }

}
