package day60.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class DangerZoneAgain2 {



    public static void main(String[] args) throws InterruptedException, IOException {

        System.out.println("The Start");
            readMyFile();

        Thread.sleep(10);
        System.out.println("The end ");


    }


    public static void readMyFile() throws IOException {

        System.out.println("Reading the file in my computer");

        try {


            List<String> allLines=Files.readAllLines(Paths.get("C:\\Users\\tahak\\IdeaProjects\\TahaJava\\src\\heros"));
            System.out.println("allLines = " + allLines);
        } catch (FileNotFoundException e) {
            System.out.println("Handling here!!!");
        }

    }


}
