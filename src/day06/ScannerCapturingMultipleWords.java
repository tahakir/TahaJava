package day06;
import java.util.Scanner;
public class ScannerCapturingMultipleWords {
    public static void main(String[] args) {

        //Scanner scan=new Scanner(System.in);

        //System.out.println("What is your name? ");
        //nextLine method of Scanner is used to capture the whole line

        //String name =scan.nextLine();

        //System.out.println("You have entered :" + name);


        Scanner scan=new Scanner(System.in);
        System.out.println("What is your name ? : ");
        String name=scan.nextLine();
        System.out.println("You have entered: " +name);
        System.out.println("Which city and state you live in ? : ");
        String cityName=scan.nextLine();
        System.out.println("You have entered: " + cityName);
        System.out.println("What is your street address ? : ");
        String street =scan.nextLine();
        System.out.println("Your street name is: " + street);
        String bio=name+cityName+street;

        System.out.println("Your bio is : " + name + "," + cityName + "," + street);

//AKBAR Note






    }
}
