package day47;

public class GasCar extends Car {

    int gasLevel;

    @Override
    public void start() {
        System.out.println("This is how gas car starts ");
    }

    @Override
    public void goForward() {
        System.out.println("GAS CAR GOING FORWARD");
    }

    @Override
    public void goBackward() {
        System.out.println("GAS CAR GOING BACKWARD");
    }

    @Override
    public void turn(String direction) {
        System.out.println("GAS CAR TURNING " +direction);
    }


}
