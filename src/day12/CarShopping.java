package day12;

public class CarShopping {
    public static void main(String[] args) {

        //buy corolla or tesla(only if its in the budget)
        String carBrand="Corolla";
        int carPrice=60000;
        double budget=40000;

       // if (carBrand.equals("Corolla") || carBrand.equals("Tesla") && carPrice<=budget){
        //    System.out.println("CAR ACQUIRED");
       // }else{
       //     System.out.println("Not I am looking for");
       // }

        if (carBrand.equals("Corolla") ){
            System.out.println("CAR ACQUIRED");
        }else if(carBrand.equals("Tesla") && carPrice<=budget){
            System.out.println("CAR ACQUIRED");
        }else{
            System.out.println("Not I am looking for");
        }

    }

}
