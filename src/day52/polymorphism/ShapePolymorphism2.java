package day52.polymorphism;

import java.text.DecimalFormat;

public class ShapePolymorphism2 {

    public static void main(String[] args) {


//        Circle  s1 = new Circle("penny",5);
        Shape  s1 = new Circle("penny",5);
        printAnyShapeArea(s1);
        Shape s2 = new Rectangle("Book",10,5);
        printAnyShapeArea(s2);

        printAnyShapeArea(new Square("Bob",6));




    }

    public static void printAnyShapeArea(Shape anyShape){
        anyShape.calculateArea();
        System.out.println(anyShape.name+"'s area is = "+anyShape.area);

    }
}