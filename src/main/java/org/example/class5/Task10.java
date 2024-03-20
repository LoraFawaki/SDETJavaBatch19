package org.example.class5;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        /*
Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in March, April, May → season =”Spring”
if user is born in June, July, August →
season =”Summer”  etc …
At the end of the program we should see 1 output as “You were born is season ______”.
 */
       /* Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your birth month");
        String birthMonth=scan.nextLine();

        if (birthMonth.equals("March") || birthMonth.equals("April") || birthMonth.equals("May")){
            System.out.println("The season is Spring");
        }else if (birthMonth.equals("June") || birthMonth.equals("July") || birthMonth.equals("August")){
            System.out.println("The season is Summer");

        */
        // Or we use Switch, if we can use Switch we shall not use the If Condition

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your birth Month");
        String month = scan.nextLine().toLowerCase();
        switch (month) {
            case "march":
            case "april":
            case "may":
                System.out.println("You were born is season Spring");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println("You were born is season Summer");
                break;
            case "september":
            case "october":
            case "november":
                System.out.println("You were born is season Autumn");
                break;
            case "december":
            case "january":
            case "february":
                System.out.println("You were born is season Winter");
                break;
            default:
                System.out.println("Invalid month");
                break;
        }

    }
}
