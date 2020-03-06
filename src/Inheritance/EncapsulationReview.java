package Inheritance;

import java.util.ArrayList;
import java.util.Arrays;

class credentials{

  private String userName;
  private String passWord;

    public credentials(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getUserName(){
      return userName;
  }

  public void setUserName(String userName){
      this.userName=userName;
      System.out.println("The username is: "+userName);

  }

  public String getPassWord(){
      return passWord;
  }
  public void setPassWord(String passWord){
      this.passWord=passWord;
      System.out.println("The password is: "+passWord);
  }
  public void getInfo(){
      System.out.println("username: "+getUserName());
      System.out.println("password: "+getPassWord());
  }
}


public class EncapsulationReview {

    public static void main(String[] args) {


        credentials c1= new credentials("Ali Baba","40 thieves");
//        c1.setPassWord("Open sesame Open");
//        c1.setUserName("My name is Ali Baba");
//        System.out.println(c1.getUserName());
//        System.out.println(c1.getPassWord());

        credentials c2= new credentials("Okkes","Sait baskan");
//        c1.setPassWord("Open sesame Open");
//        c1.setUserName("My name is Ali Baba");
//        System.out.println(c2.getUserName());
//        System.out.println(c2.getPassWord());




        credentials[] users={c1,c2};
        users[0].getInfo();
        users[1].getInfo();

        ArrayList<credentials> list=new ArrayList<>();

        list.addAll(Arrays.asList(c1,c2));
        for (credentials each : list) {

          each.getInfo();
        }
    }


}
