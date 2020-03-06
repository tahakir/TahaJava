package day61;

import java.util.LinkedList;
import java.util.List;

public class List_LinkedListImplementation {
    public static void main(String[] args) {
        
        List<String> lst= new LinkedList<>();
        lst.add("Zeynep");
        lst.add("Ayse");
        lst.add("John");
        lst.add("Karen");

        System.out.println("lst = " + lst);
        
        lst.remove("Ayse");
        System.out.println("lst = " + lst);
        
        
    }
}
