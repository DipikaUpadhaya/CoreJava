package com.dipika.conditional;

import java.util.Locale;
import java.util.Scanner;

public class ResturantConsole {
    public static void main(String[] args) {
        int choice;
        System.out.println("******** Menu **********");
        System.out.println("List         Items          Price");
        System.out.println(" 1      Chicken MOMO        150");
        System.out.println(" 2      Veg MOMO            100");
        System.out.println(" 3      Chicken Chowmein    150");
        System.out.println(" 4      Veg Chowmein        100");
        System.out.println(" 5      Burger              150");
        System.out.println("Enter Your choice: ");
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        System.out.println("Do you want to select another item?? (Y/N)");


        System.out.println("Your choosen menu item are: ");

        if (choice == 1) {
            System.out.println(" 1      Chicken MOMO        150");
        } else if (choice == 2) {
            System.out.println(" 2      Veg MOMO            100");
        } else if (choice == 3) {
            System.out.println(" 3      Chicken Chowmein    150");
        } else if (choice == 4) {
            System.out.println(" 4      Veg Chowmein    150");
        } else {
            System.out.println(" 5      Burger              150");
        }

    }

}
