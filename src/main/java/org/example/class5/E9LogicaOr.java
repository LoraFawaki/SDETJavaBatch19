package org.example.class5;

public class E9LogicaOr {
    public static void main(String[] args) {

        double bankBalance=30000;
        double cash=20000;

        if (bankBalance>40000 || cash>30000){
            System.out.println("I can go buy a Toyota");
        } else {
            System.out.println("I need to save more");
        }

    }
}
