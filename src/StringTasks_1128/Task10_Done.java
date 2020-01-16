package StringTasks_1128;

import java.util.Scanner;

public class Task10_Done {
    public static void main(String[] args) {


//        Task 10:
//        Ask user to enter sentence with 3 words
//        For example I love Java
//        write a program to print second word

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a sentence with 3 words: " );
        String sentence=scan.nextLine();

        int firstSpaceIndex=sentence.indexOf(" ");
        String firstWord=sentence.substring(0,firstSpaceIndex);
        int lastSpaceIndex=sentence.lastIndexOf(" ");
        String secondWord=sentence.substring(firstSpaceIndex+1,lastSpaceIndex);

        System.out.println(secondWord);




    }
}
