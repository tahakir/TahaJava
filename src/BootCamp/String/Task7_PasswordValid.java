package BootCamp.String;

public class Task7_PasswordValid {
    public static void main(String[] args) {
/**
 * 1. Password MUST be at least 8 characters
 * 2. Password should at least contain one upper case letter
 * 3. Password should at least contain one lowercase letter
 * 4. Password should at least contain one special characters
 * 5. Password should at least contain a digit
 */
        String password = "a?G6jdsaja";

        boolean length=password.length()>=8;
        boolean lower=password.matches(".*[a-z].*");
        boolean upper=password.matches(".*[A-Z].*");
        boolean special=password.matches(".*[!@.,#$?].*");
        boolean number=password.matches(".*[0-9].*");

        boolean valid=length&&lower&&upper&&special&&number;

        if (valid){
            System.out.println("Password is valid");
        }else{
            System.out.println("Not valid Password");
        }

    }
}
