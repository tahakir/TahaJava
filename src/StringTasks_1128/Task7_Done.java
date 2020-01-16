package StringTasks_1128;

import java.util.Scanner;

public class Task7_Done {
    public static void main(String[] args) {


//        Task 7:
//        Ask user to enter valid email address
//        for example :
//        JSnow@NightWatch.com or
//        Arya@KingsLanding.edu
//        print 3 part of the email separately
//        for example :
//        Part1 -> JSnow  Part2 -> NightWatch Part3 ->com
//        Part1 -> Arya   Part2 -> KingsLanding Part3 ->edu

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your email address");
        String email=scan.next();
        int x=email.indexOf("@");

        String firstPart=email.substring(0,x);
        int dot=email.indexOf(".");

        String secondPart=email.substring(x+1,dot);
        String thirdPart=email.substring(dot+1);


        System.out.println("Part 1--->"+firstPart+" "+"Part 2--->"+secondPart+" "+"Part 3--->"+thirdPart);
    }
}
