package PracticeAndRepls;

public class SpaceShip {

    String name;
    int x;
    int y;
    String currentDirection; //east west north south

    //1)move1Block
        //change the position according to the direction
    //2)setDirection
        //accept 1 string parameter to set the direction.

    //3)toString
        //return String representation of Spaceship Object

    //4)setInitialPosition
        //accept 2 int parameters

    public void setInitialPosition(int newX,int newY){
       x=newX;
       y=newY;
    }

    public void setDirection(String newDirection) {
        if (newDirection.equalsIgnoreCase("North") ||
                newDirection.equalsIgnoreCase("West") ||
                newDirection.equalsIgnoreCase("South") ||
                newDirection.equalsIgnoreCase("east") ) {
            currentDirection = newDirection;
        } else {
            System.out.println("Invalid direction");
        }

    }

    public void move1Block(){

        switch (currentDirection){

            case "West":
                y++;
                break;
            case "North":
                x++;
                break;
            case "East":
                y--;
                break;
            case "South":
                x--;
                break;
            default:
                break;



        }



    }


    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", currentDirection='" + currentDirection + '\'' +
                '}';
    }
}
