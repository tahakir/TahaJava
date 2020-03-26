package Inheritance;

public class ProtectedVSDefault {

    protected String name;
    String id;

    protected void printHello(){
        System.out.println("Hello");
    }
    void printHola(){
        System.out.println("Print hola");
    }
}

class cybertek{


    public static void main(String[] args) {

        ProtectedVSDefault obj= new ProtectedVSDefault();
        obj.printHello();
        obj.printHola();

        System.out.println(obj.name);
        System.out.println(obj.id);
    }
}

