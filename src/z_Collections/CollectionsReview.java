package z_Collections;

import java.util.*;

public class CollectionsReview {
    public static void main(String[] args) {

        List<Integer> list1= new ArrayList<Integer>();
        list1.addAll(Arrays.asList(100,100,100));
        System.out.println("list1 = " + list1);


        Set<Integer> set1= new HashSet<>();
        set1.add(100);
        set1.add(100);
        System.out.println("set1 = " + set1);

        ArrayList<Integer> arrayList= new ArrayList<>();
        arrayList.add(10);

        Vector<Integer> vector = new Vector<>();


        Stack<Integer> stack= new Stack<>();
        stack.add(100);
        stack.add(200);
        stack.add(300);

        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack = " + stack);
    }
}
