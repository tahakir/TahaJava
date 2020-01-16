package day13;

public class WarmUp_AmazonShippingCalculator {

    public static void main(String[] args) {

        /*
        *Amazon has 2 types of user one is Prime Member and the other is Regular
        * Prime members get free shipping in all purchase no matter the amount
        * regular member user get free shipping only if their purchase is more than $25
        * otherwise they get $5 shipping fee


         */
        String memberType="member";
        double amount=15.99d;
        int shippingFee=0;

        // first I wanna check if it's the prime member or not
        if(memberType.equalsIgnoreCase("PRIME MEMBER") ){
            System.out.println("You get 1 day Free Shipping");
            System.out.println("Your final price is " + amount);
        }else if(!memberType.equalsIgnoreCase("PRIME MEMBER")&& amount>25){
            System.out.println("Not a Prime Member but your order is more than $25");
            System.out.println("You Get Free Shipping");
        }else{
            System.out.println("Would you like to sign up for Prime Membership?");

            shippingFee=5;
            amount+=shippingFee;

            System.out.println("your total is "+amount);
        }



    }

}
