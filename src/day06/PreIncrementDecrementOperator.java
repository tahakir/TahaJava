package day06;

import java.sql.SQLOutput;

public class PreIncrementDecrementOperator {

    public static void main(String[] args) {

        int offerCount=2;

        //offerCount=offerCount+1;
        //offerCount+=1;

        ++offerCount; //if you want to increase by 1 add ++ decrease --
        //we CANNOT use for increasing or decreasing the value more than "1"
        System.out.println("Offer Now "+offerCount);

        --offerCount;
        System.out.println("Offer Now "+offerCount);





    }
}
