package day16;

import java.util.Scanner;

public class WakeUpTask1_Reverse {
    public static void main(String[] args) {
        // given a word with 4 characters stored in a string variable
        //word1 create a string variable called word2 store the reserved word1 into word2
        // and print out
        //word1---> Java ---->word2 avaJ
        //optionally ask this word from scanner

        Scanner scan=new Scanner(System.in);

        String word="";


        word=scan.next();

        System.out.println("word1-->"+word+"---word2--->"+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0));





    }
}
