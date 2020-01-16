package day15;
import java.util.Scanner;
public class NameChecker_Akbar {
    public static void main(String[] args) {

        //Name Checker
        /*
        *Declare a varibale to store your name
        * check whether your name lenght is less than 4
        * if so print your name
        * if it is with in 4-11
        * if so print medium name
        * if it is more than 11
        * print longer name
         */

        /*
        *check whether your name has either character a or e
        * if so----> name contains a or e
        * if not ---> i dont have both a or e in my name
        */

        String name ="Taha";
Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your name:");
name=scan.next();
        if(name.length()<4){
            System.out.println(name);
            System.out.println(name.length());
        }else if(name.length()>=4 && name.length()<=11){
            System.out.println(name);
            System.out.println(name.length());
        }else{
            System.out.println("Your name does not contains more than 11");
        }

        if(name.contains("a")|| name.contains("e")){
            System.out.println("Your name contains a or e");
        }else{
            System.out.println("I dont have neither of them");
        }




    }
}
