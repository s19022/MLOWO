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

    public void unlock(int lockNumber, String medicalCardId) throws BikeDoesNotExistException, BikeIsAlreadyUnlockedException, InvalidCardException {
        if(bikes[lockNumber] != null) {
            MlowoBike bike = bikes[lockNumber];
            if (bike.getLockStatus()) {
                if(MedicalCard.medicalCards.containsKey(medicalCardId)) {
                    bike.setLockStatus(false);
                    bikes[lockNumber] = null;
                }else{
                    throw new InvalidCardException("The scanned card is invalid");
                }
            }else{
                throw new BikeIsAlreadyUnlockedException("Bike with ID: " + bike.getBikeId() + ", is already unlocked");
            }

        }else{
            throw new BikeDoesNotExistException("There is no bike a lock number " + lockNumber);
        }
    }

    public void lock(int lockNumber, MlowoBike bike) throws LockIsAlreadyTakenException, BikeIsAlreadyLockedException {
        if(bikes[lockNumber] == null) {
            if (!bike.getLockStatus()) {
                bike.setLockStatus(true);
                bikes[lockNumber] = bike;
            }else{
                throw new BikeIsAlreadyLockedException("Bike with ID: " + bike.getBikeId() + ", is already locked");
            }

        }else{
            throw new LockIsAlreadyTakenException("A bike is already locked in lock number " + lockNumber);
        }
    }
}
