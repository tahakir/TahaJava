package day11;

public class LogicalOperators {
    public static void main(String[] args) {

        // combining multiple condition together
        //in java there is no range check directly like math
        //for exp. int x=70
        //in math: 60<x<100 ---->true <100
        //in java : x>60 && x<100

        //&& 2 ampersands & 1 ampersand --->logical AND operator
        // this is used to check both conditions are true at the same time

        /*
                      true       true
        *int x =70; x>60 && x <100; true
                      false       true
        * int x =10; x>60 && x <100; false
                      true       false
        * int x =110; x>60 && x <100; false
                       true      true
        * int x =99; x>60 && x <100; true
        *
         */

        // || 2 pipe or | 1 pipe is used for compiling 2 conditions : Logical OR Operator

        // if you have 2 conditions to check
        //when will this be true: As long as one side is true, whole result will be true
        // think about buying milk from 2 stores;
        //as long as you found the milk in one store, you got the milk then you get out

        /*

                      true   false
        *int x =70;  x>10 || x<5----> true

                       false   false
        *int x= 7 ;   x>10 || x<5---->false

                     false   true
        *int x=-8 ;   x>10 || x<5---->true

        //AS LONG AS ONE SIDE IS TRUE, WHOLE RESULT IS TRUE

         */
        System.out.println("TRUTH TABLE");

        System.out.println("RESULT OF true&&true is " +(true && true)  );
        System.out.println("RESULT OF true&&true is " +(false && true) );
        System.out.println("RESULT OF true&&true is " +(true && false) );
        System.out.println("RESULT OF true&&true is " +(false && false));

        System.out.println("TRUTH TABLE || ");

        System.out.println("RESULT OF true || true is " +(true || true)  );
        System.out.println("RESULT OF true || true is " +(false || true) );
        System.out.println("RESULT OF true || true is " +(true || false) );
        System.out.println("RESULT OF true || true is " +(false || false));

// create a variable called num find out whether
// this number is more than 100 or less than 10
// find out the number is within the range of 10-60
        int x=55;
        System.out.println(x >=10 && x<= 60);
        System.out.println(x > 100 || x < 10);

/// more than 2 conditions at the same time, 3 conditions
//true|| false----->false
        System.out.println( true || false || false);
// true && false -------> false
        System.out.println(true && true && false);

 // == is checking for equality , ! is checking for not equality
        System.out.println( x==50 || x==51 || x==55);

 // check x is more than 50 and x is not equal to 52 or x equal to 57
                           //false     //true  //false
        System.out.println(x>50 && x!= 52  || x==57  );
//one of them is true so we should see the resulf of True!!!





    }
}
