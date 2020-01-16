package day22;

public class CanvasDayModuleLinkGenerator {
    public static void main(String[] args) {
//        Here is the direct links to lead you to correct days
//        https://learn.cybertekschool.com/courses/278/modules#3317
//        this will lead you to day 21
//        https://learn.cybertekschool.com/courses/278/modules#3318
//        this will lead you to day 22
//        https://learn.cybertekschool.com/courses/278/modules#3319
//        this will lead you to day 23
//        https://learn.cybertekschool.com/courses/278/modules#3320
//        this will lead you to day 24
//        and so on

        String baseURL="https://learn.cybertekschool.com/courses/278/modules#";
        String dayMsg=" this will lead you to day";

//        for (int moduleNumber = 3317; moduleNumber <=3352 ; moduleNumber++) {
//            System.out.println(moduleNumber);
  //      }

        for (int day = 21; day <=56 ; day++) {
            System.out.println(dayMsg + day);
            //if day is 21 the number is 3317 according to the requirement
            //if day is 22 the number is 3318 according to the requirement

            System.out.println(baseURL + (3317 - 21 + day));

        }
        // 3297 is first day module ID BECAUSE I TOLD YOU SO
        // get the link from day 1 till day 22
        for (int day = 1; day <= 22; day++) {

            System.out.println(dayMsg + day);
            //  if day is 1 the number is 3297 according to requirement
            //  if day is 2 the number is 3298 according to requirement

            System.out.println(baseURL + (day + 3296));

        }

    }
}
