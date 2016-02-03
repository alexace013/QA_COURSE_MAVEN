package pages;

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
        web.clickLink("logoLink");
    }

    public void switchToRegistrationPage() {

        web.clickLink("logInLink");

        if (web.isElementPresent("loginFieldInput")) {
            log.info("Switch to LOGIN_PAGE successful.");
        } else {
            log.info("Switch to LOGIN_PAGE failed.");
        }

    }

    public void closeBlurb() {
        web.clickButton("buttonBlurb");
    }

    public void clickLogoutLink() {
        web.clickLink("logOutLink");
    }

    public void clickLoginLink() {
        web.clickLink("logInLink");
    }

    public boolean isUserLogIn() {
        return web.isElementPresent("logInLink");
    }

    public boolean isUserLogOut() {
        return web.isElementPresent("logOutLink");
    }

    public void refreshHomePage() {
        web.refreshPage();
    }

}
