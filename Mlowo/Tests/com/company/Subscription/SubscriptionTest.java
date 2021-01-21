package com.company.Subscription;

import com.company.Client;
import org.junit.Before;
import org.junit.Test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;

public class SubscriptionTest {

    Subscription type1;

    LocalDateTime type1ExpireDate;

    LocalDateTime type1StartDate;

    Client client1;
    Client client2;


    @Before
    public void before(){
        type1ExpireDate = LocalDateTime.of(2021, Month.JANUARY, 29, 0, 0);
        type1StartDate = LocalDateTime.of(2020, Month.DECEMBER, 29, 0, 0);
                client1 = new Client("John", "Doe", LocalDateTime.of(2001, 1, 1, 12, 34), "fake@email.com",
                "+380874715865", "somePassword", "anywhere");

        client2 = new Client("Jon", "Snow", LocalDateTime.of(1988, 3, 4, 8, 45), "jon.snow.@you.know.nothing",
                "+380874715866", "Ghost", "night's watch");
        try{
            type1 = Subscription.getInstance(TypeOfSubscription.TYPE1, 150.08,
                    type1StartDate,
                    type1ExpireDate
            );
        }catch (SubscriptionInitializationException ex){
            fail(ex.getMessage());
        }
    }

    @org.junit.Test
    public void getTypeOfSubscription() {
        assertEquals(TypeOfSubscription.TYPE1, type1.getTypeOfSubscription());
    }

    @org.junit.Test
    public void getPrice() {
        System.out.println(type1.getPrice());
        assertTrue(type1.getPrice() == 150.08);
    }

    @org.junit.Test
    public void setTypeOfSubscription() {
        type1.setTypeOfSubscription(null);
        assertEquals(TypeOfSubscription.TYPE1, type1.getTypeOfSubscription());

        type1.setTypeOfSubscription(TypeOfSubscription.TYPE2);
        assertEquals(TypeOfSubscription.TYPE2, type1.getTypeOfSubscription());

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
        assertEquals(LocalDateTime.of(2020, Month.DECEMBER, 29, 0, 0), type1.getStartDate());
    }

    @org.junit.Test
    public void setExpireDate() {
        type1.setExpireDate(null);
        assertEquals(LocalDateTime.of(2021, Month.JANUARY, 29, 0, 0), type1.getExpireDate());

        // expire date is before start date
        LocalDateTime beforeStartDate = LocalDateTime.of(2020, Month.NOVEMBER, 29, 0, 0);

        type1.setExpireDate(beforeStartDate);
        assertEquals(type1ExpireDate, type1.getExpireDate());

        LocalDateTime newDate = LocalDateTime.of(2021, Month.FEBRUARY, 26, 0, 0);

        type1.setExpireDate(newDate);
        assertEquals(newDate, type1.getExpireDate());
    }

    @org.junit.Test
    public void setClient() {
        assertTrue(client1.addSubscription(type1));
        assertTrue(client1.addSubscription(type1));

        assertFalse(client2.addSubscription(type1));
    }

    @org.junit.Test
    public void checkStatus() {
    }

    @org.junit.Test
    public void isExpired() {
        assertFalse(type1.isExpired());

        type1.setExpireDate(LocalDateTime.now().minusDays(2));
        assertTrue(type1.isExpired());
    }

    @Test
    public void getMembershipPeriod(){
        assertEquals(Duration.between(type1StartDate, LocalDateTime.now()).toDays(), type1.getMembershipPeriod());
    }
}
