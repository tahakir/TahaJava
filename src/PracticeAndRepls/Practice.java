package PracticeAndRepls;


import java.util.*;

public class Practice {
    public static void main(String[] args) {


        SpaceShip s1=new SpaceShip();
        s1.name="Avatar";
        s1.currentDirection="West";

        s1.setInitialPosition(2,6);
        s1.setDirection("East");
        s1.move1Block();

        System.out.println("s1 = " + s1);

        s1.setDirection("North");
        s1.move1Block();
        System.out.println("s1 = " + s1);
    }

}







