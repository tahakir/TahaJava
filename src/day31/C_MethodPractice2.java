package day31;

public class C_MethodPractice2 {



    public static void main(String[] args) {

        count1to10();

        count1to10();

C_MethodPractice2.count1to10();

    }
// DOES NOT MATTER WHERE YOU PUT THE METHOD
    //AS LONG AS IT'S INSIDE THE CLASS {}
    //AND OUTSIDE ANY OF THE METHOD
    public static void count1to10(){

        for (int i = 0; i <=10 ; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
    }

    //write piece of reusable code to count from 1 to 10
    //give a name count1to10                                :method name
    //no need for subject when being called                 :static
    //it should be accessible anywhere in your project      :public
    //it does not return any value                          :void
    //does not need any external data when being called     :(nothing inside)








}
