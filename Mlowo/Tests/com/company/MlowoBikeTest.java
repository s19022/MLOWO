package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MlowoBikeTest {
    private MedicalKit medicalKit1;
    private MedicalKit medicalKit2;
    private MedicalKit medicalKit3;
    private MlowoBike bike1;
    private MlowoBike bike2;
    private MlowoBike bike3;

    @Before
    public void before() throws Exception {
        medicalKit1 = new MedicalKit(1);
        medicalKit2 = new MedicalKit(2);
        medicalKit3 = new MedicalKit(3);
        bike1 = new MlowoBike();
        bike2 = new MlowoBike();
        bike3 = new MlowoBike();
        setMedicalKit();
    }

    @Test
    public void getMedicalKit() {
        Assert.assertEquals(medicalKit1,bike1.getMedicalKit());
        Assert.assertNotEquals(medicalKit2,bike1.getMedicalKit());
        Assert.assertEquals(medicalKit3,bike3.getMedicalKit());
    }

    @Test
    public void setMedicalKit() {
        bike1.setMedicalKit(medicalKit1);
        bike2.setMedicalKit(medicalKit2);
        bike3.setMedicalKit(medicalKit3);
        Assert.assertEquals(medicalKit1,bike1.getMedicalKit());
        Assert.assertNotEquals(medicalKit2,bike1.getMedicalKit());
        Assert.assertEquals(medicalKit3,bike3.getMedicalKit());
    }
}
