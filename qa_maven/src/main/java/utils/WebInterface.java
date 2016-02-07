package utils;

import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public interface WebInterface {

    void openPage(String url);

    void input(String inputLocator, String inputData) throws IOException;

    void clear(String locator) throws IOException;

    void clearAndInput(String inputLocator, String inputData) throws IOException;

    void clearAndInputAndClickEnter(String inputLocator, String inputData) throws IOException;

    void clickElement(String elementLocator) throws IOException;

    void clickButton(String buttonLocator) throws IOException;

    void clickLink(String linkLocator) throws IOException;
    void moveToElement(String moveToLocator) throws IOException;

    void moveToElementAndClick(String movToLocator, String clickToElement) throws IOException;

    void selectCheckBox(String checkBoxLocator) throws IOException;

    void selectCheckBox(String checkBoxLocator, boolean isCheckBoxSelect) throws IOException;

    boolean isElementPresent(String elementLocator) throws IOException;

    boolean isAlertPresentAndAccept();

    String getAlertText();

    void refreshPage();

    void waitElementNotVisible(String elementLocator, int timeoutSeconds) throws IOException;

    boolean waitForElementPresent(String elementLocator);

    boolean waitElementToBeClickable(String elementLocator);

    boolean waitForAjaxResponse(int timeoutSeconds);

    WebElement getElement(String elementLocator);

    List<WebElement> getElements(String elementLocator);

    void pressTAB(String locator) throws IOException;

    void pressSpace(String locator) throws IOException;

    void windowScroll();


}
