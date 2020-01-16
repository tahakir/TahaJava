package day31;

public class I_SeasonChecker {
    public static void main(String[] args) {


        decideSeasonAction("Winter");
        decideSeasonAction("Summer");
        //a String variable declared and assigned value inside main method
        //It can be accesible in main method
        String mySeason="AAAA";
        decideSeasonAction(mySeason);

        System.out.println("AAAA");//You can directly pass AAAA to the method
        System.out.println(mySeason);// or you can pass a variable that has a value AAA to the method
    }

    /*
    *Write a static method called decideSeasonAction
    * It has one String parameter called season
    * Inside method:
    * according to what user passed it should print correct action
     */
    public static void decideSeasonAction(String season){

     //this season method parameter can only be accessible inside method body

        switch (season){
            case "Spring":
                System.out.println("Hiking");
                break;
            case "Summer":
                System.out.println("Swimming");
                break;
            case "Fall":
                System.out.println("Pumpking");
                break;
            case "Winter":
                System.out.println("Ski");
                break;
            default:
                System.out.println("Invalid season");

        }

    }

}
