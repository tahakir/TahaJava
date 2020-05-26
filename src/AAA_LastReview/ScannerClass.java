package AAA_LastReview;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a byte value");
        byte byteNum=scan.nextByte();

        System.out.println("You have entered " + byteNum);
        System.out.println("Enter another byte value");
        byte byteNum2=scan.nextByte();
        System.out.println("You have entered " + byteNum2);
        System.out.println("You have entered total: " + (byteNum+byteNum2));






    }
}
