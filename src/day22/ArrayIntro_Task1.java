package day22;

public class ArrayIntro_Task1 {
    public static void main(String[] args) {

        // create an byte array with size 4
        // and store it into a variable called data

        // assign value for each index location
        // print out the values at each index

        // update last index value
        // then print it out

        byte[] data = new byte[4];
        data[0] = 5;
        data[1] = 12;
        data[2] = 125;
        data[3] = -35;

        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);

        data[3]=117;
        System.out.println(data[3]); // the last value beats the before one
    }
}
