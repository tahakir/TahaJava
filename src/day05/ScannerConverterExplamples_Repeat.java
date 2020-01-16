package day05;
import java.util.Scanner;
public class ScannerConverterExplamples_Repeat {
    public static void main(String[] args) {
        //how many minute in a day?

        // use scanner
       /* System.out.println("How many minute in an hour");
        Scanner scan=new Scanner(System.in);
        int hoursOfDay=scan.nextInt();
        hoursOfDay=60*24;

        System.out.println("A day has : " + hoursOfDay + " minutes ");

        //// hourly wage and generate yearly salary/ assume 2080 hours

        System.out.println("What is your hourly salary?");
        Scanner scan=new Scanner(System.in);
        int Total=scan.nextInt();
        int hourlyPay=15;
        int totalWage=2080*hourlyPay;

        System.out.println("Your yearly salary is: " + totalWage);

        */
        //Grocery Shopping
     // 1) ask user whats the price of tomato and store it
        //ask user how many tomato you want to buy and store it
       //2) ask user whats the price of potato and store it
        //ask user how many potato you want to buy and store it
       //3) ask user whats the price of banana and store it
        //ask user how many banana you want to buy and store it

        //generate this example output
        //You got 3 tomato price is 2.99 and total -->>
          //      You got 5 potato price is 3.49 and total -->>
            //    You got 2 banana price is 1.99 and total -->>

              //  Your grand total for this shopping is ????

        System.out.println("What is the price of a tomato?");
        Scanner scan=new Scanner(System.in);
        double priceTomato=scan.nextDouble();
        System.out.println("How many tomatoes you have bought?");
        int totalTomatoes=scan.nextInt();

        System.out.println("What is the price of a potato?");
        double pricePotato=scan.nextDouble();
        System.out.println("How many potatoes you have bought?");
        int totalPotatoes=scan.nextInt();

        System.out.println("What is the price of a banana?");
        double priceBanana=scan.nextDouble();
        System.out.println("How many bananas you have bought?");
        int totalBanana=scan.nextInt();

        System.out.println(priceBanana*totalBanana+pricePotato*totalPotatoes+priceTomato*totalTomatoes + "is your total");





    }
}
