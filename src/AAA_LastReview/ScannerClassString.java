package AAA_LastReview;

import java.util.Scanner;

public class ScannerClassString {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName=scan.next();
        System.out.println(firstName);

        System.out.println("Enter your last name");
        String lastName=scan.next();

        //next() takes only one word at a time
        //nextLine() as many as we can
    }
}
