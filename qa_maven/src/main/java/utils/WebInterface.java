package utils;

import exception.ElementNoFound;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * @author alexander bakhin
 * @version 1.02
 * @info This interface describes the behavior of use of Web pages. Some
 * methods throw exception {@link exception.ElementNoFound}
 */

public interface WebInterface {

    void openPage(String url);

    void input(String inputLocator, String inputData) throws ElementNoFound;

    void clear(String locator) throws ElementNoFound;

    void clearAndInput(String inputLocator, String inputData) throws ElementNoFound;

    void clearAndInputAndClickEnter(String inputLocator, String inputData) throws ElementNoFound;

    void clickElement(String elementLocator) throws ElementNoFound;

    void clickButton(String buttonLocator) throws ElementNoFound;

    void clickLink(String linkLocator) throws ElementNoFound;

    void moveToElement(String moveToLocator) throws ElementNoFound;

    void moveToElementAndClick(String movToLocator, String clickToElement) throws ElementNoFound;

    void selectCheckBox(String checkBoxLocator) throws ElementNoFound;

    void selectCheckBox(String checkBoxLocator, boolean isCheckBoxSelect) throws ElementNoFound;

    boolean isElementPresent(String elementLocator) throws ElementNoFound;

    boolean isAlertPresentAndAccept();

    String getAlertText();

    void refreshPage();

    void waitElementNotVisible(String elementLocator, int timeoutSeconds) throws ElementNoFound;

    boolean waitForElementPresent(String elementLocator) throws ElementNoFound;

    boolean waitElementToBeClickable(String elementLocator) throws ElementNoFound;

    boolean waitForAjaxResponse(int timeoutSeconds);

    WebElement getElement(String elementLocator) throws ElementNoFound;

    List<WebElement> getElements(String elementLocator) throws ElementNoFound;

    void pressTAB(String locator) throws ElementNoFound;

    void pressSpace(String locator) throws ElementNoFound;

    void windowScroll();


}
