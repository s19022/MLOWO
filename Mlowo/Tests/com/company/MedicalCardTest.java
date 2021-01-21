package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.Assert.*;

public class MedicalCardTest {
    private MedicalCard m1;
    private MedicalCard m2;
    @Before
    public void before(){
        m1=new MedicalCard("1",LocalDateTime.of(2001, Month.FEBRUARY, 8, 13,45),"Bob");
        m2=new MedicalCard("2",LocalDateTime.of(2001, Month.FEBRUARY, 9, 13,45),"Gog");
    }

    @Test
    public void getowner() {
        String str="Bob";
        Assert.assertEquals(str,m1.getowner());
        Assert.assertNotEquals(str,m2.getowner());

    }
    @Test
    public void getLGT() {
        LocalDateTime lgt=LocalDateTime.of(2001, Month.FEBRUARY, 8, 13,45);
        Assert.assertEquals(lgt,m1.getLGT());
        Assert.assertNotEquals(lgt,m2.getLGT());

    }

    @Test
    public void getMedicalCardId() {
        String str=m1.getMedicalCardId();
        String str2=m2.getMedicalCardId();
        Assert.assertEquals(str,m1.getMedicalCardId());
        Assert.assertNotEquals("2",m1.getMedicalCardId());
        Assert.assertEquals(str2,m2.getMedicalCardId());
        Assert.assertNotEquals("1",m2.getMedicalCardId());
    }

}