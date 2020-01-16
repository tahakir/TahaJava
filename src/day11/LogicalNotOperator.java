package day11;

public class LogicalNotOperator {

    //LOGICAL NOT OPERATOR ! is used to negate the boolean value

    public static void main(String[] args) {
///! is for getting the opposite result
        System.out.println( true);
        System.out.println( false);
        System.out.println( !true);
        System.out.println( !false);

        boolean isRecording=false;
        System.out.println("result of ! isRecording --->");
        System.out.println(! isRecording);

 /// third you can use it in front of a boolean expression
 ///boolean exp. is any expression that result in a boolean value
 //for exam.
        System.out.println("result of !(7>5) is ");
        System.out.println(!(7>5));

        int x=10;
        System.out.println("result of !(x>10) is ");
        System.out.println(x>10);
        System.out.println("result of !(x>10) is ");
        System.out.println(!(x>10));


    }


}
