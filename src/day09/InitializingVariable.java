package day09;

public class InitializingVariable {

    public static void main(String[] args) {

        //int num;
        // a variable inside a method, must get initial value
        //before its being used for the first time
        //System.out.println(num);

        System.out.println("Welcome to Maras");
        System.out.println("Please select your language option 1-7:");


        int languageOption = 5;
        String greeting = "";

        if (languageOption == 1) {
            greeting = "Hello";
        } else if (languageOption == 2) {
            greeting = "Salam";
        } else if (languageOption == 3) {
            greeting = "Hola";
        } else if (languageOption == 4) {
            greeting = "Privet";
        } else if (languageOption == 5) {
            greeting = "Merhaba";
        } else if (languageOption == 6) {
            greeting = "Szia";
        } else if (languageOption == 7) {
            greeting = "Mello";
        } else {
            greeting = "The Language is unknown";
            System.out.println(greeting + " ,SDET");
        }
    }
}










