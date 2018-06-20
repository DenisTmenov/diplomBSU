package com.denis.diplom.exceptions;

public class AircraftEmptyException extends RuntimeException {
    public AircraftEmptyException() {
        super();
    }

    public AircraftEmptyException(String message) {
        super(message);
    }

    public AircraftEmptyException(String message, Throwable cause) {
        super(message, cause);
    }
}
