package Recaps;

public class G_If_Statements {
    public static void main(String[] args) {

        int hourOfDay = 18;
        if (hourOfDay < 12) {
            System.out.println("Good Morning");
        } else {
            if (hourOfDay < 17) {
                System.out.println("Good Afternoon");
            } else {
                System.out.println("Good Evening");
            }


        }

        int typeSelection = 1;
        int drinkSelection = 1;
        String drink="none";
        double price;

        if (typeSelection == 1) {
            System.out.println("Hot beverage: Select 1 for Tea, 2 for Coffee");
            if (drinkSelection == 1) {
                price = 2.0;
                drink = "tea";
            } else if (drinkSelection == 2) {
                price = 4.0;
                drink = "Coffee";
            } else {
                System.out.println("Invalid");
            }
        }else if (typeSelection == 2) {
                System.out.println("Cold beverage: Select 1 for IceTea, 2 for Ice Coffee");
                if (drinkSelection == 1) {
                    price = 3.0;
                    drink = "Ice tea";
                } else if (drinkSelection == 2) {
                    price = 5.0;
                    drink = "Ice Coffee";
                } else {
                    System.out.println("Invalid cold drink selection");

                }
            }else{
            System.out.println("Invalid Drink type");
        }
            if(drink.equals("none")){
                System.out.println("Try again");
            }else{
             System.out.println("You are the man");
}




        }
    }
