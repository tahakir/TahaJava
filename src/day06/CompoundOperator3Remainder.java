package day06;

public class CompoundOperator3Remainder {

    public static void main(String[] args) {

        int bankBalance=1140;

        System.out.println("I have spent the half of it: " );
        bankBalance/=2;
        System.out.println("Now my balance is " + bankBalance);

        //I want divide the balance by 500 and keep the remainder in my pocket

        bankBalance%=500;

        System.out.println("The remainder is: " + bankBalance);



    }
}
