package Recaps;
import java.util.Scanner;
public class K_Looping_While_Counting {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your number");
        int number = scan.nextInt();

//        int count=1;
//        while (count<=number){
//            System.out.print(count + ",");
//            count++;
//        }

        int even=0;
        while (even<=number){
            System.out.print(even + ",");
            even+=5;
        }


    }
}
