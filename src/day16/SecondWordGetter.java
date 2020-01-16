package day16;

public class SecondWordGetter {
    public static void main(String[] args) {

        ///given a sentence with 3 words
        //get the second word

        //steps:
        //second word is between space and the last space

        //getting location of space remind me of indexOf
        //getting string inside another string by beginning and ending index
        //remind me of substring
    //                   0123456789012
        String sentence="You love Java";
        String secondWord="";

        int firstSpaceIndex=sentence.indexOf(" ");
        System.out.println("firstSpaceIndex = " + firstSpaceIndex);

        int lastSpaceIndex=sentence.lastIndexOf(" ");
        System.out.println("lastSpaceIndex = " + lastSpaceIndex);


        System.out.println(sentence.substring(2,6) );
        secondWord=sentence.substring(firstSpaceIndex+1 , lastSpaceIndex);
        System.out.println("secondWord="+secondWord);
        // how to get the first word:
        // first word is starting from the first character till the first space
        
        String firsWord=sentence.substring(0,firstSpaceIndex);
        System.out.println("firsWord = " + firsWord);;
        
        //how to get the last word:
        //last word in a sentence means from the last space till the rest

        String lastWord=sentence.substring(lastSpaceIndex+1);
        System.out.println("lastWord = " + lastWord);

        
    }

}
