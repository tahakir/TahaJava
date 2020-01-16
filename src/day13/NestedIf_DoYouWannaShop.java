package day13;

public class NestedIf_DoYouWannaShop {

    public static void main(String[] args) {

        boolean youWantToShop = true;
        String preference = "Store";

        if (youWantToShop == true) {


            if (preference.equals("Store")) {
                System.out.println("Going to store for shopping");
            } else {
                System.out.println("Going to online for Shopping");
            }

        } else {

            System.out.println("good job stay home coding!!!");

        }


    }
}