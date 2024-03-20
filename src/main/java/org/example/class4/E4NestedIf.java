package org.example.class4;

public class E4NestedIf {
    public static void main(String[] args) {
        boolean mainDoor = true;
        boolean room1 = false;
        boolean room2 = false;

        //Ctrl+Alt+l formats the lines neatly
        if (mainDoor) {

            if (room1) {
                System.out.println("Room 1");
            } else {
                System.out.println("Room 1 is Closed");
            }

        } else {
            System.out.println("Main Door is closed");
        }


    }
}
