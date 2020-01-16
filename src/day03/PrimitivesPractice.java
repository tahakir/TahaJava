package day03;

public class PrimitivesPractice {
    public static void main(String[] args) {

        byte letterCount=26;

        short sheepCount=300;

        int catCount=20;

        long mileToSun=100000000L;
        long mileToMoon=50000000l;

        //---------floating point ---------
        float priceOfBanana=1.99f; //you must add f at the end of the number to indicate this is float data type
        float priceOfPotato=2.49f; //upper or lower case is not important

        //---------larger floating point numbers------
        double priceOfIpad1=355.99d;
        double priceOfIpadPro=1024.99D;
        double priceOfMac=2299.99; //the number is a number no $ sign
        //if there is no"d" automatically assumes it is a double!!!
        //the reason why it worked without "D" is if you have a whole number by itself, the compiler assumes it's an int
        //if you have a fractional number compiler assumes as a double

        byte letterCnt=15;
        System.out.println("The letter count is " + letterCnt );
        short cowCount=200;
        System.out.println("The cow count is " + cowCount);
        int dogCount=5;
        System.out.println("The dog count is " + dogCount);
        long fromUsaToMexico=4000l;
        System.out.println("The milage from USA to Mexico is " + fromUsaToMexico);
        float priceOfStrawberry=2.99f;
        System.out.println("The price of strawberry is " + priceOfStrawberry);
        double priceOfCorolla=22000.89d;
        System.out.println("The price of Corolla is " + priceOfCorolla);




    }
}
