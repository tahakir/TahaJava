package Practice;

import java.util.*;

public class IterableInterface {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 1, 1, 2, 2, 3, 3, 4, 5, 6, 7));

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) == 1) {
                list.remove(i);
            }


        }
        // System.out.println("list = " + list);

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 1, 1, 1, 2, 2, 3, 3, 4, 5, 6, 7, 1, 1, 1, 11, 1));
        Iterator<Integer> it = list2.iterator();//we link with the list2
        boolean a = it.hasNext();
       // System.out.println("a = " + a);
       // System.out.println(it.next());

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1, 1, 1, 1, 2, 2, 3, 3, 4, 5, 6, 7, 1, 1, 1, 11, 1));
        Iterator<Integer> it3 = list3.iterator();//we link with the list2

        while (it3.hasNext()){
           int num= it3.next();
           if(num==1){
               it3.remove();
           }
        }
        System.out.println(list3);

        System.out.println("=========================================");

        Set<Integer> set= new LinkedHashSet<>(Arrays.asList(10,20));
        System.out.println(set);


        Iterator<Integer> iterate=set.iterator();
        System.out.println("iterate.hasNext() = " + iterate.hasNext());
        System.out.println("iterate.next() = " + iterate.next());
        System.out.println("iterate.next() = " + iterate.next());

        System.out.println("=========================================");
        String[] name={"Erhan","Eholly","Nadire","Emrah","Taha","Kaan"};
        Set<String> names= new LinkedHashSet<>();
        names.addAll(Arrays.asList(name));

        Iterator<String> removeE= names.iterator();

        while (removeE.hasNext()){
           String str= removeE.next();
           if(!str.toLowerCase().contains("e")){
               removeE.remove();
           }

        }
        System.out.println("names = " + names);

        System.out.println("=======================================");

        String[] students ={"Mike","Ercan","Nadire","Emrah","Taha","Marco","Marco","Mike","Firtina Kemal"};//remove mike and marco
        List<String> nameList= new ArrayList<>(Arrays.asList(students));
        
        for(Iterator<String> itr=nameList.iterator();itr.hasNext();){
            
            String abs=itr.next();
            if(abs.contains("Taha")|| abs.contains("Nadire")){
                itr.remove();
            }
                
        }
        System.out.println("nameList = " + nameList);



    }
}
