package day07;

public class PreIncrementandPostIncrement {

    public static void main(String[] args) {

        //increment a

       /* int apple=8;

        apple++; //incrementing by one -->9

        System.out.println(apple); //--->9

        //System.out.println(++apple);

        // apple++, when ++ comes after the varieable
        // it will increase the value
        //But it will reflect the increased the value next time the variable show up!!

        System.out.println(apple++);
        System.out.println(apple);
*/
        int score=50;
        System.out.println(++score);// 51
        System.out.println(score++);//51 still but ready to be after next show up
        System.out.println(score);//52
        System.out.println(--score); //51
        System.out.println(score--);//51
        System.out.println(score); //50

    }
}
