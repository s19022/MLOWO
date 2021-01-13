package com.company;

import java.util.Date;

public class FirstResponder extends Person {
    private String pesel;
    private int medicalCardNumber;
    public FirstResponder(String firstName, String lastName, Date dateOfBirth, String email, String phoneNumber, String password) {
        super(firstName, lastName, dateOfBirth, email, phoneNumber, password);
    }
    public void findClosetToClient(){}
}
