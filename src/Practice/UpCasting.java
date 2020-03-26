package Practice;


class AnimalUpCast{

public void method1(){


}


}


class DogUpCast extends AnimalUpCast{

    public void method2(){

    }

}





public class UpCasting {
    public static void main(String[] args) {

       // System.out.println( (double)10);
        //As long as there is a IS A Relation between classes, you can up cast

        //Up casting: casting subclass to superior type

        DogUpCast obj= new DogUpCast();
        AnimalUpCast obj2=(AnimalUpCast) obj;



    }

}
