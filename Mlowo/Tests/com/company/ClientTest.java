package com.company;


import com.company.Subscription.Subscription;
import com.company.Subscription.SubscriptionInitializationException;
import com.company.Subscription.TypeOfSubscription;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

import static junit.framework.TestCase.*;

public class ClientTest {

    private Client c1;
    private Client c2;

    private LocalDateTime c1BirthDate;
    private LocalDateTime c2BirthDate;

    private Bracelet b1;
    private Bracelet b2;

    private Subscription s1;
    private Subscription s2;

    @Before
    public void setUp(){
        b1 = new Bracelet(true, new Color(200, 255, 255));
        b2 = new Bracelet(true, new Color(200, 255, 255));

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

        c2.setBlocked(true);

        try{
            s1 = Subscription.getInstance(TypeOfSubscription.TYPE1, 150.08,
                    LocalDateTime.of(2021, Month.JANUARY, 29, 0, 0),
                    LocalDateTime.of(2021, Month.FEBRUARY, 26, 0, 0)
            );

            s2 = Subscription.getInstance(TypeOfSubscription.TYPE2, 199.99,
                    LocalDateTime.of(2021, Month.JANUARY, 1, 0, 0),
                    LocalDateTime.of(2021, Month.FEBRUARY, 6, 0, 0)
            );
        }catch (SubscriptionInitializationException ex){
            fail();
        }
    }

    @Test
    public void getHomeAddress() {
        assertEquals("platform 9,75", c1.getHomeAddress());
        assertEquals("Baker 221B", c2.getHomeAddress());
    }

    @Test
    public void isBlocked() {
       assertFalse(c1.isBlocked());
       assertTrue(c2.isBlocked());
    }

    @Test
    public void setBlocked() {
        assertFalse(c1.isBlocked());
        c1.setBlocked(false);
        assertFalse(c1.isBlocked());

        c1.setBlocked(true);
        assertTrue(c1.isBlocked());

    }

    @Test
    public void getBracelets() {
        c1.addBracelet(b1);
        assertEquals(Arrays.asList(b1), c1.getBracelets());
        c1.addBracelet(b1);
        assertEquals(Arrays.asList(b1), c1.getBracelets());

        c2.addBracelet(b1);
        assertEquals(0, c2.getBracelets().size());

        c2.addBracelet(b2);
        assertEquals(Arrays.asList(b2), c2.getBracelets());

    }

    @Test
    public void addBracelet() {
        getBracelets();
    }

    @Test
    public void addSubscription() {
        assertTrue(c1.addSubscription(s1));

        assertTrue(c1.addSubscription(s1));

        assertFalse(c2.addSubscription(s1));

        assertTrue(c2.addSubscription(s2));

    }
}
