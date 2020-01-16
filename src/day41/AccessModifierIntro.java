package day41;
import day40.BankAccount;
public class AccessModifierIntro {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();
        // What is default access modifier
        // if there is no access modifier
        // in front of method or field
        // it means it has default access modifier
        // This will make the method of the field
        // only accessible within the same package
        b1.showAccountBalance();


        // the BankAccount instance field from day40
        // does not have any access modifier
        // so it means it has default access modifier
        //b1.balance = 1000 ;

        // access modifier can be used for fields and methods , there are 4 of them
        // currently we care about of 3 :
        // public --->> accessible anywhere
        // (default)  --->> accessible only within the same package
        // private --->> accessible only within the same class


        Person p1=new Person();
//        p1.name="Taha";
//        p1.age=33;
//        p1.ssn=123231234;
        
        p1.setAll("Taha",33,123231234);
        System.out.println("p1 = " + p1);


        System.out.println("p1.getName() = " + p1.getName());
        p1.setName("Kaan");
        System.out.println("p1.getName() = " + p1.getName());
//After change
        p1.setAge(22);
        p1.setSsn(999887766);

        int kaanAge=p1.getAge();
        System.out.println("kaanAge = " + kaanAge);

        System.out.println("p1 = " + p1);
    }
}
