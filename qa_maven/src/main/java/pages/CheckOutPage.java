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

public class CheckOutPage {

    private static final Logger log = Logger.getLogger(CheckOutPage.class);

    private WebDriver driver;
    private WebElementsActions web;

    public CheckOutPage(WebDriver driver) {

        this.driver = driver;
        web = new WebElementsActions(driver);

    }

    /**
     * Press the button checkout (till kassan) in a page checkout {@see http://www.ellos.se/Checkout/Basket.aspx}
     *
     * @throws ElementNoSuch {@link WebElementsActions#moveToElementAndClick(String, String)}
     * @throws IOException   {@link ScreenShot#screenShot(WebDriver, String, String, String)}
     */
    public void pressButtonCheckOut() {

        try {

            web.windowScroll();
            web.moveToElementAndClick("buttonCheckout", "buttonCheckout");

            screenShot("pressButtonCheckOut");


        } catch (IOException | ElementNoSuch e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    /**
     * Input email address in field on confirm register page
     * {@see https://www.ellos.se/LoginAndRegistration/RegisterCustomer}
     *
     * @throws IOException   {@link ScreenShot#screenShot(WebDriver, String, String, String)}
     * @throws ElementNoSuch {@link WebElementsActions#input(String, String)}
     * @throws ElementNoSuch {@link WebElementsActions#moveToElementAndClick(String, String)}
     */
    public void inputEmail(String email) throws ElementNoSuch {

        web.moveToElementAndClick("registerCustomerEmailField", "registerCustomerEmailField");
        web.input("registerCustomerEmailField", email);

        try {

            screenShot("inputEmail");

        } catch (IOException e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }


    }

    /**
     * Input repeat email address in field on confirm register page
     * {@see https://www.ellos.se/LoginAndRegistration/RegisterCustomer}
     *
     * @throws IOException   {@link ScreenShot#screenShot(WebDriver, String, String, String)}
     * @throws ElementNoSuch {@link WebElementsActions#input(String, String)}
     * @throws ElementNoSuch {@link WebElementsActions#moveToElementAndClick(String, String)}
     */
    public void inputEmailRepeat(String email) throws ElementNoSuch {

        web.moveToElementAndClick("registerCustomerEmailFieldConfirm", "registerCustomerEmailFieldConfirm");
        web.input("registerCustomerEmailFieldConfirm", email);

        try {

            screenShot("inputEmail");

        } catch (IOException e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }


    }

    /**
     * Input password in field on confirm register page
     * {@see https://www.ellos.se/LoginAndRegistration/RegisterCustomer}
     *
     * @throws IOException   {@link ScreenShot#screenShot(WebDriver, String, String, String)}
     * @throws ElementNoSuch {@link WebElementsActions#input(String, String)}
     * @throws ElementNoSuch {@link WebElementsActions#moveToElementAndClick(String, String)}
     */
    public void inputPassword(String password) throws ElementNoSuch {

        web.moveToElementAndClick("registerCustomerPassFieldInputFirst", "registerCustomerPassFieldInputFirst");
        web.input("registerCustomerPassFieldInputSecond", password);

        try {

            screenShot("inputPassword");

        } catch (IOException e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    /**
     * Input repeat password in field on confirm register page
     * {@see https://www.ellos.se/LoginAndRegistration/RegisterCustomer}
     *
     * @throws IOException   {@link ScreenShot#screenShot(WebDriver, String, String, String)}
     * @throws ElementNoSuch {@link WebElementsActions#input(String, String)}
     * @throws ElementNoSuch {@link WebElementsActions#moveToElementAndClick(String, String)}
     */
    public void inputPasswordRepeat(String password) throws ElementNoSuch {

        web.moveToElementAndClick("registerCustomerPassFieldInputFieldConfirmFirst",
                "registerCustomerPassFieldInputFieldConfirmFirst");
        web.input("registerCustomerPassFieldInputFieldConfirmSecond", password);

        try {

            screenShot("inputPassword");

        } catch (IOException e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    /**
     * Input first name in field on confirm register page
     * {@see https://www.ellos.se/LoginAndRegistration/RegisterCustomer}
     *
     * @throws IOException   {@link ScreenShot#screenShot(WebDriver, String, String, String)}
     * @throws ElementNoSuch {@link WebElementsActions#input(String, String)}
     * @throws ElementNoSuch {@link WebElementsActions#moveToElementAndClick(String, String)}
     */
    public void inputFirstName(String name) throws ElementNoSuch {

        try {

            web.windowScroll();
            web.moveToElementAndClick("registerCustomerFieldFirstName", "registerCustomerFieldFirstName");
            web.input("registerCustomerFieldFirstName", name);

            screenShot("inputFirstName");

        } catch (IOException e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    /**
     * Input last name in field on confirm register page
     * {@see https://www.ellos.se/LoginAndRegistration/RegisterCustomer}
     *
     * @throws IOException   {@link ScreenShot#screenShot(WebDriver, String, String, String)}
     * @throws ElementNoSuch {@link WebElementsActions#input(String, String)}
     * @throws ElementNoSuch {@link WebElementsActions#moveToElementAndClick(String, String)}
     */
    public void inputLastName(String name) throws ElementNoSuch {

        try {

            web.windowScroll();
            web.moveToElementAndClick("registerCustomerFieldLastName", "registerCustomerFieldLastName");
            web.input("registerCustomerFieldLastName", name);

            screenShot("inputLastName");

        } catch (IOException e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    /**
     * Input c/o address in field on confirm register page
     * {@see https://www.ellos.se/LoginAndRegistration/RegisterCustomer}
     *
     * @throws IOException   {@link ScreenShot#screenShot(WebDriver, String, String, String)}
     * @throws ElementNoSuch {@link WebElementsActions#input(String, String)}
     * @throws ElementNoSuch {@link WebElementsActions#moveToElementAndClick(String, String)}
     */
    public void input_CO_address(String address) throws ElementNoSuch {

        try {

            web.moveToElementAndClick("registerCustomerFieldCOAddress", "registerCustomerFieldCOAddress");
            web.input("registerCustomerFieldCOAddress", address);

            screenShot("inputLastName");

        } catch (IOException e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    /**
     * Input address in field on confirm register page
     * {@see https://www.ellos.se/LoginAndRegistration/RegisterCustomer}
     *
     * @throws IOException   {@link ScreenShot#screenShot(WebDriver, String, String, String)}
     * @throws ElementNoSuch {@link WebElementsActions#input(String, String)}
     * @throws ElementNoSuch {@link WebElementsActions#moveToElementAndClick(String, String)}
     */
    public void inputAddress(String address) throws ElementNoSuch {

        try {

            web.moveToElementAndClick("registerCustomerFieldAddress", "registerCustomerFieldAddress");
            web.input("registerCustomerFieldAddress", address);

            screenShot("inputLastName");

        } catch (IOException e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    /**
     * Input zip code in field on confirm register page
     * {@see https://www.ellos.se/LoginAndRegistration/RegisterCustomer}
     *
     * @throws IOException   {@link ScreenShot#screenShot(WebDriver, String, String, String)}
     * @throws ElementNoSuch {@link WebElementsActions#input(String, String)}
     * @throws ElementNoSuch {@link WebElementsActions#moveToElementAndClick(String, String)}
     */
    public void inputZipCode(String address) throws ElementNoSuch {

        try {

            web.windowScroll();
            web.moveToElementAndClick("registerCustomerFieldPostCode", "registerCustomerFieldPostCode");
            web.input("registerCustomerFieldPostCode", address);

            screenShot("inputLastName");

        } catch (IOException e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    /**
     * Input ciy in field on confirm register page
     * {@see https://www.ellos.se/LoginAndRegistration/RegisterCustomer}
     *
     * @throws IOException   {@link ScreenShot#screenShot(WebDriver, String, String, String)}
     * @throws ElementNoSuch {@link WebElementsActions#input(String, String)}
     * @throws ElementNoSuch {@link WebElementsActions#moveToElementAndClick(String, String)}
     */
    public void inputCity(String city) throws ElementNoSuch {

        try {

            web.windowScroll();
            web.moveToElementAndClick("registerCustomerFieldCity", "registerCustomerFieldCity");
            web.input("registerCustomerFieldCity", city);

            screenShot("inputLastName");

        } catch (IOException e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    /**
     * Input mobile phone in field on confirm register page
     * {@see https://www.ellos.se/LoginAndRegistration/RegisterCustomer}
     *
     * @throws IOException   {@link ScreenShot#screenShot(WebDriver, String, String, String)}
     * @throws ElementNoSuch {@link WebElementsActions#input(String, String)}
     * @throws ElementNoSuch {@link WebElementsActions#moveToElementAndClick(String, String)}
     */
    public void inputMobile(String phone) throws ElementNoSuch {

        // TODO

    }

    /**
     * Private method for made screenshot page
     *
     * @param fileName input name screenshot file
     * @throws IOException {@link FileUtils#copyFile(File, OutputStream)}
     */
    private void screenShot(String fileName) throws IOException {

        ScreenShot.screenShot(driver,
                "/media/alexander/HDD/Workspace/Projects/QA/screens/checkout/",
                fileName, ".png");

    }

}
