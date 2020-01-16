package day16;
import java.util.Scanner;
public class Repl_98_FindingAWord {
    public static void main(String[] args) {

        //        Print out the number of times that the string "hi" appears anywhere in the given string.
////        Example:
////        input: abc hi how hi
////        output: 2
////
////        Example:
////        input: hi code java please
////        output: 1


        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int count=0;

        for (int i = 0; i <str.length() ; i++) {
            if(str.substring(i).startsWith("hi")){
                count++;
            }
        }
        System.out.println(count);














    }
}
