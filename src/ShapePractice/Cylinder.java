package ShapePractice;

public class Cylinder extends Shape{

    double radius;
    double height;
    final double PI=3.14;
    double diameter;

    public Cylinder(double radius,double height){
        this.radius=radius;
        this.height=height;
        diameter=radius*2;
    }
    protected void Area(){
        double area=(PI*diameter*radius)+(height*PI*diameter);
        System.out.println("The Area of cylinder is: "+area);
    }

    protected void perimeter(){
        double perimeter=2*(PI*diameter+height);
        System.out.println("The perimeter of the cylinder is: "+perimeter);
    }

    protected void volume(){
        double volume= (PI*radius*radius*height);
        System.out.println("The volume is: "+volume);
    }

}
