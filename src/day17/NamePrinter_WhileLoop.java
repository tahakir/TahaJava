package day17;

import java.util.Scanner;

public class NamePrinter_WhileLoop {
    public static void main(String[] args) {
        //if you have complain in life : call 1-800-Alexander
        String name = "Alexander";

        //get each and every character and print them out vertically
        int x = 0;
        //in order ro print each character of a String
        //we need to start getting character
        //from index 0 till last index( name.lenght()-1  )

        while (x < name.length()) {

            System.out.print("index " + x + " : ");
            System.out.println(name.charAt(x));
            ++x;
        }



        }


    }


