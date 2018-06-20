package com.denis.diplom.exceptions;

public class ReadFileException extends IOReadException {
    public ReadFileException() {
    }

    public ReadFileException(String message) {
        super(message);
    }

    public ReadFileException(String message, Throwable cause) {
        super(message, cause);
    }
}
