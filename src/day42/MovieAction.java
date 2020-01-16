package day42;

public class MovieAction {
    public static void main(String[] args) {



        Movie m2=new Movie("Joker",2.2,"Drama");
        Movie m3=new Movie("Battal Gazi",1.5,"Action");
        Movie m4=new Movie("Parcala Behcet",1.4,"Drama");

        System.out.println("m2 = " + m2);
        System.out.println("m3 = " + m3);
        System.out.println("m4 = " + m4);

        //I want to get the name of m2 separately so I can do some stuff
        //I can not access the field directly becacuse it's private
        //i need a getter method to access
        //System.out.println(m2.name);
        System.out.println(m2.getName());
    }
}
