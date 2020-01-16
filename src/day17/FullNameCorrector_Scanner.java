package day17;

import java.util.Scanner;

public class FullNameCorrector_Scanner {
    public static void main(String[] args) {
        //               0123456789
        Scanner scan=new Scanner(System.in);


        String fullName=scan.nextLine();
        int indexOfSpace=fullName.indexOf(" ");

        String firstName=fullName.substring(0,indexOfSpace);
        String lastName=fullName.substring(indexOfSpace+1);


        String firstNameCorrected=
                firstName.toUpperCase().substring(0,1)+ //ARYA--A
                firstName.toLowerCase().substring(1);   //arya---rya

        System.out.println(firstNameCorrected);
        String lastNameCorrected=
        lastName.toUpperCase().substring(0,1)+
                lastName.toLowerCase().substring(1);
        System.out.println(lastNameCorrected);


        System.out.println(firstNameCorrected+" "+lastNameCorrected);



    }
}
