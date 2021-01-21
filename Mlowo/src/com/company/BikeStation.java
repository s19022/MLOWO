package com.company;

import com.company.Exceptions.*;
import java.util.UUID;

public class BikeStation {
    private final String stationId;
    private MlowoBike[] bikes;

    public BikeStation(int maxNumberOfBikes) {
        this.stationId = UUID.randomUUID().toString();
        this.bikes = new MlowoBike[maxNumberOfBikes];
    }

    public void unlock(int lockNumber, MedicalCard medicalCard) throws BikeDoesNotExistException, BikeIsAlreadyUnlockedException, InvalidCardException {
        MlowoBike bike = bikes[lockNumber];
        if(bike == null)
            throw new BikeDoesNotExistException("There is no bike a lock number " + lockNumber);

        if (!bike.getLockStatus())
            throw new BikeIsAlreadyUnlockedException("Bike with ID: " + bike.getBikeId() + ", is already unlocked");

        if(!MedicalCard.contains(medicalCard))
            throw new InvalidCardException("The scanned card is invalid");

        bike.setLockStatus(false);
        bikes[lockNumber] = null;
    }

    public void lock(int lockNumber, MlowoBike bike) throws LockIsAlreadyTakenException, BikeIsAlreadyLockedException {
        if(bikes[lockNumber] != null)
            throw new LockIsAlreadyTakenException("A bike is already locked in lock number " + lockNumber);

        if (bike.getLockStatus())
            throw new BikeIsAlreadyLockedException("Bike with ID: " + bike.getBikeId() + ", is already locked");

        bike.setLockStatus(true);
        bikes[lockNumber] = bike;
    }
}
