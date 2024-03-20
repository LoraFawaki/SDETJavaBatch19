package org.example.class5;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class E3Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your FirstName");
        String firstName=scanner.next();
        //scanner.next()  => runs only one word
        //scanner.nextLine()  => runs multiple words, sentences, paragraphes
        System.out.println(firstName);

    }
}
