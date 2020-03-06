package z_Collections;

import java.util.*;

public class SetInterface {
    public static void main(String[] args) {

        Set<Integer> st1= new HashSet<>();
        st1.add(100);
        st1.add(100);
        st1.add(100);

        System.out.println(st1);

        System.out.println("===================");
        
        Set<Integer> hashset= new HashSet<>();
        hashset.add(10);
        hashset.add(13);
        hashset.add(144);
        hashset.add(1);
        hashset.add(100);
        hashset.add(87);

        System.out.println("hashset = " + hashset);
        
        
        Set<Integer> linkedHash= new LinkedHashSet<>();

        linkedHash.add(10);
        linkedHash.add(13);
        linkedHash.add(144);
        linkedHash.add(1);
        linkedHash.add(100);
        linkedHash.add(87);
        System.out.println("linkedHash = " + linkedHash);

        System.out.println("========================");

        SortedSet<String> treeSet= new TreeSet<>();
        treeSet.add("z");
        treeSet.add("x");
        treeSet.add("a");
        treeSet.add("f");
        treeSet.add("f");
        treeSet.add("g");
        System.out.println("treeSet = " + treeSet);


        String str="AAAABBBCCCDDD";
        String result="";
        for (int i = 0; i <str.length() ; i++) {

            if(!result.contains(""+str.charAt(i))){

                result+=""+str.charAt(i);

            }
        }
        System.out.print("The result is: "+result);

        String str2="AAAABBBCCCDDD";
        String [] arr=str.split("");
        System.out.println(Arrays.toString(arr));
        
        TreeSet<String> removeDup= new TreeSet<>(Arrays.asList(arr));
        String result1=removeDup.toString().replace("[","").replace("]","");
        System.out.println(result1);

    }
}
