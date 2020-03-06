package Interface;

public class Dealership {
    public static void main(String[] args) {

        Tesla_Model3 t1= new Tesla_Model3();
        t1.start();
        t1.Charge();
        t1.fly();
        t1.SelfDrive();

        Toyota_Hybrid h1= new Toyota_Hybrid();
        h1.start();
        h1.Charge();
        h1.PumpGas();
        h1.SelfDrive();
        h1.fly();


        Jeep_Wrangler j1= new Jeep_Wrangler();
        j1.start();
        j1.PumpGas();
        j1.SelfParking();

    }
}
