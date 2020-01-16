package OfficeHours;

import java.util.Arrays;
import java.util.List;

public class Practice_01_08_ArrayList3 {
    public static void main(String[] args) {

        List<String> numList= Arrays.asList("11","15","33","54","44","66","75","93","99","89");
        System.out.println("numList = " + numList);

        for (String each : numList) {
            int eachNum=Integer.parseInt(each);
            if(eachNum>60){
                System.out.println("pass = " + eachNum);
            }else{
                System.out.println("fail = " + eachNum);
            }
        }
        
        int count=0;
        for (String each: numList) {
            if (Integer.parseInt(each)>90){
                count++;
            }
        }
        System.out.println("count = " + count);
        
        int sum=0;
        for (String each : numList) {
            sum+=Integer.parseInt(each);
        }
        System.out.println("average = " + sum/numList.size());
        
    }
    
}
