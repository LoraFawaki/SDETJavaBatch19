package org.example.class4;

public class E5NestedIf {
    public static void main(String[] args) {

        boolean mainDoor = false;
        boolean room1 = false;
        boolean room2 = false;

        if (mainDoor){

            if (room1){
                System.out.println("Room 1 is opened");
            }else {

                System.out.println("Room 1 is closed");
            }
            if (room2) {
                System.out.println("Room 2 is opened");

            }else {
                System.out.println("Room 2 is closed");
            }

            }else {
            System.out.println("Main door is closed");

        }

        System.out.println("print this line");
    }
}
