package AAA_LastReview;

public class StringMethods2 {
    public static void main(String[] args) {

        String address=" 7925 Jones Branch Dr, McLearn, VA 22003";
        int cityNameIndex=address.indexOf("McL");
        int cityNameLast=address.indexOf(", V");
        System.out.println(cityNameIndex);
        String cityName=address.substring(cityNameIndex,cityNameLast);
        System.out.println("cityName = " + cityName);

        String s1="JAVA";
        String s2=new String("java");
        System.out.println(s1.equalsIgnoreCase(s2));


    }
}
