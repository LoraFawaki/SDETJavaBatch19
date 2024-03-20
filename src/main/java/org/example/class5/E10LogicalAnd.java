package org.example.class5;

public class E10LogicalAnd {
    public static void main(String[] args) {

        double math=95;
        double science=90;
        double history=93;

        if (math>90 && science>90 && history>90){
            System.out.println("Great Work, you got an A+");
// with and all conditions have to be true
        }else {
            System.out.println("You need to work harder");
        }
    }
}
