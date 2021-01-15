package com.company.HelpRecord;


import com.company.Client;
import com.company.FirstResponder;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.Assert.assertEquals;

public class HelpRecordTest {

    private HelpRecord helpRecord;
    private LocalDateTime time;
    private Client client;
    private FirstResponder firstResponder;

    @Before
    public void before(){
        time = LocalDateTime.of(2021, Month.JANUARY, 6, 23, 58);
        firstResponder = new FirstResponder("Joe", "Brown", LocalDateTime.of(2000, Month.MARCH, 22, 12, 34),
                "myEmail@mail.com",
                "PhoneNumber",
                "password");

        client = new Client(
                "firstName",
                "lastName",
                LocalDateTime.of(2001, Month.FEBRUARY, 8, 13,45),
                "myEmail@mail.com",
                "PhoneNumber",
                "password",
                "platform 9,75");


        helpRecord = new HelpRecord(Outcome.NEGATIVE, "loc1", time, client, firstResponder);

    }

    @Test
    public void getDateTime() {
        assertEquals(time, helpRecord.getTime());
    }

    @Test
    public void getLocation() {
        assertEquals("loc1", helpRecord.getLocation());
    }

    @Test
    public void getClient() {
        assertEquals(client, helpRecord.getClient());
    }

    @Test
    public void setOutcome() {
        helpRecord.setOutcome(null);
        assertEquals(Outcome.NEGATIVE, helpRecord.getOutcome());

        helpRecord.setOutcome(Outcome.POSITIVE);
        assertEquals(Outcome.POSITIVE, helpRecord.getOutcome());

    }

    @Test
    public void getFirstResponder() {
        assertEquals(firstResponder, helpRecord.getFirstResponder());
    }
}
