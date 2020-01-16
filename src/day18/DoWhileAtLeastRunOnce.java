package day18;

public class DoWhileAtLeastRunOnce {

     /*
        while loop check the condition first then enter the statement
        do while loop will take the action at least once then check the condition

        DO WHILE LOOP ALWAYS RUN AT LEAST ONE ITERATION
        WHILE LOOP MIGHT NOT EVEN RUN
         */
     public static void main(String[] args) {

         int x=1000;
         do{


             System.out.println("Keep Going");
         }while(x<5);

         System.out.println("The end");


         while (x < 5) {

             System.out.println("KEEP GOING IN WHILE");


         }

     }

}
