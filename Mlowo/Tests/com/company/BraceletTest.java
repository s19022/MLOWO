package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.Assert.*;

public class BraceletTest {
    private Client c1;
    private Client c2;
    private LocalDateTime c1BirthDate;
    private LocalDateTime c2BirthDate;
    private Bracelet b1;
    private Bracelet b2;
    @Before
    public void before(){
        b1 = new Bracelet(true, Color.RED);
        b2 = new Bracelet(true, Color.BLACK);

        c1BirthDate = LocalDateTime.of(2001, Month.FEBRUARY, 8, 13,45);
        c2BirthDate = LocalDateTime.of(2000, Month.MARCH, 22, 12, 34);

        c1 = new Client(
                "firstName",
                "lastName",
                c1BirthDate,
                "myEmail@mail.com",
                "PhoneNumber",
                "password",
                "platform 9,75"
        );

        c2 = new Client(
                "firstName",
                "lastName",
                c2BirthDate,
                "myEmail@mail.com",
                "PhoneNumber",
                "password",
                "Baker 221B"
        );
    }

    @Test
    public void addClient() {
        Assert.assertTrue(b1.addClient(c1));
        Assert.assertFalse(b1.addClient(c2));

        Assert.assertTrue(b2.addClient(c2));
        Assert.assertFalse(b2.addClient(c1));
    }

    @Test
    public void getBraceletId() {
        String id2=b2.getBraceletId();
        Assert.assertNotEquals(id2,b1.getBraceletId());
        Assert.assertEquals(id2,b2.getBraceletId());
    }

    @Test
    public void isActive() {
        setActive();
        Assert.assertFalse(b1.isActive());
        Assert.assertTrue(b2.isActive());

    }

    @Test
    public void setActive() {
        b1.setActive(false);
        Assert.assertFalse(b1.isActive());
        b2.setActive(true);
        Assert.assertTrue(b2.isActive());
    }


    @Test
    public void getColor() {
        Assert.assertEquals(Color.BLACK,b2.getColor());
        Assert.assertNotEquals(Color.GREEN,b1.getColor());
        Assert.assertEquals(Color.RED,b1.getColor());
        Assert.assertNotEquals(Color.GREEN,b2.getColor());
    }
}