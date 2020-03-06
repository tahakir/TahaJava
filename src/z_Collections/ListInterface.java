package z_Collections;

import java.util.*;

public class ListInterface{
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<String> list2= new LinkedList<>();
        List<Double> list3= new Vector<>();


        ArrayList<Integer> arrayList= new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.remove(1);

        System.out.println("Array List: "+arrayList);

        LinkedList<Integer>linkedList= new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.remove(1);

        System.out.println("LinkedList: "+linkedList);

        System.out.println("===============================");

        String[]arr={"A","B","C"};

        List<String> list= new ArrayList<>(Arrays.asList(arr));
        LinkedList<String>linked= new LinkedList<>(Arrays.asList(arr));
        System.out.println("linked = " + linked);

        Vector<Integer> vt= new Vector<>();
        vt.add(1);

        System.out.println("========================");

        Stack<Integer> st= new Stack<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);

        System.out.println("pop 1 "+st.pop());
        System.out.println("st 1 = " + st);
        System.out.println("pop 2 "+st.pop());
        System.out.println("st 2 = " + st);


    }
}
