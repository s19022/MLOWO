package com.company;

import java.awt.*;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here

        {
            Bracelet b1 = new Bracelet(true, new Color(200, 255, 255));
            Bracelet b2 = new Bracelet(true, new Color(200, 255, 255));
            Bracelet.showAllBracelets();

            Client c1 = new Client(
                    "firstName",
                    "lastName",
                    LocalDateTime.of(2001, Month.FEBRUARY, 8, 13,45),
                    "myEmail@mail.com",
                    "PhoneNumber",
                    "password",
                    "platform 9,75"
            );
            Client c2 = new Client(
                    "firstName",
                    "lastName",
                    LocalDateTime.of(2000, Month.MARCH, 22, 12, 34),
                    "myEmail@mail.com",
                    "PhoneNumber",
                    "password",
                    "Baker 221B"
            );

            c1.addBracelet(b1);
            c1.addBracelet(b1);
            c2.addBracelet(b1);
            c2.addBracelet(b2);
        }
    }
}
