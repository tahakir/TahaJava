package day37;

import java.util.ArrayList;
import java.util.List;

public class B_PriceListPractice {
    public static void main(String[] args) {


        //ArrayList<String> teamMates = new ArrayList<>();
        List<Double> priceList = new ArrayList<>();
        priceList.add(9.99);
        priceList.add(12.99);
        priceList.add(2.39);
        priceList.add(3.95);
        priceList.add(11.29);
        priceList.add(1.2);
        priceList.add(3.99);
        priceList.add(65.59);
        priceList.add(999.99);

        System.out.println("priceList = " + priceList);
        // change the third price to 10 $

        priceList.set(2,10D);
        System.out.println("priceList 3rd item = " + priceList);
        // Add 4 dollar to first price
        priceList.set(0,priceList.get(0)+4D);
        System.out.println("priceList add $4 ro the first item = " + priceList);

        //change last price to sum of first and second price
        priceList.set(priceList.size()-1,priceList.get(0)+priceList.get(1));
        System.out.println("change last price to sum of first and second price "+priceList);

        //give 40% off to second price
        priceList.set(1,priceList.get(1)*0.6);
        System.out.println("priceList 40% off = " + priceList);
        
        
        //DOUBLE THE VALUE OF EACH AND EVERY PRICE IN THE LAST:

        for (int i = 0; i <priceList.size() ; i++) {
            priceList.set(i,priceList.get(i)*2);
            
        }

        System.out.println("priceList doubled= " + priceList);
        
        // cut the price into half if the price is more than $20
        for (int i = 0; i <priceList.size() ; i++) {
            double eachPrice=priceList.get(i);
            if(eachPrice>=20){
                priceList.set(i,eachPrice/2);
            }
        }
        System.out.println("price list after cutting half the prices more than 20: \n\t"+priceList);

        int lastIndex=priceList.size()-1;
        //swap the first value with the last value
        Double temp=priceList.get(0);
        priceList.set(0,priceList.get(lastIndex));
        priceList.set(lastIndex,temp);

        System.out.println("price list after swapping first and last value: \n\t" +priceList);

    }
}
