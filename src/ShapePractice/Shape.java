package ShapePractice;
/**
1. create a class called ShapeActions: Area(), perimeter(), capacity()
2. create sub classes of Shape:Circle,rectangle,square,cylinder,
and give the instance variables that are needed to calculate
the Area, perimeter, and Volume of those shapes
3. override super class' Area(), perimeter(), capacity() methods to the sub classes
 **/
public class Shape {

    protected void Area(){
        System.out.println("Area is 0");
    }

    protected void perimeter(){
        System.out.println("perimeter is 0");
    }

    protected void volume(){
        System.out.println("volume is 0");
    }

    public static void main(String[] args) {

        Rectangle r1= new Rectangle(20,10);
        r1.Area();
        Rectangle r2= new Rectangle(15,25);
        r2.perimeter();

        Square s1= new Square(22);
        s1.Area();
        s1.perimeter();

        Circle c1= new Circle(5);
        c1.Area();
        c1.perimeter();

        Cylinder cyc= new Cylinder(2,5);
        cyc.Area();
        cyc.perimeter();
        cyc.volume();
    }
}
