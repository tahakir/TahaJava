package Recaps;

public class K_For_Each_Loop {
    public static void main(String[] args) {


//        int[] ints={1,2,3,4,5,6};
//
//        for( int nums : ints ){
//
//            if(nums%2!=0){
//
//                System.out.println("Odd numbers : " + nums);
//            }
//        }

        String [] names={"Taha","Betul","Kaan"};
        for (String friends: names){

            if(friends.contains("K")){
                System.out.println(friends);
                break;

            }

        }


    }

}
