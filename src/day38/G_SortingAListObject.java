package day38;

import java.util.*;

public class G_SortingAListObject {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(300, 200, 700, 600, 800));
        System.out.println("before sort nums = " + nums);
        //2 ways to sort an ArrayList
        //Use Collections utility class(just like Arrays utility class for array objects)
        Collections.sort(nums);
        System.out.println("After sort nums = " + nums);

        Collections.sort(nums, Comparator.reverseOrder());
        System.out.println("nums = " + nums);

        //List itself also has sort method that accept one Comparator Object
        //simple way to get Comparator objects are
            //Comparator.naturalOrder()---->low to high order
            //Comparator.reverseOrder()---->high to low order

        nums.sort(Comparator.naturalOrder());
        System.out.println("nums after using = nums.sort(Comparator.naturalOrder() ) = " + nums);

        nums.sort(Comparator.reverseOrder());
        System.out.println("nums after using = nums.sort(Comparator.naturalOrder() ) = " + nums);

       
    }
}
