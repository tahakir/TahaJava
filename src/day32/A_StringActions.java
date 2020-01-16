package day32;

public class A_StringActions {


    public static void main(String[] args) {

        //reversePrintMyOwnName();
       // String name="Taha";
        printStringWithDashInBetween("Hasan");
        printStringWithDashInBetween("Nargiz");
        printStringWithDashInBetween("Olga");
        printStringWithDashInBetween("Taha");
        printStringWithDashInBetween("Lisa");
        printStringWithDashInBetween("Akbar");
        reversePrintMyOwnName();
    }

    //printStringWithDashInBetween
    //it has one String parameter called name
    //it will do following in method body
    //excluding the last one
    //logic: keep concatenating after each character
    //when it comes to the last character don't add it


    public static void printStringWithDashInBetween(String name){


        for (int i = 0; i <name.length() ; i++) {

            System.out.print(name.charAt(i));
            //if i am not at last index then I print
            if(i!=name.length()-1){
                System.out.print("-");
            }
        }
        System.out.println();

    }




    /*
    *reversePrintMyOwnName
    * create a method that has no parameter
    * and print your name in reversed order
     */

    public static void reversePrintMyOwnName(){

        String name="Taha";
        //start from last character and print to first character
        //put dash between characters

        for (int i =name.length()-1 ; i>=0; i--) {
            System.out.print(name.charAt(i) +"-");

        }


    }

}
