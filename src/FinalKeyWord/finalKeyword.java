package FinalKeyWord;

class credentials{

    private final String userName="general";
    private final String passWord="santaanna";

    public String getUserName(){
        return userName;
    }

    public String getPassWord(){
        return passWord;
    }
//   public void setUserName(String userName){ you cannot re-assign
//       this.userName=userName;
//   }

}


class Holly{
    public void printName(){ //final cannot be applied if you wanna @override it!!!
        System.out.println("Erhan");
    }

}


public class finalKeyword extends Holly{
    @Override
    public void printName(){
        System.out.println("Okkesh");
    }

  final  int age=33;



    public static void main(String[] args) {


        final String SSN="123456";
       // SSN="6789088";
        System.out.println("SSN = " + SSN);


        finalKeyword obj= new finalKeyword();
        System.out.println(obj.age);

    }

    final  public static void add(int a,int b){
        System.out.println(a+b);
    }

    public static double add(double x,double y){
        return x+y;
    }

}
