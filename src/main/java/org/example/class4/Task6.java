package org.example.class4;

public class Task6 {
    public static void main(String[] args) {
        /*
. Create a Java program and call it a Donor.
In order to be eligible to donate your blood you have to
be 18 years old. Also once you identify age eligibility then we
have to see if person matches weight requirements. If person weight is
more than 110 lbs → then he/she is eligible, otherwise we cannot accept
such a patient.

 */
        int age=18;
        double weight=110;

        if (age>=18) {

            if (weight>110){

                System.out.println("eligible");
            }else {
                System.out.println("Not eligible");
            }
        }else {
            System.out.println("Not eligible");
        }
    }
}
