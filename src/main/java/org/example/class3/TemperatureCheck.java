package org.example.class3;

public class TemperatureCheck {
    public static void main(String[] args) {
        /*
        create variable to store temprature. your program should check if temperature is below 32, then it should print
        "Water will freeze with temperature----"
        otherwise "Water will NOT freeze with temperature ----"
         */

        int temperature=35;
        if(temperature<32) {
            System.out.println("Water will freeze with temperature" + temperature);
        } else {
            System.out.println("Water will NOT freeze with temperature" + temperature);

        }
    }
}

