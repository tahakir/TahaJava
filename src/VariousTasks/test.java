package VariousTasks;



public class test {

    public static void main(String[] args) {


        try {
            System.out.println("Try block");
            throw new RuntimeException();
        } catch (ArithmeticException e) {
            System.out.println("caught");

        }


    }
}