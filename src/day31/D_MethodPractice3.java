package day31;

import javax.xml.namespace.QName;

public class D_MethodPractice3 {

    //write piece of reusable code to count from 1 to 10
    //give a name count1to10                                :method name
    //no need for subject when being called                 :static
    //it should be accessible anywhere in your project      :public
    //it does not return any value                          :void
    //does not need any external data when being called     :(nothing inside)


// Create a method called countDownFrom20tillOne
// Create a method to print odd numbers from 1-100 : printOddNumbers1to100()
// Create a method to spell your name :  Seda -->> S-e-d-a

    public static void countDownFrom20tillOne(){


    for (int i = 20; i >0 ; i--) {
        System.out.print(i+" ");
    }
        System.out.println();

    }

    public static void printOddNumbers1to100(){
        for (int i = 1; i <100 ; i+=2) {

            System.out.print(i+ " ");
    }


    }

    public static void spellName(){

        String name="Taha";

        for (int i = 0; i <name.length() ; i++) {

            System.out.print(name.charAt(i)+"-");
        }

    }

    public static void main(String[] args) {

       countDownFrom20tillOne();
        System.out.println();
        printOddNumbers1to100();
        System.out.println();
        spellName();


    }



}
