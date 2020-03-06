package P_Abstraction_1;

public abstract class Animal {

    public abstract void eat();
    public abstract void sleep();


}
//concrete
/*
A concrete class in java is any such class which has
implementation of all of its inherited members either
from interface or abstract class. Lets take an example:
public abstract class A
{ public abstract void methodA();
 */
class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("cats eat fish");
    }
    @Override
    public void sleep(){

        System.out.println("cats sleep 14 hours");
    }

}

class KingKong extends Animal{

    @Override
    public  void eat(){
        System.out.println("king kong eats humankind");
    }
    @Override
    public  void sleep(){
        System.out.println("king kong sleeps 5 hours");

    }
}

class Test{
    public static void main(String[] args) {

        KingKong obj= new KingKong();
        obj.eat();
        obj.sleep();

        Cat obj2= new Cat();
        obj2.eat();
        obj2.sleep();


    }

}