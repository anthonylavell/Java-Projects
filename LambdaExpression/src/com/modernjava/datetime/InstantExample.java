package com.modernjava.datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class InstantExample {
    public static void main(String[] args) {
        Instant timeStamp = Instant.now();
        System.out.println("timeStamp.getNano() = " + timeStamp.getNano());

        Instant timeStamp2 = Instant.now().plusSeconds(3600);
        Duration duration = Duration.between(timeStamp,timeStamp2);
        System.out.println("duration.toSeconds() = " + duration.toSeconds());

        LocalDateTime localDateTime = LocalDateTime.ofInstant(timeStamp,
                ZoneId.systemDefault());
        System.out.println("localDateTime = " + localDateTime);

    }
}
