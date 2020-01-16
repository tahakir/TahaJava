package day07;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class CastingTheCharacter {
    public static void main(String[] args) {


        char grade='B';
        System.out.println(grade);

        int letterInNumber='B'; //B is represented by 66 in ASCII Table
        // here type char is automatically widened to int
        //and stored as number

        System.out.println(letterInNumber);

        int letterInNumber2='b';
        System.out.println(letterInNumber2);


        //--------------------------
        char myFirstChar=(char)100;
        System.out.println(myFirstChar);

        ///Print My name number each letter

        int num1='T';
        System.out.println(num1);
        int num2='A';
        System.out.println(num2);
        int num3='H';
        System.out.println(num3);
        int num4='A';
        System.out.println(num4);
        System.out.println(num1 + num2 +num3 + num4);


        // adding a character to an int number will result in int

        char letterA='a';
        System.out.println(letterA+1);

        System.out.println("" + letterA + 1);




    }
}
