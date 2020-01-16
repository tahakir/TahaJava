package Recaps;
import java.util.Arrays;
public class L_Arrays_SearchingAnArray {
    public static void main(String[] args) {

        int[] numbs={11,22,33,44,55,66,77};

        System.out.println(Arrays.binarySearch(numbs,11));
        System.out.println(Arrays.binarySearch(numbs,22));
        System.out.println(Arrays.binarySearch(numbs,33));
        System.out.println(Arrays.binarySearch(numbs,44));
        System.out.println(Arrays.binarySearch(numbs,46));
        //We got - because we dont have it//if it were exists it could have been at index 5
        System.out.println(Arrays.binarySearch(numbs,55));
        System.out.println(Arrays.binarySearch(numbs,61));
        //We got - because we dont have it//if it were exists it could have been at index 6
        System.out.println(Arrays.binarySearch(numbs,66));
        System.out.println(Arrays.binarySearch(numbs,77));



    }
}
