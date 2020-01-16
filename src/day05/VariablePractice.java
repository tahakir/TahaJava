package day05;

public class VariablePractice {

    public static void main(String[] args) {

        // 8 primitive
        /*
         This is called block comment, everything between will be seen as comment
         whole numbers     : byte,short,int,double
         fractional number :float,double
         logical           : boolean (true,false)
         character         : char(single character in single quote)


         usually by default for whole numbers :just use "int"
         usually by default for fractional numbers : just use "double"

         ****Is string part of primitive? no it is a sequence of character!!!


                 */

        //age calcultor
        //given birth year,please calc. the age

        int birthYear = 1987;
        int currentYear=2019;
        int formula=currentYear-birthYear;
        System.out.println("I was born in the year of " + birthYear +",and "+ " I am " + formula + " years old "  );

        //I was born in year of 1987 , and I am ... years old

        //Task 2: you are speeding today
        // speed limit is 65mph , and your current speed is 85mph
        // you are driving 20 mph more than speed limit

        int speedLimit = 65;
        int yourSpeed=85;
        int form=yourSpeed-speedLimit;
        System.out.println("You are driving " + form +"mph "+ "more than the speed limit" );



    }
}
