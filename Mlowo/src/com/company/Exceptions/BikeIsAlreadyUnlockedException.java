package com.company.Exceptions;

public class BikeIsAlreadyUnlockedException extends Exception {
    public BikeIsAlreadyUnlockedException(String errorMessage) {
        super(errorMessage);
    }
}
