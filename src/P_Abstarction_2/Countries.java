package P_Abstarction_2;



public abstract class Countries {

    public String name,flag,language,religion,rival;
    public double population;

    public abstract void exports();
    public abstract void imports();
    public abstract void economy();
    public abstract void currency();

    public Countries(String name,String flag,String language,String religion, String rival,double population){
        this.name=name;
        this.flag=flag;
        this.language=language;
        this.religion=religion;
        this.rival=rival;
        this.population=population;

    }

    public void getInfo(){
        System.out.println("The country name is: "+name);
        System.out.println("The country flag name is: "+flag);
        System.out.println("The language is: "+language);
        System.out.println("The predominant religion is: "+religion);
        System.out.println("The rival country name is: "+rival);
        System.out.println("The population is: "+population+" million");
    }

}

class Turkiye extends Countries{


    public Turkiye(String name, String flag, String language, String religion, String rival, double population) {
        super(name, flag, language, religion, rival, population);
    }

    @Override
    public  void exports(){
        System.out.println("Unmanned aircrafts, armored vehicles,chemical goods,fruits");
    }
    @Override
    public  void imports(){
        System.out.println("Metals,electronics,chemical raw materials");
    }
    @Override
    public  void economy(){
        System.out.println("Semi-autonomous Capitalism");
    }
    @Override
    public  void currency(){

        System.out.println("Turkish Lira");

    }


}

class USA extends Countries{


    public USA(String name, String flag, String language, String religion, String rival, double population){
        super(name,flag,language,religion,rival,population);
    }

    @Override
    public  void exports(){
        System.out.println("Weapons,electronics,cotton");
    }
    @Override
    public  void imports(){
        System.out.println("Metals,electronics,chemical raw materials");
    }
    @Override
    public  void economy(){
        System.out.println("Hard-core Capitalism");
    }
    @Override
    public  void currency(){

        System.out.println("US Dollar");

    }

}

class France extends Countries{

    public France(String name, String flag, String language, String religion, String rival, double population){
        super(name,flag,language,religion,rival,population);
    }


    @Override
    public  void exports(){
        System.out.println("Weapons,electronics,perfume,cologne");
    }
    @Override
    public  void imports(){
        System.out.println("Metals,electronics,chemical raw materials");
    }
    @Override
    public  void economy(){
        System.out.println("Capitalism");
    }
    @Override
    public  void currency(){

        System.out.println("Euro/Frank");

    }


}

class UnitedNations{

    public static void main(String[] args) {

        Turkiye TR= new Turkiye("Turkiye","Turkish Flag","Turkish","Islam","Greece",82);
        TR.getInfo();
        TR.currency();
        TR.economy();
        TR.exports();
        TR.imports();

        System.out.println("=============================================================");

        USA US= new USA("United States","Stars and Stripes","English-Spanish-French","Christianity","China",350);
        US.getInfo();
        US.currency();
        US.economy();
        US.exports();
        US.imports();

        System.out.println("=============================================================");

        France FR =new France("France","Frankish","French","Christianity","Germany",65);
        FR.getInfo();
        FR.currency();
        FR.economy();
        FR.exports();
        FR.imports();
    }
}