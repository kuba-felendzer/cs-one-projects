package com.kuba.projects;

import java.util.Scanner;

public class HappyChineseKitchen {
    /* MENU:
    $4.95  Large Wonton Soup           [A]
    $5.95  6 Crab Rangoon              [B]
    $5.95  Pot Stickers                [C]
    $2.70  Egg Rolls                   [D]
    $8.95  Large Mongolian Beef        [E]
    $8.95  Large Beef w/ Broccoli      [F]
    $8.95  Large Sweet & Sour Chicken  [G]
    $9.45  Large General Tao’s Chicken [H]
    $10.25 Cashew Shrimp               [I]
    $7.95  Chicken Lo Mein             [J]
    $8.95  Chicken Pad Thai            [K]
    $12.45 Happy Family                [L]

    include total, subtotal, tax and tip (20% of tax)
    */
    public static int display(Item item) {
        System.out.println("- " + item.price + " * " + item.amount + " = " + (item.price * item.amount) + " for " + item.amount + " of the " + item.name);
        return 0;
    }

    public static Item lrgWontonSoup = new Item(4.95, "Large Wonton Soup", 0);
    public static Item sixCrabRangoon = new Item(5.95, "6 Crab Rangoon", 0);
    public static Item potStickers = new Item(5.95, "Pot Stickers", 0);
    public static Item eggRolls = new Item(2.70, "Egg Rolls", 0);
    public static Item lrgMongolBeef = new Item(8.95, "Large Mongolian Beef", 0);
    public static Item lrgBeefBroccoli = new Item(8.95, "Large Beef w/ Broccoli", 0);
    public static Item lrgSweetSourChicken = new Item(8.95, "Large Sweet & Sour Chicken", 0);
    public static Item lrgGenTaoChicken = new Item(9.45, "Large General Tao's Chicken", 0);
    public static Item cashewShrimp = new Item(10.25, "Cashew Shrimp", 0);
    public static Item chickenLoMein = new Item(7.95, "Chicken Lo Mein", 0);
    public static Item chickenPadThai = new Item(8.95, "Chicken Pad Thai", 0);
    public static Item happyFamily = new Item(12.45, "Happy Family", 0);

    public static Item[] menu = {lrgWontonSoup, sixCrabRangoon, potStickers, eggRolls, lrgMongolBeef, lrgBeefBroccoli, lrgSweetSourChicken, lrgGenTaoChicken, cashewShrimp, chickenLoMein, chickenPadThai, happyFamily};

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        for(Item temp : menu) {
            System.out.print("How many " + temp.name + " ($" + temp.price + ") do you want?: ");
            temp.amount = scan.nextInt();
        }

        for(Item temp : menu) {
            display(temp);
        }
        scan.close();

        System.out.println("-------------------------");
        double subtotal = 0;
        for(Item temp : menu) subtotal += (temp.price * temp.amount);
        double tax = subtotal + (subtotal * .0625);
        System.out.println("SUBTOTAL: $" + subtotal + " | TAX: $" + tax + " | TOTAL: $" + subtotal + tax);
    }
}

class Item {
    public double price;
    public String name;
    public int amount;
     
    public Item(double price, String name, int amount) {
        this.price = price;
        this.name = name;
        this.amount = amount;
    }
}