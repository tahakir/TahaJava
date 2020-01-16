package day20;

public class Get2SiblingChar {
    public static void main(String[] args) {

        // given a String with even number character count
// print 2 characters in one line as below example
//
// for example  :  Ayra
/*
    Ay
    yr
    ra
*/

        String name = "Ayra";

        int lastCharIndex = name.length()-1;

        for (int x = 0; x <= lastCharIndex-2; x ++) {

            System.out.println(name.substring(x, x + 3));


        }
    }
}