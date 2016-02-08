package exception;

import java.io.IOException;

public class ElementNoFound extends IOException{

    private static final String EXCEPTION_NAME = "ElementNoFoundException: ";

    public ElementNoFound (String message) {

        super(String.format(EXCEPTION_NAME, message));

    }



}
