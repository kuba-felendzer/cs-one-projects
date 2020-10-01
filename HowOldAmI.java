package com.kuba.projects;

import java.util.Scanner;

public class HowOldAmI {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        // Today's date is 9-30-2020
        Date today = new Date(); today.day = 30; today.month = 9; today.year = 2020;
        Date birthday = new Date();

        // get the user's birthday
        System.out.print("Day: ");
        birthday.day = input.nextInt();
        System.out.print("Month: ");
        birthday.month = input.nextInt();
        System.out.print("Year: ");
        birthday.year = input.nextInt();

        final int MONTHS = 12;
        final int DAYS = 365;
        final int WEEKDAYS = 7;
        final int HOURS = 24;
        final int MINUTES = 60;
        final int SECONDS = 60;
        int ay = (today.year - birthday.year); // age in years
        int amo = ((ay*MONTHS) + (birthday.day)); // age in months
        int ad = ((amo*DAYS) + (today.day - birthday.day)); // age in days
        int aw = (ad/WEEKDAYS); // age in weeks
        int ah = (ad*HOURS); // age in hours
        int am = (ah*MINUTES); // age in minutes
        int as = (am*SECONDS); // age in seconds
        
        System.out.println("YEARS: " + ay);
        System.out.println("MONTHS: " + amo);
        System.out.println("DAYS: " + ad);
        System.out.println("WEEKS: " + aw);
        System.out.println("HOURS: " + ah);
        System.out.println("MINUTES: " + am);
        System.out.println("SECONDS: " + as);

        input.close();
    }

}

class Date {
    public int day, month, year;

    public void printDate() {
        System.out.println("D: " + day + ", M: " + month + ", Y: " + year);
    }
}