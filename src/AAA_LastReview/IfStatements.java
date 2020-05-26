package AAA_LastReview;

public class IfStatements {
    public static void main(String[] args) {

        int hours=12;
        int minutes=45;
        int seconds=30;
        String amOrPm="pm";

        if(hours>12 && minutes>59) {
            System.out.println("Invalid");
        }
        if(hours<=12&&minutes<=59){
            System.out.println(hours+":"+minutes+":"+seconds+" "+amOrPm);
        }


        int year=2000;
        boolean leapYear=year%4==0;

        if(leapYear){
            System.out.println("The year of "+year+" is a leap year");
        }else{
            System.out.println("The year is not a leap year");
        }


    }
}
