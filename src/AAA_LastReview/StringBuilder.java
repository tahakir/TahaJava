package AAA_LastReview;

public class StringBuilder {
    public static void main(String[] args) {

        java.lang.StringBuilder stringBuilder=new java.lang.StringBuilder("Taha");
        System.out.println(stringBuilder.reverse());
        isPalindromeWithStringBuilder("AGATHA");

    }
    public static boolean isPalindromeWithStringBuilder(String str){
        return new java.lang.StringBuilder(str).reverse().toString().equals(str);
    }
}
