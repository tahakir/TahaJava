package StringTasks_1128;

import java.util.Scanner;

public class Task6_Done {
    public static void main(String[] args) {


//        Task 6:
//        Ask user to enter full name
//        assuming full name is 2 word
//        Write a program generate email account as below:
//        it starts with first character of first name
//        and whole last name then @NightWatch.com
//        for example :
//        Jon Snow -->> JSnow@NightWatch.com

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your Full name : " );
        String fullName=scan.nextLine();
      int firstSpace=fullName.indexOf(" ");
        String lastName=fullName.substring(5);

        String email=fullName.charAt(0)+lastName+"@NightWatch.com";

        System.out.println(email);



    }
}
