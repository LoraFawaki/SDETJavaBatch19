package org.example.class8;

public class E1Break {
    public static void main(String[] args) {

        String [] names={"James", "Iram", "Matt Naughty", "ubaidur" , "Aladin","Ana","Silvia"};
        //search for the name James if it s present print on console

        for (String n:names){
            if (n.equals("James")){
                System.out.println("Name is present");
                break;

            }
        }
    }
}
