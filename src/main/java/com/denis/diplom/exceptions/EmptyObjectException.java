package com.denis.diplom.exceptions;

public class EmptyObjectException extends EmptyException {
    public EmptyObjectException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyObjectException(Throwable cause) {
        super(cause);
    }

    public EmptyObjectException(String message) {
        super(message);
    }
}
