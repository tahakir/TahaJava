package P_Abstarction_2;


class Cat extends Animal {


    public Cat(String name, String color, String gender, int age) {
        super(name, color, gender, age);
    }

    @Override
    public void Speak() {
        System.out.println("==> meow");
    }

    @Override
    public void Eat() {
        System.out.println("m&m");
    }

    @Override
    public void Sleep() {
        System.out.println("==> 14 hours");
    }

    @Override
    public void Drink() {
        System.out.println("Hot chocolate");
    }

}

class Dog extends Animal {
    public Dog(String name, String color, String gender, int age) {
        super(name, color, gender, age);
    }

    @Override
    public void Speak() {
        System.out.println("==> woof");
    }

    @Override
    public void Eat() {
        System.out.println("KFC");
    }

    @Override
    public void Sleep() {
        System.out.println("==> 8 hours sleep");
    }

    @Override
    public void Drink() {
        System.out.println("Milk Shake");
    }
}

class Cow extends Animal {
    public Cow(String name, String color, String gender, int age) {
        super(name, color, gender, age);
    }

    @Override
    public void Speak() {
        System.out.println("==> moo");
    }

    @Override
    public void Eat() {
        System.out.println("grace");
    }

    @Override
    public void Sleep() {
        System.out.println("==> 5 hours sleep");
    }

    @Override
    public void Drink() {
        System.out.println("Coffee with sugar");
    }
}

public abstract class Animal {

    public String gender;
    public int age;
    public String color;
    public String name;

    public abstract void Speak();

    public abstract void Eat();

    public abstract void Sleep();

    public abstract void Drink();

    public Animal(String name, String color, String gender, int age) {
        this.name = name;
        this.color = color;
        this.gender = gender;
        this.age = age;
    }

    public void getInfo(){
        System.out.println("The name is: "+name);
        System.out.println("The color is: "+color);
        System.out.println("The gender is: "+gender);
        System.out.println("The age is: "+age);
    }
}

class Zoo{

    public static void main(String[] args) {

        Dog d1=new Dog("Sabi","Black","Female",10);
        d1.getInfo();
        d1.Drink();
        d1.Eat();
        d1.Sleep();
        d1.Speak();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        Cat c1 = new Cat("Sonia","Brown","Female",5);
        c1.getInfo();
        c1.Drink();
        c1.Eat();
        c1.Sleep();
        c1.Speak();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");

        Cat c2 = new Cat("Mish","White","Male",7);
        c2.getInfo();
        c2.Drink();
        c2.Eat();
        c2.Sleep();
        c2.Speak();


        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        Cow cows= new Cow("Sarikiz","White","Female",15);
        cows.getInfo();
        cows.Drink();
        cows.Eat();
        cows.Sleep();
        cows.Speak();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");

        Cat [] cats={c1,c2};
        cats[0].getInfo();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        cats[1].getInfo();
    }
}
