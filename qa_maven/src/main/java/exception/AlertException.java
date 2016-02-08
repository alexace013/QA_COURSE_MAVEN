package exception;

import org.openqa.selenium.NoAlertPresentException;

public class AlertException extends NoAlertPresentException {

    public AlertException(String message) {
        super(message);
    }

}
