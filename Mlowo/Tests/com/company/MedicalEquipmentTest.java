package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MedicalEquipmentTest {

    private MedicalEquipment equipment;
    @Before
    public void before() throws Exception {
        equipment = new MedicalEquipment(1, "Bayer");
    }

    @Test
    public void getEquipmentId() {
        assertEquals(1 ,equipment.getEquipmentId());
    }

    @Test
    public void getProducer() {
        assertEquals("Bayer" ,equipment.getProducer());
    }

    @Test
    public void setProducer() {
        equipment.setProducer("USP Zdrowie");
        assertEquals("USP Zdrowie" ,equipment.getProducer());
    }
}