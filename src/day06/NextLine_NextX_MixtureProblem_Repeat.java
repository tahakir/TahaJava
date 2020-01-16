package day06;
import java.util.Scanner;
public class NextLine_NextX_MixtureProblem_Repeat {
    public static void main(String[] args) {

        System.out.println("What is your full name?");
        Scanner scan=new Scanner(System.in);
        String fullName=scan.nextLine();


        System.out.println("When is your birthday?");
        String birthday=scan.nextLine();

        System.out.println("Your full name is:" +fullName+ "and your birthday is: "+ birthday);







    }

}
