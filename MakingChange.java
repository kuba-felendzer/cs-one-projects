package com.kuba.projects;
import java.util.Scanner;
import java.lang.Math;

public class MakingChange {

    public static void main(String args[]) {
        final double PENNY = 100;
        final double NICKEL = 20;
        final double DIME = 10;
        final double QUARTER = 4;
        final double HALFDOLLAR = 2;

        double value = 0;
        int count = 0;

        System.out.println("Coin Counter 3000 has started up!");
        Scanner input = new Scanner(System.in);

        System.out.print("PENNIES?: "); int amount = input.nextInt(); value += (amount / PENNY); count += amount;
        System.out.print("NICKELS?: "); amount = input.nextInt(); value += (amount / NICKEL); count += amount;
        System.out.print("DIMES?: "); amount = input.nextInt(); value += (amount / DIME); count += amount;
        System.out.print("QUARTERS?: "); amount = input.nextInt(); value += (amount / QUARTER); count += amount;
        System.out.print("HALF DOLLARS?: ");  amount = input.nextInt(); value += (amount / HALFDOLLAR); count += amount;
        System.out.print("DOLLARS?: "); amount = input.nextInt(); value += amount; count += amount; // the value of a dollar is one, so no division is needed
        input.close();

        System.out.println("--------------------------------");
        System.out.println("TOTAL: " + (Math.round(value * 100d) / 100d) + " | COUNT: " + count + " |");
        System.out.println("--------------------------------");
    }
}