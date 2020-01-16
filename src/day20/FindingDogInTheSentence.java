package day20;

public class FindingDogInTheSentence {
    public static void main(String[] args) {



        // given sentence , find out the location of the dog

        // our approach is
        // doing through the sentence 3 character at a time
        // then if 3 characters happen to be a dog , we print out the index

    /*
      0123456789012345678901234567890123456789012345
    * I like Dog , Dogs are cute , Dogs are friendly
    * I l
    *  li
    * lik
    *
    *
    * */

            String message="I like Dog , Dogs are cute , Dogs are friendly";
            int charCount=message.length();
            int lastIndexOfCharCount=charCount-1;

        for (int i = 0; i <=lastIndexOfCharCount-2 ; i++) {

            String c3chars=message.substring(i,i+3);
            //System.out.println(message.substring(i,i+3));
            if(c3chars.equals("Dog"))
            System.out.println(i + " Bingo " );
        }



    }
}
