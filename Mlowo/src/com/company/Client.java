package com.company;

import java.util.Date;

public class Client extends Person {
    private String homeAddress;
    private boolean isBlocked;
    public Client(String firstName, String lastName, Date dateOfBirth, String email, String phoneNumber, String password) {
        super(firstName, lastName, dateOfBirth, email, phoneNumber, password);
    }
    public void pressHelpMeButton(){}
    public void bookHealthTest(){}
}
