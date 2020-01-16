package day37;

import java.util.ArrayList;

public class E_MethodWithArrayListParameter {
    public static void main(String[] args) {

        ArrayList<String> nameLst = new ArrayList<String>();
        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Guzelnurin");
        
        printAList(nameLst);

    }

    //create a method that accept a list of String as argument
    //same thing as method that has list of String parameter
    //and print out each and every item in the list vertically
    
    public static void printAList(ArrayList<String>list){
        for (String each : list) {

            System.out.println("each = " + each);
            
        }
        
    }
    
}
