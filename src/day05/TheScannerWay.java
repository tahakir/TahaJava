package day05;
import java.util.Scanner;
public class TheScannerWay {

   /* Scanner is class that comes from JDK library
            We can use it to capture keyboard input from users
            In order to use Scanner we need to first import it as below
    Import java.util.Scanner ;
    The import statement must be in between your package declaration and before the beginning of the class
// Create scanner object
    Scanner scan = new Scanner(System.in);
    There is few ways to get users input and store the result
    Getting single word as String                           —> scan.next() ;
    Getting single number as int                            —> scan.nextInt() ;
    Getting single fractional number as double    —> scan.nextDouble() ;
    Getting single fractional number as float       —> scan.nextFloat() ;
    Getting single true or false as boolean         —> scan.nextBoolean() ;
*/

    public static void main(String[] args) {
        //ask user name
        //and capture the result
        // your name is ...
        //ask user for birth year
        //print the age
        //ask for height
        //capture the result
        //print the height
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name : ");
        //String name = "Sam" ;
        String name = scan.next();
        System.out.println("Your name is  " + name );
        System.out.println("What is your birth year : ");
        int birthYear =  scan.nextInt();
        int age = 2019 - birthYear ;
        System.out.println("Your age is : "  + age );
        System.out.println("what is your height ? ");
        double height = scan.nextDouble();
        System.out.println("your height is : " + height+"ft");






    }
}
