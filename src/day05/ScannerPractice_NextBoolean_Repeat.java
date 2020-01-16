package day05;
import java.util.Scanner;
public class ScannerPractice_NextBoolean_Repeat {
    public static void main(String[] args) {

        //creating scanner object
        //asking user are you recording
        //the result of concatenating a string to any data typr--->string
        System.out.println("Are you recording?");
        Scanner scan=new Scanner(System.in);
        boolean isRecording=scan.nextBoolean();

        System.out.println("Your recording result is: " + isRecording);





    }
}
