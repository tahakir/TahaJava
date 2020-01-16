package day37;

import java.util.ArrayList;

public class A_TeamMateListPractice {
    public static void main(String[] args) {

        ArrayList<String> teamMates=new ArrayList<>();
        teamMates.add("Taha");
        teamMates.add("Asena");
        teamMates.add("Vlad");
        teamMates.add("Rana");
        teamMates.add("Umit");
        teamMates.add("Sena");

        System.out.println("teamMates = " + teamMates);

        //first item
        System.out.println("The first item= " + teamMates.get(0));
        //last item
        int lastItemIndex=teamMates.size()-1;
        System.out.println("The first item= " + teamMates.get(lastItemIndex));

        //print one by one

        for (int i = 0; i <teamMates.size() ; i++) {
            System.out.println("print one by one = " +teamMates.get(i) );
        }

        //size
        System.out.println("Team size is= " +teamMates.size());
        // reverse print

        for (int i = teamMates.size()-1; i >=0 ; i--) {

            System.out.println("Reverse print  " +"item = " + (i+1)+" "+teamMates.get(i));
        }

        //get 2 items at a time
        System.out.println("\n");
        for (int i = 0; i <=teamMates.size()-2 ; i++) {
            System.out.println("two items at a time " + teamMates.get(i)+","+teamMates.get(i+1));

        }
        //get 2 items at a time but do not repeat the item

        for (int i = 0; i <=teamMates.size()-2 ; i+=2) {
            System.out.println("two item at a time but not repeating= " +teamMates.get(i)+","+teamMates.get(i+1));
        }
        
        //pair them up by 3
        //concat everyone in one string separated by -
        String result="";

        for (int i = 0; i <teamMates.size() ; i++) {
            if(i!=lastItemIndex){
                result=result+teamMates.get(i)+"-";
            }else{
                result=result+teamMates.get(i);

            }


        }
        System.out.println("result = " + result);

        String lstToString=teamMates.toString();
        System.out.println("lstToString after replacing =\n"
        +lstToString.replace(", ","-")
                    .replace("[","")
                    .replace("]",""));

    }
}
