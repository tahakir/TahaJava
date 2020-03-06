package Practice;

import java.util.*;

public class ListPractice {
    public static void main(String[] args) {

        List<Double> list = new LinkedList<>(Arrays.asList(3d, 4d, 22d, 44d, 55d, 3d, 3d, 55d));
        System.out.println("list = " + list);

        System.out.println("list.get(3) before = " + list.get(3));

        list.add(3, 99d);
        System.out.println("list = " + list);
        System.out.println("list.get(3) after = " + list.get(3));

        list.set(3, 75.0);
        System.out.println("list = " + list);

        System.out.println("list.indexOf(15) = " + list.lastIndexOf(1000));


        list.replaceAll(x -> x + 5d);
        System.out.println("list after adding 5:" + list);

        list.sort(Comparator.naturalOrder());
        System.out.println("The list after sorting in natural order: " + list);
        list.sort(Comparator.reverseOrder());
        System.out.println("The list after sorting in reverse order: " + list);



        //getting view of your list object
        //view is part of your original list object
        //subList(from,to)

        System.out.println("list.subList(2,7) = " + list.subList(2, 7));

        List<Double> partOfListView=list.subList(1,4);
        System.out.println("partOfListView before = " + partOfListView);
        partOfListView.set(0,199.99);
        System.out.println("partOfListView after = " + partOfListView);
        System.out.println("list = " + list);

    }
}
