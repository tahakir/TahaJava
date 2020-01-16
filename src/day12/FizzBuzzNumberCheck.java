package day12;

public class FizzBuzzNumberCheck {
    public static void main(String[] args) {

        //Given a number
        //if this number can be divided by 5 without remainder called ""Fizz Number""
        //for exp....5/10/15

        //if this number can be divided by 3 without remainder called ""Buzz Number""

        //for exp. 3/9/12/27
        //if this number can be divided by 3 and 5 without remainder called ""FizzBuzz Number""
        //for exp.  15/45/30/90

        int number=10;

        if(number%5==0 && number%3==0){
            System.out.println("FizzBuzz Number");
        }else if(number%5==0){
            System.out.println("Fizz Number");
        }else if(number%3==0  ){
            System.out.println("Buzz Number");
        }else{
            System.out.println("NOT MY NUMBER");
        }


    }

}
