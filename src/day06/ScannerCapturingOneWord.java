package day06;
import java.util.Scanner;
public class ScannerCapturingOneWord {
    public static void main(String[] args) {
        //we will learn how to output more than one word


        Scanner scan =new Scanner(System.in);

        System.out.println("What is your name ? ");
        String name =scan.next();
        String anotherWord=scan.next();

        System.out.println("You have entered " + name);
        System.out.println("Another word is " + anotherWord);





    }
}
