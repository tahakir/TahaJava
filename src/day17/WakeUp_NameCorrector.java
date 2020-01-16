package day17;

import java.util.Scanner;
public class WakeUp_NameCorrector {
    public static void main(String[] args) {
        /*WAKE UP TASK 1 :
        create a class called WakeUp_NameCorrector with main
                Create a String variable to store your name in any case combination
        for example  jon jOn jON  any of them :
        Create a variable called name2
        make your first letter uppercase then rest lowercase
        jon  ---> Jon    arya -->> Arya
        Optionally ask your name from Scanner
        Optionally ask your full name
                -->> then make your full name first letter uppercase the rest lowercase

         */
        String name="tAhA";
        //substring method copy to part of String inside another String
        //it has 2 versions
        //1) start with certain index and end at ending index
        //2)start with certain index and get the rest.

         //get the first character--->make it upper case
        //get the rest of the characetrs starting from 2nd character
        //then make it lower case
        //eventually concatinate

       // String nameFixed=(name.charAt(0)+"").toUpperCase();
        //nameFixed=nameFixed+name.substring(1).toLowerCase();

        String nameFixed=name.toUpperCase().substring(0,1);
        nameFixed+=name.substring(1).toLowerCase(); //1 yazinca bundan sonrasini da alir
        //substring or to lowercase can come first does not matter!

        System.out.println("nameFixed = " + nameFixed);


        //make whole name upper case the get the first character
        //get the rest of the characteres starting from the 2nd character
        //then make it lowercase
        //eventually conc.



        String myName;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your name");
        myName=scan.nextLine();

        String correctedName=myName.toUpperCase().substring(0,1);
        System.out.println(correctedName+myName.toLowerCase().substring(1));









    }
}
