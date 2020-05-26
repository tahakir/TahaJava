package AAA_LastReview;

public class SwitchStatements {

    public static void main(String[] args) {
        
        String str = "Monday";
        switch (str) {
            case "Monday":
                System.out.println("Today is: Monday");
                break;
            case "Tuesday":
                System.out.println("Today is: Tuesday");
                break;
            case "Wednesday":
                System.out.println("Today is: Wednesday");
                break;
            case "Thursday":
                System.out.println("Today is: Thursday");
                break;
            case "Friday":
                System.out.println("Today is: Friday");
                break;
            case "Saturday":
                System.out.println("Today is: Saturday");
                break;
            case "Sunday":
                System.out.println("Today is: Sunday");
                break;
            default:
                System.out.println("Invalid");


        }


        //or logic in switch statement

        char grade='B';

        switch (grade){
            case 'A':
            case 'B':
                System.out.println("passed");
            break;

            default:
                System.out.println("failed");

        }

        String US="USA";
        switch (US){
            case "USA":
            case "America":
                System.out.println("American");
            default:
                System.out.println("Not American");
        }


    }

}