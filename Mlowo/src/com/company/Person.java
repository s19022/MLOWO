package com.company;

import com.company.HelpRecord.HelpRecord;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

public abstract class Person {
    private final String personId;
    private String firstName;
    private String lastName;
    private LocalDateTime dateOfBirth;
    private String email;
    private String phoneNumber;
    private String password;

    private Set<HelpRecord> helpRecords = new HashSet<>();

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return personId.equals(person.personId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId);
    }

    public synchronized boolean addHelpRecord(HelpRecord helpRecord){
        return helpRecords.add(helpRecord);
    }
}
