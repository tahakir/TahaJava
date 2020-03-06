package MethodOverRiding;


class student{

    public void printName(){
        System.out.println("Taha");
    }
}


public class MethodOverriding extends student {

    public void print(String str){


    }

    public void print (double a){

    }

  //  public void print(String str){ }

    public void printName(){
        System.out.println("Kaan");
    }

    public static void main(String[] args) {


        student obj2= new student();
        obj2.printName();

        MethodOverriding obj= new MethodOverriding();
        obj.printName();


    }

}
