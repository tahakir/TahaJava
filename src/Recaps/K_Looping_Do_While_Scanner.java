package Recaps;
import java.util.Scanner;
public class K_Looping_Do_While_Scanner {
    public static void main(String[] args) {

        int number,count;

        System.out.println("Enter number");
        Scanner scan=new Scanner(System.in);
        number=scan.nextInt();

count=1;

        do{
            System.out.println(count+", ");

            count++;
        }while (count<=number);










    }
}
