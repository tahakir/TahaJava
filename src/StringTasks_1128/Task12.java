package StringTasks_1128;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {


//        Task 12:
//        Given a String with at least two characters
//        swap first character with last character
//        for example
//        Java --> aavJ , Kawap --> pawaK


        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your word");
        String word=scan.next();
        String swapWord;
        String firstChar=word.substring(0,1);
        int lastChar=word.length()-1;

        String lastCharx=word.substring(lastChar);

        System.out.println();


    }
}
