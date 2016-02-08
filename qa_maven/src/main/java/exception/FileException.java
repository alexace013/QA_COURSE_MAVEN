package exception;

import java.io.FileNotFoundException;

public class FileException extends FileNotFoundException {

    private static final String EXCEPTION_NAME = "FileException: ";

    public FileException(String message) {

        super(String.format(EXCEPTION_NAME + "< %s >", message));

    }


}
