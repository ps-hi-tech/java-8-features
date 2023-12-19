package com.eos.java8feature;

/*
*
* program to find date of next month second sunday using java time api
* */

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TimeAPIJava8 {

    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the date of the second Sunday of the next month
        LocalDate nextMonthSecondSunday = currentDate.plusMonths(1)
                .with(TemporalAdjusters.firstDayOfMonth())  // Move to the first day of the next month
                .with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY)) // Move to the first Sunday of the next month
                .with(TemporalAdjusters.next(DayOfWeek.SUNDAY)); // Move to the second Sunday of the next month

        System.out.println("Date of the next month's second Sunday: " + nextMonthSecondSunday);
    }
}
