package day11;

public class ScoreChecker {
    public static void main(String[] args) {

        int score = 71;
        if (score < 0 || score > 100) {    // OR dedigi icin
            System.out.println("INVALID SCORE");
        } else if (score == 100) {
        System.out.println("PERFECT SCORE");
    }else if(score>70 && score<100){
            System.out.println("YOU HAVE PASSED");
        }else{
            System.out.println("YOU HAVE FAILED");
        }

        int score2 = 0;
        if (score2 < 20 ) {
            System.out.println("COME TO MY OFFICE");
        } else if (score2 >30 && score2< 40) {
            System.out.println("ATTEND ADDITIONAL CLASSES");
        }else if(score2>40 && score2<70){
            System.out.println("LITTLE BIT MORE STUDY WILL LET YOU PASS");
        }else{
            System.out.println("DROP OFF THIS CLASS MAN");
        }

    }
}
