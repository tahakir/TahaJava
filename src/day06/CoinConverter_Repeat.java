package day06;
import java.util.Scanner;
public class CoinConverter_Repeat {
    public static void main(String[] args) {
        // you have 200 cent
        // how many quarter you can get 25c
        // how many dime you can get 10c
        // how many Nickel you can get 5c
        // how many penny you can get
        // you have purchase candle for 74 cent ,
        // what would be your remainder

        System.out.println("How many cents you have got?");
        Scanner scan=new Scanner(System.in);
        int totalCent=scan.nextInt();

        System.out.println("How much have you spent for the candle");
        int candle=scan.nextInt();

        int quarter=(totalCent-candle)/25;
        int penny=quarter%25;
        System.out.println("The remaining money is: " + quarter+"quarters and, " + penny+ "pennies");








    }
}
