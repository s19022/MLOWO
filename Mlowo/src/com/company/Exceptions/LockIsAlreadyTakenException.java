package com.company.Exceptions;

public class LockIsAlreadyTakenException extends Exception {
    public LockIsAlreadyTakenException(String errorMessage) {
        super(errorMessage);
    }
}
