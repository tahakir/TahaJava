package day42;

public class Movie {

    private   String name;
    private double length;
    private String genre;
// default constructor
    //a constructor that give by compiler
    //only if you dont have any constructor in your class
    //its invisible
    //and it has no parameter
    //it has no code inside

    //Write a constructor to set all the fields value


    public Movie(String name, double length, String genre) {
        this.name = name;
        this.length = length;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public String getGenre() {
        return genre;
    }
//toString so we can directly print out



    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", genre='" + genre + '\'' +
                '}';
    }
}
