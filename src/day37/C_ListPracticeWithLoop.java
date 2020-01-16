package day37;

import java.util.ArrayList;
import java.util.List;

public class C_ListPracticeWithLoop {
    public static void main(String[] args) {
        
        
        /*
        *Create an ArrayList of Integer and fill it up with 1-100
         **/
        List<Integer> nums=new ArrayList<>();
        for (int number = 1; number <=100 ; number++) {


            nums.add(number);
        }
        System.out.println("nums = " + nums);
        
        //change all the odd number value to 0;
        for (int i = 0; i <nums.size() ; i+=2) {
            nums.set(i,0);
        }
        System.out.println("nums = " + nums);

        //How to find the index of 20
        System.out.println("index of 20= " +nums.indexOf(20));

        //INSERT 100 TO FIRST INDEX
        nums.add(0,100);
        System.out.println("After adding 100 as the first item " +nums);

        System.out.println("index of 20 after adding 100= " + nums.indexOf(20));

        List<Integer> lst2 = new ArrayList<>();
        lst2.add(44);
        lst2.add(14);
        lst2.add(34);
        lst2.add(41);
        lst2.add(19);

        // insert 100 right after 34 : WE DO NOT KNOW WHERE IS 34 :

//        System.out.println(lst2.indexOf(34));
//        lst2.add(3,100);
//        System.out.println("lst2 = " + lst2);
        
        lst2.add(lst2.indexOf(34)+1,100);
        System.out.println("lst2 = " + lst2);
        //how to add 100 5 times at location 0
        for (int i = 1; i <=5 ; i++) {
            lst2.add(0,100);
        }
        System.out.println("lst2 = " + lst2);

    }
}
