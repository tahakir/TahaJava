package day12;

public class WarmUp_SeasonFinder {
    public static void main(String[] args) {

        int month = 7;
        if (month > 12 || month < 1) {
            System.out.println("INVALID MONTH");
        } else if (month >= 3 && month <= 5) {
            System.out.println("SPRING");
        } else if (month >= 6 && month <= 8) {
            System.out.println("SUMMER");
        } else if (month >= 9 && month <= 11) {
            System.out.println("FALL");
        } else if (month == 12 || month == 1 || month == 2) {
            System.out.println("WINTER");
//since first condition is already taking out
            //invalid situations, we do not need else in this
            // else in general is optional
        }
    }
}