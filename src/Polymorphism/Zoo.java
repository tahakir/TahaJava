package Polymorphism;

class Animal{
    public void Talk(){

        System.out.println("Animal is talking");
    }
}


class Tiger extends Animal{
    public void Hunt(){
        System.out.println("Tiger us hunting");
    }

    @Override
    public void Talk(){
        System.out.println("The tiger is talking==>Roar");
    }
}

class Octopus extends Animal{

    public void Swim(){
        System.out.println("Octopus is swimming");
    }

    @Override
    public void Talk(){
        System.out.println("The octopus is talking==>Gulu gulu");
    }

}


public class Zoo {

    public static void main(String[] args) {
        Tiger tiger1= new Tiger();
        Tiger[] Tigers={tiger1,new Tiger()};

        Octopus octopus1= new Octopus();
        Octopus[] octopus={octopus1,new Octopus()};

        Animal               animal1=            new Tiger();
//      reference type       reference name      object
        Animal animal2= new Octopus();
        animal2.Talk();

    }

}
