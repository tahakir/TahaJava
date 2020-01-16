package day08;

public class IfStatement {

    public static void main(String[] args) {


        int speedLimit=60;
        int yourCurrentSpeed=59;

        //If the currentSpeed is more than speed limit get pulled over by the police
        //get pulled over by the police
        //given ticket by the police
        //taken away some points on your license
        //go to court

        boolean IamSpeeding=yourCurrentSpeed>speedLimit;
//INSIDE PARENTHESIS WE CAN ONLY PUT
// BOOLEAN VALUE
//BOOLEAN VARIABLE
//ANY EXPRESSION THAT RETURN BOOLEAN VALUE

        if(IamSpeeding) {
            System.out.println("get pulled over by the police");
            System.out.println("given ticket by the police");
            System.out.println("taken away some points on your license");
            System.out.println("go to court");
        }else{

            System.out.println("Shopping!!!");
            System.out.println("have dinner!!!");
            System.out.println("Enjoy the Day!!");

        }

        System.out.println("The End");




        //if not over the limit
        //go to shopping!!


        //outside if statement,say the end

        System.out.println("");






    }




}
