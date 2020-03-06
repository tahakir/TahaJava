package day60.exception;

public class BreakTimeException extends RuntimeException {

}

class Main{

    public static void main(String[] args) {

        try {
            throw new MyOwnCheckedException();
        }catch (MyOwnCheckedException x){
            System.out.println("My own exception");
        }

    }




}


