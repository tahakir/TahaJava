package day19;

public class ForLoopPractice {
    public static void main(String[] args) {


        String name = "Kahren Mkrtchya Said Argaphlu Hasan Ankar Rana Aral";

        //System.out.println(  name.charAt(0) =='a'     );

        int countOfA = 0;
        for (int x = 0; x < name.length(); x++) {
            //System.out.println(   name.charAt( x )     );
            char curretChar = name.charAt(x);
            if (curretChar == 'a') {
                //System.out.println("BINGO FOUND IT !! ");
                ++countOfA;
            }
        }
        System.out.println("countOfA = " + countOfA);
    }
}
