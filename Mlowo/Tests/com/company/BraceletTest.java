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

public class BraceletTest {

    private Client c1;
    private Client c2;

    private LocalDateTime c1BirthDate;
    private LocalDateTime c2BirthDate;

    private Subscription s1;
    private Subscription s2;

    private Bracelet b1;
    private  Bracelet b2;

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
    public void addClient() {
        assertEquals(true, b1.addClient(c1));
        assertEquals(false, b1.addClient(c1));
    }

    @Test
    public void braceletId()
    {
        assertFalse(b1.getBraceletId().equals(b2.getBraceletId()));
    }
}