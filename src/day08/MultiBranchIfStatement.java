package day08;

public class MultiBranchIfStatement {

    public static void main(String[] args) {

        //sudo code
        /*given your currentSpeed, speedLimit
        check whether the current speed is

         more than 90--> jail
         more than 80 and less than 90--> reckless driving

         ****************************
         more than 70 and less than 80 --> point taken
         more than 60 and less than 70 --> warning

         if not speeding keep driving

        */

        int currentSpeed=90;

        if(currentSpeed>60){
            System.out.println("You are speeding more than 70----POINT TAKEN!!!");
         //asking whether its less than or equal 70 and more than 60
            //when you come to this pont,your speed is already not more than 70
        }else if(currentSpeed>70) {
            System.out.println("Your speed is less than 70 but more than 60");
        }else{
            System.out.println("Keeep Driving you are good");
        }


    }
}
