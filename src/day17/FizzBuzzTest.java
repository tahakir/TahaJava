package day17;

public class FizzBuzzTest {
    public static void main(String[] args) {
        //if a number can be divided by both 3 and 5 --->Fizz Buzz Number
        //if a number can be divided by  5 --->Fizz  Number
        //if a number can be divided by3 ---> Buzz Number

        /*int num=14;

        if(num%5==0 && num%3==0){
            System.out.println("Fizz Buzz Number");
        }else if(num%5==0){
            System.out.println("Fizz Number");
        }else if(num%3==0){
            System.out.println("Buzz Number");
        }
*/
        int num = 1;
        while (num <= 100) {

            if (num % 5 == 0 && num % 3 == 0) {
                System.out.println(num + " is Fizz Buzz Number");
            } else if (num % 5 == 0) {
                System.out.println(num + " is Fizz Number");
            } else if (num % 3 == 0) {
                System.out.println(num + " is Buzz Number");
            }

            ++num;
        }
    }
}