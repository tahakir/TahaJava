package day06;

import java.util.Scanner;

public class UsingTheValueOfOtherVariables_Repeat {
    public static void main(String[] args) {

        int myFavouriteNumber=199;
        int yourFavouriteNumber=myFavouriteNumber;

        System.out.println("my fav.number is " + myFavouriteNumber+ " and your is: " +yourFavouriteNumber);

        Scanner input= new Scanner(System.in);
        System.out.println("WHAT IS YOUR ORDER ? I WANT THE SAME!");
        String yourOrder = input.nextLine();
        String myOrder = yourOrder;

        System.out.println("I will order :" +myOrder+ " and you will get the same order " + yourOrder);



    }
}
