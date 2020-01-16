package day17;

public class OnlyEvenNumber {
    public static void main(String[] args) {


        //Print all the even numbers backward from 100-0
        //use if statement


        int backwardEven = 100;


        while (backwardEven > 0) {

            if (backwardEven % 2 == 0) {
                System.out.println(backwardEven + " is an even number ");
            }

            --backwardEven;
        }


    }

}


