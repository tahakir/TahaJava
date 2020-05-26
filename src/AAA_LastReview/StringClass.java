package AAA_LastReview;

import java.util.Scanner;

public class StringClass {
    public static void main(String[] args) {

        String str="Cybertek";//saved in "string pool"(String literals)
        // if there are more variables with the same value ,
        // they will be at the same memory location

        String str2=new String("Cybertek");//saved outside of the string pool
        //string pool does not take duplicates

        System.out.println(str == str2);//false because they are saved in different locations

        String str3 =new String("Cybertek");
        System.out.println(str2==str3);//false because they are saved in different locations
        //heap memory=the place where all the objects are stored at.
        //string pool=the place where all the string literals are stored at.

        String longName="aaabbbcccdddd";
        System.out.println("The lenght: "+longName.length());
        System.out.println("The third index is: "+longName.charAt(3));
        System.out.println("to upper case: " + longName.toUpperCase());
        System.out.println("longName.toLowerCase() = " + longName.toLowerCase());

        //              012345678901234  
        String Address="Mclean VA 22000";
        String zipcode=Address.substring(10);
        System.out.println("zipcode = " + zipcode);
        String city=Address.substring(6,9);
        System.out.println("city = " + city);

        //               01234567890123456789012
        String fullName="Cybertek School Batch15";

        String middleName=fullName.substring(9,15);
        System.out.println("middleName = " + middleName);

        String replaceMethod="Java is a Fun Programming Language";
        System.out.println("replaceMethod.replace('a','x') = " + replaceMethod.replace('a', 'x'));

        System.out.println("String replace: "+replaceMethod.replace("Java","SQL"));



    }
}
