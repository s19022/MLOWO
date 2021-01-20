package com.company.Exceptions;

public class BikeIsAlreadyLockedException extends Exception {
    public BikeIsAlreadyLockedException(String errorMessage) {
        super(errorMessage);
    }
}
