package com.company;

import static org.junit.jupiter.api.Assertions.*;
import com.company.Person;
import org.junit.Assert;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

class PersonTest
{
    @org.junit.jupiter.api.Test
    void getLastName() {
        date = LocalDateTime.of(2001, Month.FEBRUARY, 8, 13,45);
        Person person = new FirstResponder("Adam", "Kowalewski", date, "kowalewski.adam@gmail.com", "+48582134658", "adamko04");
        Assert.assertEquals("Kowalewski", person.getLastName());
    }

    @org.junit.jupiter.api.Test
    void getDateOfBirth() {
        date = LocalDateTime.of(2001, Month.FEBRUARY, 8, 13,45);
        Person person = new FirstResponder("Adam", "Kowalewski", date, "kowalewski.adam@gmail.com", "+48582134658", "adamko04");
        Assert.assertEquals(date, person.getDateOfBirth());
    }

    @org.junit.jupiter.api.Test
    void getEmail() {
        date = LocalDateTime.of(2001, Month.FEBRUARY, 8, 13,45);
        Person person = new FirstResponder("Adam", "Kowalewski", date, "kowalewski.adam@gmail.com", "+48582134658", "adamko04");
        Assert.assertEquals("kowalewski.adam@gmail.com", person.getEmail());
    }

    @org.junit.jupiter.api.Test
    void getPhoneNumber() {
        date = LocalDateTime.of(2001, Month.FEBRUARY, 8, 13,45);
        Person person = new FirstResponder("Adam", "Kowalewski", date, "kowalewski.adam@gmail.com", "+48582134658", "adamko04");
        Assert.assertEquals("+48582134658", person.getPhoneNumber());
    }

    @org.junit.jupiter.api.Test
    void getPassword() {
        date = LocalDateTime.of(2001, Month.FEBRUARY, 8, 13,45);
        Person person = new FirstResponder("Adam", "Kowalewski", date, "kowalewski.adam@gmail.com", "+48582134658", "adamko04");
        Assert.assertEquals("adamko04", person.getPassword());
    }

    @org.junit.jupiter.api.Test
    void getFirstName() {
        date = LocalDateTime.of(2001, Month.FEBRUARY, 8, 13,45);
        Person person = new FirstResponder("Adam", "Kowalewski", date, "kowalewski.adam@gmail.com", "+48582134658", "adamko04");
        Assert.assertEquals("Adam", person.getFirstName());
    }
}