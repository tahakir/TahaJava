package day41;
//TV
//        attributes :
//        brand , isOn , currentChannel
//        Stirng , boolean , int   (range from 0-50)
//        behaviours :
//        turnOn
//        turnOff
//        getcurrentChannel
//        setcurrentChannel (newChannelNumber)
//        moveForward
//        moveBackward


public class TV {
    String name;
    boolean isOn;
    int currentChannel;

    /**
     * A method to return the value of current channel for the TV
     * @return the value of current channel for the TV
     */

    public int getCurrentChannel(){
        return currentChannel;
    }

    public void setCurrentChannel(int newChannel){
        if (newChannel<0 || newChannel>50){
            System.out.println("Invalid channel,getting out");
            return;//early exit form the method
        }
        if (isOn==true){
            currentChannel=newChannel;
        }else {
            System.out.println("TURN ON THE TV FIRST");
        }

    }


    public void turnOn(){


        if (isOn==false){ //checking for equality
            System.out.println("Turning on TV");
            isOn=true;// assigning the value

        }

    }

    public void turnOff(){
        if(isOn==true){
            System.out.println("Turning off TV");
            isOn=false;
        }


    }


    public String toString() {
        return "TV{" +
                "name='" + name + '\'' +
                ", isOn=" + isOn +
                ", currentChannel=" + currentChannel +
                '}';
    }
}




