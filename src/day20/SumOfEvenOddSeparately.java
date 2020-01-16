package day20;

public class SumOfEvenOddSeparately {
    public static void main(String[] args) {

//Sum of all the odd numbers from 10 to 100
        //sum of all even numbers from 10-100
        //if it is add that number to sumOfEven
        //if not add that numbr to sumOfOdd

        //eventually after the loop---print sum of value
        

        int sumOfEven=0;
        int sumOfOdd=0;

        for (int i = 10; i <= 100; i++) {
            if(i%2==0){

                sumOfEven=sumOfEven+i;

            }else{
                sumOfOdd=sumOfOdd+i;
            }

        }
        System.out.println("sumOfOdd = " + sumOfOdd);
        System.out.println("sumOfEven = " + sumOfEven);


    }
}
