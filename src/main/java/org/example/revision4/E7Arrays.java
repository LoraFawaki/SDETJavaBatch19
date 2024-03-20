package org.example.revision4;

public class E7Arrays {
    public static void main(String[] args) {
        // count how many evern numbers are represnt in the array

        int[] num={10,25,45,66,85,100,26,89,56,33};
        int counter = 0;

        for (int n:num) {

            if (n %2==0){
                counter++;
            }
        }
        System.out.println(counter);


    }
}
