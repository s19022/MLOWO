package com.company;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MedicalCardTest {
    private MedicalCard m1;
    private MedicalCard m2;
    private LocalDateTime m1ExpirationDate;
    private LocalDateTime m2ExpirationDate;
    @Before
    public void before(){
        m1ExpirationDate = LocalDateTime.of(2001, Month.FEBRUARY, 8, 13,45);
        m2ExpirationDate = LocalDateTime.of(2001, Month.FEBRUARY, 9, 13,45);

        m1 = new MedicalCard(m1ExpirationDate,"Bob");
        m2 = new MedicalCard(m2ExpirationDate,"Gog");
    }

    @Test
    public void getOwner() {
        String str = "Bob";
        assertEquals(str,m1.getOwner());
        assertNotEquals(str,m2.getOwner());

    }
    @Test
    public void getExpDate() {
        assertEquals(m1ExpirationDate, m1.getExpirationDate());
        assertNotEquals(m1ExpirationDate, m2.getExpirationDate());

    }
}