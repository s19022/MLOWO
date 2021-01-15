package com.company.Subscription;

import org.junit.Assert;
import org.junit.Before;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;

public class SubscriptionTest {

    Subscription type1;

    @Before
    public void before(){
        try{
            type1 = Subscription.getInstance(TypeOfSubscription.TYPE1, 150.08,
                    LocalDateTime.of(2020, Month.DECEMBER, 29, 0, 0),
                    LocalDateTime.of(2021, Month.JANUARY, 29, 0, 0)
            );
        }catch (SubscriptionInitializationException ex){
            fail(ex.getMessage());
        }
    }

    @org.junit.Test
    public void getTypeOfSubscription() {
        assertEquals(type1.getTypeOfSubscription(), TypeOfSubscription.TYPE1);
    }

    @org.junit.Test
    public void getPrice() {
        System.out.println(type1.getPrice());
        assertTrue(type1.getPrice() == 150.08);
    }

    @org.junit.Test
    public void setTypeOfSubscription() {
        type1.setTypeOfSubscription(null);
        assertEquals(type1.getTypeOfSubscription(), TypeOfSubscription.TYPE1);

        type1.setTypeOfSubscription(TypeOfSubscription.TYPE2);
        assertEquals(type1.getTypeOfSubscription(), TypeOfSubscription.TYPE2);

    }

    @org.junit.Test
    public void setPrice() {
        type1.setPrice(-3.5);
        assertTrue(type1.getPrice()== 150.08);
        type1.setPrice(166.75666666);
        assertTrue(type1.getPrice() == 166.75);
    }

    @org.junit.Test
    public void getStartDate() {
    }

    @org.junit.Test
    public void getExpireDate() {
    }

    @org.junit.Test
    public void setExpireDate() {
    }

    @org.junit.Test
    public void setClient() {
    }

    @org.junit.Test
    public void checkStatus() {
    }

    @org.junit.Test
    public void isExpired() {
    }

    @org.junit.Test
    public void getInstance() {
    }
}
