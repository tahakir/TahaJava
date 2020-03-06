package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ItirationDelete {
    public static void main(String[] args) {


        List<Integer> list1= new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
        
        for (Iterator<Integer> it= list1.iterator(); it.hasNext();){
            
           int a =it.next();
           if(a%2==0){
               it.remove();
           }
           
        }
        System.out.println("list1 = " + list1);

        List<Integer> list2= new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
        Iterator<Integer> it2= list2.iterator();
        
        while(it2.hasNext()){
            int x =it2.next();
            if(x%2==1){
                it2.remove();
            }
        }
        System.out.println("list2 = " + list2);
    }
}
