package OfficeHours;

import java.util.Arrays;

public class Practice_12_30_Method {
    public static void main(String[] args) {
//        12/30/2019
//        Practice topic: Wrapper class
//        primitives: byte, short, int, long, float, double, char, boolean
//        default value:
//        byte, short, int, long ==> 0
//        float, double ==> 0.0
//        boolean ==> false
//        char ==> empty
//        Wrapper classes:
//        every primitives in java has a class that's dedicated to it
//        Byte, Short, Integer, Long, Float, Double, Character, Boolean
//        all those wrapper classes are presented in "java.lang"
//        default value of all wrapper class: null
//        Auto-boxing: assigning primitive value to wrapper class
//        un-boxing: assign wrapper class value to primitive values
//                Useful methods of wrapper class:
//        Max_Value: returns the maximum value
//        Min_Value: returns the minimum value
//        parse methods: converting String values to primitives, not case sensitive, returns primitive
//        ValueOf methods: converting String to Wrapper class, not case sensitive ,returns wrapper class

        int a = 10;
        Integer A = a;
        //   Double A2 = a;  // Double is only dedicated to double

        float f = 0.5f;
        // Double F = f;   // each wrapper classes are dedicated to their own primitives


        Double num1 = 0.5;
        Short num3 = 45;
        Integer num4 = 100;

        double num2 = num4;
        System.out.println(num2);


        Long number1 = 100L; // Auto

        Float f1 = 100.0f;


        double d1 = f1; // unboxing

        System.out.println(Byte.MAX_VALUE); // maximum value of byte primitive
        System.out.println(Byte.MIN_VALUE); // Minimum value of primitive Byte

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


        // parse methods:
        String str1 = "123";
        int result = Integer.parseInt(str1);
        System.out.println(result + 1); //124

        String str2 = "TRUE";
        boolean r1 = Boolean.parseBoolean(str2);
        System.out.println(r1);

        String str3 = "FaLsE";  // true, false
        boolean r2 = Boolean.parseBoolean(str3);
        System.out.println(r2);

        String str4 = "Yes or No";  // anything other true, will return false
        boolean r3 = Boolean.parseBoolean(str4);
        System.out.println(r3);


        // ValueOf:
        String s1 = "100.5";
        Double c1 = Double.parseDouble(s1); // auto boxing
        Double c2 = Double.valueOf(s1);

        System.out.println(c1);
        System.out.println(c2);

        String s2 = "TrUE";
        Boolean b1 = Boolean.valueOf(s2);
        System.out.println(b1);


        Boolean[] arr = new Boolean[3];
        System.out.println(Arrays.toString(arr));


        System.out.println(addNum(100.5, 200.8));


    }


    public static int addNum(int a, int b) {
        return a + b;
    }

    public static double addNum(double a, double b) {
        return a + b;
    }


}