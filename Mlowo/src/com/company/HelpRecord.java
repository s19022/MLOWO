package com.company;

import java.sql.Time;
import java.util.Date;

public class HelpRecord {
    private Date date;
    private Time time;
    private boolean outcome;
    private String location;
    public HelpRecord(Date date, Time time, boolean outcome, String location) {
        this.date = date;
        this.time = time;
        this.outcome = outcome;
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public Time getTime() {
        return time;
    }

    public boolean isOutcome() {
        return outcome;
    }

    public String getLocation() {
        return location;
    }
}
