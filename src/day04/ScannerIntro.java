package day04;
import java.util.Scanner;
public class ScannerIntro {

    public static void main(String[] args) {

        //I want to save users input after asking some questions
        //and I want to save this input so I can do something with it

        //Step 1 : Use scanner class to create scanner object
        // that have this functionality

        Scanner scan= new Scanner(System.in);

        //ask user to enter name
        System.out.println("Please enter your first name : ");

        // capture what user type on keyboard in console

        String firstName= scan.next();
        // print the result of what we saved from user input


        System.out.println("You have entered : "+ firstName);
        // capture what user type on keyboard in console for age
        //ask user age
        System.out.println("What is your age ? : ");
        int age = scan.nextInt();
        //print the result of users age
        System.out.println("Your age is : " + age);




    }
}
