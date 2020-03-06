package Exceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class ExceptionHandling {
    public static void main(String[] args) {


        int [] number={100,200,300};

        try {
            System.out.println(number[5]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
            System.out.println("Try block.Checked exception");

        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Catch block.Unchecked exception");
        }

        System.out.println("================================================");

        try {
            Thread.sleep(100);
            System.out.println("Try block.checked exception");
        }catch (InterruptedException e){

            System.out.println("Catch block.unchecked exception");
        }
        System.out.println("Work done");

        ArrayList<Integer> list= new ArrayList<Integer>();
        list.addAll(Arrays.asList(1,2,3));

        try {
            System.out.println(list.get(10));
            System.out.println("Try block.checked exception occurred in arrayList");
        }catch (RuntimeException x){ //IndexOutOfBoundsException//Exception
            System.out.println("Catch block.Unchecked exception occurred in arrayList");
        }




    }
}
