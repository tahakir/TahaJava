package day17;
import java.util.Scanner;
public class ReverseName {
    public static void main(String[] args) {
//                     01234567
        String myName;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name");
        myName=scan.nextLine();


        int lastCharacterIndex = myName.length() - 1;

        while (lastCharacterIndex >= 0) {


            System.out.println("index " + lastCharacterIndex + " : " + myName.charAt(lastCharacterIndex));
            --lastCharacterIndex;

        }
    }
}
