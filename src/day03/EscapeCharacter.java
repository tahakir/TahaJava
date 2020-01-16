package day03;

import java.sql.SQLOutput;

public class EscapeCharacter {
    public static void main(String[] args) {
        System.out.println("    Hello   \\  world"   );

        System.out.println("I like the book \"Java\"  awesome"  );
        // The reason why we have this backslash is you cannot have quotation inside of text.
        //we just wanted to add quotation marks before and after Java.
        //in order ro not to treat it as special character we use!!!

        System.out.println("The movie name is : \'The Lord of The Rings' " );

        System.out.println("Hello\tWorld");

        System.out.println("Hello\n b15");

        //The equivalent of println and print is


    }
}
