package day31;

public class E_DailyRoutine {

    public static void wakeUp(){

        System.out.println("Open your eyes");
        System.out.println("Close your eyes");
        System.out.println("Hear your alarm? Open them again!");
        System.out.println("============================");
    }
    public static void drinkCoffee(){
        System.out.println("Put coffee in to your coffee machine");
        System.out.println("Press the button Make your coffee");
        System.out.println("============================");

    }
        public static void prepareKidsForSchool(){

            System.out.println("Kiss your kids to wake them up");
            System.out.println("Wake them up for 10 times");
            System.out.println("Prepare their breakfast and lunch");
            System.out.println("Eat with them");
            System.out.println("==============================");

        }


        public static void takeThemToSchool(){
            System.out.println("Take them to School bus");
            System.out.println("Say goodbye!");
            System.out.println("===================================");
        }

        public static void studyJava(){
            System.out.println("Think about java waking up");
            System.out.println("Think about java drinking coffee");
            System.out.println("Think about java preparing Kids for school");
            System.out.println("Eventually sit down and study for Java ,practice");
            System.out.println("=======================================");


        }

            public static void sayIloveJava300Times(){

                for (int i = 1; i <=300 ; i++) {
                    System.out.print("I love Java"+" | ");
                }

            }

    public static void main(String[] args) {

        wakeUp();
        drinkCoffee();
        prepareKidsForSchool();
        takeThemToSchool();
        studyJava();
        sayIloveJava300Times();
        /*
        *wakeUp
        * drinkCoffee
        * prepareKidsForSchool
        * takeThemToSchool
        * goToWork
        * groceryShopping
        * cooking
        * studyJava
        * goToSleep
         */



    }
}
