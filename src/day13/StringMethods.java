package day13;
import java.util.Scanner;

public class StringMethods {

    public static void main(String[] args) {


      // String actions that we already know so far

      // equals

        String s1="HELLLLLo";
        System.out.println(s1.equals("abc")  );
        //equalsIgnoreCase
        System.out.println(s1.equalsIgnoreCase("HELLO"));

        //toUpperCase method of String is used to make String all characters uppercase
        System.out.println(s1);
        System.out.println(s1.toUpperCase());

        // toLowerCase method of String is used to
        // make String all characters lowercase
        System.out.println(s1.toLowerCase() );

        //Store your name into a variable
        //print your name all uppercase
        //lowercase

        String name="taha";

        System.out.println(name.toUpperCase());
        System.out.println("My upper case name is " + name);

        System.out.println(name.toLowerCase());
        System.out.println("My lowercase name is " + name);

        /// In order to get how many character we have inside String
        //we can use length method of String

        System.out.println(name.length());

        int lengthOfStr=s1.length();

        if(lengthOfStr>4){
            System.out.println("More than 4 character");
        }else{
            System.out.println("NOT MORE THAN 4");
        }


    }

}
