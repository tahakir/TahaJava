package day10;
import java.util.Scanner;
public class SeasonAction {
    public static void main(String[] args) {

        /*
        *What do you do in each season?
        * Spring--> Hike! Easter,Nawruz,Blossom
        * Summer-->Swim, Vacation, BBQ,Holiday
        * Fall---> Harvest,Hiking,Halloween,Shopping
        * Winter---> Snowboarding ,Ski, Christmas,new Year
        *
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Hey What is the season????");
String season=scan.next();


        switch(season){

            case "Spring":
                System.out.println("Hike! Easter,Nawruz,Blossom");
                break;
            case"Summer":
                System.out.println("Swim, Vacation, BBQ,Holiday");
                break;
            case"Fall":
                System.out.println("Harvest,Hiking,Halloween,Shopping");
                break;
            case "Winter":
                System.out.println("Snowboarding ,Ski, Christmas,New Year");
                break;

            default:
                System.out.println("Unknown season");
                break;


        }
        System.out.println("Great season to find your love " + season);

    }
}
