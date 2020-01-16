package day17;

public class SkipCounting {
    public static void main(String[] args) {

        //Skip counting by 3 from 0 till 30
        //3 6 9 12 15 18 21 24 27 30

       // int counter=0;
       // while (counter<30){
          //  counter+=3; // increase first than print out
          //  System.out.print(counter+" ");
            //counter+=3; // print out the first then increase



        //write a program to print out a even number 0 to 50;
        //write a program to print out a odd number 0 to 50;

        // write a program to print out a even number from 0 to 50 ;
        // write a program to print out a odd number from 0 to 50 ;

        int cnt = 0;
        while (cnt <= 50) {

            System.out.print(cnt + " ");
            cnt += 2; // cnt = cnt + 2 ;

        }
        System.out.println("------------");

        int cnt2 = 1;
        while (cnt2 <= 50) {

            System.out.print(cnt2 + " ");
            cnt2 += 2;

        }

        System.out.println("------------");
        int cnt3 = 0;

        while (cnt3 <= 50) {

            if (cnt3 % 2 == 0) {
                System.out.println(cnt3 + " is even number");
            } else {
                System.out.println(cnt3 + " is odd number");
            }
            ++cnt3;
        }


    }
}
