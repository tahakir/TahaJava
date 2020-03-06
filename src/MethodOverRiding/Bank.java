package MethodOverRiding;


public class Bank {

    public void InterestRate(){
        System.out.println("General Rate-->9 percent");
    }

    public static void main(String[] args) {

        BankOfAmerica BOA= new BankOfAmerica();
        BOA.InterestRate();//9

        Chase ch= new Chase();
        ch.InterestRate();

        CapitalOne c1= new CapitalOne();
        c1.InterestRate();
    }

}

class BankOfAmerica extends Bank{
@Override
public void InterestRate(){
    System.out.println("BAO-->7% of Interest Rate");
}

}

class Chase extends Bank {
    @Override
    public void InterestRate() {
        System.out.println("CHASE-->6% of Interest Rate");
    }

}

class CapitalOne extends Bank {
    @Override
    public void InterestRate() {
        System.out.println("CAPITAL ONE-->8% of Interest Rate");
    }
}