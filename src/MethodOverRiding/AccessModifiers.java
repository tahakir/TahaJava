package MethodOverRiding;

class Volcano{
    void methodA(){
        System.out.println("Method A");
    }

  protected  double salary (double bonus){
        return bonus+100000;
    }
}

public class AccessModifiers extends Volcano{

    @Override
    void methodA(){
        System.out.println("Method b");
    }

    @Override
    protected  double salary (double bonus){
        return bonus+200000;
    }

    public static void main(String[] args) {
        AccessModifiers obj= new AccessModifiers();
        obj.methodA();
        
    }
}
