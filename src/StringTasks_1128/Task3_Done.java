package StringTasks_1128;
import java.util.Scanner;
public class Task3_Done {
    public static void main(String[] args) {


//        Task 3:
//        Ask user to enter full name
//        assuming full name is 2 word
//        Write a program to print users initials
//        for example :
//        Jon Snow -->> Initial is JS

        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter your Full Name:");

        String fullName=scan.nextLine();

        int firstSpaceIndex=fullName.indexOf(" ");
        String firstName=fullName.substring(0,firstSpaceIndex);
        String lastName=fullName.substring(firstSpaceIndex+1);

        System.out.println(firstName.charAt(0)+""+lastName.charAt(0));

        

    }
}
