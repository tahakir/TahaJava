package day11;

public class WarmUp1_LightOnOff_Switch {

    public static void main(String[] args) {
        System.out.println("Which room light is turned on?");
        String targetOption="";

        switch (targetOption){

            case "Bd":
                System.out.println("Bedroom Light is on!!!");
                break;
            case "Lr":
                System.out.println("Living room light is on!!!");
                break;
            case "ki":
                System.out.println("Kitchen light is on!!!");
                break;
            case"Ha":
                System.out.println("Hallway light is on!!!");
                break;
            default:
                System.out.println("There is no light is on!!!");
                System.out.println("Save some energy save the World!!");

        }




    }
}
