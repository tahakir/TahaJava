package ShapePractice;

public class Circle extends Shape {

    double radius;
   final double PI=Math.PI;

    public Circle (double radius){
        this.radius=radius;

    }

    @Override
    protected void Area(){
        double area=PI*radius*radius;
        System.out.println("The Area of the circle is: "+area);
    }

    @Override
    protected void perimeter(){
        double perimeter=PI*2*radius;
        System.out.println("The perimeter of the circle is: "+perimeter);
    }
}
