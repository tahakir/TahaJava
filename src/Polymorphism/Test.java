package Polymorphism;

abstract class AbstractClass{

    public void ByLinkText(){
        System.out.println("By Link Test");
    }

    public void get(){
        System.out.println("Chrome");
    }

}


public class Test extends AbstractClass {

    public void get(){
        System.out.println("FireFox");
    }


    @Override
    public void ByLinkText(){
        System.out.println("By Link Test2");

    }
    public static void Test(){

    }
    public static void main(String[] args) {


        AbstractClass obj= new Test(); //is a relationship
        obj.ByLinkText();
        obj.get();

    }
}
