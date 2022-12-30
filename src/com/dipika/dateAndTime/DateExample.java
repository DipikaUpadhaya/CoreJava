package com.dipika.dateAndTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date date= new Date();
        System.out.println("This date is given by date " +date);

        LocalDate localDate= LocalDate.now();
        System.out.println("This date is given by local date "+localDate);

        DateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd EEEE hh:mm:ss");
        System.out.println(dateFormat.format(date));

    }
}
