package com.company;

import java.time.LocalDateTime;
import java.util.UUID;

public class Subscription {
    private final String subscriptionId;
    private TypeOfSubscription typeOfSubscription;
    private long price;
    private final LocalDateTime startDate;
    private LocalDateTime expireDate;

    public Subscription(TypeOfSubscription typeOfSubscription, double price, LocalDateTime startDate, LocalDateTime expireDate) {
        subscriptionId = UUID.randomUUID().toString();
        this.typeOfSubscription = typeOfSubscription;
        this.price = (long)(price * 100);
        this.startDate = startDate;
        this.expireDate = expireDate;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public TypeOfSubscription getTypeOfSubscription() {
        return typeOfSubscription;
    }

    public double getPrice() {
        return ((double)price) / 100;
    }

    public void setTypeOfSubscription(TypeOfSubscription typeOfSubscription) {
        if (typeOfSubscription == null) return;
        this.typeOfSubscription = typeOfSubscription;
    }

    public void setPrice(double price) {
        if (price < 0) return;
        this.price = (long)(price * 100);
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDateTime expireDate) {
        if (expireDate.isBefore(startDate)) return;
        this.expireDate = expireDate;
    }

    public void checkStatus(){}

    public boolean isExpired(){
        return LocalDateTime.now().isEqual(expireDate) || LocalDateTime.now().isAfter(expireDate);
    }
}
