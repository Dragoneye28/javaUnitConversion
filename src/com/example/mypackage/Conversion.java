package com.example.mypackage;

import java.util.Scanner;

public class Conversion {
    private static double kgs_per_pound = 0.45;
    private static double lbs_per_kg = 2.2;
    private static double weeks_per_year = 52.1;
    private static double days_per_year = 365;
    private static double kms_per_mile = 1.6;
    private static double miles_per_km = 0.62;
    private static double feet_per_cm = 0.03;
    private static double cms_per_foot = 30.48;
    private double amount;
    private double result;
    private Scanner scanner = new Scanner(System.in);

    public void kilogramsIntoPounds(){
        System.out.println("How many?");
        amount = scanner.nextDouble();
        result = amount * kgs_per_pound;
        System.out.format(amount + " kilograms equals to " + result + " pounds.");
    }

    public void poundsIntoKilograms(){
        System.out.println("How many?");
        amount = scanner.nextDouble();
        result = amount * lbs_per_kg;
        System.out.println(amount + " pounds equals to " + result + " kilograms.");
    }

    public void yearIntoWeeks(){
        System.out.println("How many?");
        amount = scanner.nextDouble();
        result = amount * weeks_per_year;
        System.out.println(amount + " years equals to " + result + " weeks.");
    }

    public void yearIntoDays(){
        System.out.println("How many?");
        amount = scanner.nextDouble();
        result = amount * days_per_year;
        System.out.println(amount + " years equals to " + result + " days.");
    }

    public void kilometersIntoMiles(){
        System.out.println("How many?");
        amount = scanner.nextDouble();
        result = amount * kms_per_mile;
        System.out.println(amount + " kilometers equals to " + result + " miles.");
    }

    public void milesIntoKilometers(){
        System.out.println("How many?");
        amount = scanner.nextDouble();
        result = amount * miles_per_km;
        System.out.println(amount + " miles equals to " + result + " kilometers.");
    }

    public void centimetersIntoFeet(){
        System.out.println("How many?");
        amount = scanner.nextDouble();
        result = amount * cms_per_foot;
        System.out.println(amount + " centimeters equals to " + result + " feet.");
    }

    public void feetIntoCentimeters(){
        System.out.println("How many?");
        amount = scanner.nextDouble();
        result = amount * feet_per_cm;
        System.out.println(amount + " feet equals to " + result + " centimeters.");
    }
}
