package Practice;

abstract public class Animal {


    public char gender;
    public byte age;
    public String color;
    public String nickname;

    public Animal(char gender, byte age, String color, String nickname) {

        this.gender = gender;
        this.age = age;
        this.color = color;
        this.nickname = nickname;

    }


    public abstract void speak(String language);

    public abstract void eat();

    public abstract void sleep();

    public abstract void drink();

    public void getInfo(){

        System.out.println("Nickname is: "+nickname);
        System.out.println("Gender is: "+gender);
        System.out.println("Color is: "+color);
        System.out.println("Age is: "+age);

    }

}




class Cat extends Animal{


    public Cat(char gender, byte age, String color, String nickname) {
        super(gender, age, color, nickname);
    }



    @Override
    public void speak(String language){
        System.out.println("Cleo speaks"+language);
    }

    @Override
    public void eat(){

        System.out.println("Cleo eats fish");
    }

    @Override
    public void sleep(){

        System.out.println("Cleo sleeps 15 hours a day");
    }

    @Override
    public void drink(){

        System.out.println("Cleo drinks milk");
    }

}

