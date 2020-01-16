package day18;

public class EvenNumber_ForLoop {
    public static void main(String[] args) {

        //skip counting by 2
        //starting from 0---100

        //INITIALIZATION WILL ALWAYS RUN FIRST!!!


        for(int i=0; i<100; i+=2){
            System.out.print(i + " " );
        }

        System.out.println("-------------------------------");

        for(int x=0; x<100 ; x+=3){
            System.out.print(x + " " );

        }

        System.out.println();

        for(int i=0; i<100 ; i++){

            if(i%2==0){
                System.out.print(i + " " );
            }
        }


    }
}
