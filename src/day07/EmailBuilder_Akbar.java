package day07;
import java.util.Scanner;

public class EmailBuilder_Akbar {
    public static void main(String[] args) {
        //String firstName, lastName, company, email;
        //firstName = "Taha";
        //lastName = "Kir";
        //company = "Verizon";
        // firstName_lastName@company.com    Astrit_Enver@Verizon.com
        //email = firstName + "_" + lastName + "@" + company + ".com";

        //System.out.println(" My name is " + firstName + " " + lastName + " and I work for " + company + " "
               // + "and my email is " + email);

        String firstName, lastName, company, email;
        Scanner scan = new Scanner(System.in);
        firstName =scan.next();
        lastName =scan.next();
        company =scan.next();
        // firstName_lastName@company.com    Astrit_Enver@Verizon.com
        email = firstName + "_" + lastName + "@" + company + ".com";

        System.out.println(" My name is " + firstName + " " + lastName + " and I work for " + company + " "
                + "and my email is " + email);



    }
}
