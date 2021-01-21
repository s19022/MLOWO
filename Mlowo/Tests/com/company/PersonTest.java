package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.Assert.*;

public class PersonTest {

private LocalDateTime date;
    private Person person;

    @Before
    public void before(){
        date = LocalDateTime.of(2001, Month.FEBRUARY, 8, 13,45);
        person = new FirstResponder("Adam", "Kowalewski", date,
                "kowalewski.adam@gmail.com", "+48582134658", "adamko04");
    }

    @Test
    public void getLastName() {
        Assert.assertEquals("Kowalewski", person.getLastName());
    }

    @Test
    public void getDateOfBirth() {
        Assert.assertEquals(date, person.getDateOfBirth());
    }

    @Test
    public void getEmail() {
        Assert.assertEquals("kowalewski.adam@gmail.com", person.getEmail());
    }

    @Test
    public void getPhoneNumber() {
        Assert.assertEquals("+48582134658", person.getPhoneNumber());
    }

    @Test
    public void getPassword() {
        Assert.assertEquals("adamko04", person.getPassword());
    }

    @Test
    public void getFirstName() {
        Assert.assertEquals("Adam", person.getFirstName());
    }
}