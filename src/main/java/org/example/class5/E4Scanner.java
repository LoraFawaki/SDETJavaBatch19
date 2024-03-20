package org.example.class5;

import java.util.Scanner;

import static java.lang.System.*;

public class E4Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(in);
        out.println("Please enter the gender m/f");
        //scanner can't accept {char}, it done differently
        char gender=scanner.next().charAt(0);
        out.println("My gender is " + gender);
        out.println("Please enter your Firstname");
        String firstName=scanner.next();
        out.println("My First Name is "+firstName);

        out.println("My name is "+ firstName + " I am a " + gender);

        //next(), computer will pick only the first word and will ignore the rest of the sentence
        //charAt(), the computer will pick ONLY one character
        //(0) means it will take the first letter. (1) will pick up the second letter and.....




    }
}
