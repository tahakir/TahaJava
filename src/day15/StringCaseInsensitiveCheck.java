package day15;

public class StringCaseInsensitiveCheck {

    public static void main(String[] args) {


        String name="Irina Kozhevnikova ";
        System.out.println("name.contains( \"st\") RESULT IS = " + name.contains("st"));//"st" just a quatation there is not other way to print out

        //wanna check whether this name contains st no matter the case
        //so i want to store the uppercase version of this name then check for ST

        String upperCaseName=name.toUpperCase();//"IRINA KOZHEVNIKOVA"
        System.out.println("upperCaseName contains ST or Not? " + upperCaseName.contains("ST"));



        String lowerCaseName=name.toLowerCase(); //"irina kozhevnikova"
        System.out.println("lowerCaseName contains st or not = " + lowerCaseName.contains("st"));


        //this is called method chaining, combining multiple method call
        //make mu name all lowercase() then check whether it contains lowercase st

        System.out.println(name.toLowerCase().contains("st"));
        //System.out.println(name.lenght().toUpperCase()); bad idea int and string together wont work



    }

}
