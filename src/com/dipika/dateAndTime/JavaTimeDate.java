package com.dipika.dateAndTime;

import java.time.LocalDate;

public class JavaTimeDate {
    public static void main(String[] args) {
        LocalDate localDate= LocalDate.now();
        System.out.println(localDate);
        System.out.println( "The total day of this year is "+localDate.getDayOfYear());
        System.out.println("Is this year is leap year? "+localDate.isLeapYear());
        localDate=localDate.plusMonths(5);
        System.out.println("After adding 5 months: "+localDate);
    }
}
