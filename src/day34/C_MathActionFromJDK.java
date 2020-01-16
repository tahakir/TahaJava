package day34;

public class C_MathActionFromJDK {
    public static void main(String[] args) {
        // where is String class coming from
        //its coming from a package called java.lang
        //it's a special package
        //and any class in it, does not need importing when being used
        //for example String class

        //what if really want to explicitly import String class
        //import java.lang.String

        String str="Hello";

        //There is a class under java.lang called Math
        //and it has lots of math utility methods that ready to be used
        int sum=Math.addExact(10,20);
        System.out.println("sum = " + sum);

        System.out.println("max of 10, 20---> " + Math.max(10,20));


    }
}
