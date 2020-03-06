package Interface;

public class Toyota_Hybrid implements Cars,ElectricVehicles,GasVehicles {

    @Override
    public  void start(){

        System.out.println("Push the start button");
    }
    @Override
     public void Charge(){

        System.out.println("Charging");
     }
     @Override
    public void SelfDrive(){

         System.out.println("Self-Drive Mode is on!");
    }
    @Override
    public  void PumpGas(){
        System.out.println("Pumping Gas");
    }

    @Override
    public void SelfParking() {

    }

    @Override
    public void fly(){
        System.out.println("Toyota is flying!");
    }
}
