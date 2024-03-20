package org.example.class5;

public class E8LogicalNot {
    public static void main(String[] args) {

        boolean box = false;
        System.out.println(!box);
        box = !box;
        System.out.println(box);

        //it is helpful inside If condition
        // when we need to negate something in a long list
        //from which countries people are not allowed to enter the USA

        String country = "Iran";
        if (!country.equals("Iran")) {
            System.out.println("You can visit USA");
        } else {
            System.out.println("You can't visit USA");
        }


    }
}
