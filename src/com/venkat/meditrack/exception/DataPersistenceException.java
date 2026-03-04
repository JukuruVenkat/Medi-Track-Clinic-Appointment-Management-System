package com.venkat.meditrack.exception;

public class DataPersistenceException extends RuntimeException {

    public DataPersistenceException(String message, Throwable cause) {
        super(message, cause);
    }
}