package OfficeHours;

public class Practice_12_02_ReplaceMethod {
    public static void main(String[] args) {
//                   012345678901234567890123456
        String item="Echo Dot (3rd Gen) Charcoal";
        //get whatever is inside parenthesis

        //find out index of (and index of),use them for substring to get the next

        System.out.println(item.substring(9,18)); ///ending index is always NOT included
        System.out.println(item.substring(10,17));
        
        int indexOfOpeningParenthesis=item.indexOf("(");
        int indexOfEndingParenthesis=item.indexOf(")");
        
        String wordInsideParenthesis=item.substring(indexOfOpeningParenthesis+1, indexOfEndingParenthesis);
        System.out.println("wordInsideParenthesis = " + wordInsideParenthesis);

        ///----------------------------------------------------------
        //              0
        String letters="J%a^V**$a";
        // remove % ^ * $

        letters=letters.replace("%","")//Ja^V**$a
                .replace("^","")     //JaV**$a
                .replace("*","")     //JaV$a
                .replace("$","")     //JaVa
        .toUpperCase();                                 //JAVA

        System.out.println("letters = " + letters);







    }
}
