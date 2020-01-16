package day08;

public class IfStatements_Repeat {
    public static void main(String[] args) {

        int maxSpeed=79;
        int mySpeed=81;

        if(mySpeed>maxSpeed){
            System.out.println("You are getting a ticket");
        }else if(mySpeed>80){
            System.out.println("Jail!!!");
        }else if(mySpeed<65){
            System.out.println("You are good to go");
        }


         /*given your currentSpeed, speedLimit
        check whether the current speed is

         more than 90--> jail
         more than 80 and less than 90--> reckless driving
         more than 70 and less than 80 --> point taken
         more than 60 and less than 70 --> warning

         if not speeding keep driving


          */

        int speed=75;
        if(speed>90){
            System.out.println("JAIL!!!!");
        }else if(speed>80 && speed<90){
            System.out.println("Reckless driving");
        }else if(speed>70 && speed<80){
            System.out.println("Points taken");
        }else if(speed>60 && speed<70){
            System.out.println("Warning!!!");
        }else{
            System.out.println("Keep Driving");
        }


    }
}
