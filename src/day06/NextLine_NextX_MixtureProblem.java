package day06;
import java.util.Scanner;
public class NextLine_NextX_MixtureProblem {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("What is your name? ");
        String name=scan.nextLine();
        System.out.println("Your name is : "+name);

        System.out.println("What is your age? ");
        int age=scan.nextInt();//When you hit enter it captures the next "nextline"
        scan.nextLine();//we are not storing this one
        //because so that it does not accidentally
        // get captured by the next line we use to capture address
        System.out.println("Your age is : " +age);

        System.out.println("What is your address? ");
        String address1=scan.nextLine();
        System.out.println("Your address is : " + address1);











    }

}
