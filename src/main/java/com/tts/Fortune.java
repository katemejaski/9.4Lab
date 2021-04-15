package com.tts;

import java.util.Scanner;

public class Fortune {
    public static void tellFortune(){
        int willPlay = 1;
        String firstName;
        String lastName;
        int userAge;
        int birthMon;
        String favCol;
        int numSibs;
        int retireYrs;
        String vacaHome;
        String transportMode;
        String bankBal = "";
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("What's your first name?");
        firstName = inputDevice.next();
        System.out.println("What's your last name?");
        lastName = inputDevice.next();
        System.out.println("What's your age?");
        userAge = inputDevice.nextInt();
        System.out.println("What's your birth month?");
        birthMon = inputDevice.nextInt();
        favCol = "help";
        do {
            System.out.println("What is your favorite ROYGBIV color? (if you don't know what ROYGBIV stands for, please type: \"help\")");
            favCol = inputDevice.next().toLowerCase();
            if (favCol.toLowerCase().equals("help")) {
                System.out.println("ROYGBIV = the colors of the rainbow!\n1.Red\n2.Orange\n3.Yellow\n4.Green\n5.Blue\n6.Indigo\n7.Violet");
            }
        } while(favCol.toLowerCase().equals("help"));
        System.out.println("How many siblings do you have?");
        numSibs = inputDevice.nextInt();
        if(userAge < 25){
            retireYrs = 666;
        } else {
            retireYrs = 1;
        }
        switch (numSibs) {
            case 0:
                vacaHome = "Wrightsville Beach";
                break;
            case 1:
                vacaHome = "Breckenridge";
                break;
            case 2:
                vacaHome = "Asheville";
                break;
            case 3:
                vacaHome = "Paris";
                break;
            case 4:
                vacaHome = "Palm Springs";
                break;
            default:
                vacaHome = "Crete";
                break;
        }
        switch (favCol){
            case "red":
                transportMode = "Tesla";
                break;
            case "orange":
                transportMode = "Subaru Outback";
                break;
            case "yellow":
                transportMode = "Minivan";
                break;
            case "green":
                transportMode = "Beat-up Truck";
                break;
            case "blue":
                transportMode = "DUI Scooter";
                break;
            case "indigo":
                transportMode = "Yacht";
                break;
            case "violet":
                transportMode = "Bus";
                break;
            default:
                transportMode = "VW Van";
                break;
        }
        switch (birthMon){
            case 1:
            case 2:
            case 3:
                bankBal = "$5,000,000,000.00";
                break;
            case 4:
            case 5:
            case 6:
                bankBal = "$9.00";
                break;
            case 7:
            case 8:
            case 9:
                bankBal = "$12,004.23";
                break;
            case 10:
            case 11:
            case 12:
                bankBal = "$100.00";
                break;
        }
        System.out.println(firstName + " " + lastName + " will retire in " + retireYrs + " year(s) with " +
                bankBal + " in the bank, a vacation home in " + vacaHome + " and travel by " + transportMode);
    }
}
