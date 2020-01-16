package day14;

public class String_Email_Checker {
    public static void main(String[] args) {

        //if it does not contain character @ say invalid email
        //if it contains space say invalid email

        //if it endsWith @gmail.com--->gmail
        //if it endsWith @yahoo.com--->gmail
        //if it endsWith @mail.ru--->gmail
        String emailCheck = "abc@ mail.ru";

        //if it does not contain character @ say invalid email

        //if it contains space say invalid email


        if (!emailCheck.contains("@") || emailCheck.contains(" ")) {
            System.out.println("INVALID EMAIL");
            //if it endsWith @gmail.com--->gmail
        } else if (emailCheck.endsWith("@gmail.com")) {
            System.out.println("GMAIL");
            //if it endsWith @yahoo.com--->gmail
        }else if (emailCheck.contains("@yahoo.com")) {
            System.out.println("YAHOO");
            //if it endsWith @mail.ru--->gmail
        }else if (emailCheck.endsWith("@mail.ru") ) {
            System.out.println("RUSSKI");

        }



    }
}
