package day08;
import java.util.Scanner;
public class WarmUpTask {
    public static void main(String[] args) {

        int age=18;
        if(age>=18){
            System.out.println("You are ready to vote!!!");
        } else {
            System.out.println("Wait until you are 18!!!");
        }

        Scanner scan=new Scanner(System.in);

        int myFavouriteNumber=15;
        System.out.println("Guess your favourite number?");
            myFavouriteNumber=scan.nextInt();
        if(myFavouriteNumber==15){
            System.out.println("BINGO!!!");
        }else{
            System.out.println("Try again later");
        }



    }


}
