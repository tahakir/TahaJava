package z_Collections;

import java.util.*;

public class IterableInterface {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 1, 2, 3, 4, 5, 6, 7));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 1) {
                list.remove(i);
            }
        }
        System.out.println("list = " + list);


        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 1, 1, 2, 3, 4, 5, 6, 7, 1, 1, 1, 1, 1, 1));

        Iterator<Integer> it = list2.iterator();
        boolean a = it.hasNext();
        System.out.println("a = " + a);
        System.out.println("it.next() = " + it.next());

        System.out.println("=====================================");

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1, 1, 1, 2, 3, 4, 5, 6, 7, 1, 1, 1, 1, 1, 1));

        Iterator<Integer>it3=list3.iterator();
        
        while(it3.hasNext()){
            int num=it3.next();
            if(num==1){
                
                it3.remove();
            }
        }
        System.out.println("list3 = " + list3);

        System.out.println("=====================================");

        Set<Integer> set1= new LinkedHashSet<>();
        set1.addAll(Arrays.asList(10,20));
        Iterator<Integer> iterate=set1.iterator();
        System.out.println("iterate.hasNext() = " + iterate.hasNext());
        System.out.println("iterate.next() = " + iterate.next());
        System.out.println("iterate.hasNext() 2 = " + iterate.hasNext());
        System.out.println("iterate.next() 2 = " + iterate.next());

        System.out.println("=====================================");

        String[] name= {"Erhan","Eholly","Emrah","Nadire","Taha"};
        Set<String> names= new LinkedHashSet<String>();
        names.addAll(Arrays.asList(name));

        Iterator<String> removeE = names.iterator();

        while (removeE.hasNext()){
            String str=removeE.next();
            if(!str.toLowerCase().contains("e")){
                removeE.remove();
            }

        }
        System.out.println(names);


        List<Integer> myList= new ArrayList<>();
        myList.addAll(Arrays.asList(100,900,500,99,200,220,30,88));

        for (Iterator<Integer> itr  = myList.iterator(); itr.hasNext();) {
            int numbers=itr.next();
            if(numbers>100){
                itr.remove();
            }
        }
        System.out.println("myList = " + myList);
    }
}
