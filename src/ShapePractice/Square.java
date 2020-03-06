package ShapePractice;

public class Square extends Shape {

double side;

public Square (double side){
    this.side=side;

}

    @Override
    protected void Area(){
        double area=side*side;
        System.out.println("The Area of the square is: "+area);
    }

    @Override
    protected void perimeter(){
        double perimeter=side*4;
        System.out.println("The Area of the perimeter is: "+perimeter);
    }
}
