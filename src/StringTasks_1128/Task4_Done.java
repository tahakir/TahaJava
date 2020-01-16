package StringTasks_1128;

import java.util.Scanner;

public class Task4_Done {
    public static void main(String[] args) {

//        Task 4:
//        Ask user to enter a word with at least 3 characters
//        print the first character
//        print the last character
//        print the middle character
//        for example : Uighur
//        first character : U
//        last character  : r
//        middle character: g
//                (if the length is even number get the one on the left)

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a word with at least 3 characters");

        String word=scan.next();

        if(word.length()>=3){
            System.out.println(word.charAt(0) +""+word.charAt(word.length()-1)+""+word.charAt(word.length()/2));
        }else if(word.length()%2==0){
            System.out.println(word.length()/2-1);


        }




    }
}
