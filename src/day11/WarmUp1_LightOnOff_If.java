package day11;

public class WarmUp1_LightOnOff_If {

    public static void main(String[] args) {
        System.out.println("Which room light is turned on?");

        String targetOption="Rr";
        if(targetOption=="Br") {
            System.out.println("Bedroom Light is on");
        }else if (targetOption=="Hw") {
            System.out.println("Hallway light is on");
        }else if (targetOption=="Ki") {
            System.out.println("Kitchen Light is on");
        }else if(targetOption=="Rr") {
            System.out.println("Restroom light is on");
        }else{
            System.out.println("You have no lights on!!");
            System.out.println("Thanks for saving some energy");


        }




    }
}
