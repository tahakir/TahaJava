package day09;

public class InitializingVariable_SwitchVer {

    public static void main(String[] args) {

        System.out.println("Welcome to Cybertek Call Center ");

        System.out.println("Please select your language option from 1-7");

        int languageOption = 6;
        switch (languageOption) {

            case 1:
                System.out.println("Salam");
                break;
            case 2:
                System.out.println("Hello");
                break;
            case 3:
                System.out.println("Hola");
                break;
            case 4:
                System.out.println("Merhaba");
                break;
            case 5:
                System.out.println("Privet");
                break;
            case 6:
                System.out.println("Mello");
                break;
            case 7:
                System.out.println("Kalimera");
                break;
            default:
                System.out.println("Day is Unknown");
                System.out.println("Your language is "+languageOption);
            {
            }
            }
        }
    }

