package day22;

public class ArrayPractice1 {
    public static void main(String[] args) {

        double[] prices= new double[5];

        System.out.println(prices[0]);

        //CANNOT PRINT OUT ARRAY VARIABLE DIRECTLY
        //TO SEE WHAT'S INSIDE
        System.out.println(prices);

        prices[0]=2.46;
        prices[1]=12.96;
        prices[2]=992.1;
        prices[3]=500;
        prices[4]=65.123;


        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
        System.out.println(prices[3]);
        System.out.println(prices[4]);


        //create a char array



        char[] name=new char[4];
        name[0]='T';
        name[1]='A';
        name[2]='H';
        name[3]='A';

        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name[3]);

        System.out.println("------------------------------");


        boolean[] yesNo=new boolean[3]; ///we can only put TRUE or FALSE
        yesNo[0]=true;
        yesNo[1]=false;
        yesNo[2]=true;

        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);




    }
}
