package VariousTasks;

import java.text.DecimalFormat;

public class FormattingDecimals {
    public static void main(String[] args) {


        DecimalFormat f1= new DecimalFormat("0.00");
        double b=23.123344223232323;
        
        String num1=f1.format(b);
        System.out.println("num1 = " + num1);
        
        double c= 45.56789;
        System.out.println(f1.format(c));
        
        c=Double.parseDouble(f1.format(c));
        System.out.println("c = " + c);


    }
}
