package org.example.class3;

public class If2 {
    public static void main(String[] args) {
        boolean isRaining=false;

        if(isRaining) {
            System.out.println("Take the umberella");
            //the sout is not executed because isRaining is false
            System.out.println("Lets take the Jacket");
        }
        System.out.println("Lets go shopping");
        //it was executed as the order is out of the curly brackets, so it is unconditional order
    }
}
