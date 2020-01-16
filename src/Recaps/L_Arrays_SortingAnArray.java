package Recaps;
import java.util.Arrays;
public class L_Arrays_SortingAnArray {
    public static void main(String[] args) {


         int [] sorting={77,32,55,22,44,89,99};
         Arrays.sort(sorting);

         for(int order  : sorting ){

             System.out.println("Numbers sorted : " +order);
         }


    }
}
