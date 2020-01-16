package day20;

public class SumOfOdd {
    public static void main(String[] args) {

//Sum of all the odd numbers from 10 to 100

        int sum = 0;
        for (int x = 10; x <= 100; x++) {
            if(x%2==1){
                sum = sum + x;
            }

        }
        System.out.println(sum);


    }
}
