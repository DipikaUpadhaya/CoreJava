package com.dipika.dateAndTime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BirthdayFinder {
    public static void main(String[] args) throws ParseException {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your date of birth in yyyy-mm-dd format: ");
        String dob= scanner.next();
        System.out.println("your dob is: "+ dob);

        DateFormat formatDOB= new SimpleDateFormat("yyyy-mm-dd");
        Date dateOfBirth= formatDOB.parse(dob);
        System.out.println("after using date format and parsing string into date: "+dateOfBirth);

        DateFormat df=new SimpleDateFormat("EEEE");
        String bornday= df.format(dateOfBirth);
        System.out.println("Your born day is "+ bornday);
    }
}
