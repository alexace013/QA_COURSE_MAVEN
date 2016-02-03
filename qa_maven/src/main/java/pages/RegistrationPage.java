package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import utils.WebElementsActions;

public class RegistrationPage {


    private final static Logger log = Logger.getLogger("log4j.rootLogger");
    private WebDriver driver;
    private WebElementsActions web;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        web = new WebElementsActions(driver);
    }

    public void clickAndInputEmailMain(String email) {
        web.click("registrationEmailMain");
        web.clear("registrationEmailMain");
        web.input("registrationEmailMain", email);
    }

    public void clickAndInputEmailRepeatAndClickTAB(String email) {
        web.click("registrationEmailRepeat");
        web.clear("registrationEmailRepeat");
        web.input("registrationEmailRepeat", email);
        web.clickTAB("registrationEmailRepeat");
    }

    public void clickAndInputPassMainAndClickTAB(String pass) {
        web.click("registrationPassMain");
        web.clear("registrationPassMain");
        web.input("registrationPassMain", pass);
        web.clickTAB("registrationPassMain");
    }

    public void clickAndInputPassRepeat(String pass) {
        web.click("registrationPassRepeat");
        web.clear("registrationPassRepeat");
        web.input("registrationPassRepeat", pass);
    }

    public void windowScroll() {
        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,100)", "");
    }

    public void clickCheckBox() {
        web.click("checkBoxAccept");
    }

    public void clickButtonRegistration() {
        web.click("buttonRegistration");
    }

    public void clickLogin() {
        web.click("logInLink");
    }

    public void clickLogOut() {
        web.click("logOutLink");
    }

    public boolean isRegistrationSuccessful() {

        if (web.isElementPresent("correctRegistration")) {
            return true;
        } else if (web.isElementPresent("buttonRegistration")) {
            return false;
        }

        return false;

    }

    public boolean isErrorPassPresent() {

        if (web.isElementPresent("errorRegPassFieldOne")) {
            return true;
        }

        return false;

    }

    public boolean isErrorJustOneField() {

        if (web.isElementPresent("errorRegJustFirstEmail")) {
            return true;
        }

        return false;

    }

    public boolean isErrorMessagePresent() {

        if (web.isElementPresent("errorRegMessage")) {
            return true;
        }

        return false;

    }

    public void clickTAB(String filed) {
        web.clickTAB(filed);
    }

}
