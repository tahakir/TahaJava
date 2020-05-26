package AAA_LastReview;

import java.util.Scanner;

public class ScannerClassPractice {
    public static void main(String[] args) {

//        Scanner scan=new Scanner(System.in);
//        System.out.println("Please enter your first number");
//        int num1=scan.nextInt();
//
//        System.out.println("Enter your second number");
//        int num2=scan.nextInt();
//        System.out.println("Total is: "+(num1+num2));


        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your first number");
        int num1=scan.nextInt();

        System.out.println("Enter your second number");
        int num2=scan.nextInt();

        System.out.println("Enter your third number");
        int num3=scan.nextInt();

        System.out.println("Total is: "+(num1+num2+num3));
        int max=(num1>num2&&num1>num2)?num1:
                (num2>num1&&num2>num3)?num2:
                num3;
        System.out.println("The largest number is: "+max);
    }


}
