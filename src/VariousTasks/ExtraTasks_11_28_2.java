package VariousTasks;
import java.util.Scanner;
public class ExtraTasks_11_28_2 {
    public static void main(String[] args) {

        //NUMBER TASKS WITH LOGICAL OPERATOR
        /*
        Task 2 :
        given 3 whole numbers variable  num1, num2 , num3 with value already set .
        and another int variable called sumOfSpecialNumber with initial value 0
        Write a program to print
        Only the sum of numbers that more than 20
        for example  10, 25, 30 . --->> 25+30=55

         */

        int num1=8;
        int num2=13;
        int num3=5;

        if(num1+num2>20){
            System.out.println("It is more than 20 v1");
        }else if(num1+num3>20){
            System.out.println("It is more than 20 v2");
        }else if(num2+num3>20){
            System.out.println("It is more than 20 v3");
        }else{
            System.out.println("Not greater than 20");
        }


    }
}
