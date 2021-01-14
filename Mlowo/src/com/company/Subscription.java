package com.company;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.UUID;

public class Subscription {

    private final String subscriptionId;
    private TypeOfSubscription typeOfSubscription;
    private long price;
    private final LocalDateTime startDate;
    private LocalDateTime expireDate;
    private final Client client;

    private Subscription(TypeOfSubscription typeOfSubscription, long price, LocalDateTime startDate, LocalDateTime expireDate, Client client) {
        subscriptionId = UUID.randomUUID().toString();
        this.typeOfSubscription = typeOfSubscription;
        this.startDate = startDate;
        this.expireDate = expireDate;
        this.client = client;
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
        if (expireDate == null || expireDate.isBefore(startDate)) return;
        this.expireDate = expireDate;
    }

    public void checkStatus(){}

    public boolean isExpired(){
        return LocalDateTime.now().isEqual(expireDate) || LocalDateTime.now().isAfter(expireDate);
    }

    public static Subscription getInstance(TypeOfSubscription typeOfSubscription, double price,
                                           LocalDateTime startDate, LocalDateTime expireDate, Client client) throws SubscriptionInitializationException{
        if (startDate == null) throw new SubscriptionInitializationException("start date is null");
        if (expireDate == null) throw new SubscriptionInitializationException("expire date is null");
        if (expireDate.isBefore(startDate)) throw new SubscriptionInitializationException("expire date is smaller than start date");
        if (price < 0) throw new SubscriptionInitializationException("price should be a non-negative number");
        if (typeOfSubscription == null) throw new SubscriptionInitializationException("type of subscription is null");
        if (client == null) throw new SubscriptionInitializationException("Client is null");



        return new Subscription(typeOfSubscription, (long)(price * 100), startDate, expireDate, client);
    }
}
