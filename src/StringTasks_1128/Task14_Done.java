package StringTasks_1128;

public class Task14_Done {
    public static void main(String[] args) {


//        Task 14:
//        Ask user to enter sentence with any number of words
//        For example I love Java Java Java Java
//        write a program to print last word
//        remove last word from the sentence
//        check weather remaining part still contains last word
//        for example :
//        1, I love Java Java Java Java  -->> Java
//        2, I love Java Java Java
//        3, I love Java Java Java still contains last word

        String sentence="I love Java Java Java Java";
int javaCount=0;
        for (int x = sentence.length()-4; x >=0 ; x--) {

            if(sentence.substring(x,x+4).equalsIgnoreCase("Java")){

               String n=sentence.substring(0,x);
                if(n.contains("Java")){
                    System.out.println("Present");
                    javaCount++;
                }else{
                    System.out.println("No More");
                break;
                }
            }

        }

        System.out.println("javaCount = " + javaCount);

    }
}
