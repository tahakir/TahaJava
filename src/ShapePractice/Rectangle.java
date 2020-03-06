package ShapePractice;

public class Rectangle extends Shape{

    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    protected void Area(){
        double Area=length*width;
        System.out.println("The area of the rectangle is: "+Area);
    }

    @Override
    protected void perimeter(){
        double perimeter=(length+width)*2;
        System.out.println("The perimeter of the rectangle is: "+perimeter);
    }
}
