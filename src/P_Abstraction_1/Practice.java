package P_Abstraction_1;

abstract class shape{

    public abstract void Area();



}

class triangle extends shape{

    @Override
    public void Area(){
        System.out.println("The area of the triangle");
    }

}

public class Practice {
}
