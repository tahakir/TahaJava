package AAA_LastReview;

import java.util.Scanner;

public class ScannerAndString {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your last name");
        String lastname=scanner.nextLine();
        lastname=lastname.substring(0,1).toUpperCase()+lastname.substring(1).toLowerCase();

        System.out.println(lastname);

    }
}
