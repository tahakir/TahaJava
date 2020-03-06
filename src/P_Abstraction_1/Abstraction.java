package P_Abstraction_1;

public abstract class Abstraction {

    public abstract void startTheCar();

}

class A extends Abstraction{

    @Override
    public void startTheCar(){
        System.out.println("push the brake");
        System.out.println("push the button");
        System.out.println("release the break");
    }
    public static void main(String[] args) {


    }


}
