package z_Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {

        Queue<Integer> q1= new PriorityQueue<>();
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(10);

        System.out.println("q1 = " + q1);
        q1.poll();
        System.out.println("q1 = " + q1);
        q1.poll();
        System.out.println("q1 = " + q1);
        q1.poll();
        System.out.println("q1 = " + q1);

        Queue<String> q2= new PriorityQueue<>();
        q2.add("Taha");
        q2.add("Kaan");
        q2.add("Mehmet");
        q2.add("Ada");
        q2.add("Ilkay");

        q2.poll();
        System.out.println(q2);
    }
}
