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

            web.moveToElementAndClick("buttonCheckout", "buttonCheckout");

            screenShot("pressButtonCheckOut");


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
                "/media/alexander/HDD/Workspace/Projects/QA/screens/checkout/",
                fileName, ".png");

    }

}
