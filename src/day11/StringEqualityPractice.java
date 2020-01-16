package day11;

public class StringEqualityPractice {

    public static void main(String[] args) {
        // checking for String equality should be always
        //done using equals method of the String

        // oneString.equals(anotherString) ----> true or false

// each and every String object you created will have this functionality

        // just comparing 2 string literal directly using equals method
//this is something that you will rarely
        //System.out.println("Java".equals("java")  );

        String myStr="Java";

        System.out.println(myStr.equals("Java")  );

        String yourStr=new String("Java"); ///dont type original
        System.out.println("is my string same as your string? ");

        // how to compare myStr to yourStr for equality

        System.out.println( myStr.equals(yourStr)   );


// create a program to check whether myStr value is Java
        //if true----> CORRECT WORD!!!!!
        //if false-----> SAY JAVA!!!!


        if(myStr.equals("Java")){
            System.out.println("CORRECT WORD");
        }else{
            System.out.println("SAY JAVA");
        }

// create a program to check whether myStr value is Java
        //if true----> CORRECT WORD!!!!!
        //if false-----> SAY JAVA!!!!






    }
}
