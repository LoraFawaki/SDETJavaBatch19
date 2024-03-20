package org.example.class3;

public class If1 {
    public static void main(String[] args) {

        double bankBalnace=120000;
        if(bankBalnace>80000){
            //System.out.println("Lets buy a Tesla");
            // if we run the sout above, the outcome will be the sentence mentioned.
        }
        bankBalnace=1200;
        if(bankBalnace>80000) {
            System.out.println("Let's buy a Tesla");
        }
        //Nothing was printed because the if condition wasn't met.
        System.out.println("will always be executed");
       // the if condition wasn't applied on the second sout because it was out of the curly brackets related to the if condition
                /*
        The if else has 2 parts. 1- the condition part: where we specify the condition
         and it is written in between brackets after if ( ----)
         we create the conditions with boolean or with the relational operators if(10>5).
         or we can simply write if(true)
        2- the order part(the code) what is written in between the curly brackets, after the if statement.
         */
    }
}
