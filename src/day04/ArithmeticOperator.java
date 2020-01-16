package day04;

public class ArithmeticOperator {
    public static void main(String[] args) {
        // arithmetic operator between two "int"---->> another "int"
        //Java takes only the whole number not after the period

        //System.out.println(5-3);
        //System.out.println(5*3);
        //System.out.println(5+3);
        //System.out.println(5/3);//1

        // arithmetic operator between two "numerical data type"final result will be larger data type/after period

        //System.out.println(5-3.0d);
        //System.out.println(5*3.0d);
        //System.out.println(5+3.0d);
        //System.out.println(5/3.0f);
        //System.out.println(5/3.0d);

        //store above numbers in variables
        // and replace above statements with variables instead

        //int x=5;
        //float y=3.00f;
        //System.out.println(x/y);

        int num1=5;
        double num2=3.0d;
        float num3=3.0f;

        double result1=num1+num2;
        double result2=num1-num2;
        double result3=num1*num2;
        double result4=num1/num2;
        float result5=num1/num3;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);


    }

}
