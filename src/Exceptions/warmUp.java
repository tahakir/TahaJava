package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class warmUp {

    public static void main(String[] args) {

    Wait(0.5);
        System.out.println("Batch 15");

        Properties property= new Properties();

        String path= "C:\\Users\\tahak\\Desktop\\TAHA.properties.txt";

        try {
            FileInputStream file=new FileInputStream(path);
            property.load(file);
        }catch (IOException e){

        }

        String Name =property.getProperty("ID");
        System.out.println(Name);

        System.out.println(getData("URL2","C:\\Users\\tahak\\Desktop\\TAHA.properties.txt"));


       String age1= getData("Gender","TestData");
        System.out.println(age1);

    }



    public static void Wait( double seconds) {

        try {
            Thread.sleep((long) (seconds * 1000));
            System.out.println("Try block....Checked exception");
        } catch (java.lang.Exception x) {
            System.out.println("Catch block....Unchecked exception");

        }
    }

    public static String getData(String Key,String Path){
        String data="";
        Properties property= new Properties();
        try {
            FileInputStream file=new FileInputStream(Path);
            property.load(file);
        }catch (IOException e){

        }

        data=property.getProperty(Key);

        return data;
    }
}
