package day07;
import java.util.Scanner;
public class EmailBuilder_Repeat {
    public static void main(String[] args) {
        //String firstName, lastName, company, email;
        //firstName = "Taha";
        //lastName = "Kir";
        //company = "Verizon";
        // firstName_lastName@company.com    Astrit_Enver@Verizon.com
        //email = firstName + "_" + lastName + "@" + company + ".com";

        //System.out.println(" My name is " + firstName + " " + lastName + " and I work for " + company + " "
        // + "and my email is " + email);

        System.out.println("Please enter your information");
        System.out.println("What is your first name?");
        Scanner scan=new Scanner(System.in);
        String firstName=scan.next();

        System.out.println("What is your  last name?");
        String lastName=scan.next();

        System.out.println("Which company you work for?");
        String company=scan.next();
        String email=firstName+"_"+lastName+"@"+company+".com";

        System.out.println("My name is " +firstName+" "+lastName+" "+"My email address is: " +email+"and I work for"+company);










    }
}
