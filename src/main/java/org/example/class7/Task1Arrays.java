package org.example.class7;

public class Task1Arrays {
    public static void main(String[] args) {

        String [] cars={"Kia","Honda","Toyota","VW","BMW","Mercedes"};
        int i=0;

        while (i<cars.length){ // tells us automatically how many elements are present in the array
            System.out.println(cars[i]);
            i++;
        }
        /*for (i=0;i<6;i++){
            System.out.println(cars[i]);
        }*/
    }
}
