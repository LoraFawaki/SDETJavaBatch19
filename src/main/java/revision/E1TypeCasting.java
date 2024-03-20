package revision;

public class E1TypeCasting {
    public static void main(String[] args) {
        byte number=10;
        float num=number;
        System.out.println(num);

        int num1=100098;
        short num2= (short) num1;
        System.out.println(num2);

        /*
        Random results in the short box. as we are forcing the operation. Short box can't hold
         the big value of the int.
        */


    }
}
