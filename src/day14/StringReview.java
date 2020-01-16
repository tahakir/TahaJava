package day14;

public class StringReview {
    public static void main(String[] args) {

        String str="I like Pumpkin";
        System.out.println(str.equals("pumpkin"));
//  contains:
//  it checks whether a string exists in another string
//   and return true or false result
        System.out.println("does it contains Pumpkin : ");
        System.out.println(str.contains("Pumpkin")      );
                                 //true
        boolean gotPumpkin=str.contains("Pumpkin");
// shortcut to print variable in a nice format soutv + tab
        System.out.println("gotPumpkin = " + gotPumpkin);

 //startsWith    endsWith
 //check whether a string starts with another string
        // check whether a string ends with another string
        // and return true or false result

        boolean startedWithI=str.startsWith("I");
        System.out.println("started With I = " + startedWithI);

        boolean endWithPumpkin=str.endsWith("Pimpkin");
        System.out.println("end With Pumpkin = " + endWithPumpkin);

        //PASSWORD VALIDATOR

        //MINIMUM 8 CHARACTER MAX 16 CHARACTERS
        //IT MUST CONTAIN _ OR $
        // IT MUST NOT CONTAIN SPACE
        // IT MUST START WITH Ab

        //if any of above condition does not match say INVALID PASSWORD
        // ELSE SAY GOOD PASSWORD!

        String password="Ab_1234568$";
        //MINIMUM 8 CHARACTER MAX 16 CHARACTERS
        boolean min8max16=password.length() >=8  && password.length()  <=16;

        //IT MUST CONTAIN _ OR $
        boolean mustContain_or$ =password.contains("_")  || password.contains("$");

        //// IT MUST NOT CONTAIN SPACE
       boolean mustNotContainsSpace= ! password.contains(" ");

        //IT MUST START Ab
        boolean mustStartWithAb= password.startsWith ("Ab");

        if(min8max16 && mustContain_or$ && mustNotContainsSpace && mustStartWithAb){
            System.out.println("VALID PASSWORD");
        }else{
            System.out.println("INVALID PASSWORD");
        }










    }
}
