package com.modernjava.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationExample {
    public static void main(String[] args) {
        //duration between 2 Localdateteim instance
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime2 = LocalDateTime.now().plusHours(2);
        Duration duration = Duration.between(localDateTime,localDateTime2);
        System.out.println("duration.toHours() = " + duration.toHours());

        duration = Duration.ofHours(3);
        System.out.println("duration.toMinutes() = " + duration.toMinutes());

        LocalTime localTime = LocalTime.now();
        LocalTime localTime2 = LocalTime.now().plusMinutes(60);
        duration = Duration.between(localTime, localDateTime2);
        System.out.println("duration = " + duration.toMinutes());

        LocalDate localDate = LocalDate.now();
        LocalDate localDate2 = LocalDate.now().plusDays(1);
        duration = Duration.between(localTime, localTime2);
        System.out.println("duration = " + duration.toMinutes());
    }
}
