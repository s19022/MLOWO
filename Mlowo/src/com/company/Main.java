package com.company;

import java.awt.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here

        {
            Bracelet b1 = new Bracelet(true, new Color(200, 255, 255));
            Bracelet b2 = new Bracelet(true, new Color(200, 255, 255));
            Bracelet.showAllBracelets();

            Client c1 = new Client(
                    "firstNmae",
                    "lastName",
                    new Date(),
                    "myEmail@mail.com",
                    "PhoneNumber",
                    "password"
            );
            Client c2 = new Client(
                    "firstNmae",
                    "lastName",
                    new Date(),
                    "myEmail@mail.com",
                    "PhoneNumber",
                    "password"
            );

            c1.addBracelet(b1);
            c1.addBracelet(b1);
            c2.addBracelet(b1);
            c2.addBracelet(b2);
        }
    }
}
