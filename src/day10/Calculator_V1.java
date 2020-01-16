package day10;

public class Calculator_V1 {
    public static void main(String[] args) {

        char operator='+';
        switch (operator){
            case '+':
                System.out.println("You are about to add numbers");

                break;
            case '-':
                System.out.println("You are about to subtract numbers");
                break;
            case '*':
                System.out.println("You are about to multiply numbers");
                break;
            case '/':
                System.out.println("You are about to divide numbers");

            default:
                System.out.println("Unknown");
                break;


        }

        }



    }

