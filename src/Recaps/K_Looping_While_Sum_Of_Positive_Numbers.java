package Recaps;
import java.util.Scanner;

public class K_Looping_While_Sum_Of_Positive_Numbers {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

      int total=0;
        System.out.println("Please enter a positive number");
        int nextNumber=scan.nextInt();

        while (nextNumber>0){

            total=total+nextNumber;
            nextNumber=scan.nextInt();
        }
        System.out.println("Sum of all numbers " + total);


    }
}
