package day31;

public class H_Voting {
    public static void main(String[] args) {

        checkEligibility(15);
        checkEligibility(23);
        checkEligibility(26);

        int yourAge=12;
        checkEligibility(yourAge);
     //can not access the method parameter outside of the method
        //System.out.println(age);

    }
    //THis method haas one int parameter named age
    //whoever calling this method need to provide a number
    //It will set the value of age into that number
    //the method parameter can be only accessible within the method

public static void checkEligibility(int age){

    //int age=15;

    if(age>18){

        System.out.println("You are eligible to vote");
    }else{
        System.out.println("You are not eligible");
    }


}




}
