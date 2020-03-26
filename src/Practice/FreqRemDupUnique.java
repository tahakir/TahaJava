package Practice;
import java.util.Arrays;
import java.util.Collections;
public class FreqRemDupUnique {
    public static void main(String[] args) {
        String str="AAAAABBBBBBBCCCCCCCCDDDDDEFG";
        String removeDup="";
        for (int i = 0; i <str.length() ; i++) {
            if(!removeDup.contains(str.substring(i,i+1))){

                removeDup+=str.substring(i,i+1);
            }
        }
        System.out.println("removeDup = " + removeDup);
        System.out.println("----------------------------------------");

        String result="";
        for (int i = 0; i <removeDup.length() ; i++) {
            int count=0;
            for (int j = 0; j <str.length() ; j++) {
                if(str.substring(j,j+1).equals(removeDup.substring(i,i+1))){
                    count++;
                }
            }
            result+=removeDup.substring(i,i+1)+count;
        }
        System.out.println("frequency = " + result);
        System.out.println("----------------------------------------");

        String x=unique("AAAAABBBBBBBCCCCCCCCDDDDDEFG");
        System.out.println("Uniqueness = " + x);
    }
    public static String unique(String abc){
        String result="";
        for (String each  : abc.split("") )
        result+=((Collections.frequency(Arrays.asList(abc.split("")),each))==1)?each:"";
        return result;
    }
}
