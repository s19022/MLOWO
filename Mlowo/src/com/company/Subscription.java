package com.company;

import java.util.Date;

public class Subscription {
    private int subscriptionId;
    //String instead of Type
    private String typeOfSubscription;
    private double price;
    private boolean isExpired;
    private Date startDate;
    private Date expireDate;

    public Subscription(int subscriptionId, String typeOfSubscription, double price, boolean isExpired, Date startDate, Date expireDate) {
        this.subscriptionId = subscriptionId;
        this.typeOfSubscription = typeOfSubscription;
        this.price = price;
        this.isExpired = isExpired;
        this.startDate = startDate;
        this.expireDate = expireDate;
    }

    public void checkStatus(){}
    public int getSubscriptionId() {
        return subscriptionId;
    }

    public String getTypeOfSubscription() {
        return typeOfSubscription;
    }

    public double getPrice() {
        return price;
    }

    public boolean isExpired() {
        return isExpired;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }


}
