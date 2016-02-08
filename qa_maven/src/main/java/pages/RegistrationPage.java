package pages;

import exception.ElementNoSuch;
import org.apache.log4j.Logger;
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

        try {

            web.clickElement("registrationEmailMain");
            web.clear("registrationEmailMain");
            web.input("registrationEmailMain", email);

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    public void clickAndInputEmailRepeatAndClickTAB(String email) {

        try {

            web.clickElement("registrationEmailRepeat");
            web.clear("registrationEmailRepeat");
            web.input("registrationEmailRepeat", email);
            web.pressTAB("registrationEmailRepeat");

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    public void clickAndInputPassMainAndClickTAB(String pass) {

        try {

            web.clickElement("registrationPassMain");
            web.clear("registrationPassMain");
            web.input("registrationPassMain", pass);
            web.pressTAB("registrationPassMain");

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    public void clickAndInputPassRepeat(String pass) {

        try {

            web.clickElement("registrationPassRepeat");
            web.clear("registrationPassRepeat");
            web.input("registrationPassRepeat", pass);

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    public void clickAndInputPassRepeatVVVVV(String pass) {

        try {

            web.clickElement("registrationPassRepeat");
            web.clear("registrationPassRepeat");
            web.clearAndInputAndClickEnter("registrationPassRepeat", pass);

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    public void windowScroll() {

        web.windowScroll();

    }

    public void clickCheckBox() {

        try {

            web.clickElement("checkBoxAccept");

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    public void clickButtonRegistration() {

        try {

            web.clickElement("buttonRegistration");

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    public void clickLogin() {

        try {

            web.clickLink("loginLink");

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    public void clickLogOut() {

        try {

            web.clickLink("logoutLink");

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    public boolean isRegistrationSuccessful() {

        try {

            if (web.isElementPresent("correctRegistration")) {

                return true;

            } else if (web.isElementPresent("buttonRegistration")) {

                return false;

            }

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

        return false;

    }

    public boolean isErrorPassPresent() {

        try {

            if (web.isElementPresent("errorRegPassFieldOne")) {

                return true;

            }

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

        return false;

    }

    public boolean isErrorJustOneField() {

        try {

            if (web.isElementPresent("errorRegJustFirstEmail")) {

                return true;

            }

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

        return false;

    }

    public boolean isErrorMessagePresent() {

        try {

            if (web.isElementPresent("errorRegMessage")) {

                return true;

            }

        } catch (ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

        return false;

    }

}
