package Practice;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;


public class HashSet {
    public static void main(String[] args) {

        System.out.println(new String ("Taha").hashCode());
        System.out.println(new String ("Taha").hashCode());
        System.out.println(new String ("Kaan").hashCode());


        Set<String> list= new java.util.HashSet<>(Arrays.asList("Ali","Veli","Deli","Deli","Veli"));
        System.out.println("list = " + list);

        Set<String> list1= new java.util.LinkedHashSet<>(Arrays.asList("Ali","Veli","Deli","Deli","Veli"));
        System.out.println("list1 = " + list1);

        Set<String> list2= new TreeSet<>(Arrays.asList("Ali","Veli","Deli","Deli","Veli"));
        System.out.println("list2 = " + list2);


    }
}
