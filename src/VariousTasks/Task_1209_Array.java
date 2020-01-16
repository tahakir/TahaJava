package VariousTasks;
import java.util.*;
public class Task_1209_Array {
    public static void main(String[] args) {

//        create an int array of 6 elements and find out
//        average of the array
//        sum of all elements
//        sum of even numbers in the array
//        sum of odd numbers in the array
//        max number in the array
//        min number in the array

        int sum=0;
        int ave=0;
        int sumE=0;
        int sumO=0;
        int min=0;
        int max=0;

            int [] array=new int[6];
Scanner scan=new Scanner(System.in);

        for (int i = 0; i <=5 ; i++) {
            array[i]=scan.nextInt();
            sum+=array[i];
            if(array[i]%2==0){
                sumE+=array[i];
            }else if(array[i]%2==1){
                sumO+=array[i];
            }
        }

        System.out.println(sum);
        System.out.println(sum/6);
        System.out.println(sumE);
        System.out.println(sumO);
        Arrays.sort(array);
        System.out.println(array[0]);
        System.out.println(array[5]);

    }
}
