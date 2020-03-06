package Practice;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeInterface {
    public static void main(String[] args) {

//LAST IN FIRST OF DATA STRUCTURE
        Deque<Integer> dque=new ArrayDeque<>();
        dque.push(1);
        dque.push(3);
        dque.push(4);
        dque.push(6);
        dque.push(8);
        dque.push(20);
        System.out.println("dque = " + dque);

        System.out.println("dque.pop() = " + dque.pop());//returns the last item added

        while(!dque.isEmpty()){
            System.out.println("dque.pop() removing items = " + dque.pop());
        }



    }
}
