package day06;
import java.util.Scanner;
public class Remainder {

    public static void main(String[] args) {

        //System.out.println(5/2);
        //System.out.println(5.0/2);
        //System.out.println(5.0/2f);
        //The remainder is left over whole number
        //5 divided by 2 is 2 and remainder is 1
        //2*2=4 1 is the remainder
        //System.out.println(5%2);
        //10*9 +9=99
        //System.out.println(99%10);

        //declare a variable called minutes data type int
        //ask user to enter minutes as whole number
        //print the result in x hour y minutes format
        //for exp. 135 minutes, 2 hours 15 minutes


        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the minutes: ");
        int minutes=scan.nextInt();
          // 135 ; //60*2+15

        int hourPart = minutes / 60;     //135/60 ;  // -->> 2
        int minsPart = minutes % 60; // 135%60 ;  // -->> 15

        System.out.println(" The minutes " + minutes + " is "
                + hourPart + " hours and " + minsPart + " minutes");










    }
}
