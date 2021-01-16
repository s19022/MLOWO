package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MedicalKitTest {

    private MedicalKit medicalKit;
    private MedicalEquipment equipment1;
    private MedicalEquipment equipment2;

    @Before
    public void before() throws Exception {

        medicalKit=new MedicalKit(1);
        equipment1=new MedicalEquipment(1,"BAND-AID");
        equipment2=new MedicalEquipment(2,"USP Zdrowie");
    }

    @Test
    public void addMedicalEquipment() {

        assertEquals(false,medicalKit.addMedicalEquipment(equipment1));

        assertEquals(true,medicalKit.addMedicalEquipment(equipment2));

    }

    @Test
    public void getKitId() {
        assertEquals(1 ,medicalKit.getKitId());
    }


    @Test
    public void getEquipments() {

        addMedicalEquipment();
        assertEquals(1, medicalKit.getEquipments().get(0).getEquipmentId());
        assertEquals(2, medicalKit.getEquipments().get(1).getEquipmentId());
        assertEquals(2, medicalKit.getEquipments().size());
    }
}