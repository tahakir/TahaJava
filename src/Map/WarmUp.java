package Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class WarmUp {

    public static void main(String[] args) {

        List<Integer> list1= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));



        for (Iterator<Integer> itr = list1.iterator(); itr.hasNext() ;) {
          int x=  itr.next();
          if(x%2==0){
              itr.remove();
          }
        }
        System.out.println("list1 = " + list1);

        List<Integer> list2= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        Iterator<Integer> it2=list2.iterator();

        while (it2.hasNext()){
           int z= it2.next();
            if(z%2==1){
                it2.remove();
            }
        }
        System.out.println("list2 = " + list2);
    }
}
