package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class Unique {

    public static String findUni(String xyz){
        String result="";
        for (String each:xyz.split(""))
       result+=((Collections.frequency(Arrays.asList(xyz.split("")),each)==1)?each:"");

        return result;
    }

    public static void main(String[] args) {
        System.out.println(findUni("hhhhssssssmmmmmmmqwer"));

    }
}