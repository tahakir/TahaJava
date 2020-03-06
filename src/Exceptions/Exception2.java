package Exceptions;
import java.lang.Exception;
public class Exception2 {
    public static void main(String[] args) {


        try {
            System.out.println(9/0);//Exception in thread "main" java.lang.ArithmeticException: / by zero
            System.out.println("Try Block....checked exception");
        }catch (RuntimeException xyz){
            System.out.println("Catch Block....unchecked exception");
        }finally {
            System.out.println("Finally block....");
        }

        System.out.println("==========================================");

        try{
            Thread.sleep(2000);
            System.out.println("Try Block....checked exception");
        }catch (Exception x){

            System.out.println("Catch Block....unchecked exception");
        }finally {
            System.out.println("Finally block....");
        }



    }
}
