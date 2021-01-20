package com.company.Exceptions;

public class BikeDoesNotExistException extends Exception {
    public BikeDoesNotExistException(String errorMessage) {
        super(errorMessage);
    }
}
