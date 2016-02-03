package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import utils.WebElementsActions;

public class LoginPage {

    private final static Logger log = Logger.getLogger("log4j.rootLogger");
    private WebDriver driver;
    private WebElementsActions web;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        web = new WebElementsActions(driver);
    }

    public void clickAndInputLoginField(String login) {
        web.click("loginFieldInput");
        clearLoginField();
        web.input("loginFieldInput", login);
    }

    public boolean isUserLogIn() {
        return web.isElementPresent("logInLink");
    }

    public boolean isUserLogOut() {
        return web.isElementPresent("logOutLink");
    }

    public void clickAndInputLoginFieldAndClickTAB(String login) {
        web.click("loginFieldInput");
        clearLoginField();
        web.input("loginFieldInput", login);
        web.clickTAB("loginFieldInput");
    }

    public void clickAndInputPassFieldOne(String pass) {
        web.click("passFieldInputSecond");
        clearPassField();
        web.input("passFieldInputSecond", pass);
    }

    public void clickAndInputPassFieldAll(String pass) {
        web.click("passFieldInputFirst");
        clearPassField();
        web.input("passFieldInputSecond", pass);
    }

    private void clickTAB_onLoginField() {
        web.clickTAB("loginFieldInput");
    }

    public void clickLoginButton() {
        web.click("loginButton");
    }

    public void clickLogText() {
        web.click("loginTextLink");
    }

    public void closeHelpBox() {
        web.click("closeHelpBox");
    }

    public boolean isErrorMessagePresentOnPage() {
        return web.isElementPresent("errorMessage");
    }

    public boolean isErrorMessageOneFieldEmpty() {
        return web.isElementPresent("errorMessageOneFieldEmpty");
    }

    public boolean isErrorMessageFieldsEmpty() {
        return web.isElementPresent("errorMessageEmptyFields");
    }

    public boolean isHelpBoxActive() {
        return web.isElementPresent("closeHelpBox");
    }

    public boolean isHelpBoxPresent() {

        return web.waitForElementPresent("closeHelpBox");

    }

    private void clearLoginField() {
        web.clear("loginFieldInput");
    }

    private void clearPassField() {
        web.clear("passFieldInputSecond");
    }

}
