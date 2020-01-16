package day19;
import java.util.Scanner;
public class HomeWork_Integer {
    public static void main(String[] args) {
        // Homework

        // Create a program to
        // ask user two number and
        // add numbers within those range
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number 1:");
        int num1 = scan.nextInt();
        System.out.println("Please enter number 2:");
        int num2 = scan.nextInt();
        int sum=0;
        if (num1>num2){
            for (int i = num2; i <= num1; i++) {
                sum+=i;
            }
        }
        else if (num1<num2){
            for (int i = num1; i <= num2; i++) {
                sum+=i;

            }

        }
        else {
            System.out.println(num1);
        }
        System.out.println(sum);





    }
}
