package day05;
import java.util.Scanner;
public class TheScannerWay_Repeat {
    public static void main(String[] args) {

        //ask user name
        //and capture the result
        // your name is ...
        //ask user for birth year
        //print the age
        //ask for height
        //capture the result
        //print the height

        Scanner scan=new Scanner(System.in);
        System.out.println("What is your name?");
        String name=scan.next();
        System.out.println("Your name is: " + name);

        System.out.println("When is your year?");
        int birthYear=scan.nextInt();
        int age=2019-birthYear;
        System.out.println("Your age is: " + age);

        System.out.println("What is your height?");
        float height=scan.nextFloat();
        System.out.println("Your height is: " +height);























    }
}
