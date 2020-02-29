package InterviewPrep;


import java.util.*;

public class InterviewQuestionsPart1 {


    public static void main(String[] args) {

        System.out.println("frequency(\"aaaabbbbrrrr\") = " + frequency("aaaabbbbrrrr"));

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,11,6,33,7,8,9,10));
        System.out.println("maximum(list) = " + maximum(list));


        System.out.println("minimum() = " + minimum(list));

    }

    public static String removeDup(String xyz){

        String result="";

        for (int i = 0; i <xyz.length() ; i++) {
            if(!result.contains(xyz.substring(i,i+1))){

                result+=xyz.substring(i,i+1);

            }

        }
        return result;
    }

    public static int numOfApp(String a,String b){

        int count=0;
        while (a.contains(b)){

            count++;
            a=a.replaceFirst(b,"");

        }

        return count;
    }


    public static String frequency(String str){

        String nonDup=removeDup(str);
        String result="";

        for (int i = 0; i <nonDup.length() ; i++) {

            int freq=numOfApp(str,nonDup.substring(i,i+1));

            result+=nonDup.substring(i,i+1)+freq;
        }


        return result;
    }

    public static int maximum(ArrayList<Integer> list){

        int max=0;

       for(int each:list){
           if(each>max){

               max=each;
           }
       }
       return max;

    }


    public static int minimum(ArrayList<Integer> list){

        int min=Integer.MAX_VALUE;

        for(int each:list){
            if(each<min){

                min=each;
            }
        }
        return min;
    }
}







