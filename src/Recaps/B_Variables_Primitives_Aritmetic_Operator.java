package Recaps;

public class B_Variables_Primitives_Aritmetic_Operator {
    public static void main(String[] args) {



    //Variable is a container can store data
    //while you are naming your variable you CAN NOT name starting with number
    //Should always start with lower case, encouraged to use camel case
    // String firstName="Wolf";
//////From Smaller to larger////
    //byte ---->Integer
    //short ---->Integer
    //int ---->Integer
    //long---->Integer + l (ALWAYS)
    //float---->Floating Point  + f if we dont specify as f the compiler will define as "d"
    //double---->Floating Point  +d
    ///
    //char ---->Single use character
// boolean---->True or false statement

    int n=10;
    n=100;
    System.out.println(n);
// System picked up 100 because its the latest one.

     int x=10;
     int i=x;
        System.out.println(i);
// System printed out 10 because i picked up the x value


        ///String
        String name="TANRI TURKU KORUSUN!";
        System.out.println(name);

        //Concatinate

        String firstName="Taha";
        String lastName="Kir";
        System.out.println(firstName +" "+ lastName);

///Aritmetic Operations

        ///Basic Math!!!
        int a=40;
        int b=30;
        int add=a+b;
        int sub=a-b;
        int mult=a*b;
        int div=a/b;
        int rem=a%b;
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(div);
        System.out.println(rem);





    }

}
