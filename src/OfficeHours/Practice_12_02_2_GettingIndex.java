package OfficeHours;
import java.util.Scanner;
public class Practice_12_02_2_GettingIndex {
    public static void main(String[] args) {

        System.out.println("What is your name?");
        Scanner scan=new Scanner(System.in);


        String name=scan.nextLine();

        //getting each character using charAt(index)
        //generate sequential number 0---->10



        //is there any chance that while loop does not execute

        int x=0;

        while (x<name.length()){
            System.out.println("index:" + x);
            System.out.println(name.charAt(x));
            ++x;
        }

    }
}
