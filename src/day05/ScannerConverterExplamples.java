package day05;
import java.util.Scanner;
public class ScannerConverterExplamples {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
//how many minute in a day?
        System.out.println(" How many hours is a day ? " );
        int hour=scan.nextInt();
        int dayHours=24*60;

        System.out.println(" A day is " + dayHours + " minutes ");

// hourly wage and generate yearly salary/ assume 2080 hours

        System.out.println(" What is your hourly wage ? " );
        int wage=scan.nextInt();
        int hourlyWage=20;

        System.out.println(" You make " + hourlyWage + "$ an hour ");

        System.out.println(" How many hours do you work in a year ? " );
        int salary=scan.nextInt();
        int yearWorkingHours=2080;
        int salaryYear=hourlyWage*yearWorkingHours;
        System.out.println("You make " + salaryYear + "$ in a year");

       /* Grocery Shopping
    *   ask user whats the price of tomato and store it
        ask user how many tomato you want to buy and store it
    *   ask user whats the price of potato and store it
        ask user how many potato you want to buy and store it
    *   ask user whats the price of banana and store it
        ask user how many banana you want to buy and store it

        generate this example output
        You got 3 tomato price is 2.99 and total -->>
                You got 5 potato price is 3.49 and total -->>
                You got 2 banana price is 1.99 and total -->>

                Your grand total for this shopping is ????
                *

*/
        System.out.println(" whats the price of tomato ? " );
        float tomato=scan.nextFloat()   ;
        System.out.println("How many tomatoes will you buy? ");
        int tomatoCount=scan.nextInt();
        double tomTotal=(tomato*tomatoCount);

        System.out.println("Your tomatoes will cost " + (tomato*tomatoCount));

        System.out.println(" whats the price of potato ? " );
        float potato=scan.nextFloat()   ;
        System.out.println("How many potatoes will you buy? ");
        int potatoCount=scan.nextInt();
        double patTotal=(potato*potatoCount);

        System.out.println("Your potato will cost " + (potato*potatoCount));


        System.out.println(" whats the price of banana ? " );
        float banana=scan.nextFloat()   ;
        System.out.println("How many bananas will you buy? ");
        int bananaCount=scan.nextInt();
        double banTotal=(banana*bananaCount);

        System.out.println("Your banana will cost " + (banana*bananaCount));

        double total=banTotal+tomTotal+patTotal;

        System.out.println(" Your total will be : " +total+"$ Thanks for shopping from TahaMart :)" );


    }



}
