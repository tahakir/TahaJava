package day09;

public class DayPrinter_V2 {
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
        int dayCode = 6;
        String dayName = "";

         // assigning a empty String value

        if (dayCode == 1) {
            dayName = "Monday";
        } else if (dayCode == 2) {
            dayName = "Tuesday";
        } else if (dayCode == 3) {
            dayName = "Wednesday";
        } else if (dayCode == 4) {
            dayName = "Thursday";
        } else if (dayCode == 5) {
            dayName = "Friday";
        } else if (dayCode == 6) {
            dayName = "Saturday";
            System.out.println("YAY@@@ SATURDAY@@");
        } else if (dayCode == 7) {
            dayName = "Sunday";
            System.out.println("WATCH FOOTBAL@@@@!!!");
        } else {
            dayName = "UNKNOWN!!!";
            //System.out.println("Day is Unknown");
        }

        System.out.println("Day is " + dayName);

    }

}