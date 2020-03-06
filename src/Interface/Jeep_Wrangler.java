package Interface;

public class Jeep_Wrangler implements Cars,GasVehicles {


    @Override
    public  void PumpGas(){
        System.out.println("Pumping Gas");
    }

    @Override
    public  void start(){

        System.out.println("Call mechanic");
        System.out.println("Oil change");
        System.out.println("Jump start");
    }

    @Override
    public void SelfParking(){
        System.out.println("Jeep is self parking");
    }

}
