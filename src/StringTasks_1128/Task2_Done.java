package StringTasks_1128;
import java.util.Scanner;
public class Task2_Done {
    public static void main(String[] args) {


//        Task 2:
//        When searching from google ,
//        it will always show your search keyword in tab name
//        for example if you search Java
//        your tab title is : Java - Google Search
//        Create a program to ask user to
//        enter a String with any number of word
//        Create a variable called searchKeyword to save user input
//        Create another String variable called tabTitle
//        assign tabTitle value to searchKeyword +  "- Google Search"
//        Check if tabTitle start with your searchKeyword
//        and end with - Google Search
//        If so print the test has passed , if not print test has failed
//                (Assume you don't know tab title is already correct
//        in real world , we will capture it with automation)

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your word:");
        String searchKeyword=scan.next();
        String tabTitle=(searchKeyword + "-Google Search");

        if(tabTitle.startsWith(searchKeyword)&&tabTitle.endsWith("-Google Search")){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
        }

    }
}
