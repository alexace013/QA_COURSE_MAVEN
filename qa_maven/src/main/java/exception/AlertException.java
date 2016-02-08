package exception;

import org.openqa.selenium.NoAlertPresentException;

public class AlertException extends NoAlertPresentException {

    private static final String EXCEPTION_NAME = "NoAlertPresentException: ";

    public AlertException(String message) {
        super(String.format(EXCEPTION_NAME, message));
    }

}
