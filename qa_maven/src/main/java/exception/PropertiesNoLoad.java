package exception;

import java.io.IOException;

public class PropertiesNoLoad extends IOException {

    private static final String EXCEPTION_NAME = "PropertiesNoLoadException: ";

    public PropertiesNoLoad(String message) {
        super(String.format(EXCEPTION_NAME + "< %s >", message));
    }
}
