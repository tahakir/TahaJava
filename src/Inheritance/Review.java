package Inheritance;


class X{
    public String name1="Ali";
}

class Y extends X{

    public String name2="Veli";
    public String name3="Deli";

    public void method1(){
        super.name1="Okkes";
    }

}

public class Review extends Y{

    public String name4="Faramir";
    public String name5="Aragorn";



    public static void main(String[] args) {

        Review r1= new Review();
        r1.method1();
        System.out.println(r1.name1);

        X r2= new X();

        System.out.println(r2.name1);

    }

}
