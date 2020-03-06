package Inheritance;

class Data{

    public String name="Taha";
    private String age="18";
    String ID="Secret Service";

    public String getAge(){
        return age;
    }

    public void Hello(){
        System.out.println("Hello");
    }

    private void Hola(){
        System.out.println("Hola");
    }

    void Aloha(){
        System.out.println("Aloha");
    }
}


public class MultiClassPractices {
    public static void main(String[] args) {

        Data obj=new Data();
        System.out.println("Public name: "+obj.name);//public
        System.out.println("Private age: "+obj.getAge());//PRIVATE
        System.out.println("Default ID: "+obj.ID);//DEFAULT

        obj.Aloha();//default
        obj.Hello();//public

    }
}
