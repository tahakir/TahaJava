package day44.sub;

import day44.Vehicle;

public class Car extends Vehicle {
    
    int milage;

    public static void main(String[] args) {
        
        Car c1=new Car();
        c1.milage=35678;
        c1.make="Toyota Corolla";
        System.out.println("c1.make = " + c1.make);

        System.out.println("c1.milage = " + c1.milage);
        c1.setYear(2016);

        System.out.println("c1.getYear() = " + c1.getYear());
        

        
    }

    
}
