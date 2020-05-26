package BootCamp.String;

public class Task3_Palindrome {
    public static void main(String[] args) {

        String str = "abcdgheed";
        boolean check=true;

        for (int i = 0; i <str.length()/2; i++) {
            if (str.charAt(i)!=str.charAt(str.length()-1-i)){
                check=false;
                break;
            }

        }
        System.out.println(check?"Palindrome":"Not Palindrome");

    }
}
