package day37;

import java.util.ArrayList;
import java.util.List;

public class F_MethodWithArrayListAsReturnType {
    public static void main(String[] args) {

        System.out.println(getListFrom1ToFinalNumber(7));
        System.out.println(getListFrom1ToFinalNumber(2));
        System.out.println(getListFrom1ToFinalNumber(24));
        
        List<Integer> myList=getListFrom1ToFinalNumber(26);
        System.out.println("myList = " + myList);
        
    }
    //Create a method that accept a finalNumber as int
    //return an ArrayList of Integer containing numbers
    //starting from 1 till finalNumber
    
        public static List<Integer> getListFrom1ToFinalNumber(int finalNumber ){
            List<Integer>nums=new ArrayList<>();
            for (int numbers = 0; numbers <=finalNumber ; numbers++) {
                nums.add(numbers);
            }
         //   System.out.println("nums = " + nums);
        
            return nums;
        }
        
}
