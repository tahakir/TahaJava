package day32;

public class B_CharacterActions {
    public static void main(String[] args) {


       // printAtoZ();

        //printZtoA();

        printAlphabetInRange('a','f');
        printAlphabetInRange('G','B');
        printAlphabetInRange('A','A');
        printAlphabetInRange('a','A');



    }

    public static void printAlphabetInRange(char beginning,char ending){
//this mean beginning character comes before ending character
        //in ascii table
        if(beginning<ending ){
            System.out.println("WE NEED TO INCREMENT FROM " + beginning + " till " + ending);
            for (char i = beginning; i <=ending ; i++) {
                System.out.print(i+" ");

            }
            System.out.println();

        }else if(beginning>ending) {
            System.out.println("WE NEED TO DECREMENT FROM " + beginning + " till " + ending);

            for (char i = beginning; i >=ending ; i--) {
                System.out.print(i+" ");

            }

        }else{
            System.out.println("THEY ARE SAME CHARS");
        }
    }


    /*
    *printAtoZ
    * create a method that has no parameter
    * and print A-Z in one line
    *
     */

    public static void printAtoZ(){

        for (char i = 'A'; i <='Z' ; i++) {
            System.out.print(i+" ");
        }

        System.out.println(); //so we can move to next line
    }

    /*
     *printZtoA
     * create a method that has no parameter
     * and print Z-A in one line
     *
     */
    public static void printZtoA(){

        //this is how we can print in descending order
        //'Z'-- >'A'
        for (char i = 'Z'; i >='A' ; i--) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

}
