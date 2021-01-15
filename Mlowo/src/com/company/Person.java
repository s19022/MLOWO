package com.company;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public abstract class Person {
    private final String personId;
    private String firstName;
    private String lastName;
    private LocalDateTime dateOfBirth;
    private String email;
    private String phoneNumber;
    private String password;

    public Person(String firstName, String lastName, LocalDateTime dateOfBirth, String email, String phoneNumber, String password) {
        personId = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }
}
