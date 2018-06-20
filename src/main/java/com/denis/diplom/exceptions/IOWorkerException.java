package com.denis.diplom.exceptions;

public class IOWorkerException extends RuntimeException {
    public IOWorkerException() {
        super();
    }

    public IOWorkerException(String message) {
        super(message);
    }

    public IOWorkerException(String message, Throwable cause) {
        super(message, cause);
    }
}
