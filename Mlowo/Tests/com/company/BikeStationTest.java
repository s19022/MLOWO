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

import static org.junit.Assert.*;


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
	   	bstation2 = new BikeStation(maxnumber);
	   	bike1 = new MlowoBike();
	   	bike2 = new MlowoBike();
	   	bike3 = new MlowoBike();
	   	bikes = new MlowoBike[15];
	   	card = new MedicalCard(LocalDateTime.of(2022, 01, 20, 15,56), new String("Maruf kyzy Nuraiza"));
	}
	
	@Test
	public void lock() throws BikeDoesNotExistException, BikeIsAlreadyUnlockedException,
			InvalidCardException {

	 	try{
	 		bstation.lock(0, bike1);
			bstation.lock(1, bike2);
			bstation.lock(2, bike3);
		}catch (Exception ex){
	 		fail(ex.getMessage());
		}


		bstation.unlock(0,card);
	 	bstation.unlock(1, card);

	 	assertFalse(bike1.getLockStatus() );
		assertFalse(bike2.getLockStatus());
		assertTrue(bike3.getLockStatus());
	 }
	 @Test
	    public void unlock() throws LockIsAlreadyTakenException, BikeIsAlreadyLockedException {
		 bstation2.lock(0,bike1);
		 bstation2.lock(1, bike2);
		 bstation2.lock(2,  bike3);
		 assertTrue(bike1.getLockStatus() );
		 assertTrue(bike2.getLockStatus());
		assertTrue( bike3.getLockStatus());
	    }
}
