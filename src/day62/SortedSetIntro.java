package day62;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetIntro {
    public static void main(String[] args) {


        SortedSet<Integer> mySet= new TreeSet<>();
        mySet.add(70);
        mySet.add(70);
        mySet.add(30);
        mySet.add(30);
        mySet.add(65);
        mySet.add(35);

        System.out.println("mySet = " + mySet);

        System.out.println("mySet.first() = " + mySet.first());
        System.out.println("mySet.first() = " + mySet.last());
        System.out.println("mySet.headSet(30) = " + mySet.headSet(65));//ind(65 is the index 2)
        System.out.println("mySet.subSet(35,70) = " + mySet.subSet(35, 70));//from 35 until the element 70
        System.out.println("mySet.tailSet(70) = " + mySet.tailSet(65));//from 65 onwards

    }
}
