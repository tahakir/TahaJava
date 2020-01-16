package day40;

public class HotMarketActions4 {

    public static void main(String[] args) {


        Offer o1= new Offer();
        o1.company = "Amazon";
        o1.location= "Virginia";
        o1.isFullTime = true;
        o1.salary = 150000;

        String o1Str=o1.toString();
        System.out.println("o1Str = " + o1Str);;

        System.out.println(o1.toString());
        //if you directly print out object, it will call toString() method automatically

        System.out.println("o1 = " + o1); //this is what is automatically happening behind the scene o1.toString()

    }
}
