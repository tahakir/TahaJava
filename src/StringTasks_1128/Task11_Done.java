package StringTasks_1128;

import java.util.Scanner;

public class Task11_Done {
    public static void main(String[] args) {


//        Task 11:
//        Ask user to enter sentence with more than 1 word
//        For example I love Java
//        write a program to
//        print first word and last word

        Scanner scan=new Scanner(System.in);
        System.out.println("enter sentence with more than 1 word");
        String sentence=scan.nextLine();

        int firstSpaceIndex=sentence.indexOf(" ");
        String firstWord=sentence.substring(0,firstSpaceIndex);

        int lastSpaceIndex=sentence.lastIndexOf(" ");
        String secondWord=sentence.substring(firstSpaceIndex+1,lastSpaceIndex);

        String lastWord=sentence.substring(lastSpaceIndex+1);

        System.out.println(firstWord+" "+lastWord);



    }
}
