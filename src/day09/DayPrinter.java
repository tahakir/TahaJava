package day09;

public class DayPrinter {
    public static void main(String[] args) {

        /*
        create a variable called dayCode as int
        * if the dayCode is 1-----> Monday
        * if the dayCode is 1-----> Tuesday
        * if the dayCode is 1-----> Wednesday
        * if the dayCode is 1-----> Thursday
        * if the dayCode is 1-----> Friday
        * if the dayCode is 1-----> Saturday
        * if the dayCode is 1-----> Sunday
        * if the dayCode none of them just print unknown day

         */
        int dayCode=88;
        if(dayCode==1) {
            System.out.println("The Day is Monday");
        }else if(dayCode==2) {
            System.out.println("The Day is Tuesday");
        }else if(dayCode==3) {
            System.out.println("The day is Wednesday");
        }else if(dayCode==4) {
            System.out.println("The day is Thursday");
        }else if(dayCode==5) {
            System.out.println("The day is Friday");
        }else if(dayCode==6) {
            System.out.println("The day is Saturday");
        }else if(dayCode==7) {
            System.out.println("The day is Sunday");
        }else{
            System.out.println("The Day is unknown");

        }
        }

    }
