package com.company.Exceptions;

public class InvalidCardException extends Exception {
    public InvalidCardException(String errorMessage) {
        super(errorMessage);
    }
}
