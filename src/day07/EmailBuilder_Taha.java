package day07;
import java.util.Scanner;

public class EmailBuilder_Taha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name? : ");
        String firstName =scan.next();
scan.nextLine();
        System.out.println("What is your last name? : ");
        String lastName =scan.next();
        scan.nextLine();
        System.out.println("What is your company name? : ");
        String companyName =scan.next();
        scan.nextLine();
        System.out.println("What is your e-mail address? : ");
        String emailAddress =firstName+"_"+lastName+"@"+companyName+".com";
        System.out.println("My name is " + firstName + " and " + " I work for " + companyName+ " and my email is " + emailAddress);



    }
}
