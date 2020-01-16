package day12;

public class CheckingStringEqualityWithoutCase {

    public static void main(String[] args) {
// only care about the characters
        String userName = "abc123";
        boolean userNameCorrect= userName.equals("ABC123");

        System.out.println(userNameCorrect);

        boolean nameCheckIgnoreCase=userName.equalsIgnoreCase("ABC123");
        System.out.println(nameCheckIgnoreCase);

        //store your name in a name variable
        //check for equality using different uppercase lowercase exp.
        //using equals and equalsIgnoreCase
        String name="Taha";
        boolean nameCorrect=name.equals("TAHA");
        System.out.println(nameCorrect);

        boolean nameCheckIgn=name.equalsIgnoreCase("TAHA");
        System.out.println(nameCheckIgn);



        String namex = "Emre";
        // I want to store the result of checking name into a variable
        boolean nameEqualsWithoutCase = namex.equalsIgnoreCase("emre");
        System.out.println("Does this name has same character without caring about the case");
        System.out.println(nameEqualsWithoutCase);

        System.out.println(name.equalsIgnoreCase("eMrE"));




    }
}
