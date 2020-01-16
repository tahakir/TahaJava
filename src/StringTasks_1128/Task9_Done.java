package StringTasks_1128;

import java.util.Scanner;

public class Task9_Done {
    public static void main(String[] args) {


//        Task 9:
//        Ask user to enter a valid URL in below format
//        www.blackfriday.com
//        Write a program to print first Index of .(dot)
//                and last index of .(dot)
//                and eventually print the domain
//        for example :
//        www.nightwatch.com  --->> blackfriday


        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a valid URL");
        String url=scan.next();

        int firstDot=url.indexOf(".");
        int lastDot=url.lastIndexOf(".");
        String message=url.substring(firstDot+1,lastDot);

        System.out.println(url + "--->" + message);




    }
}
