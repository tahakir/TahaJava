package day14;

public class IndexOfPractice {
    public static void main(String[] args) {

        //IndexOf----->
        // find out index of another String inside This String
                 //  012345678901
        String name="Game of Java";// lenght is 12, last char index is 11

        // find out the location of Java
        // find out the location of letter O
// find out the location of first space

        System.out.println(name.indexOf("Java")); //12
        System.out.println(name.indexOf("o"));
        System.out.println(name.indexOf(" "));
    }
}
