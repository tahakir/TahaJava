package Practice;

public class Zoo  {
    public static void main(String[] args) {

        Cat cleo= new Cat('F',(byte) 5,"White","Cleo");
        System.out.println("Cleo is "+ cleo.age+" years old");
        System.out.println("Cleo has only "+ cleo.color+" color");
        System.out.println("Cleo is a "+cleo.gender);
        System.out.println("Nickname is: "+cleo.nickname);
        cleo.sleep();
        cleo.eat();
        cleo.drink();
        cleo.sleep();
    }
}
