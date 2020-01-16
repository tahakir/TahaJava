package OfficeHours;
import java.util.Scanner;
public class Practice_10 {
    public static void main(String[] args) {
// Scanner nextX and nextLine will solve the capturing all issue
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your age? ");
        int age=scan.nextInt();

        scan.nextLine();
        System.out.println("What is your full name?");
        String fullName=scan.nextLine();

        System.out.println("Your name is " + fullName+ ", your age is "+ age);




    }
}
