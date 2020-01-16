package StringTasks_1128;

import java.util.Scanner;

public class Task8_Done {
    public static void main(String[] args) {

//        Task 8:
//        Ask user to enter a sentence
//        Assuming the sentence has at least 2 words
//        also assuming there is single space between words
//        -->
//            1)    first trim empty spaces in two sides
//        then
//        2)check if the first index of space is equal to last index of the space
//        if so print you have entered two words
//else print you have more than 2 words
//        For example :
//        Jon Snow -->>
//                first index of the space is 3
//        last index of the space is also 3
//        this means there is only 2 words
//
//


        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your sentence");
        String sentence=scan.nextLine().trim();

        int locationOfFirstSpace=sentence.indexOf(" ");
        System.out.println(locationOfFirstSpace);

        int locationOfSecondSpace=sentence.lastIndexOf(" ");
        System.out.println(locationOfSecondSpace);

        if(locationOfFirstSpace==locationOfSecondSpace){
            System.out.println("This means there are only two words");
        }else{
            System.out.println("There are more than 2 words");
        }



    }
}
