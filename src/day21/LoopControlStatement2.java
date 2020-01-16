package day21;

public class LoopControlStatement2 {
    public static void main(String[] args) {

        //continue
        //if line contains countinue reaches, the loop will skip to the next itiration

        //We can use Break and continue for any type of loop

        for (int x = 1; x <=10 ; x++) {
            if(x%2==1){
                continue;
            }
            System.out.println(x);
        }





    }
}
