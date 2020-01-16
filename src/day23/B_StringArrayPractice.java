package day23;

public class B_StringArrayPractice {
    public static void main(String[] args) {

        // we created array in short way just by opening up { }
        // we put them in different line since white space does not matter
        String[] shows = {"Orville", "Gifted", "Game of Throne", "Flash", "Arrow", "Super girl"};
//        int countShow=shows.length;
//        System.out.println("count Show = " + countShow);
//
//        for (int i = 0; i <countShow ; i++) {
//            String currentShow=shows[i];
//
//            System.out.println(currentShow + " has character count: " + currentShow.length());

//        }


        String myFavShow=shows[0];

        System.out.println("My fav show is " + myFavShow + " and, My fav show character count is= " + myFavShow.length());

        int showsCount = shows.length;
        System.out.println("shows Count = " + showsCount);

        for (int x = 0; x < showsCount; x++) {

            //String currentShow =  shows[x] ;
            //System.out.println(  currentShow  + " has character count : " +  currentShow.length()  );
            System.out.println(shows[x] + " has character count : " + shows[x].length());
        }


    }
}
