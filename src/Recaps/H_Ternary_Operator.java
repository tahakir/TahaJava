package Recaps;

public class H_Ternary_Operator {
    public static void main(String[] args) {

        int n1=115, n2=10;

        int max;

        max=(n1>n2)? n1:n2;
        System.out.println(max);

        String action;
        boolean isGreen=false;

        action=(isGreen)? "You can drive":"You CANNOT drive";
        System.out.println(action);


        int bill=2000;
        int qty=112;
        int discount;
        discount=(bill>1000)? (qty>11)?10:9:5;
        System.out.println(discount);


    }
}
