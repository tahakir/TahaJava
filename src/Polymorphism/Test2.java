package Polymorphism;

interface Interface{

    abstract void get();
}


public class Test2 implements Interface {


    public static void main(String[] args) {

        Interface obj = new Test2();
        obj.get();
    }

    public void get(){
        System.out.println("Chrome driver");
    }
}