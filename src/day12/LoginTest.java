package day12;

public class LoginTest {

    public static void main(String[] args) {

        String userName="user13";
        String passWord="pass123";

        if(userName.equals("user123")&& passWord.equals("pass123")){
            System.out.println("Login Successful");
        }else if (!userName.equals("user123")){
            System.out.println("Your User name is not correct");
            System.out.println("Login is NOT successful ");
        }else if (!passWord.equals("pass123")){
            System.out.println("Your password is not correct");
            System.out.println("Login is NOT successful ");
        }

    }
}
