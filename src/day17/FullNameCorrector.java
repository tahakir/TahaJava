package day17;

public class FullNameCorrector {
    public static void main(String[] args) {
        //               0123456789
        String fullName="arYa sTarK";

        String firstName=fullName.substring(0,4);
        String lastName=fullName.substring(5);


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
