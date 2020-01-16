package OfficeHours;

public class Practice_12_23 {
    public static void main(String[] args) {

        String word="Computer";
        System.out.println(reverseString(word));
    }

    public static String reverseString(String str){
        String reversedString="";
        for (int i = str.length()-1; i >=0 ; i--) {

            reversedString+=str.charAt(i);
        }
        return reversedString;
    }

}
