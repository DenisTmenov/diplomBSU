package com.denis.diplom.exceptions;

public class IOWriteException extends IOWorkerException {
    public IOWriteException() {
        super();
    }

    public IOWriteException(String message) {
        super(message);
    }

    public IOWriteException(String message, Throwable cause) {
        super(message, cause);
    }
}
