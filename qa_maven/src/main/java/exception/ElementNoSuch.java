package exception;

import java.util.NoSuchElementException;

public class ElementNoSuch extends NoSuchElementException {

    private static final String EXCEPTION_NAME = "ElementNoFoundException: ";

    public ElementNoSuch(String message) {

        super(String.format(EXCEPTION_NAME + "< %s >", message));

    }


}
