package day17;

public class WhileLoopPractice {
    public static void main(String[] args) {

        //Count 1 to 5 the count 5 to 1
        //if i use (counter<=5) as condition I will have these
        //-->> iteration 1: 1<=5 true
              //print1 counter 2

        //-->> iteration 2: 2<=5 true
        //print2 counter 3

        //-->> iteration 3: 3<=5 true
        //print3 counter 3

        //-->> iteration 4: 4<=5 true
        //print4 counter 5

        //-->> iteration 5: 5<=5 true
        //print5 counter 6
        //6<=5 FALSE---->EXIT FROM THE LOOP


        int counter=1;

        while(counter<=5){

            System.out.print(counter+" ");
            ++counter;
        }
        System.out.println();
        System.out.println("counter = " + counter);
        //NOW I WANT TO COUNT FROM 5 TO 1
        //counter >=1 ---->6>=1  5>=1  4>=1  3>=1  2>=1  1>=1 -->true    0>=1--->false!!
        //conter>1---->6>1   5>1   4>1   3>1   2>1--->true   1>1--->false


        while (counter>1){
            --counter;
            System.out.print(counter+" ");
        }
        System.out.println();
        System.out.println("counter = " + counter);

    }

}
