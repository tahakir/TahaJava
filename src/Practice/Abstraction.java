package Practice;

public abstract class Abstraction {

    public abstract void startTheCar();
}

class A extends Abstraction{


    @Override
    public void startTheCar(){
        System.out.println("Brake");
        System.out.println("Push the start button");
        System.out.println("Release the break");
    }

    public static void main(String[] args) {


    }

}

class Tesla extends Abstraction{

    @Override
    public void startTheCar(){

        System.out.println("Voice control");
        System.out.println("driver");
    }

}


