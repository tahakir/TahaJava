package VariousTasks;

public class ExtraTasks_11_28_3 {
    public static void main(String[] args) {

        //NUMBER TASKS WITH LOGICAL OPERATOR
        /*

        Task 3 :
        given 3 whole numbers variable num1, num2 , num3 with value already set .
        Write a program to
        find out the largest number and print the result


         */

        int num1=8;
        int num2=1;
        int num3=9;

        if(num1>num2 && num1>num3){
            System.out.println("num1 is the greatest");
        }else if(num2>num1 && num2>num3){
            System.out.println("num2 is the greatest");
        }else if(num3>num1 && num3>num2){
            System.out.println("num3 is the greatest");

        }



    }
}
