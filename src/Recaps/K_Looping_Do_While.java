package Recaps;

public class K_Looping_Do_While {
    public static void main(String[] args) {

//     int apples=1;
//
//     do{
//         System.out.println("Eating an apple;) --->" + apples);
//         apples++;
//     }while (apples<=10);
//        System.out.println("No more apples ;(");


        int number=100;
        int until=1;

        do{
            System.out.println("Number--->"+number + " ,");
            number--;


        }while (number>=until);//100 e erisene kadar devam et

        System.out.println("The count has been completed");

    }
}
