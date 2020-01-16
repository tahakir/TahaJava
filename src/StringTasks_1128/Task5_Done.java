package StringTasks_1128;

import java.util.Scanner;

public class Task5_Done {
    public static void main(String[] args) {


//        Task 5:
//        given a name with prefix, stored in a String variable called name
//        for example
//        Dr. Dru , Mr. Robot , Ms. Lois , Mrs. Brown
//                -- in case insensitive condition ----
//        print as below
//        if the name Started with (Dr )-->> Doctor
//        if the name Started with (Mr )-->> Male
//        if the name Started with (Miss )-->> Single female
//        if the name Started with (Mrs )-->> Married female

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter Your name with your Prefix");
        String name=scan.nextLine();
        String upperCasename=name.toUpperCase();
        if(upperCasename.startsWith("DR ")){
            System.out.println("Doctor");

        }else if(upperCasename.startsWith("MR ")){
            System.out.println("Male ");
        }else if(upperCasename.startsWith("MISS ")){
            System.out.println("Single Female");
        }else if(upperCasename.startsWith("MRS ")){
            System.out.println("Married Female");
        }else{
            System.out.println("Invalid prefix");
        }





    }
}
