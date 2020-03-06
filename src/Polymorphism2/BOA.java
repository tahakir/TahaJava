package Polymorphism2;

import java.util.ArrayList;
import java.util.Arrays;

abstract class ScrumTeam{

   public String name,jobTitle;
   public double salary;

   public abstract void DailyStandUp();
   public abstract void Demo();

    public void getEmployeeInfo(){
        System.out.println("============================");
        System.out.println("The tester name is: "+name);
        System.out.println("The job title is: "+jobTitle);
        System.out.println("The salary is: $"+salary);
        System.out.println("============================");
    }

}


class Testers extends ScrumTeam{

    public Testers (String name,String jobTitle,double salary){
        this.name=name;
        this.jobTitle=jobTitle;
        this.salary=salary;
    }



    @Override
    public  void DailyStandUp(){
        System.out.println("Tester "+name+" is talking");
    }
    @Override
    public  void Demo(){

        System.out.println("Testers "+name+" is doing demo");

    }

}

class Developers extends ScrumTeam{

    public Developers(String name,String jobTitle,double salary){
        this.jobTitle=jobTitle;
        this.name=name;
        this.salary=salary;
    }

    @Override
    public void DailyStandUp() {

        System.out.println("Developer "+name+" is talking");
    }

    @Override
    public void Demo() {

        System.out.println("Developer "+name+ "is doing demo");
    }
}


public class BOA {

    public static void main(String[] args) {

        ScrumTeam t1= new Testers("Taha","SDET",90000);
        ScrumTeam t2=new Testers("Kaan","QA Tester",100000);
        ScrumTeam t3= new Testers("Okkes","Manual Tester",50000);

        ScrumTeam [] testers={t1,t2,t3};
//        for (ScrumTeam each : testers) {
//            each.getEmployeeInfo();
//        }

        ScrumTeam d1= new Developers("Ali","Developer",120000);
        ScrumTeam d2= new Developers("Veli","Junior Developer",100000);
        ScrumTeam d3= new Developers("Suat","Senior Developer",150000);
        ScrumTeam d4= new Developers("Yusuf","Junior Developer",105000);

        ScrumTeam [] developers={d1,d2,d3,d4};
//        for (ScrumTeam each : developers) {
//            each.getEmployeeInfo();
//        }

        ArrayList<ScrumTeam> scrum= new ArrayList<>();
        scrum.addAll(Arrays.asList(testers));
        scrum.addAll(Arrays.asList(developers));

        for (ScrumTeam each : scrum) {
            each.getEmployeeInfo();
        }

    }


}
