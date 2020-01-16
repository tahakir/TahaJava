package day06;
import java.util.Scanner;
public class Remainder_Repeat {

    public static void main(String[] args) {

        //declare a variable called minutes data type int
        //ask user to enter minutes as whole number
        //print the result in x hour y minutes format
        //for exp. 135 minutes, 2 hours 15 minutes


        System.out.println("How many minutes you have got?");
        Scanner scan=new Scanner(System.in);
        int minutes=scan.nextInt();
        int hoursP=minutes/60;
        int minutesP=minutes%60;
        System.out.println(minutes + " minutes ," +hoursP + " hours and," + minutesP + " minutes. ");





    }


}
