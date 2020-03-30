package com.example.mypackage;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Conversion conversion = new Conversion();
    static String wrongChoice = "Invalid token.";
    static int counter;

    public static void main(String[] args) {
        String decision;
        do {
            counter++;
            if (counter > 1) {
                System.out.println();
            }
            System.out.println("Choose the unit type you'd like to convert:");
            System.out.println("Press M for mass (kgs and lbs).");
            System.out.println("Press T for time (years into weeks and days).");
            System.out.println("Press D for distance (miles, kilometers, cm, feet).");
            System.out.println("Press Q to quit");
            decision = scanner.nextLine();
            if (decision.equalsIgnoreCase("m")){
                System.out.println("Press K to convert kgs into pounds.");
                System.out.println("Press P to convert pounds into kgs.");
                decision = scanner.nextLine();
                if (decision.equalsIgnoreCase("k")){
                    conversion.kilogramsIntoPounds();
                } else if (decision.equalsIgnoreCase("p")){
                    conversion.poundsIntoKilograms();
                } else {
                    System.out.println(wrongChoice);
                }
            } else if (decision.equalsIgnoreCase("t")) {
                System.out.println("Press W to convert years into weeks.");
                System.out.println("Press D to convert into days.");
                decision = scanner.nextLine();
                if (decision.equalsIgnoreCase("w")){
                    conversion.yearIntoWeeks();
                } else if (decision.equalsIgnoreCase("d")){
                    conversion.yearIntoDays();
                } else
                    System.out.println(wrongChoice);
            } else if (decision.equalsIgnoreCase("D")){
                System.out.println("Press M to convert miles into kilometers.");
                System.out.println("Press K to convert kilometers into miles.");
                System.out.println("Press F to convert feet into centimeters.");
                System.out.println("Press C to convert centimeters into feet.");
                decision = scanner.nextLine();
                if (decision.equalsIgnoreCase("m")){
                    conversion.milesIntoKilometers();
                } else if (decision.equalsIgnoreCase("k")){
                    conversion.kilometersIntoMiles();
                } else if (decision.equalsIgnoreCase("f")){
                    conversion.feetIntoCentimeters();
                } else if (decision.equalsIgnoreCase("c")){
                    conversion.centimetersIntoFeet();
                } else System.out.println(wrongChoice);
            } else if (!decision.equalsIgnoreCase("q")){
                System.out.println("Returning.");
            } else {
                System.out.println("Quitting.");
                System.out.println("You've used the converter " + (counter -1) + " times this session.");
            }
        } while (!decision.equalsIgnoreCase("q"));
    }
}
