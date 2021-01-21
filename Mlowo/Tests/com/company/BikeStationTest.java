package com.company;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.company.Exceptions.BikeDoesNotExistException;
import com.company.Exceptions.BikeIsAlreadyLockedException;
import com.company.Exceptions.BikeIsAlreadyUnlockedException;
import com.company.Exceptions.InvalidCardException;
import com.company.Exceptions.LockIsAlreadyTakenException;



public class BikeStationTest {
	private MlowoBike  bike1;
	private MlowoBike  bike2;
	private MlowoBike  bike3;
	private BikeStation bstation;
	private BikeStation bstation2;
	private int maxnumber =15;
	private MlowoBike[] bikes;
	private MedicalCard card;
	
	 @Before
	    public void before() {
	       bstation = new BikeStation(maxnumber);
	       bstation2= new BikeStation(maxnumber);
	       bike1 = new MlowoBike();
	       bike2 = new MlowoBike();
	       bike3 = new MlowoBike();
	       bikes = new MlowoBike[15];
			bikes[0]= bike1;
			bikes[1]=bike2;
			bikes[2]=bike3;
			bstation.getBikes()[0]=bike1;
			bstation.getBikes()[1]=bike2;
			bstation.getBikes()[2]=bike3;
			card = new MedicalCard(LocalDateTime.of(2022, 01, 20, 15,56), new String("Maruf kyzy Nuraiza"));
	    }
	
	 @Test
	    public void unlock() throws BikeDoesNotExistException, BikeIsAlreadyUnlockedException, InvalidCardException {
		 bike1.setLockStatus(true);
		 bike2.setLockStatus(true);
		 bike3.setLockStatus(true);
		 bstation.unlock(0,card.getMedicalCardId());
		 bstation.unlock(1, card.getMedicalCardId());
		 bstation.unlock(2,  card.getMedicalCardId());
		 Assert.assertEquals(false, bike1.getLockStatus() );
		 Assert.assertEquals(false, bike2.getLockStatus());
		Assert.assertEquals(false, bike3.getLockStatus());
	    }
	 @Test
	    public void lock() throws BikeDoesNotExistException, BikeIsAlreadyUnlockedException, InvalidCardException, LockIsAlreadyTakenException, BikeIsAlreadyLockedException {
		 bike1.setLockStatus(false);
		 bike2.setLockStatus(false);
		 bike3.setLockStatus(false);
		 bstation2.lock(0,bike1);
		 bstation2.lock(1, bike2);
		 bstation2.lock(2,  bike3);
		 Assert.assertEquals(true, bike1.getLockStatus() );
		 Assert.assertEquals(true, bike2.getLockStatus());
		Assert.assertEquals(true, bike3.getLockStatus());
	    }
	 @Test
	    public void setBikes() {
		bstation2.setBikes(bikes);
		bstation.setBikes(bikes);
		 Assert.assertEquals(bikes, bstation.getBikes() );
		 Assert.assertEquals(bikes, bstation2.getBikes() );
	    } 
	
	 @Test
	    public void getBikes() {
		bstation2.setBikes(bikes);
		bstation.setBikes(bikes);
		 Assert.assertEquals(bikes, bstation.getBikes() );
		 Assert.assertEquals(bikes, bstation2.getBikes() );
	    } 


}
