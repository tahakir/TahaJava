package day44;

public class Person {
    //instance field:belong to the instance (object)
    //every Person object will get their own name and age
    //chancing the value of one object does not affect another

    private String name;
    private int age;
    //static field:belong to the class (type itself)
    //there is only one copy of this value shared by all the objects
    //chancing the value of one object does not affect another
    public static String species;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", species='"+species+'\'' +
                '}';
    }
}