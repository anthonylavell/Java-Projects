package com.modernjava.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class DateModifyExample {
    public static void main(String[] args) {
        LocalDate locateDate = LocalDate.now();
        //4 days from now
        System.out.println("locateDate = " + locateDate.plusDays(4));
        System.out.println("locateDate = " + locateDate);
        System.out.println("locateDate.plusMonths(2) = " + locateDate.plusMonths(2));
        System.out.println("locateDate.plusYears(2) = " + locateDate.plusYears(2));
        System.out.println("locateDate.minusDays(2) = " + locateDate.minusDays(2));
        System.out.println("locateDate.withYear(2023) = " + locateDate.withYear(2023));
        System.out.println("locateDate.with = " + locateDate.with(ChronoField.YEAR, 2025));

        System.out.println("locateDate.with(TemporalAdjusters.lastDayOfMonth()) = " + locateDate.with(TemporalAdjusters.lastDayOfMonth()));
    }
}
