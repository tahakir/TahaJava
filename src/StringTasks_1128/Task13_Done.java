package StringTasks_1128;

import java.util.Scanner;

public class Task13_Done {
    public static void main(String[] args) {


        //Task 13:
//        Given a String with 3 characters
//        swap first character with last character
//        and check whether new String is same as old one
//        if so print Palindrome

               Scanner scan=new Scanner(System.in);
        System.out.println("Enter");
        String name= scan.next();


//        if(name.substring(0,name.length()/2).equalsIgnoreCase(name.substring(name.length()/2+1))){
//            System.out.println("Palindrome");
//
//        }else{
//            System.out.println("NOT PALINDROME");
//        }


        String a="";

        for (int i = name.length()-1; i >=0 ; i--) {
            System.out.println(name.charAt(i));
            a+=name.charAt(i);

        }

        if(name.equalsIgnoreCase(a)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Failed");
        }

    }
}
