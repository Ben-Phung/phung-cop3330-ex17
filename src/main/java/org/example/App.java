/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Ben Phung
 */

package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        double ratio;

        // Prompt user
        System.out.print( "Enter a 1 is you are male or a 2 if you are female: " );
        String Gender = scan.nextLine();

        System.out.print( "How many ounces of alcohol did you have? " );
        String Ounces = scan.nextLine();

        System.out.print( "What is your weight, in pounds?: " );
        String Weight = scan.nextLine();

        System.out.print( "How many hours has it been since your last drink? " );
        String Hours = scan.nextLine();

        // Convert strings to int and double
        int iGender = Integer.parseInt(Gender);
        double dOunces = Double.parseDouble(Ounces);
        double dWeight = Double.parseDouble(Weight);
        double dHours = Double.parseDouble(Hours);

        // If gender is 1 or 2 change the alcohol ratio
        if (iGender == 1)
        {
            ratio = 0.73;
        }
        else
        {
            ratio = 0.66;
        }

        // Calculate BAC
        double BAC = (dOunces * 5.14 / dWeight * ratio) - 0.015 * dHours;

        // Print outputs
        System.out.println("Your BAC is " + String.format("%.6f",BAC));

        if (BAC >= 0.08)
        {
            System.out.println( "It is not legal for you to drive." );
        }
        else
        {
            System.out.println( "It is legal for you to drive." );
        }


    }
}