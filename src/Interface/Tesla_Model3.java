package Interface;

public class Tesla_Model3 implements Cars,ElectricVehicles {


    @Override
    public void start() {
        System.out.println("Voice Control \"Tesla Start \" ");
    }
    @Override
    public void Charge(){

        System.out.println("Charging");

    }
    @Override
    public void SelfDrive(){
        System.out.println("Self drive mode is on!");
    }

    @Override
    public void fly(){
        System.out.println("Tesla is flying!");
    }
}
