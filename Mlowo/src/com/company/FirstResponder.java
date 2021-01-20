package com.company;

import java.time.LocalDateTime;

public class FirstResponder extends Person {
    private String pesel;
    private MedicalCard medicalCardNumber;
    public FirstResponder(String firstName, String lastName, LocalDateTime dateOfBirth, String email, String phoneNumber, String password) {
        super(firstName, lastName, dateOfBirth, email, phoneNumber, password);
    }
    public void findClosetToClient(){}
}
